//
//  DownloadViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/10/17.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "DownloadViewController.h"
#import "DHHudPrecess.h"
#import "Global.h"
#import "playEx.h"
#import <fstream>

static std::ofstream s_recordfile;

@interface DownloadViewController ()<UIPickerViewDelegate, UIPickerViewDataSource>

@property (nonatomic, strong) UILabel *m_labChannel;
@property (nonatomic, strong) UIButton *m_btnChannel;
@property (nonatomic, strong) UILabel *m_labStream;
@property (nonatomic, strong) UIButton *m_btnStream;
@property (nonatomic, strong) UIPickerView *m_pickerview;

@property (nonatomic, strong) UIButton *m_btnStartTime;
@property (nonatomic, strong) UIButton *m_btnEndTime;
@property (nonatomic, strong) UILabel *m_labStartTime;
@property (nonatomic, strong) UILabel *m_labEndTime;
@property (nonatomic, strong) UIDatePicker *m_datepicker;
@property (nonatomic, strong) UIButton *m_btnDownload;
@property (nonatomic, strong) UIProgressView *m_progress;

@property (nonatomic) int m_nChannel;
@property (nonatomic) int m_nStream;
@property (nonatomic) NET_TIME m_stuStartTime;
@property (nonatomic) NET_TIME m_stuEndTime;
@property (nonatomic) BOOL bDownlaod;
@property (nonatomic) LLONG m_DownloadHandle;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) NSMutableArray *m_arrStream;


@end

@implementation DownloadViewController

@synthesize m_labChannel, m_btnChannel, m_labStream, m_btnStream,  m_pickerview, m_btnStartTime, m_btnEndTime, m_labStartTime, m_labEndTime, m_datepicker, m_btnDownload, m_nChannel, m_nStream, m_stuStartTime, m_stuEndTime, m_arrChannel, m_arrStream, m_progress, bDownlaod;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Record Download");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    bDownlaod = FALSE;
    
    m_arrChannel = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"%d"), i]];
    }
    
    m_arrStream = [[NSMutableArray alloc] initWithObjects:_L(@"Main"), _L(@"Extra"), nil];

    
    m_labChannel = [[UILabel alloc] init];
    [m_labChannel setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labChannel setCenter:CGPointMake(kScreenWidth/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labChannel.text = _L(@"Channel");
    m_labChannel.textColor = UIColor.blackColor;
    m_labChannel.layer.borderWidth = 1;
    m_labChannel.layer.cornerRadius = 10;
    m_labChannel.layer.masksToBounds = YES;
    m_labChannel.backgroundColor = UIColor.whiteColor;
    m_labChannel.textAlignment = NSTextAlignmentCenter;
    m_labChannel.adjustsFontSizeToFitWidth = YES;
    [m_labChannel setFont:[UIFont systemFontOfSize:24]];
    [self.view addSubview:m_labChannel];
    
    m_btnChannel = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnChannel.center = CGPointMake(kScreenWidth*3/8, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"0") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onBtnChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    m_labStream = [[UILabel alloc] init];
    [m_labStream setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labStream setCenter:CGPointMake(kScreenWidth*5/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labStream.text = _L(@"Stream");
    m_labStream.textColor = UIColor.blackColor;
    m_labStream.layer.borderWidth = 1;
    m_labStream.layer.cornerRadius = 10;
    m_labStream.layer.masksToBounds = YES;
    m_labStream.backgroundColor = UIColor.whiteColor;
    m_labStream.textAlignment = NSTextAlignmentCenter;
    [m_labStream setFont:[UIFont systemFontOfSize:24]];
    [self.view addSubview:m_labStream];
    
    m_btnStream = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnStream.center = CGPointMake(kScreenWidth*7/8, kScreenHeight/40+kNavigationBarHeight);
    m_btnStream.backgroundColor = [UIColor lightGrayColor];
    [m_btnStream setTitle:_L(@"Main") forState:UIControlStateNormal];
    [m_btnStream addTarget:self action:@selector(onBtnStream) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStream setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStream.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStream.layer.cornerRadius = 10;
    m_btnStream.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream];
    
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = YES;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    m_btnStartTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20)];
    m_btnStartTime.center = CGPointMake(kScreenWidth*1/5, m_btnChannel.center.y+kScreenHeight/20*1.5);
    m_btnStartTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnStartTime setTitle:_L(@"Start Time") forState:UIControlStateNormal];
    [m_btnStartTime addTarget:self action:@selector(onSelectStartTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStartTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStartTime.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStartTime.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnStartTime.layer.cornerRadius = 10;
    m_btnStartTime.layer.borderWidth = 1;
    [self.view addSubview:m_btnStartTime];
    
    m_labStartTime = [[UILabel alloc] init];
    m_labStartTime.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_labStartTime.center = CGPointMake(kScreenWidth*0.7, m_btnStartTime.center.y);
    m_labStartTime.font = [UIFont systemFontOfSize:24];
    m_labStartTime.textAlignment = NSTextAlignmentCenter;
    m_labStartTime.adjustsFontSizeToFitWidth = YES;
    [self.view addSubview:m_labStartTime];
    
    m_btnEndTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20)];
    m_btnEndTime.center = CGPointMake(kScreenWidth*1/5, m_btnStartTime.center.y+kScreenHeight/20*1.5);
    m_btnEndTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnEndTime setTitle:_L(@"End Time") forState:UIControlStateNormal];
    [m_btnEndTime addTarget:self action:@selector(onSelectEndTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnEndTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnEndTime.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnEndTime.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnEndTime.layer.cornerRadius = 10;
    m_btnEndTime.layer.borderWidth = 1;
    [self.view addSubview:m_btnEndTime];
    
    m_labEndTime = [[UILabel alloc] init];
    m_labEndTime.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_labEndTime.center = CGPointMake(kScreenWidth*0.7, m_btnEndTime.center.y);
    m_labEndTime.font = [UIFont systemFontOfSize:24];
    m_labEndTime.textAlignment = NSTextAlignmentCenter;
    m_labEndTime.adjustsFontSizeToFitWidth = YES;
    [self.view addSubview:m_labEndTime];
    
    m_datepicker = [[UIDatePicker alloc] init];
    m_datepicker.center = self.view.center;
//    m_datepicker.locale = [NSLocale localeWithLocaleIdentifier:@"zh_CN"];
    [m_datepicker setDate:[NSDate date] animated:TRUE];
    m_datepicker.datePickerMode = UIDatePickerModeDateAndTime;
    m_datepicker.backgroundColor = [UIColor lightGrayColor];
    //[m_datepicker addTarget:self action:@selector(ondateChange:) forControlEvents:UIControlEventValueChanged];
    m_datepicker.hidden = TRUE;
    [self.view addSubview:m_datepicker];
    
    m_progress = [[UIProgressView alloc] initWithProgressViewStyle:UIProgressViewStyleDefault];
    m_progress.frame = CGRectMake(0, 0, kScreenWidth, kScreenHeight/20);
    m_progress.center = self.view.center;
    m_progress.transform = CGAffineTransformMakeScale(1.0f, 15.0f);
    m_progress.progress = 0;
    [self.view addSubview:m_progress];
    
    m_btnDownload = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20)];
    m_btnDownload.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.8);
    m_btnDownload.backgroundColor = [UIColor lightGrayColor];
    [m_btnDownload setTitle:_L(@"Download") forState:UIControlStateNormal];
    [m_btnDownload addTarget:self action:@selector(onBtnDownload) forControlEvents:UIControlEventTouchUpInside];
    [m_btnDownload setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnDownload.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnDownload.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnDownload.layer.cornerRadius = 10;
    m_btnDownload.layer.borderWidth = 1;
    [self.view addSubview:m_btnDownload];
    
    
}

