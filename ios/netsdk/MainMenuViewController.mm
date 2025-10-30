//
//  ViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/5.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "MainMenuViewController.h"
#import "IPLoginViewController.h"
#import "P2PLoginViewController.h"
#import "SmartConfigViewController.h"
#import "InitDevAccountViewController.h"
#import "SearchDeviceViewController.h"
#import "AccessPointViewController.h"
#import "netsdk.h"
#import "Global.h"
#import <CoreLocation/CLLocationManager.h>


@interface MainMenuViewController ()

@property (nonatomic, strong) CLLocationManager *locationManager;

//@property (strong, nonatomic) IBOutlet UILabel  *m_labTitle;
//@property (strong, nonatomic) IBOutlet UIButton *m_btnLogin;
//@property (strong, nonatomic) IBOutlet UIButton *m_btnP2PLogin;
//@property (strong, nonatomic) IBOutlet UIButton *m_btnSmartConfig;
//@property (strong, nonatomic) IBOutlet UIButton *m_btnInitDevAccount;
//@property (strong, nonatomic) IBOutlet UILabel  *m_labRight;
//
//
//- (IBAction)onIPLogin:(id)sender;
//- (IBAction)onP2PLogin:(id)sender;
//- (IBAction)onSmartConfig:(id)sender;
//- (IBAction)onInitDevAccount:(id)sender;

@end

@implementation MainMenuViewController

//@synthesize m_labTitle, m_btnLogin, m_btnP2PLogin, m_btnSmartConfig, m_btnInitDevAccount, m_labRight;

- (instancetype)init
{
    self = [super init];
    if (self) {
        [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(applicationWillEnterForeground) name:UIApplicationWillEnterForegroundNotification object:NULL];
        [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(applicationDidEnterBackground) name:UIApplicationDidEnterBackgroundNotification object:NULL];
    }
    
    return self;
}

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.

    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
