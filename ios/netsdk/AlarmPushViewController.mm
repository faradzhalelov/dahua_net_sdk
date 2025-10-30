//
//  AlarmPushViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "AlarmPushViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "DHHudPrecess.h"
#import "BECheckBox.h"

static struct DHDevice{
    int m_nDeviceID;
    NSString * m_szUUID;
    NSString * m_szDeviceName;
    NSString * m_szIP;
    int m_nPort;
    NSString * m_szUser;
    NSString * m_szPassword;
    NSString * m_AESPassword;
    BOOL m_bPushNotify;
    NSString * m_szSubscribeTime;
    BOOL bAddDelNotification;
} pDevice;


@interface AlarmPushViewController ()<UITextFieldDelegate>

@property (strong, nonatomic) UITextField *m_textDeviceName;

@end

@implementation AlarmPushViewController

@synthesize m_textDeviceName;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Alarm Push");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    m_textDeviceName = [[UITextField alloc] init];
    m_textDeviceName.frame = CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20);
    m_textDeviceName.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.3);
    m_textDeviceName.borderStyle = UITextBorderStyleRoundedRect;
    m_textDeviceName.placeholder = _L(@"Device Name");
    m_textDeviceName.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textDeviceName.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textDeviceName.textColor = [UIColor blackColor];
    m_textDeviceName.font = [UIFont systemFontOfSize:24];
    m_textDeviceName.adjustsFontSizeToFitWidth = YES;
    m_textDeviceName.textAlignment = NSTextAlignmentLeft;
    m_textDeviceName.rightViewMode = UITextFieldViewModeAlways;
    m_textDeviceName.delegate = self;
    [self.view addSubview:m_textDeviceName];
    
    UIButton *m_btnSubscribe = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnSubscribe.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.5);
    m_btnSubscribe.backgroundColor = [UIColor lightGrayColor];
    [m_btnSubscribe setTitle:_L(@"Subscribe") forState:UIControlStateNormal];
    [m_btnSubscribe addTarget:self action:@selector(OnBtnSubscribe) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSubscribe setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSubscribe.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnSubscribe.layer.cornerRadius = 10;
    m_btnSubscribe.layer.borderWidth = 1;
    [self.view addSubview:m_btnSubscribe];
    
    
    UIButton *m_btnUnsubscribe = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnUnsubscribe.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.7);
    m_btnUnsubscribe.backgroundColor = [UIColor lightGrayColor];
    [m_btnUnsubscribe setTitle:_L(@"Unsubscribe") forState:UIControlStateNormal];
    [m_btnUnsubscribe addTarget:self action:@selector(OnBtnUnsubscribe) forControlEvents:UIControlEventTouchUpInside];
    [m_btnUnsubscribe setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnUnsubscribe.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnUnsubscribe.layer.cornerRadius = 10;
    m_btnUnsubscribe.layer.borderWidth = 1;
    [self.view addSubview:m_btnUnsubscribe];
    
    
    //仅供编译，需要修改
    pDevice.m_szDeviceName = m_textDeviceName.text;
    pDevice.m_szIP = g_szIP;
    pDevice.m_nPort = g_nPort;
    pDevice.m_szUser = g_szUser;
    pDevice.m_szPassword = g_szPassword;
    
    [self GetMobilePushCaps];
    
}

- (void)GetMobilePushCaps{
    pDevice.bAddDelNotification = FALSE;
    // 获取手机推送支持能力
    NET_IN_GET_MOBILE_PUSHER_CAPS stuCapsIn = {sizeof(stuCapsIn)};
    NET_OUT_GET_MOBILE_PUSHER_CAPS stuCapsOut = {sizeof(stuCapsOut)};
    BOOL bRet = CLIENT_GetMobilePusherCaps(g_loginID, &stuCapsIn, &stuCapsOut, 5000);
    if (bRet) {
        if (stuCapsOut.bAddNotification && stuCapsOut.bDelNotification) {
            pDevice.bAddDelNotification = TRUE;
        }
    }
    else
    {
        NSLog(@"CLIENT_GetMobilePusherCaps failed------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Get mobile push caps failed!"), @"");
    }
}

- (void)OnBtnSubscribe {
    
    if (m_textDeviceName.text.length == 0) {
        MSG(@"", _L(@"Device name cannot be NULL"), @"");
        return ;
    }
    pDevice.m_szDeviceName = m_textDeviceName.text;
    
    if (pDevice.bAddDelNotification) {
        [self AddMobilePusherNotification];
    }
    else
    {
        [self SubscribeCfg];
    }
    
}

