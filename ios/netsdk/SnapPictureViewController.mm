//
//  SnapPictureViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "SnapPictureViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "DHHudPrecess.h"
#import <fstream>

static std::ofstream s_recordfile;

static std::string strPicName ;

@interface SnapPictureViewController ()<UIPickerViewDelegate, UIPickerViewDataSource>

@property (strong, nonatomic) UIButton *m_btnChannel;
@property (strong, nonatomic) UIButton *m_btnRemoteSnap;
@property (strong, nonatomic) UIButton *m_btnTimingSnap;

@property (strong, nonatomic) UIPickerView *m_pickerview;
@property (strong, nonatomic) UIImageView *m_imageview;

@property (nonatomic) int m_nChannel;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) BOOL m_bSnap;
@end

@implementation SnapPictureViewController

@synthesize m_btnChannel, m_btnRemoteSnap, m_btnTimingSnap, m_pickerview, m_nChannel, m_arrChannel, m_imageview, m_bSnap;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Snap Picture");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    UILabel *m_labChannel = [[UILabel alloc] init];
    [m_labChannel setFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    [m_labChannel setCenter:CGPointMake(kScreenWidth/4, kScreenHeight/40+kNavigationBarHeight)];
    m_labChannel.text = _L(@"Channel");
    m_labChannel.textColor = UIColor.blackColor;
    m_labChannel.layer.borderWidth = 1;
    m_labChannel.layer.cornerRadius = 10;
    m_labChannel.layer.masksToBounds = YES;
    m_labChannel.backgroundColor = UIColor.whiteColor;
    m_labChannel.textAlignment = NSTextAlignmentCenter;
    [m_labChannel setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labChannel];
    
    m_btnChannel = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    m_btnChannel.center = CGPointMake(kScreenWidth*3/4, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"0") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onBtnChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnChannel.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    m_btnRemoteSnap = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    m_btnRemoteSnap.center = CGPointMake(kScreenWidth/4, kScreenHeight*0.8);
    m_btnRemoteSnap.backgroundColor = [UIColor lightGrayColor];
    [m_btnRemoteSnap setTitle:_L(@"Remote Snap") forState:UIControlStateNormal];
    [m_btnRemoteSnap addTarget:self action:@selector(onBtnRemoteSnap) forControlEvents:UIControlEventTouchUpInside];
    [m_btnRemoteSnap setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnRemoteSnap.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnRemoteSnap.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnRemoteSnap.layer.cornerRadius = 10;
    m_btnRemoteSnap.layer.borderWidth = 1;
    [self.view addSubview:m_btnRemoteSnap];
    
    m_btnTimingSnap = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    m_btnTimingSnap.center = CGPointMake(kScreenWidth*3/4, kScreenHeight*0.8);
    m_btnTimingSnap.backgroundColor = [UIColor lightGrayColor];
    [m_btnTimingSnap setTitle:_L(@"Timing Snap") forState:UIControlStateNormal];
    [m_btnTimingSnap addTarget:self action:@selector(onBtnTimingSnap) forControlEvents:UIControlEventTouchUpInside];
    [m_btnTimingSnap setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnTimingSnap.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnTimingSnap.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnTimingSnap.layer.cornerRadius = 10;
    m_btnTimingSnap.layer.borderWidth = 1;
    [self.view addSubview:m_btnTimingSnap];
 
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = TRUE;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    m_imageview = [[UIImageView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenWidth*3/4)];
    m_imageview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    [self.view addSubview:m_imageview];
    m_imageview.layer.borderWidth = 1;
    [m_imageview setHidden:TRUE];
    
    m_nChannel = 0;
    m_arrChannel = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"%d"), i]];
    }
    m_bSnap = FALSE;
    CLIENT_SetSnapRevCallBack(SnapRev, (LDWORD)(__bridge void*)self);
}

void SnapRev(LLONG lLoginID, BYTE *pBuf, UINT RevLen, UINT EncodeType, DWORD CmdSerial, LDWORD dwUser) {
    
    if (0 == EncodeType || 0 == RevLen) {
        return;
    }
    SnapPictureViewController *pself = (__bridge SnapPictureViewController*)(void *)dwUser;
    
    NSString *str = [pself str_now];
    const std::string strPicName = g_docFolder + "/Snap/" + [str UTF8String] + ".jpg";
    s_recordfile.open(strPicName.c_str(), std::ios_base::out|std::ios_base::binary);
    s_recordfile.write((char*)pBuf, RevLen);
    s_recordfile.close();
    
    dispatch_async(dispatch_get_main_queue(), ^{
        [pself.m_imageview setHidden:FALSE];
        NSData *data = [NSData dataWithBytes:pBuf length:RevLen];
        pself.m_imageview.image = [UIImage imageWithData:data];
//        pself.m_imageview.image = [UIImage imageWithContentsOfFile:[NSString stringWithUTF8String:strPicName.c_str()]];
    });
}

- (void)onBtnChannel {
    if (TRUE == m_pickerview.isHidden) {
        if (TRUE ==  m_bSnap) {
            [self onBtnTimingSnap];
        }
        [m_pickerview setHidden:FALSE];
        [m_imageview setHidden:TRUE];
        [m_btnRemoteSnap setEnabled:FALSE];
        [m_btnTimingSnap setEnabled:FALSE];
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
    }
    else {
        [m_pickerview setHidden:TRUE];
        [m_imageview setHidden:FALSE];
    }
}

