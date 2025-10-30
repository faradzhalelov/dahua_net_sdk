//
//  UnlockFileViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/10/15.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "UnlockFileViewController.h"
#import "Global.h"
#import "FileItemTableCell.h"
#import "DHHudPrecess.h"

@interface Item : NSObject
@property (retain, nonatomic) NSString *title;
@property (assign, nonatomic) BOOL isChecked;
@property (nonatomic) int nDriveNo;
@property (nonatomic) int nStartCluster;
@end
@implementation Item
@end

@interface UnlockFileViewController ()<UIPickerViewDelegate, UIPickerViewDataSource, UITableViewDelegate, UITableViewDataSource>

@property (nonatomic, strong) UILabel *m_labChannel;
@property (nonatomic, strong) UIButton *m_btnChannel;
@property (nonatomic, strong) UIPickerView *m_pickerview;
@property (nonatomic, strong) UIButton *m_btnStartTime;
@property (nonatomic, strong) UIButton *m_btnEndTime;
@property (nonatomic, strong) UILabel *m_labStartTime;
@property (nonatomic, strong) UILabel *m_labEndTime;
@property (nonatomic, strong) UIDatePicker *m_datepicker;
@property (strong, nonatomic) UITableView *m_tableView;
@property (nonatomic, strong) UIButton *m_btnQuery;
@property (nonatomic, strong) UIButton *m_btnCheckAll;
@property (nonatomic, strong) UIButton *m_btnUnlock;
@property (nonatomic, strong) UIButton *m_btnLock;
@property (nonatomic, strong) UILabel *m_labCount;
@property (strong, nonatomic) MBProgressHUD* waitView;

@property (nonatomic) int m_nChannel;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) NET_TIME m_stuStartTime;
@property (nonatomic) NET_TIME m_stuEndTime;
@property (nonatomic) NSMutableArray *m_arrItems;
@property (nonatomic) BOOL m_bAllChecked;
@property (nonatomic) int nFileCount;
@end

@implementation UnlockFileViewController

@synthesize m_labChannel, m_btnChannel, m_btnStartTime, m_btnEndTime, m_labStartTime, m_labEndTime, m_pickerview, m_datepicker, m_stuStartTime, m_stuEndTime, m_tableView, m_btnQuery, m_btnUnlock, m_btnCheckAll, m_btnLock, m_nChannel, m_labCount, m_arrItems, waitView;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.title = _L(@"Record Lock");
    
    self.m_bAllChecked = FALSE;
    
    m_labChannel = [[UILabel alloc] init];
    [m_labChannel setFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    [m_labChannel setCenter:CGPointMake(kScreenWidth/4, kScreenHeight/40+kNavigationBarHeight)];
    m_labChannel.text = _L(@"Channel");
    m_labChannel.textColor = UIColor.blackColor;
    m_labChannel.layer.borderWidth = 1;
    m_labChannel.layer.cornerRadius = 10;
    m_labChannel.layer.masksToBounds = YES;
    m_labChannel.backgroundColor = UIColor.whiteColor;
    m_labChannel.textAlignment = NSTextAlignmentCenter;
    [m_labChannel setFont:[UIFont systemFontOfSize:24]];
    [self.view addSubview:m_labChannel];
    
    m_btnChannel = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.48, kScreenHeight/20)];
    m_btnChannel.center = CGPointMake(kScreenWidth*3/4, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"All") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onBtnChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = YES;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    
    
    m_btnStartTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnStartTime.center = CGPointMake(kScreenWidth*1/6, m_btnChannel.center.y+kScreenHeight/20*1.25);
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
    
    m_btnEndTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnEndTime.center = CGPointMake(kScreenWidth*1/6, m_btnStartTime.center.y+kScreenHeight/20*1.25);
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
    
    m_tableView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.6) style:UITableViewStylePlain];
    m_tableView.center = CGPointMake(kScreenWidth/2, m_btnEndTime.center.y + kScreenHeight/40 + kScreenHeight*0.3);
    m_tableView.rowHeight = 50;
    m_tableView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableView.separatorColor = [UIColor redColor];
    m_tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableView.backgroundColor = [UIColor whiteColor];