- (void)OnBtnUnsubscribe {
    
    if (pDevice.bAddDelNotification) {
        [self DelMobilePusherNotification];
    }
    else
    {
        [self UnsubscribeCfg];
    }
}

- (void)Subscribe {
    NET_MOBILE_PUSH_NOTIFY mobilePushNotify = {sizeof(NET_MOBILE_PUSH_NOTIFY)};
    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(mobilePushNotify.szRegisterID, [deviceToken UTF8String]);
    // 平台类型
    mobilePushNotify.emServerType = EM_MOBILE_SERVER_TYPE_APPLE;
    // 有效时间，单位为秒
    mobilePushNotify.nPeriodOfValidity = 365*24*60*60;
    // 推送服务器地址(大华代理，末选服务器，供兼容) 2018年8月关闭，为了兼容部分设备，保留该字段下发与主服务器一致
    strcpy(mobilePushNotify.szPushServerAddr, [@"push.messagepush.org" UTF8String]);
    // 推送服务器端口(大华代理)
    mobilePushNotify.nPushServerPort = 8888;
    // 推送服务器配置
    NET_PUSH_SERVER_INFO mainPushServerInfo;
    strcpy(mainPushServerInfo.szAddress, [@"push.messagepush.org" UTF8String]);
    mainPushServerInfo.nPort = 8888;
    mobilePushNotify.stuPushServerMain = mainPushServerInfo;
    
    
    NSString* strDevName = pDevice.m_szDeviceName;
    NSUInteger nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
    
    BOOL bFlag = FALSE;
    
    while (nLen2 > 20)
    {
        NSUInteger nIndex = [strDevName length];
        strDevName =[strDevName substringToIndex:nIndex-1];
        const char *tempText = [strDevName UTF8String];
        if (tempText == NULL)//若是图标，会占2个以上的字节（一般是4个），所以要再减一个string尝试(string占2个字节)
        {
            continue;
        }
        
        nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
        
        bFlag = TRUE;
    }
    
    if (bFlag)
    {
        strDevName = [NSString stringWithFormat:@"%@...",strDevName];
    }
    // 设备别名，手机端设置显示
    strcpy(mobilePushNotify.szDevName,[strDevName UTF8String]);
    // 设备标识，手机端设置使用
    if (pDevice.m_szSubscribeTime == nil)
    {
        NSDateFormatter *format = [[NSDateFormatter alloc] init];
        [format setDateFormat:@"YYYYMMddHHmmss"];
        NSString* localString = [format stringFromDate:[NSDate date]];
        
        pDevice.m_szSubscribeTime = [localString substringFromIndex:4] ;
    }
    
    NSString* sDevID = pDevice.m_szSubscribeTime;
    strcpy(mobilePushNotify.szDevID, [sDevID UTF8String]);
    // 登陆用户名
    strcpy(mobilePushNotify.szUser, [@"iOS" UTF8String]);
    // 登陆密码
    strcpy(mobilePushNotify.szPassword, [@"" UTF8String]);
    // ios证书信息，base64之后的字符串，需要采用TLS加密时有效
    NSString *pemFilePath = [[NSBundle mainBundle]    pathForResource:@"apns-production" ofType:@"pem"];
//    NSString *appid = [[[NSBundle mainBundle] infoDictionary] objectForKey:(NSString *)kCFBundleIdentifierKey];
//    if ([appid isEqualToString:@"com.dahuatech.netsdk"]) {
//        pemFilePath = [[NSBundle mainBundle]    pathForResource:@"apns-production1" ofType:@"pem"];
//    }else if ([appid isEqualToString:@"com.dahuatech.netsdk2"]){
//        pemFilePath = [[NSBundle mainBundle]    pathForResource:@"apns-production2" ofType:@"pem"];
//    }
    //#endif
    NSError* pError;
    NSString* cerString = [NSString stringWithContentsOfFile:pemFilePath encoding:NSUTF8StringEncoding error:&pError];
    strcpy(mobilePushNotify.szCertificate, [cerString UTF8String]);
    
    int nChnCount = g_ChannelCount;
    if (0 == nChnCount) {
        MSG(@"", _L(@"Device has no channel"), @"");
    }
    mobilePushNotify.nSubScribeMax = 3;
    mobilePushNotify.nSubScribeNum = 3;
    mobilePushNotify.pstuSubscribes = (NET_SUBSCRIBE_INFO*)malloc(sizeof(NET_SUBSCRIBE_INFO) * mobilePushNotify.nSubScribeMax);
    if (!mobilePushNotify.pstuSubscribes)
    {
        return;
    }
    memset(mobilePushNotify.pstuSubscribes, 0, sizeof(NET_SUBSCRIBE_INFO)*mobilePushNotify.nSubScribeMax);
    mobilePushNotify.pstuSubscribes[0].nCode = EVENT_ALARM_MOTIONDETECT;
    mobilePushNotify.pstuSubscribes[0].nChnNum = nChnCount;
    mobilePushNotify.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    mobilePushNotify.pstuSubscribes[1].nCode = EVENT_IVS_CALLNOANSWERED;
    mobilePushNotify.pstuSubscribes[1].nChnNum = nChnCount;
    mobilePushNotify.pstuSubscribes[1].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    mobilePushNotify.pstuSubscribes[2].nCode = EVENT_IVS_PROFILEALARMTRANSMIT;
    mobilePushNotify.pstuSubscribes[2].nChnNum = nChnCount;
    mobilePushNotify.pstuSubscribes[2].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    for (int j = 0; j < nChnCount; j++)
    {
        mobilePushNotify.pstuSubscribes[0].nIndexs[j] = j;
        mobilePushNotify.pstuSubscribes[1].nIndexs[j] = j;
        mobilePushNotify.pstuSubscribes[2].nIndexs[j] = j;
    }
    
    int nRestart;
    int nError;
    BOOL bRet = CLIENT_SetMobileSubscribe(g_loginID, &mobilePushNotify, &nError, &nRestart, 3000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Subscribe Alarm Push Failed"), @"");
    }
    else {
        MSG(@"", _L(@"Subscribe Alarm Push Success"), @"");
    }
    
    // 释放订阅的空间
    free(mobilePushNotify.pstuSubscribes);
    mobilePushNotify.pstuSubscribes = NULL;
}

