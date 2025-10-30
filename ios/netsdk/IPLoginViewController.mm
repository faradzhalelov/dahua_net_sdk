//
//  IPLoginViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "IPLoginViewController.h"
#import "FunctionListTableViewController.h"
#import "BECheckBox.h"
#import "DHHudPrecess.h"
#import "netsdk.h"
#import "Global.h"
//@class BECheckBox;

@interface IPLoginViewController ()<UITextFieldDelegate>


@property (strong, nonatomic) UITextField *m_textIP;
@property (strong, nonatomic) UITextField *m_textPort;
@property (strong, nonatomic) UITextField *m_textUser;
@property (strong, nonatomic) UITextField *m_textPwd;
@property (strong, nonatomic) UIButton *m_btnPwd;
@property (retain, nonatomic) BECheckBox *m_chkRecord;
@property (strong, nonatomic) UIButton *m_btnLogin;

@end

@implementation IPLoginViewController

@synthesize m_textIP, m_textPort, m_textUser, m_textPwd, m_btnPwd, m_chkRecord, m_btnLogin;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    
    self.title = _L(@"IP Login");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.navigationItem.backBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:_L(@"Back") style:UIBarButtonItemStylePlain target:nil action:nil];

    
    m_textIP = [[UITextField alloc] init];
    m_textIP.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textIP.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.2);
    m_textIP.borderStyle = UITextBorderStyleRoundedRect;
    m_textIP.placeholder = _L(@"IP");
    m_textIP.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textIP.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textIP.textColor = [UIColor blackColor];
    m_textIP.font = [UIFont systemFontOfSize:24];
    m_textIP.adjustsFontSizeToFitWidth = YES;
    m_textIP.textAlignment = NSTextAlignmentLeft;
    m_textIP.rightViewMode = UITextFieldViewModeAlways;
    m_textIP.delegate = self;
    [self.view addSubview:m_textIP];
    
    m_textPort = [[UITextField alloc] init];
    m_textPort.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textPort.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.3);
    m_textPort.borderStyle = UITextBorderStyleRoundedRect;
    m_textPort.placeholder = _L(@"Port");
    m_textPort.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textPort.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPort.textColor = [UIColor blackColor];
    m_textPort.font = [UIFont systemFontOfSize:24];
    m_textPort.adjustsFontSizeToFitWidth = YES;
    m_textPort.textAlignment = NSTextAlignmentLeft;
    m_textPort.rightViewMode = UITextFieldViewModeAlways;
    m_textPort.delegate = self;
    [self.view addSubview:m_textPort];
    
    m_textUser = [[UITextField alloc] init];
    m_textUser.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textUser.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.4);
    m_textUser.borderStyle = UITextBorderStyleRoundedRect;
    m_textUser.placeholder = _L(@"Username");
    m_textUser.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textUser.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textUser.textColor = [UIColor blackColor];
    m_textUser.font = [UIFont systemFontOfSize:24];
    m_textUser.adjustsFontSizeToFitWidth = YES;
    m_textUser.textAlignment = NSTextAlignmentLeft;
    m_textUser.rightViewMode = UITextFieldViewModeAlways;
    m_textUser.delegate = self;
    [self.view addSubview:m_textUser];
    
    m_textPwd = [[UITextField alloc] init];
    m_textPwd.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textPwd.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.5);
    m_textPwd.borderStyle = UITextBorderStyleRoundedRect;
    m_textPwd.placeholder = _L(@"Password");
    m_textPwd.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPwd.textColor = [UIColor blackColor];
    m_textPwd.font = [UIFont systemFontOfSize:24];
    m_textPwd.adjustsFontSizeToFitWidth = YES;
    m_textPwd.textAlignment = NSTextAlignmentLeft;
    m_textPwd.rightViewMode = UITextFieldViewModeWhileEditing;
    m_textPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPwd.delegate = self;
    m_textPwd.secureTextEntry = true;
    [self.view addSubview:m_textPwd];
    
    UIImage *im = [UIImage imageNamed:@"mobile_closeeye.png"];
    UIImageView *iv = [[UIImageView alloc]initWithImage:im];
    m_btnPwd = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [m_btnPwd setImage:im forState:UIControlStateNormal];
    UIView *view = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view addSubview:m_btnPwd];
    iv.center = m_btnPwd.center;
    [m_btnPwd addTarget:self action:@selector(onSwitch) forControlEvents:UIControlEventTouchUpInside];
    m_textPwd.rightView = view;
    m_textPwd.rightViewMode = UITextFieldViewModeUnlessEditing;
    
    //增加CheckBox
    m_chkRecord = [[BECheckBox alloc]initWithFrame:CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight/20)];
    m_chkRecord.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    [m_chkRecord setTitle:_L(@"Remember me") forState:UIControlStateNormal];
    m_chkRecord.titleLabel.font = [UIFont systemFontOfSize:20];
    [m_chkRecord setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    [self.view addSubview:m_chkRecord];
    
    m_btnLogin = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnLogin.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.8);
    m_btnLogin.backgroundColor = [UIColor lightGrayColor];
    [m_btnLogin setTitle:_L(@"Login") forState:UIControlStateNormal];
    [m_btnLogin addTarget:self action:@selector(onLogin) forControlEvents:UIControlEventTouchUpInside];
    [m_btnLogin setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnLogin.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnLogin.layer.cornerRadius = 10;
    m_btnLogin.layer.borderWidth = 1;
    [self.view addSubview:m_btnLogin];
 
    //加载登录信息
    [self loadLoginInfo];
}