//    UILabel *headerLabel = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, m_tableView.rowHeight)];
//    headerLabel.text = _L(@"Marked Record List");
//    headerLabel.font = [UIFont systemFontOfSize:24];
//    headerLabel.textAlignment = NSTextAlignmentCenter;
//    headerLabel.textColor = [UIColor blackColor];
//    m_tableView.tableHeaderView = headerLabel;
//    m_tableView.allowsSelection = TRUE;
//    m_tableView.allowsMultipleSelection = TRUE;
    m_tableView.allowsSelectionDuringEditing = TRUE;
//    m_tableView.allowsMultipleSelectionDuringEditing = TRUE;
    m_tableView.delegate = self;
    m_tableView.dataSource = self;
    [self.view addSubview:m_tableView];
    
    m_btnCheckAll = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    m_btnCheckAll.center = CGPointMake(kScreenWidth*3/8, kScreenHeight-kScreenHeight/40);
    m_btnCheckAll.backgroundColor = [UIColor lightGrayColor];
    [m_btnCheckAll setTitle:_L(@"Check All") forState:UIControlStateNormal];
    [m_btnCheckAll addTarget:self action:@selector(onBtnCheckAll) forControlEvents:UIControlEventTouchUpInside];
    [m_btnCheckAll setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnCheckAll.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnCheckAll.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnCheckAll.layer.cornerRadius = 10;
    m_btnCheckAll.layer.borderWidth = 1;
    [self.view addSubview:m_btnCheckAll];
    
    m_btnQuery = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    m_btnQuery.center = CGPointMake(kScreenWidth*1/8, kScreenHeight-kScreenHeight/40);
    m_btnQuery.backgroundColor = [UIColor lightGrayColor];
    [m_btnQuery setTitle:_L(@"Query") forState:UIControlStateNormal];
    [m_btnQuery addTarget:self action:@selector(onBtnQuery) forControlEvents:UIControlEventTouchUpInside];
    [m_btnQuery setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnQuery.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnQuery.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnQuery.layer.cornerRadius = 10;
    m_btnQuery.layer.borderWidth = 1;
    [self.view addSubview:m_btnQuery];
    
    m_btnUnlock = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    m_btnUnlock.center = CGPointMake(kScreenWidth*5/8, kScreenHeight-kScreenHeight/40);
    m_btnUnlock.backgroundColor = [UIColor lightGrayColor];
    [m_btnUnlock setTitle:_L(@"Unlock") forState:UIControlStateNormal];
    [m_btnUnlock addTarget:self action:@selector(onBtnUnlock) forControlEvents:UIControlEventTouchUpInside];
    [m_btnUnlock setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnUnlock.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnUnlock.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnUnlock.layer.cornerRadius = 10;
    m_btnUnlock.layer.borderWidth = 1;
    [self.view addSubview:m_btnUnlock];
    
    m_btnLock = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    m_btnLock.center = CGPointMake(kScreenWidth*7/8, kScreenHeight-kScreenHeight/40);
    m_btnLock.backgroundColor = [UIColor lightGrayColor];
    [m_btnLock setTitle:_L(@"Lock") forState:UIControlStateNormal];
    [m_btnLock addTarget:self action:@selector(onBtnLock) forControlEvents:UIControlEventTouchUpInside];
    [m_btnLock setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnLock.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnLock.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnLock.layer.cornerRadius = 10;
    m_btnLock.layer.borderWidth = 1;
    [self.view addSubview:m_btnLock];
    
    m_labCount = [[UILabel alloc] init];
    [m_labCount setFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    [m_labCount setCenter:CGPointMake(kScreenWidth/2, kScreenHeight-kScreenHeight/40-kScreenHeight/20*1.25)];
    NSString *str =[NSString stringWithFormat:_L(@"Record Count : %d"), 0];
    m_labCount.text = str;
    m_labCount.textColor = UIColor.blackColor;
    m_labCount.layer.borderWidth = 1;
    m_labCount.layer.cornerRadius = 10;
    m_labCount.layer.masksToBounds = YES;
    m_labCount.backgroundColor = UIColor.whiteColor;
    m_labCount.textAlignment = NSTextAlignmentCenter;
    [m_labCount setFont:[UIFont systemFontOfSize:24]];
    [self.view addSubview:m_labCount];
    self.m_arrChannel = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount+1];
    [self.m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"All")]];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [self.m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"%d"), i]];
    }
    
    m_arrItems = [[NSMutableArray alloc] init];
    
    
}