- (void)Unsubscribe {
    
    NET_MOBILE_PUSH_NOTIFY_DEL stuIn1;
    memset(&stuIn1, 0, sizeof(stuIn1));
    stuIn1.dwSize = sizeof(stuIn1);

    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(stuIn1.szRegisterID, [deviceToken UTF8String]);
    NET_OUT_DELETECFG stuOut1 = {sizeof(NET_OUT_DELETECFG)};
    BOOL bRet = CLIENT_DelMobileSubscribe(g_loginID, &stuIn1, &stuOut1, 5000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Unsubscribe Alarm Push Failed"), @"");
    }
    else
    {
        if (0 == stuOut1.dwOptionMask) {
            MSG(@"", _L(@"Unsubscribe Alarm Push Success"), @"");
        } else {
            MSG(@"", _L(@"Unsubscribe Alarm Push Failed"), @"");
            // 返回选项，根据返回字段做后续处理
            NSLog(@"dwOptionMask is %d", stuOut1.dwOptionMask);
        }
    }
}

- (void)SubscribeCfg {
    NET_MOBILE_PUSH_NOTIFY_CFG mobilePushNotifyCfg = {sizeof(NET_MOBILE_PUSH_NOTIFY_CFG)};
    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(mobilePushNotifyCfg.szRegisterID, [deviceToken UTF8String]);
    // AppID内容不能带点号,点号可以用下划线代替
    NSString *appID = [[NSBundle mainBundle] bundleIdentifier];
    //strcpy(mobilePushNotifyCfg.szAppID, [appID UTF8String]);
    strcpy(mobilePushNotifyCfg.szAppID, "com_dahuatech_netsdk_test1");
    // 平台类型
    mobilePushNotifyCfg.emServerType = EM_MOBILE_SERVER_TYPE_APPLE;
    // 有效时间，单位为秒
    mobilePushNotifyCfg.nPeriodOfValidity = 365*24*60*60;
    // 推送服务器地址(大华代理，末选服务器，供兼容),
    // 2018年8月关闭，为了兼容部分设备，保留该字段下发与主服务器一致
    strcpy(mobilePushNotifyCfg.szPushServerAddr, [@"push.messagepush.org" UTF8String]);
    // 推送服务器端口(大华代理)
    mobilePushNotifyCfg.nPushServerPort = 8888;
    // 推送服务器配置
    NET_PUSH_SERVER_INFO mainPushServerInfo;
    // SDK Demo在测试时使用的调试版本证书，故服务器地址为gateway.sandbox.push.apple.com；
    // 若为发布证书，则推送服务器地址：gateway.push.apple.com
    strcpy(mainPushServerInfo.szAddress, [@"push.messagepush.org" UTF8String]);
    mainPushServerInfo.nPort = 8888;
    mobilePushNotifyCfg.stuPushServerMain = mainPushServerInfo;
    
    
    NSString* strDevName = pDevice.m_szDeviceName;
    NSUInteger nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
    
    BOOL bFlag = FALSE;
    
    while (nLen2 > 20)
    {
        NSUInteger nIndex = [strDevName length];
        strDevName =[strDevName substringToIndex:nIndex-1];
        const char *tempText = [strDevName UTF8String];
        if (tempText == NULL)//若是图标，会占2个以上的字节（一般是4个），所以要再减一个string尝试(string占2个字节)
        {
            continue;
        }
        
        nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
        
        bFlag = TRUE;
    }
    
    if (bFlag)
    {
        strDevName = [NSString stringWithFormat:@"%@...",strDevName];
    }
    // 设备别名，手机端设置显示
    strcpy(mobilePushNotifyCfg.szDevName,[strDevName UTF8String]);
    // 设备标识，手机端设置使用
    if (pDevice.m_szSubscribeTime == nil)
    {
        NSDateFormatter *format = [[NSDateFormatter alloc] init];
        [format setDateFormat:@"YYYYMMddHHmmss"];
        NSString* localString = [format stringFromDate:[NSDate date]];
        
        pDevice.m_szSubscribeTime = [localString substringFromIndex:4] ;
    }
    
    NSString* sDevID = pDevice.m_szSubscribeTime;
    strcpy(mobilePushNotifyCfg.szDevID, [sDevID UTF8String]);
    // 登陆用户名
    strcpy(mobilePushNotifyCfg.szUser, [@"iOS" UTF8String]);
    // 登陆密码
    strcpy(mobilePushNotifyCfg.szPassword, [@"" UTF8String]);
    // ios证书信息，base64之后的字符串，需要采用TLS加密时有效
    NSString *pemFilePath = [[NSBundle mainBundle]    pathForResource:@"apns-production" ofType:@"pem"];
    
    //#endif
    NSError* pError;
    NSString* cerString = [NSString stringWithContentsOfFile:pemFilePath encoding:NSUTF8StringEncoding error:&pError];
    strcpy(mobilePushNotifyCfg.szCertificate, [cerString UTF8String]);
    
    int nChnCount = g_ChannelCount;
    if (0 == nChnCount) {
        MSG(@"", _L(@"Device has no channel"), @"");
    }
    mobilePushNotifyCfg.nSubScribeMax = 3;
    mobilePushNotifyCfg.nSubScribeNum = 3;
    mobilePushNotifyCfg.pstuSubscribes = (NET_SUBSCRIBE_INFO*)malloc(sizeof(NET_SUBSCRIBE_INFO) * mobilePushNotifyCfg.nSubScribeMax);
    
    if (!mobilePushNotifyCfg.pstuSubscribes)
    {
        return;
    }
    memset(mobilePushNotifyCfg.pstuSubscribes, 0, sizeof(NET_SUBSCRIBE_INFO)*mobilePushNotifyCfg.nSubScribeMax);
    mobilePushNotifyCfg.pstuSubscribes[0].nCode = EVENT_ALARM_MOTIONDETECT;
    mobilePushNotifyCfg.pstuSubscribes[0].nChnNum = nChnCount;
    mobilePushNotifyCfg.pstuSubscribes[0].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    
    mobilePushNotifyCfg.pstuSubscribes[1].nCode = EVENT_IVS_CALLNOANSWERED;
    mobilePushNotifyCfg.pstuSubscribes[1].nChnNum = nChnCount;
    mobilePushNotifyCfg.pstuSubscribes[1].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    mobilePushNotifyCfg.pstuSubscribes[2].nCode = EVENT_IVS_PROFILEALARMTRANSMIT;
    mobilePushNotifyCfg.pstuSubscribes[2].nChnNum = nChnCount;
    mobilePushNotifyCfg.pstuSubscribes[2].emSubCode = EM_EVENT_SUB_CODE_UNKNOWN;
    for (int j = 0; j < nChnCount; j++)
    {
        mobilePushNotifyCfg.pstuSubscribes[0].nIndexs[j] = j;
        mobilePushNotifyCfg.pstuSubscribes[1].nIndexs[j] = j;
        mobilePushNotifyCfg.pstuSubscribes[2].nIndexs[j] = j;
    }
    
    int nRestart;
    int nError;
    BOOL bRet = CLIENT_SetMobileSubscribeCfg(g_loginID, &mobilePushNotifyCfg, &nError, &nRestart, 10000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Subscribe Alarm Push Failed"), @"");
    }
    else {
        MSG(@"", _L(@"Subscribe Alarm Push Success"), @"");
    }
    
    // 释放订阅的空间
    free(mobilePushNotifyCfg.pstuSubscribes);
    mobilePushNotifyCfg.pstuSubscribes = NULL;
}