//    self.navigationItem.leftBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:@"" style:UIBarButtonItemStyleDone target:self action:nil];
//    if ([self.navigationController respondsToSelector:@selector(interactivePopGestureRecognizer)]) {
//        self.navigationController.interactivePopGestureRecognizer.enabled = NO;
//    }
    
    
    UILabel* m_labTitle = [[UILabel alloc]initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.1)];
    m_labTitle.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.25);
    m_labTitle.text = _L(@"NetSDK Demo");
    m_labTitle.font = [UIFont systemFontOfSize:50];
    m_labTitle.textAlignment = NSTextAlignmentCenter;
    m_labTitle.adjustsFontSizeToFitWidth = YES;
    [self.view addSubview:m_labTitle];
    
    UIButton* m_btnLogin = [[UIButton alloc] init];
    m_btnLogin.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnLogin.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.4);
    m_btnLogin.backgroundColor = [UIColor lightGrayColor];
    [m_btnLogin setTitle:_L(@"IP Login") forState:UIControlStateNormal];
    [m_btnLogin addTarget:self action:@selector(onIPLogin) forControlEvents:UIControlEventTouchUpInside];
    [m_btnLogin setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnLogin.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnLogin.layer.cornerRadius = 10;
    m_btnLogin.layer.borderWidth = 1;
    
    
    UIButton* m_btnP2PLogin = [[UIButton alloc] init];
    m_btnP2PLogin.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnP2PLogin.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.5);
    m_btnP2PLogin.backgroundColor = [UIColor lightGrayColor];
    [m_btnP2PLogin setTitle:_L(@"P2P Login") forState:UIControlStateNormal];
    [m_btnP2PLogin addTarget:self action:@selector(onP2PLogin) forControlEvents:UIControlEventTouchUpInside];
    [m_btnP2PLogin setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnP2PLogin.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnP2PLogin.layer.cornerRadius = 10;
    m_btnP2PLogin.layer.borderWidth = 1;
    m_btnP2PLogin.hidden = YES;

    UIButton* m_btnSmartConfig = [[UIButton alloc] init];
    m_btnSmartConfig.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnSmartConfig.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    m_btnSmartConfig.backgroundColor = [UIColor lightGrayColor];
    [m_btnSmartConfig setTitle:_L(@"Smart Config") forState:UIControlStateNormal];
    [m_btnSmartConfig addTarget:self action:@selector(onSmartConfig) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSmartConfig setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSmartConfig.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnSmartConfig.layer.cornerRadius = 10;
    m_btnSmartConfig.layer.borderWidth = 1;
    
    UIButton *m_btnSearchDevice = [[UIButton alloc] init];
    m_btnSearchDevice.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnSearchDevice.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    m_btnSearchDevice.backgroundColor = [UIColor lightGrayColor];
    [m_btnSearchDevice setTitle:_L(@"Search Device") forState:UIControlStateNormal];
    [m_btnSearchDevice addTarget:self action:@selector(onSearchDevice) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSearchDevice setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSearchDevice.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnSearchDevice.layer.cornerRadius = 10;
    m_btnSearchDevice.layer.borderWidth = 1;
    
    UIButton* m_btnInitDevAccount = [[UIButton alloc] init];
    m_btnInitDevAccount.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnInitDevAccount.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.7);
    m_btnInitDevAccount.backgroundColor = [UIColor lightGrayColor];
    [m_btnInitDevAccount setTitle:_L(@"Init Dev Account") forState:UIControlStateNormal];
    [m_btnInitDevAccount addTarget:self action:@selector(onInitDevAccount) forControlEvents:UIControlEventTouchUpInside];
    [m_btnInitDevAccount setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnInitDevAccount.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnInitDevAccount.layer.cornerRadius = 10;
    m_btnInitDevAccount.layer.borderWidth = 1;
    
    UIButton *m_btnAPConfig = [[UIButton alloc] init];
    m_btnAPConfig.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnAPConfig.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.8);
    m_btnAPConfig.backgroundColor = [UIColor lightGrayColor];
    [m_btnAPConfig setTitle:_L(@"APConfig") forState:UIControlStateNormal];
    [m_btnAPConfig addTarget:self action:@selector(onAPConfig) forControlEvents:UIControlEventTouchUpInside];
    [m_btnAPConfig setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnAPConfig.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnAPConfig.layer.cornerRadius = 10;
    m_btnAPConfig.layer.borderWidth = 1;
    
    [self.view addSubview:m_btnLogin];
    [self.view addSubview:m_btnP2PLogin];
//    [self.view addSubview:m_btnSmartConfig];
    [self.view addSubview:m_btnInitDevAccount];
    [self.view addSubview:m_btnSearchDevice];
    [self.view addSubview:m_btnAPConfig];
    
    self.locationManager = [[CLLocationManager alloc]init];
    self.locationManager.distanceFilter = 1.0f;
    [self.locationManager requestAlwaysAuthorization];
    [self.locationManager startUpdatingLocation];
    
//    UILabel* m_labRight = [[UILabel alloc]initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.05)];
//    m_labRight.center = CGPointMake(kScreenWidth/2, kScreenHeight*39/40 - kTabBarHeight + 49);
//    m_labRight.text = _L(@"Copyright © 2018年 NetSDK. All rights reserved.");
//    m_labRight.textAlignment = NSTextAlignmentCenter;
//    m_labRight.adjustsFontSizeToFitWidth = YES;
//    [self.view addSubview:m_labRight];
    
    
    [self createFolderWithDevID:@"Record"];
    [self createFolderWithDevID:@"Snap"];
    
    
    CLIENT_Init(cbDisConnect, (LDWORD)(__bridge void*)self); 
	
    //日志打印
    LOG_SET_PRINT_INFO logPrintInfo;
    memset(&logPrintInfo, 0, sizeof(LOG_SET_PRINT_INFO));
    logPrintInfo.dwSize = sizeof(LOG_SET_PRINT_INFO);
    logPrintInfo.bSetFilePath = YES;
    const std::string docFolder = [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES)[0] UTF8String];
    const std::string fileName = docFolder + "/sdk_log/sdk_log.log";
    strncpy(logPrintInfo.szLogFilePath, fileName.c_str(), sizeof(logPrintInfo.szLogFilePath) - 1);
    logPrintInfo.bSetPrintStrategy = TRUE;
    logPrintInfo.nPrintStrategy = 0;
    CLIENT_LogOpen(&logPrintInfo);
    NSLog(@"sdk_log:%s", fileName.c_str());
    
	// set login optimization
    int value = OPTTYPE_MOBILE_DEVICE_ATTR | OPTTYPE_MOBILE_DEVICE_SN |OPTTYPE_MOBILE_DISK_INFO | OPTTYPE_MOBILE_DIGITAL_NUM | OPTTYPE_MOBILE_ALARM_IO | OPTTYPE_MOBILE_DEVICE_ABILITY | OPTTYPE_MOBILE_STATE_SOFTWARE;
    BOOL bRet = CLIENT_SetOptimizeMode(EM_OPT_TYPE_MOBILE_OPTION, &value);
    if (bRet) {
               NSLog(@"CLIENT_SetOptimizeMode success");
           } else {
               NSLog(@"CLIENT_SetOptimizeMode Failed, error is %x", CLIENT_GetLastError());
           }
    
    // write log file
//        NSString *documentDirectory = [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES) objectAtIndex:0];
//        NSDateFormatter *dateformat = [[NSDateFormatter alloc] init];
//        [dateformat setDateFormat:@"yyyy-MM-dd-HH-mm-ss"];
//        NSString *fileName = [NSString stringWithFormat:@"NetSDKLog-%@.txt", [dateformat stringFromDate:[NSDate date]]];
//        NSString *logFilePath = [documentDirectory stringByAppendingPathComponent:fileName];
//        // 先删除已经存在的文件
//        NSFileManager *defaultManager = [NSFileManager defaultManager];
//        [defaultManager removeItemAtPath:logFilePath error:nil];
        
//        freopen([logFilePath cStringUsingEncoding:NSASCIIStringEncoding], "a+", stdout);
//        freopen([logFilePath cStringUsingEncoding:NSASCIIStringEncoding], "a+", stderr);


    
    NSString* phoneVersion = [[UIDevice currentDevice] systemVersion];
    CGFloat version = [phoneVersion floatValue];
    // 判断系统是否高于ios13
    if (version >=13) {
        // 判断当前位置权限是否被打开
        if (!(([CLLocationManager authorizationStatus] == kCLAuthorizationStatusAuthorizedAlways) || ([CLLocationManager authorizationStatus] == kCLAuthorizationStatusAuthorizedWhenInUse))) {

            // 弹出 去设置 的窗口
            UIAlertController * alertVC = [UIAlertController alertControllerWithTitle:_L(@"Please open location information authorization") message:@"" preferredStyle:UIAlertControllerStyleAlert];
            UIAlertAction * ok = [UIAlertAction actionWithTitle:_L(@"Go to Set") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
                //打开app定位设置
                NSURL *settingsURL = [NSURL URLWithString:UIApplicationOpenSettingsURLString];
                [[UIApplication sharedApplication] openURL:settingsURL];

            }];
            [alertVC addAction:ok];
            [self presentViewController:alertVC animated:YES completion:nil];
            return;
        }
    }

}