- (void)ShowSubviews : (BOOL) bFlags {
    [m_labChannel setHidden:bFlags];
    [m_btnChannel setHidden:bFlags];
    [m_btnStartTime setHidden:bFlags];
    [m_btnEndTime setHidden:bFlags];
    [m_labStartTime setHidden:bFlags];
    [m_labEndTime setHidden:bFlags];
    [m_tableView setHidden:bFlags];
    [m_btnQuery setHidden:bFlags];
    [m_btnUnlock setHidden:bFlags];
    [m_btnCheckAll setHidden:bFlags];
    [m_btnLock setHidden:bFlags];
    [m_labCount setHidden:bFlags];
}

- (void)onBtnChannel {
    [self ShowSubviews:TRUE];
    [m_pickerview setHidden:FALSE];
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

void CALLBACK QueryRecordFileCallBack(LLONG lQueryHandle, LPNET_RECORDFILE_INFO pFileinfos, int nFileNum, int nError, void *pReserved, LDWORD dwUser) {
    
    UnlockFileViewController* pSelf = (__bridge UnlockFileViewController*)((void*)dwUser);
    NET_RECORDFILE_INFO *pstInfo = new NET_RECORDFILE_INFO[nFileNum];
    memset(pstInfo, 0, sizeof(NET_RECORDFILE_INFO)*nFileNum);
    memcpy(pstInfo, pFileinfos, sizeof(NET_RECORDFILE_INFO)*nFileNum);
    pSelf.nFileCount = nFileNum;
    NSLog(@"return count is %d", nFileNum);
    
    dispatch_async(dispatch_get_main_queue(), ^{
        
//        for (int i = 0; i < nFileNum; ++i) {
//            NSString *str = [NSString stringWithFormat:@"%4d-%02d-%02d %02d:%02d:%02d~%4d-%02d-%02d %02d:%02d:%02d", pFileinfos[i].starttime.dwYear, pFileinfos[i].starttime.dwMonth, pFileinfos[i].starttime.dwDay, pFileinfos[i].starttime.dwHour, pFileinfos[i].starttime.dwMinute, pFileinfos[i].starttime.dwSecond, pFileinfos[i].endtime.dwYear, pFileinfos[i].endtime.dwMonth, pFileinfos[i].endtime.dwDay, pFileinfos[i].endtime.dwHour, pFileinfos[i].endtime.dwMinute, pFileinfos[i].endtime.dwSecond];
//            Item *item = [[Item alloc] init];
//            item.title = str;
//            item.isChecked = FALSE;
//            item.nDriveNo = pFileinfos[i].driveno;
//            item.nStartCluster = pFileinfos[i].startcluster;
//            [pSelf.m_arrItems addObject:item];
//        }

		[pSelf.m_arrItems removeAllObjects];
        for (int i = 0; i < nFileNum; ++i) {
            NSString *str = [NSString stringWithFormat:@"%4d-%02d-%02d %02d:%02d:%02d~%4d-%02d-%02d %02d:%02d:%02d", pstInfo[i].starttime.dwYear, pstInfo[i].starttime.dwMonth, pstInfo[i].starttime.dwDay, pstInfo[i].starttime.dwHour, pstInfo[i].starttime.dwMinute, pstInfo[i].starttime.dwSecond, pstInfo[i].endtime.dwYear, pstInfo[i].endtime.dwMonth, pstInfo[i].endtime.dwDay, pstInfo[i].endtime.dwHour, pstInfo[i].endtime.dwMinute, pstInfo[i].endtime.dwSecond];
            Item *item = [[Item alloc] init];
            item.title = str;
            item.isChecked = FALSE;
            item.nDriveNo = pstInfo[i].driveno;
            item.nStartCluster = pstInfo[i].startcluster;
            [pSelf.m_arrItems addObject:item];
        }
        delete[] pstInfo;
//        pstInfo = NULL;
        
        NSString *str = [NSString stringWithFormat:_L(@"Record Count : %d"), nFileNum];
        [pSelf.m_labCount setText:str];
        [pSelf.m_tableView setEditing:TRUE animated:YES];
        [pSelf.m_tableView performSelector:@selector(reloadData) withObject:nil afterDelay:0.3];
        MSG(@"", _L(@"Query Record File Success"), @"");
    });
    }

- (void)onBtnQuery {
    [m_arrItems removeAllObjects];
    [m_tableView reloadData];
    NET_IN_START_QUERY_RECORDFILE stIn = {sizeof(stIn)};
    stIn.nChannelId = m_nChannel;
    stIn.nRecordFileType = EM_RECORD_TYPE_IMPORTANT;
    stIn.nStreamType = 0;
    memcpy(&stIn.stStartTime, &(m_stuStartTime), sizeof(NET_TIME));
    memcpy(&stIn.stEndTime, &(m_stuEndTime), sizeof(NET_TIME));
    stIn.nWaitTime = 10000;
    stIn.cbFunc = QueryRecordFileCallBack;
    stIn.dwUser = (LDWORD)self;
    NET_OUT_START_QUERY_RECORDFILE stOut = {sizeof(stOut)};
    BOOL bRet = CLIENT_StartQueryRecordFile(g_loginID, &stIn, &stOut);
    if (bRet) {
        NSLog(@"success");
    }
    else {
        MSG(@"", _L(@"Query Record File Failed"), @"");
        NSLog(@"error is %x", CLIENT_GetLastError());
    }
}

- (void)onBtnLock {
    NSLog(@"onBtnLock");
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    NET_IN_SET_MARK_FILE_BY_TIME stIn = {sizeof(stIn)};
    stIn.nChannel = m_nChannel;
    stIn.stuStartTime.dwYear = m_stuStartTime.dwYear;
    stIn.stuStartTime.dwMonth = m_stuStartTime.dwMonth;
    stIn.stuStartTime.dwDay = m_stuStartTime.dwDay;
    stIn.stuStartTime.dwHour = m_stuStartTime.dwHour;
    stIn.stuStartTime.dwMinute = m_stuStartTime.dwMinute;
    stIn.stuStartTime.dwSecond = m_stuStartTime.dwSecond;
    stIn.stuEndTime.dwYear = m_stuEndTime.dwYear;
    stIn.stuEndTime.dwMonth = m_stuEndTime.dwMonth;
    stIn.stuEndTime.dwDay = m_stuEndTime.dwDay;
    stIn.stuEndTime.dwHour = m_stuEndTime.dwHour;
    stIn.stuEndTime.dwMinute = m_stuEndTime.dwMinute;
    stIn.stuEndTime.dwSecond = m_stuEndTime.dwSecond;
    stIn.bFlag = TRUE;
    NET_OUT_SET_MARK_FILE_BY_TIME stOut = {sizeof(stOut)};
    BOOL bRet = CLIENT_SetMarkFileByTime(g_loginID, &stIn, &stOut, 10000);
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            if (bRet) {
                MSG("", _L(@"Lock Record Success"), "");
            }
            else {
                MSG("", _L(@"Lock Record Failed"), "");
                NSLog(@"error is %x", CLIENT_GetLastError());
            }
        });
    });