- (void)UnsubscribeCfg {

    NET_MOBILE_PUSH_NOTIFY_CFG_DEL stuIn2;
    memset(&stuIn2, 0, sizeof(stuIn2));
    stuIn2.dwSize = sizeof(stuIn2);
    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(stuIn2.szRegisterID, [deviceToken UTF8String]);
    NSLog(@"szRegisterID is %s", stuIn2.szRegisterID);
    // AppID内容不能带点号,点号可以用下划线代替
    NSString *appID = [[NSBundle mainBundle] bundleIdentifier];
    //strcpy(stuIn2.szAppID, [appID UTF8String]);
    strcpy(stuIn2.szAppID, "com_dahuatech_netsdk_test1");
    
    NET_OUT_DELETECFG stuOut2 = {sizeof(NET_OUT_DELETECFG)};
    BOOL bRet = CLIENT_DelMobileSubscribeCfg(g_loginID, &stuIn2, &stuOut2, 10000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Unsubscribe Alarm Push Failed"), @"");
    }
    else
    {
        if (0 == stuOut2.dwOptionMask) {
            MSG(@"", _L(@"Unsubscribe Alarm Push Success"), @"");
        } else {
            MSG(@"", _L(@"Unsubscribe Alarm Push Failed"), @"");
            // 返回选项，根据返回字段做后续处理
            NSLog(@"dwOptionMask is %d", stuOut2.dwOptionMask);
        }
    }
}