- (void)viewDidAppear:(BOOL)animated {
    [super viewDidAppear:animated];
    [super viewDidAppear:animated];
    if ([self.navigationController respondsToSelector:@selector(interactivePopGestureRecognizer)]) {
        self.navigationController.interactivePopGestureRecognizer.enabled = NO;
    }
}
void cbDisConnect(LLONG lLoginID, char *pchDVRIP, LONG nDVRPort, LDWORD dwUser)
{
    NSString* ip = [[NSString alloc] initWithUTF8String:pchDVRIP];
    NSString *str = [NSString stringWithFormat:_L(@"Device %@ is disconnected"), ip];
    UIAlertController *alert = [UIAlertController alertControllerWithTitle:_L(@"") message:str preferredStyle:UIAlertControllerStyleAlert];
    UIAlertAction *okAction = [UIAlertAction actionWithTitle:_L(@"OK") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
        NSLog(@"OK Action");
    }];
    [alert addAction:okAction];
    
    MainMenuViewController *pself = (__bridge MainMenuViewController*)(void *)dwUser;
//    [pself presentViewController:alert animated:TRUE completion:^{
//        [pself.navigationController popToRootViewControllerAnimated:TRUE];
//    }];
//    [UIApplication.sharedApplication.keyWindow.rootViewController presentViewController:alert animated:TRUE completion:nil];
//    [pself.navigationController popToRootViewControllerAnimated:TRUE];
    
    dispatch_async(dispatch_get_main_queue(), ^{
        
        [pself.navigationController popToRootViewControllerAnimated:TRUE];
        [pself presentViewController:alert animated:TRUE completion:nil];
    });

    