//    [self onBtnQuery];
}

- (void)onBtnUnlock {
    NSLog(@"onBtnUnlock");
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
        NSMutableArray *array = [[NSMutableArray alloc]initWithArray:m_arrItems];
        int nSuccess = 0;
        for (int i = 0; i < array.count; ++i) {
            Item *item = [array objectAtIndex:i];
            if (item.isChecked) {
                NET_IN_SET_MARK_FILE stIn = {sizeof(stIn)};
                stIn.emLockMode = EM_MARK_FILE_BY_NAME_MODE;
                stIn.emFileNameMadeType = EM_MARKFILE_NAMEMADE_JOINT;
                stIn.nDriveNo = item.nDriveNo;
                stIn.nStartCluster = item.nStartCluster;
                stIn.byImportantRecID = 0;
                NET_OUT_SET_MARK_FILE stOut = {sizeof(stOut)};
                
                BOOL bRet = CLIENT_SetMarkFile(g_loginID, &stIn, &stOut, 5000);
                if (bRet) {
                    [m_arrItems removeObject:item];
                    nSuccess++;
                }
                else {
                    NSLog(@"error is %x", CLIENT_GetLastError());
                }
            }
        }
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
        NSString *str = [NSString stringWithFormat:_L(@"Unlock %d file success"), nSuccess];
        MSG(@"", str, @"");
        NSString *str2 = [NSString stringWithFormat:_L(@"Record Count : %d"), m_arrItems.count];
            
            [m_labCount setText:str2];
            [m_tableView reloadData];
        });
        
    });
}