- (void)AddMobilePusherNotification {
    NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION stuPushInfo = {sizeof(stuPushInfo)};
    NET_OUT_ADD_MOBILE_PUSHER_NOTIFICATION stuPushOut = {sizeof(stuPushOut)};
    
    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(stuPushInfo.szRegisterID, [deviceToken UTF8String]);
    NSString *appID = [[NSBundle mainBundle] bundleIdentifier];
    //strcpy(stuPushInfo.szAppID, [appID UTF8String]);
    strcpy(stuPushInfo.szAppID, "com_dahuatech_netsdk_test1");
    // 平台类型
    stuPushInfo.emServerType = EM_MOBILE_SERVER_TYPE_APPLE;
    // 有效时间，单位为秒
    stuPushInfo.nPeriodOfValidity = 365*24*60*60;
    // 推送服务器地址(大华代理，末选服务器，供兼容),
    // 2018年8月关闭，为了兼容部分设备，保留该字段下发与主服务器一致
    strcpy(stuPushInfo.szPushServerAddr, [@"push.messagepush.org" UTF8String]);
    // 推送服务器端口(大华代理)
    stuPushInfo.nPushServerPort = 8888;

    // 推送服务器配置
    NET_PUSH_SERVER_INFO_EX mainPushServerInfo;
    strcpy(mainPushServerInfo.szAddress, [@"push.messagepush.org" UTF8String]);
    mainPushServerInfo.nPort = 8888;
    stuPushInfo.stuPushServerMain = mainPushServerInfo;
    
    NSString* strDevName = pDevice.m_szDeviceName;
    NSUInteger nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
    
    BOOL bFlag = FALSE;
    
    while (nLen2 > 20)
    {
        NSUInteger nIndex = [strDevName length];
        strDevName =[strDevName substringToIndex:nIndex-1];
        const char *tempText = [strDevName UTF8String];
        if (tempText == NULL)//若是图标，会占2个以上的字节（一般是4个），所以要再减一个string尝试(string占2个字节)
        {
            continue;
        }
        
        nLen2 = [strDevName lengthOfBytesUsingEncoding:NSUTF8StringEncoding];
        
        bFlag = TRUE;
    }
    
    if (bFlag)
    {
        strDevName = [NSString stringWithFormat:@"%@...",strDevName];
    }
    // 设备别名，手机端设置显示
    strcpy(stuPushInfo.szDevName,[strDevName UTF8String]);
    // 设备标识，手机端设置使用
    if (pDevice.m_szSubscribeTime == nil)
    {
        NSDateFormatter *format = [[NSDateFormatter alloc] init];
        [format setDateFormat:@"YYYYMMddHHmmss"];
        NSString* localString = [format stringFromDate:[NSDate date]];
        
        pDevice.m_szSubscribeTime = [localString substringFromIndex:4] ;
    }
    
    NSString* sDevID = pDevice.m_szSubscribeTime;
    strcpy(stuPushInfo.szDevID, [sDevID UTF8String]);
    // 登陆用户名
    strcpy(stuPushInfo.szUser, [@"iOS" UTF8String]);

    // ios证书信息，base64之后的字符串，需要采用TLS加密时有效
    NSString *pemFilePath = [[NSBundle mainBundle]    pathForResource:@"apns-production" ofType:@"pem"];
    //#endif
    NSError* pError;
    NSString* cerString = [NSString stringWithContentsOfFile:pemFilePath encoding:NSUTF8StringEncoding error:&pError];
    // iOS证书信息
    strcpy(stuPushInfo.szCertificate, [cerString UTF8String]);
    
    int nChnCount = g_ChannelCount;
    if (0 == nChnCount) {
        MSG(@"", _L(@"Device has no channel"), @"");
    }
    stuPushInfo.nSubScribeNum = 3;
    stuPushInfo.pstuSubscribes = (NET_SUBSCRIBE_INFO_EX*)malloc(sizeof(NET_SUBSCRIBE_INFO_EX) * stuPushInfo.nSubScribeNum);
    
    if (!stuPushInfo.pstuSubscribes)
    {
        return;
    }
    memset(stuPushInfo.pstuSubscribes, 0, sizeof(NET_SUBSCRIBE_INFO_EX)*stuPushInfo.nSubScribeNum);
    
    strcpy(stuPushInfo.pstuSubscribes[0].szCode, "VideoMotion");
    stuPushInfo.pstuSubscribes[0].nChnNum = nChnCount;
    strcpy(stuPushInfo.pstuSubscribes[1].szCode, "CallNoAnswered");
    stuPushInfo.pstuSubscribes[1].nChnNum = nChnCount;
    strcpy(stuPushInfo.pstuSubscribes[2].szCode, "ProfileAlarmTransmit");
    stuPushInfo.pstuSubscribes[2].nChnNum = nChnCount;

    for (int j = 0; j < nChnCount; j++)
    {
        stuPushInfo.pstuSubscribes[0].nIndexs[j] = j;
        stuPushInfo.pstuSubscribes[1].nIndexs[j] = j;
        stuPushInfo.pstuSubscribes[2].nIndexs[j] = j;
    }
    
    BOOL bRet = CLIENT_AddMobilePusherNotification(g_loginID, &stuPushInfo, &stuPushOut,10000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Subscribe Alarm Push Failed"), @"");
    }
    else {
        MSG(@"", _L(@"Subscribe Alarm Push Success"), @"");
    }
    
    // 释放订阅的空间
    free(stuPushInfo.pstuSubscribes);
    stuPushInfo.pstuSubscribes = NULL;
}