- (void)onBtnRemoteSnap {
    NSLog(@"onBtnRemoteSnap");
//    NET_IN_SNAP_PIC_TO_FILE_PARAM pSnapPicIn = {0};
//    pSnapPicIn.dwSize = sizeof(NET_IN_SNAP_PIC_TO_FILE_PARAM);
//    pSnapPicIn.stuParam.Channel = m_nChannel;
//    pSnapPicIn.stuParam.Quality = 6;
//    pSnapPicIn.stuParam.ImageSize = 2;
//    pSnapPicIn.stuParam.mode = 0;
//    pSnapPicIn.stuParam.CmdSerial = 1;
//    NSString *str = [self str_now];
//    const std::string strPicName = g_docFolder + "/Snap/" + [str UTF8String] + ".jpg";
//    memcpy(pSnapPicIn.szFilePath, strPicName.c_str(), strPicName.length());
//    NET_OUT_SNAP_PIC_TO_FILE_PARAM pSnapPicOut = {0};
//    pSnapPicOut.dwSize = sizeof(NET_OUT_SNAP_PIC_TO_FILE_PARAM);
//    pSnapPicOut.dwPicBufLen = 1024*5000;
//    pSnapPicOut.szPicBuf = new char[1024*5000];
//    BOOL bRet = CLIENT_SnapPictureToFile(g_loginID, &pSnapPicIn,&pSnapPicOut,3000);
    SNAP_PARAMS stParams = {0};
    stParams.Channel = m_nChannel;
    stParams.Quality = 6;
    stParams.ImageSize = 2;
    stParams.mode = 0;
    BOOL bRet = CLIENT_SnapPictureEx(g_loginID, &stParams);
    if (!bRet) {
        MSG(@"", _L(@"Remote Snap Failed"), @"");
    }
    else
    {
        MSG(@"", _L(@"Remote Snap Success"), @"");
//        m_imageview.image = [UIImage imageWithContentsOfFile:[NSString stringWithUTF8String:strPicName.c_str()]];
    }
}



- (void)onBtnTimingSnap {
    NSLog(@"onBtnTimingSnap");

    SNAP_PARAMS stParams = {0};
    stParams.Channel = m_nChannel;
    stParams.Quality = 3;
    stParams.mode = 2;
    
    if (FALSE == m_bSnap) {
        BOOL bRet = CLIENT_SnapPictureEx(g_loginID, &stParams);
        if (bRet) {
            MSG(@"", _L(@"Start Timing Snap Success"), @"");
            m_bSnap = TRUE;
            [m_btnRemoteSnap setEnabled:FALSE];
            [m_btnTimingSnap setTitle:_L(@"Stop Timing Snap") forState:UIControlStateNormal];
        }
        else {
            MSG(@"", _L(@"Start Timing Snap Failed"), @"");
        }
    }
    else {
        stParams.mode = -1;
        BOOL bRet = CLIENT_SnapPictureEx(g_loginID, &stParams);
        if (bRet) {
            MSG(@"", _L(@"Stop Timing Snap Success"), @"");
            m_bSnap = FALSE;
            [m_btnRemoteSnap setEnabled:TRUE];
            [m_btnTimingSnap setTitle:_L(@"Timing Snap") forState:UIControlStateNormal];
        }
        else {
            MSG(@"", _L(@"Stop Timing Snap Failed"), @"");
        }
    }
    
}


- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {

    return m_arrChannel.count;
}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{

    return [m_arrChannel objectAtIndex:row];
}

-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {

    [m_arrChannel objectAtIndex:row];
    m_nChannel = (int)row;
    [m_btnChannel setTitle:[m_arrChannel objectAtIndex:row]forState:UIControlStateNormal];

    [m_pickerview setHidden:TRUE];
    [m_btnRemoteSnap setEnabled:TRUE];
    [m_btnTimingSnap setEnabled:TRUE];
    [m_imageview setHidden:FALSE];
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    if (FALSE == m_pickerview.isHidden) {
        [m_pickerview setHidden:TRUE];
        [m_btnRemoteSnap setEnabled:TRUE];
        [m_btnTimingSnap setEnabled:TRUE];
        [m_imageview setHidden:FALSE];
    }
}

- (NSString *)str_now
{
    time_t t;
    time(&t);
    tm* stTime = localtime(&t);
    
    NSString *str = [NSString stringWithFormat:@"%04d%02d%2d_%02d%02d%02d_ch%d",stTime->tm_year + 1900, stTime->tm_mon+1, stTime->tm_mday, stTime->tm_hour, stTime->tm_min, stTime->tm_sec, m_nChannel];
    
    return str;
}

- (void)touchesBegan:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_pickerview resignFirstResponder];
}


- (void)didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        [m_pickerview setHidden:TRUE];
        [m_btnRemoteSnap setEnabled:TRUE];
        [m_btnTimingSnap setEnabled:TRUE];
        [m_imageview setHidden:TRUE];
        if (TRUE == m_bSnap) {
            [self onBtnTimingSnap];
        }
    }
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
