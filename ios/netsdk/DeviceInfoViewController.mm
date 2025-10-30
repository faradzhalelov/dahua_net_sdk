//
//  DeviceInfoViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/7.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "DeviceInfoViewController.h"
#import "WQCodeScanner.h"
#import "DHHudPrecess.h"
#import "WifiListViewController.h"
#import "Global.h"

@interface DeviceInfoViewController ()<UITextFieldDelegate>

@property (strong, nonatomic) UILabel *m_labDeviceSN;
@property (strong, nonatomic) UILabel *m_labUser;
@property (strong, nonatomic) UILabel *m_labPwd;
@property (strong, nonatomic) UITextField *m_txtDeviceSN;
@property (strong, nonatomic) UITextField *m_txtUser;
@property (strong, nonatomic) UITextField *m_txtPwd;

@property (strong, nonatomic) NSString *m_strIP;

@property (nonatomic) BOOL bFind;

@property (nonatomic) long lSearchHandle;
@property (strong, nonatomic) MBProgressHUD* waitView;
@end

@implementation DeviceInfoViewController

@synthesize m_labDeviceSN, m_labUser, m_labPwd, m_txtDeviceSN, m_txtUser, m_txtPwd, lSearchHandle, waitView;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.title = _L(@"Device information");
    
    m_labDeviceSN = [[UILabel alloc] init];
    [m_labDeviceSN setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labDeviceSN setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.2)];
    m_labDeviceSN.text = _L(@"Device SN");
    m_labDeviceSN.adjustsFontSizeToFitWidth = TRUE;
    m_labDeviceSN.textColor = UIColor.blackColor;
    m_labDeviceSN.layer.borderWidth = 1;
    m_labDeviceSN.layer.cornerRadius = 10;
    m_labDeviceSN.layer.masksToBounds = YES;
    m_labDeviceSN.backgroundColor = UIColor.whiteColor;
    m_labDeviceSN.textAlignment = NSTextAlignmentCenter;
    [m_labDeviceSN setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labDeviceSN];
    
    m_txtDeviceSN = [[UITextField alloc] init];
    [m_txtDeviceSN setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtDeviceSN setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.2)];
    
    m_txtDeviceSN.borderStyle = UITextBorderStyleRoundedRect;
    m_txtDeviceSN.keyboardType = UIKeyboardTypeURL;
    m_txtDeviceSN.returnKeyType = UIReturnKeyDone;
    [m_txtDeviceSN setFont:[UIFont systemFontOfSize:20]];
    m_txtDeviceSN.placeholder = _L(@"Device SN");
    m_txtDeviceSN.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtDeviceSN.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_txtDeviceSN.textColor = [UIColor blackColor];
    m_txtDeviceSN.adjustsFontSizeToFitWidth = YES;
    m_txtDeviceSN.textAlignment = NSTextAlignmentLeft;
    m_txtDeviceSN.layer.cornerRadius = kScreenWidth/40;
    m_txtDeviceSN.layer.borderWidth = 1;
    //m_txtDeviceSN.text = @"4G012BDPAZE247C";
    UIImage *im = [UIImage imageNamed:@"scan.png"];
    UIImageView *iv = [[UIImageView alloc]initWithImage:im];
    UIButton* btnScan = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [btnScan setImage:im forState:UIControlStateNormal];
    UIView *view = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view addSubview:btnScan];
    iv.center = btnScan.center;
    [btnScan addTarget:self action:@selector(onScan) forControlEvents:UIControlEventTouchUpInside];
    m_txtDeviceSN.rightView = view;
    m_txtDeviceSN.rightViewMode = UITextFieldViewModeUnlessEditing;
    m_txtDeviceSN.delegate = self;
    [self.view addSubview:m_txtDeviceSN];
    
    
    m_txtUser = [[UITextField alloc] init];
    [m_txtUser setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtUser setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.3)];
    m_txtUser.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtUser.keyboardType   = UIKeyboardTypeURL;
    m_txtUser.returnKeyType  = UIReturnKeyNext;
    m_txtUser.font = [UIFont systemFontOfSize:20];
    m_txtUser.layer.borderWidth = 1;
    m_txtUser.layer.cornerRadius = 10;
    m_txtUser.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtUser.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtUser setPlaceholder:_L(@"Username")];
    m_txtUser.adjustsFontSizeToFitWidth = TRUE;
    m_txtUser.text = @"";
    [self.view addSubview: m_txtUser];
    m_txtUser.delegate = self;
    
    
    m_labUser = [[UILabel alloc] init];
    [m_labUser setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labUser setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.3)];
    m_labUser.text = _L(@"Username");
    m_labUser.adjustsFontSizeToFitWidth = TRUE;
    m_labUser.textColor = UIColor.blackColor;
    m_labUser.layer.borderWidth = 1;
    m_labUser.layer.cornerRadius = 10;
    m_labUser.layer.masksToBounds = YES;
    m_labUser.backgroundColor = UIColor.whiteColor;
    m_labUser.textAlignment = NSTextAlignmentCenter;
    [m_labUser setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labUser];
    
    
    m_txtPwd = [[UITextField alloc] init];
    [m_txtPwd setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtPwd setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.4)];
    m_txtPwd.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtPwd.keyboardType   = UIKeyboardTypeURL;
    m_txtPwd.returnKeyType  = UIReturnKeyNext;
    m_txtPwd.font = [UIFont systemFontOfSize:20];
    m_txtPwd.layer.borderWidth = 1;
    m_txtPwd.layer.cornerRadius = 10;
    m_txtPwd.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtPwd setPlaceholder:_L(@"Password")];
    m_txtPwd.text = @"";
    m_txtPwd.adjustsFontSizeToFitWidth = TRUE;
    [self.view addSubview: m_txtPwd];
    m_txtPwd.delegate = self;
    
    m_labPwd = [[UILabel alloc] init];
    [m_labPwd setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labPwd setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.4)];
    m_labPwd.text = _L(@"Password");
    m_labPwd.adjustsFontSizeToFitWidth = TRUE;
    m_labPwd.textColor = UIColor.blackColor;
    m_labPwd.layer.borderWidth = 1;
    m_labPwd.layer.cornerRadius = 10;
    m_labPwd.layer.masksToBounds = YES;
    m_labPwd.backgroundColor = UIColor.whiteColor;
    m_labPwd.textAlignment = NSTextAlignmentCenter;
    [m_labPwd setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labPwd];
    
    
    UIButton *btn = [[UIButton alloc] init];
    btn.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    btn.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    btn.layer.cornerRadius = 10;
    btn.layer.borderWidth = 1;
    [btn setTitle:_L(@"Next") forState:UIControlStateNormal];
    btn.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [btn setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    btn.titleLabel.font = [UIFont systemFontOfSize:20];
    [btn addTarget:self action:@selector(searchDevice) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:btn];
 
    
    
}