- (void) onSwitch {
    NSLog(@"switch");
    if (m_textPwd.secureTextEntry == true) {
        m_textPwd.secureTextEntry = false;
        UIImage *im = [UIImage imageNamed:@"mobile_openeye.png"];
        [m_btnPwd setImage:im forState:UIControlStateNormal];
    }
    else {
        m_textPwd.secureTextEntry = true;
        UIImage *im = [UIImage imageNamed:@"mobile_closeeye.png"];
        [m_btnPwd setImage:im forState:UIControlStateNormal];
    }
}

- (void)onLogin {
    
//    char* szIP = (char*)[m_textIP.text UTF8String];
    int nPort = [m_textPort.text intValue];
//    char* szUser = (char*)[m_textUser.text UTF8String];
//    char* szPwd = (char*)[m_textPwd.text UTF8String];
    
    NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginInfo = {sizeof(NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginOut = {sizeof(NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    stLoginInfo.nPort = [m_textPort.text intValue];
    strncpy(stLoginInfo.szIP, (char*)[m_textIP.text UTF8String], sizeof(stLoginInfo.szIP));
    strncpy(stLoginInfo.szUserName, (char*)[m_textUser.text UTF8String], sizeof(stLoginInfo.szUserName));
    strncpy(stLoginInfo.szPassword, (char*)[m_textPwd.text UTF8String], sizeof(stLoginInfo.szPassword));
    stLoginInfo.emSpecCap = EM_LOGIN_SPEC_CAP_TCP;
    
    g_loginID = CLIENT_LoginWithHighLevelSecurity(&stLoginInfo, &stLoginOut);
    if (g_loginID) {
        g_ChannelCount = stLoginOut.stuDeviceInfo.nChanNum;
//        g_AlarmInChannel = stInfo.nAlarmInPortNum;
//        g_AlarmOutChannel = stInfo.nAlarmOutPortNum;
        g_szIP = m_textIP.text;
        g_nPort = nPort;
        g_szUser = m_textUser.text;
        g_szPassword = m_textPwd.text;
        
        dispatch_async(dispatch_get_main_queue(), ^{
            [self saveLoginInfo];
        });
        
		// set real play optimization
        int realPlayFlag = 0x01 |0x02;
        BOOL bRet = CLIENT_SetLocalMode(g_loginID, EM_LOCAL_PLAY_FLAG_MODE, &realPlayFlag);
        if (bRet) {
            NSLog(@"CLIENT_SetLocalMode realplay success");
        } else {
            NSLog(@"CLIENT_SetLocalMode realplay Failed, error is %x", CLIENT_GetLastError());
        }
        // set playback optimization
        int playbackFlab = 0x01;
        bRet = CLIENT_SetLocalMode(g_loginID, EM_LOCAL_PLAYBACK_FLAG_MODE, &playbackFlab);
        if (bRet) {
            NSLog(@"CLIENT_SetLocalMode playback success");
        } else {
            NSLog(@"CLIENT_SetLocalMode playback Failed, error is %x", CLIENT_GetLastError());
        }
		
        FunctionListTableViewController *function = [[FunctionListTableViewController alloc] init];
        [self.navigationController pushViewController:function animated:TRUE];
    }
    else {
        NSLog(@"CLIENT_LoginWithHighLevelSecurity Last Error %x", CLIENT_GetLastError());
        [self loginErrorMsg: stLoginOut.nError];
    }
}

/************************************************************
 *登录失败提示信息
 ***********************************************************/
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

/************************************************************
 *保存登录信息到UserDefault中
 ***********************************************************/
- (void) saveLoginInfo
{
    NSUserDefaults *userDefaults = [NSUserDefaults standardUserDefaults];
    if (m_chkRecord.isChecked) {
        
        NSArray *array = [NSArray arrayWithObjects:m_textIP.text, m_textUser.text,
                          m_textPwd.text, m_textPort.text, nil];
        NSLog(@"Save login info:%@, %@, %@, %@", m_textIP.text, m_textUser.text,
              m_textPwd.text, m_textPort.text);
        [userDefaults setObject:array forKey:_L(@"userInfo")];
    }
    else {
        [userDefaults removeObjectForKey:_L(@"userInfo")];
    }
}

/************************************************************
 *从UserDefault加载登录信息
 ***********************************************************/
- (void) loadLoginInfo
{
    NSUserDefaults *userDefaults = [NSUserDefaults standardUserDefaults];
    NSArray* array = [userDefaults objectForKey:_L(@"userInfo")];
    
    if (array)
    {
        m_textIP.text = [array objectAtIndex:0] ? [array objectAtIndex:0] : @"";
        m_textUser.text = [array objectAtIndex:1] ? [array objectAtIndex:1] : @"";
        m_textPwd.text = [array objectAtIndex:2] ? [array objectAtIndex:2] : @"";
        m_textPort.text = [array objectAtIndex:3] ? [array objectAtIndex:3] : @"37777";
        m_chkRecord.isChecked = YES;
    }
    else
    {
        m_textIP.text =  @"";
        m_textUser.text = @"";
        m_textPwd.text = @"";
        m_textPort.text = @"37777";
        m_chkRecord.isChecked = YES;
    }
    
    NSLog(@"Load login info:%@, %@, %@, %@", m_textIP.text, m_textUser.text, m_textPwd.text, m_textPort.text);
}

- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_textIP       resignFirstResponder];
    [m_textPort     resignFirstResponder];
    [m_textUser     resignFirstResponder];
    [m_textPwd      resignFirstResponder];
}

- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_textIP       resignFirstResponder];
    [m_textPort     resignFirstResponder];
    [m_textUser     resignFirstResponder];
    [m_textPwd      resignFirstResponder];
    return TRUE;
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