- (void)onBtnCheckAll {
    NSLog(@"onBtnCheckAll");
    self.m_bAllChecked = !self.m_bAllChecked;
    NSMutableArray *array = [[NSMutableArray alloc] initWithArray:m_arrItems];
    if (self.m_bAllChecked) {
        for (int i = 0; i < array.count; ++i) {
            Item *item = [array objectAtIndex:i];
            item.isChecked = TRUE;
        }
    }
    else {
        for (int i = 0; i < array.count; ++i) {
            Item *item = [array objectAtIndex:i];
            item.isChecked = FALSE;
        }
    }
    m_arrItems = [[NSMutableArray alloc] initWithArray:array];
    [m_tableView reloadData];
}

- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {
    
    return self.m_arrChannel.count;

}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{

    return [self.m_arrChannel objectAtIndex:row];
  
}

-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    
    [self.m_arrChannel objectAtIndex:row];
    self.m_nChannel = (int)row-1;
    [self.m_btnChannel setTitle:[self.m_arrChannel objectAtIndex:row]forState:UIControlStateNormal];
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


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
    
    return 1;
}


- (nonnull UITableViewCell *)tableView:(nonnull UITableView *)tableView cellForRowAtIndexPath:(nonnull NSIndexPath *)indexPath {
    
    static NSString *identifier = @"CELL";
//    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:identifier];
//    if (!cell) {
//        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:identifier];
//        cell.accessoryType = UITableViewCellAccessoryNone;
//    }
//    cell.textLabel.text = [self.m_arrFile objectAtIndex:indexPath.row];
//    cell.textLabel.font = [UIFont systemFontOfSize:18];
//    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;

    FileItemTableCell *cell = (FileItemTableCell*)[tableView dequeueReusableCellWithIdentifier:identifier];
    if (cell == nil) {
        cell = [[FileItemTableCell alloc] initWithStyle:UITableViewCellStyleValue1 reuseIdentifier:identifier];
        cell.textLabel.font = [cell.textLabel.font fontWithSize:20];
    }
    
    cell.accessoryType = UITableViewCellAccessoryNone;
    cell.textLabel.textColor = [UIColor blackColor];
    
    Item* item = [m_arrItems objectAtIndex:indexPath.row];
    NSString *str = [NSString stringWithFormat:@"%ld : %@", indexPath.row+1, item.title];
    cell.textLabel.text = str;
    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
    [cell setChecked:item.isChecked];
    return cell;

}

- (NSInteger)tableView:(nonnull UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    
    return [m_arrItems count];
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath
{
    Item* item = [m_arrItems objectAtIndex:indexPath.row];
    
//    if (self.m_tableView.editing) {
        FileItemTableCell *cell = (FileItemTableCell*)[tableView cellForRowAtIndexPath:indexPath];
        item.isChecked = !item.isChecked;
        [cell setChecked:item.isChecked];
    NSLog(@"didSelectRowAtIndexPath : %ld", (long)indexPath.row);
//    }
    
    [m_tableView deselectRowAtIndexPath:indexPath animated:YES];
}


- (UITableViewCellEditingStyle)tableView:(UITableView *)tableView editingStyleForRowAtIndexPath:(NSIndexPath *)indexPath
{
    return UITableViewCellEditingStyleNone;
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