- (void)viewDidAppear:(BOOL)animated {
    _bFind = NO;
    
    
}

-(void)onScan {
    NSLog(@"Scan!");
    WQCodeScanner *scanner = [[WQCodeScanner alloc] init];
    [self presentViewController:scanner animated:YES completion:nil];
    scanner.resultBlock = ^(NSString *value) {
        self.m_txtDeviceSN.text = value;
    };
}


- (void)StopSearchDevice {
    CLIENT_StopSearchDevices(lSearchHandle);
    lSearchHandle = 0;
}

static void SearchDeviceCB(DEVICE_NET_INFO_EX *pDevNetInfo, void* pUserData) {

    DeviceInfoViewController* pself = (__bridge DeviceInfoViewController*)pUserData;
    if (pself.bFind) {
        return;
    }
        const char *szDeviceSN = [pself.m_txtDeviceSN.text UTF8String];
        if ((strcmp(pDevNetInfo->szSerialNo, szDeviceSN) == 0)) {
            NSLog(@"ip : %s", pDevNetInfo->szIP);
            NSLog(@"11===========%x, %x", pDevNetInfo->byInitStatus, pDevNetInfo->byPwdResetWay);
            
            NSString *strMac = [NSString stringWithUTF8String:pDevNetInfo->szMac];
            NSString *strIP = [NSString stringWithUTF8String:pDevNetInfo->szIP];
            if (strMac.length == 0 || strIP.length == 0) {
                return ;
            }
            if ((0 == (pDevNetInfo->byInitStatus & 0x01)) && (1 == (pDevNetInfo->byInitStatus>>1 & 0x01))) {
                pself.bFind = YES;
                dispatch_async(dispatch_get_main_queue(), ^{
                    [pself StopSearchDevice];
                    [pself.waitView hide:YES];
                    pself.m_strIP = strIP;
                    [pself pushViewController];
                });
                return ;
            }
            else {
                dispatch_async(dispatch_get_main_queue(), ^{
                    MSG(@"", _L(@"Device has not Inited"), @"");
                    [pself StopSearchDevice];
                });
            }
        }
    
}