- (void)ShowSubviews : (BOOL) bFlags {
    [m_labChannel setHidden:bFlags];
    [m_btnChannel setHidden:bFlags];
    [m_labStream setHidden:bFlags];
    [m_btnStream setHidden:bFlags];
    [m_btnStartTime setHidden:bFlags];
    [m_btnEndTime setHidden:bFlags];
    [m_labStartTime setHidden:bFlags];
    [m_labEndTime setHidden:bFlags];
    [m_progress setHidden:bFlags];
    [m_btnDownload setHidden:bFlags];
}

- (void)onBtnChannel {
    
    if (m_pickerview.isHidden) {
        [self ShowSubviews:TRUE];

        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
    }
}

- (void)onBtnStream {
    if (m_pickerview.isHidden) {
        [self ShowSubviews:TRUE];

        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream inComponent:0 animated:TRUE];
    }
}

- (void)onSelectStartTime {
    [self ShowSubviews:TRUE];
    m_datepicker.tag = 1;
    [m_datepicker setHidden: FALSE];
    
}

- (void)onSelectEndTime {
    [self ShowSubviews:TRUE];
    m_datepicker.tag = 2;
    [m_datepicker setHidden: FALSE];
}

- (NSString *)str_now
{
    time_t t;
    time(&t);
    tm* stTime = localtime(&t);
    
    NSString *str = [NSString stringWithFormat:@"%04d%02d%2d_%02d%02d%02d_ch%d",stTime->tm_year + 1900, stTime->tm_mon+1, stTime->tm_mday, stTime->tm_hour, stTime->tm_min, stTime->tm_sec, m_nChannel];
    
    return str;
}

static void CALLBACK cbTimeDownLoadPos(LLONG lPlayHandle, DWORD dwTotalSize, DWORD dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo, LDWORD dwUser) {

    DownloadViewController* pSelf = (__bridge DownloadViewController*)((void*)dwUser);
    if (-1 != dwDownLoadSize) {
        dispatch_async(dispatch_get_main_queue(), ^{
            pSelf.m_progress.progress = ((double)dwDownLoadSize / (double)dwTotalSize);
        });
        NSLog(@"%lf", ((double)dwDownLoadSize / (double)dwTotalSize));
    }
    else {
        dispatch_async(dispatch_get_main_queue(), ^{
            MSG("", _L(@"Download Record Success"), "");
            [pSelf onBtnDownload];
        });
    }
}