//    dispatch_async(dispatch_get_main_queue(), ^{
//        [pself presentViewController:alert animated:TRUE completion:^{
//            [pself.navigationController popToRootViewControllerAnimated:TRUE];
//        }];
//    });
    
}


- (void)onIPLogin {
    NSLog(@"onIPLogin");
    IPLoginViewController *IPLogin = [[IPLoginViewController alloc] init];
    [self.navigationController pushViewController:IPLogin animated:TRUE];
}

- (void)onP2PLogin {
    NSLog(@"onP2PLogin");
    P2PLoginViewController *P2PLogin = [[P2PLoginViewController alloc] init];
    [self.navigationController pushViewController:P2PLogin animated:TRUE];
}

- (void)onSmartConfig {
    NSLog(@"onSmartConfig");
    SmartConfigViewController *smartConfig = [[SmartConfigViewController alloc] init];
    [self.navigationController pushViewController:smartConfig animated:TRUE];
}

- (void)onInitDevAccount {
    NSLog(@"onInitDevAccount");
    
    InitDevAccountViewController *InitDevAccount = [[InitDevAccountViewController alloc] init];
    [self.navigationController pushViewController:InitDevAccount animated:TRUE];
    
}

- (void)onSearchDevice {
    SearchDeviceViewController *searchDevice = [[SearchDeviceViewController alloc] init];
    [self.navigationController pushViewController:searchDevice animated:TRUE];
}

- (void)onAPConfig {
    AccessPointViewController *access = [[AccessPointViewController alloc] init];
    [self.navigationController pushViewController:access animated:YES];
}

- (NSString*)createFolderWithDevID:(NSString*)deviceID
{
    
    NSString *eventRootDir = [NSSearchPathForDirectoriesInDomains(NSDocumentDirectory,NSUserDomainMask, YES) objectAtIndex:0];
    NSString *eventDir = [eventRootDir stringByAppendingPathComponent:deviceID];
    NSFileManager* fileManage = [NSFileManager defaultManager];
    NSError* pError;
    if (![fileManage fileExistsAtPath:eventDir]) {
        [fileManage createDirectoryAtPath:eventDir withIntermediateDirectories:YES attributes:nil error:&pError];
    }
    return eventDir;
}



-(void)applicationWillEnterForeground
{
    NSLog(@"111111 applicationWillEnterForeground");
}


-(void)applicationDidBecomeActive
{
    NSLog(@"222222 applicationDidBecomeActive");
}

-(void)applicationDidEnterBackground
{
    NSLog(@"333333 applicationDidEnterBackground");
}




- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