- (void) searchDevice {
    
    if ((m_txtDeviceSN.text.length == 0) || (m_txtUser.text.length == 0) || (m_txtPwd.text.length == 0)) {
        MSG(@"", _L(@"SN and UserName and Password cannot be NULL"), @"");
        return ;
    }
    self.bFind = NO;
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
        [self StopSearchDevice];
    lSearchHandle = CLIENT_StartSearchDevices(SearchDeviceCB, (__bridge void*)self);
    dispatch_time_t time = dispatch_time(DISPATCH_TIME_NOW, 5*NSEC_PER_SEC);
    dispatch_after(time, dispatch_get_main_queue(), ^{
            [waitView hide:YES];
        });

    });
}

- (long) login{
    
    NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginInfo = {sizeof(NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginOut = {sizeof(NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    stLoginInfo.nPort = 37777;
    strncpy(stLoginInfo.szIP, (char*)[_m_strIP UTF8String], sizeof(stLoginInfo.szIP));
    strncpy(stLoginInfo.szUserName, (char*)[m_txtUser.text UTF8String], sizeof(stLoginInfo.szUserName));
    strncpy(stLoginInfo.szPassword, (char*)[m_txtPwd.text UTF8String], sizeof(stLoginInfo.szPassword));
    stLoginInfo.emSpecCap = EM_LOGIN_SPEC_CAP_TCP;
    
    long loginid = CLIENT_LoginWithHighLevelSecurity(&stLoginInfo, &stLoginOut);
    if (loginid) {
        NSLog(@"login success");
    }
    else {
        NSLog(@"login failed, error is %d", stLoginOut.nError);
        [self loginErrorMsg: stLoginOut.nError];
    }
    return loginid;
}
- (void) loginErrorMsg:(int) nError
{
    switch (nError)
    {
        case 1:
            MSG(@"", _L(@"login_error_pwd"), @"");
            break;
            
        case 2:
            MSG(@"", _L(@"login_error_account"), @"");
            break;
            
        case 3:
            MSG(@"", _L(@"login_error_overtime"), @"");
            break;
            
        case 4:
            MSG(@"", _L(@"login_error_registered"), @"");
            break;
            
        case 5:
            MSG(@"", _L(@"login_error_locked"), @"");
            break;
            
        case 6:
            MSG(@"", _L(@"login_error_inblacklist"), @"");
            break;
            
        case 7:
            MSG(@"", _L(@"login_error_busy"), @"");
            break;
            
        case 10:
            MSG(@"", _L(@"login_error_maxaccount"), @"");
            break;
            
        default:
            MSG(@"", _L(@"login_error_connect"), @"");
            break;
    }
}

- (void) pushViewController {
    
    long lLoginID = [self login];
    if (lLoginID != 0) {
        WifiListViewController *wifi = [[WifiListViewController alloc] init];
        wifi.lLoginID = lLoginID;
        [self.navigationController pushViewController:wifi animated:YES];
    }
    
}


- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    if (!parent) {
        [self StopSearchDevice];
        self.bFind = NO;
    }
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField
{
    [m_txtDeviceSN  resignFirstResponder];
    [m_txtPwd       resignFirstResponder];
    [m_txtUser     resignFirstResponder];
    return YES;
}
- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event
{
    [m_txtDeviceSN  resignFirstResponder];
    [m_txtPwd       resignFirstResponder];
    [m_txtUser     resignFirstResponder];
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