static int CALLBACK fDownLoadDataCallBack(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LDWORD dwUser) {
    
    s_recordfile.write((char *)pBuffer, dwBufSize);
    return 1;
}

- (void)onBtnDownload {
    if (FALSE == self.bDownlaod) {
        
        int nRecordStreamType = 0;
        if (0 == m_nStream) {
            nRecordStreamType = 1;
        }
        else if (1 == m_nStream) {
            nRecordStreamType = 2;
        }
        CLIENT_SetDeviceMode(g_loginID, DH_RECORD_STREAM_TYPE, &nRecordStreamType);
        
        NSString *str = [self str_now];
        std::string strTime = [str UTF8String];
        const std::string strFilename = g_docFolder + "/Record/" + strTime + ".dav";
        s_recordfile.open(strFilename.c_str(), std::ios_base::out|std::ios_base::binary);
        char *szName = (char *)strFilename.c_str();
        self.m_DownloadHandle = CLIENT_DownloadByTimeEx(g_loginID, m_nChannel, 0, &m_stuStartTime, &m_stuEndTime, szName, cbTimeDownLoadPos, (LDWORD)(__bridge void*)self, fDownLoadDataCallBack, (LDWORD)(__bridge void*)self);
        if (self.m_DownloadHandle) {
            self.bDownlaod = TRUE;
            [m_btnDownload setTitle:_L(@"Stop") forState:UIControlStateNormal];
        }
        else {
            MSG("", _L(@"Download Record Failed"), "");
        }
    }
    else {
        BOOL bRet = CLIENT_StopDownload(self.m_DownloadHandle);
        if (bRet) {
            self.bDownlaod = FALSE;
            [m_btnDownload setTitle:_L(@"Download") forState:UIControlStateNormal];
            m_progress.progress = 0;
        }
    }

}

- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {
    
    if (1 == m_pickerview.tag) {
        return m_arrChannel.count;
    }
    else {
        return m_arrStream.count;
    }
}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{
    
    if (1 == m_pickerview.tag) {
        return [m_arrChannel objectAtIndex:row];
    }
    else {
        return [m_arrStream objectAtIndex:row];
    }
    
}

-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    
    if (1 == pickerView.tag) {
        [m_arrChannel objectAtIndex:row];
        m_nChannel = (int)row;
        [m_btnChannel setTitle:[m_arrChannel objectAtIndex:row]forState:UIControlStateNormal];
        
    }
    else if (2 == pickerView.tag) {
        [m_arrStream objectAtIndex:row];
        m_nStream = (int)row;
        [m_btnStream setTitle:[m_arrStream objectAtIndex:row]forState:UIControlStateNormal];
    }
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    if (FALSE == m_pickerview.isHidden) {
        [m_pickerview setHidden:TRUE];
        NSLog(@"channel : %d", self.m_nChannel);
    }
    if (FALSE == m_datepicker.isHidden) {
        
        NSDateFormatter *formatter = [[NSDateFormatter alloc] init];
        formatter.dateFormat = @"yyyy-MM-dd HH:mm:00";
        NSString *dateStr = [formatter stringFromDate:m_datepicker.date];
        if (1 == m_datepicker.tag) {
            m_labStartTime.text = dateStr;
            NSCalendar* calendar = [NSCalendar currentCalendar];
            NSDateComponents* dateComp = [calendar components:(NSCalendarUnitYear|NSCalendarUnitMonth|NSCalendarUnitDay|NSCalendarUnitHour|NSCalendarUnitMinute|NSCalendarUnitSecond) fromDate:m_datepicker.date];
            m_stuStartTime.dwYear = (DWORD)[dateComp year];
            m_stuStartTime.dwMonth = (DWORD)[dateComp month];
            m_stuStartTime.dwDay = (DWORD)[dateComp day];
            m_stuStartTime.dwHour = (DWORD)[dateComp hour];
            m_stuStartTime.dwMinute = (DWORD)[dateComp minute];
            m_stuStartTime.dwSecond = 0;
        }
        else {
            m_labEndTime.text = dateStr;
            NSCalendar* calendar = [NSCalendar currentCalendar];
            NSDateComponents* dateComp = [calendar components:(NSCalendarUnitYear|NSCalendarUnitMonth|NSCalendarUnitDay|NSCalendarUnitHour|NSCalendarUnitMinute|NSCalendarUnitSecond) fromDate:m_datepicker.date];
            m_stuEndTime.dwYear = (DWORD)[dateComp year];
            m_stuEndTime.dwMonth = (DWORD)[dateComp month];
            m_stuEndTime.dwDay = (DWORD)[dateComp day];
            m_stuEndTime.dwHour = (DWORD)[dateComp hour];
            m_stuEndTime.dwMinute = (DWORD)[dateComp minute];
            m_stuEndTime.dwSecond = 0;
        }
        [m_datepicker setHidden:TRUE];
    }
    [self ShowSubviews:FALSE];
}



- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