- (void)DelMobilePusherNotification {
    
    NET_IN_DEL_MOBILE_PUSHER_NOTIFICATION stuDelInfo = {sizeof(stuDelInfo)};
    NET_OUT_DEL_MOBILE_PUSHER_NOTIFICATION stuDelOut = {sizeof(stuDelOut)};
    
    NSString* deviceToken = [NSString stringWithFormat:@"%@", g_Token];
    deviceToken = [deviceToken stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
    // 手机向Appple/ Android服务器注册返回的，每次不同
    strcpy(stuDelInfo.szRegisterID, [deviceToken UTF8String]);
    NSString *appID = [[NSBundle mainBundle] bundleIdentifier];
    //strcpy(stuDelInfo.szAppID, [appID UTF8String]);
    strcpy(stuDelInfo.szAppID, "com_dahuatech_netsdk_test1");
    
    BOOL bRet = CLIENT_DelMobilePusherNotification(g_loginID, &stuDelInfo, &stuDelOut, 10000);
    if (!bRet) {
        NSLog(@"------错误码：%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Unsubscribe Alarm Push Failed"), @"");
    }
    else
    {
        MSG(@"", _L(@"Unsubscribe Alarm Push Success"), @"");
    }
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_textDeviceName       resignFirstResponder];
}

- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_textDeviceName       resignFirstResponder];
    return TRUE;
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
