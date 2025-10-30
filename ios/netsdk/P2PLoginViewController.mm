//
//  P2PLoginViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/11.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "P2PLoginViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "P2PClient.h"
#import "FunctionListTableViewController.h"
#import "DHHudPrecess.h"
#import <AVFoundation/AVFoundation.h>
#import <AVFoundation/AVMediaFormat.h>
#import "WQCodeScanner.h"



@interface P2PLoginViewController ()<UITextFieldDelegate>

@property (retain, nonatomic)  UITextField* m_serverIP;
@property (retain, nonatomic)  UITextField* m_serverPort;
@property (retain, nonatomic)  UITextField* m_serverSecret;
@property (retain, nonatomic)  UITextField* m_serverUserName;
@property (retain, nonatomic)  UITextField* m_textDeviceSN;
@property (retain, nonatomic)  UITextField* m_textPort;
@property (retain, nonatomic)  UITextField* m_textUser;
@property (retain, nonatomic)  UITextField* m_textPwd;

@property (nonatomic, strong) UITextField* firstResponderTextF;

@property (strong, nonatomic) UIButton *m_btnSecret;
@property (strong, nonatomic) UIButton *m_btnPwd;
@property (strong, nonatomic) UIButton *m_btnLogin;
@property (nonatomic) int m_p2pLocalport;

@end

@implementation P2PLoginViewController

@synthesize m_serverIP, m_serverPort, m_serverUserName, m_serverSecret, m_textDeviceSN, m_textPort, m_textUser, m_textPwd, m_btnSecret, m_btnPwd, m_btnLogin, m_p2pLocalport;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"P2P Login");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.navigationItem.backBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:_L(@"Back") style:UIBarButtonItemStylePlain target:nil action:nil];
    
    m_serverIP = [[UITextField alloc] init];
    m_serverIP.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_serverIP.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.2);
    m_serverIP.borderStyle = UITextBorderStyleRoundedRect;
    m_serverIP.placeholder = _L(@"P2P Server Address");
    m_serverIP.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_serverIP.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_serverIP.text = @"";
    m_serverIP.textColor = [UIColor blackColor];
    m_serverIP.font = [UIFont systemFontOfSize:24];
    m_serverIP.adjustsFontSizeToFitWidth = YES;
    m_serverIP.textAlignment = NSTextAlignmentLeft;
    m_serverIP.rightViewMode = UITextFieldViewModeAlways;
    m_serverIP.delegate = self;
    [self.view addSubview:m_serverIP];
    
    m_serverPort = [[UITextField alloc] init];
    m_serverPort.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_serverPort.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.28);
    m_serverPort.borderStyle = UITextBorderStyleRoundedRect;
    m_serverPort.placeholder = _L(@"P2P Server Port");
    m_serverPort.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_serverPort.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_serverPort.text = @"";
    m_serverPort.textColor = [UIColor blackColor];
    m_serverPort.font = [UIFont systemFontOfSize:24];
    m_serverPort.adjustsFontSizeToFitWidth = YES;
    m_serverPort.textAlignment = NSTextAlignmentLeft;
    m_serverPort.rightViewMode = UITextFieldViewModeAlways;
    m_serverPort.delegate = self;
    [self.view addSubview:m_serverPort];
    
    m_serverUserName = [[UITextField alloc] init];
    m_serverUserName.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_serverUserName.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.36);
    m_serverUserName.borderStyle = UITextBorderStyleRoundedRect;
    m_serverUserName.placeholder = _L(@"P2P Username");
    m_serverUserName.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_serverUserName.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_serverUserName.text = @"";
    m_serverUserName.textColor = [UIColor blackColor];
    m_serverUserName.font = [UIFont systemFontOfSize:24];
    m_serverUserName.adjustsFontSizeToFitWidth = YES;
    m_serverUserName.textAlignment = NSTextAlignmentLeft;
    m_serverUserName.rightViewMode = UITextFieldViewModeAlways;
    m_serverUserName.delegate = self;
    [self.view addSubview:m_serverUserName];
    
    m_serverSecret = [[UITextField alloc] init];
    m_serverSecret.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_serverSecret.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.44);
    m_serverSecret.borderStyle = UITextBorderStyleRoundedRect;
    m_serverSecret.placeholder = _L(@"P2P Server Secret");
    m_serverSecret.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_serverSecret.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_serverSecret.text = @"";
    m_serverSecret.textColor = [UIColor blackColor];
    m_serverSecret.font = [UIFont systemFontOfSize:24];
    m_serverSecret.adjustsFontSizeToFitWidth = YES;
    m_serverSecret.textAlignment = NSTextAlignmentLeft;
    m_serverSecret.rightViewMode = UITextFieldViewModeWhileEditing;
    m_serverSecret.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_serverSecret.delegate = self;
    m_serverSecret.secureTextEntry = true;
    [self.view addSubview:m_serverSecret];
    
    UIImage *im = [UIImage imageNamed:@"mobile_closeeye.png"];
    UIImageView *iv = [[UIImageView alloc]initWithImage:im];
    m_btnSecret = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [m_btnSecret setImage:im forState:UIControlStateNormal];
    UIView *view = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view addSubview:m_btnSecret];
    iv.center = m_btnSecret.center;
    [m_btnSecret addTarget:self action:@selector(onSwitch) forControlEvents:UIControlEventTouchUpInside];
    m_serverSecret.rightView = view;
    m_serverSecret.rightViewMode = UITextFieldViewModeUnlessEditing;
    
    
    m_textDeviceSN = [[UITextField alloc] init];
    m_textDeviceSN.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textDeviceSN.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.52);
    m_textDeviceSN.borderStyle = UITextBorderStyleRoundedRect;
    m_textDeviceSN.placeholder = _L(@"Device SN");
    m_textDeviceSN.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textDeviceSN.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textDeviceSN.text = @"";
    m_textDeviceSN.textColor = [UIColor blackColor];
    m_textDeviceSN.font = [UIFont systemFontOfSize:24];
    m_textDeviceSN.adjustsFontSizeToFitWidth = YES;
    m_textDeviceSN.textAlignment = NSTextAlignmentLeft;
    m_textDeviceSN.rightViewMode = UITextFieldViewModeWhileEditing;
    m_textDeviceSN.delegate = self;
    UIImage *im2 = [UIImage imageNamed:@"scan.png"];
    UIImageView *iv2 = [[UIImageView alloc]initWithImage:im2];
    UIButton* btnScan = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [btnScan setImage:im2 forState:UIControlStateNormal];
    UIView *view2 = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view2 addSubview:btnScan];
    iv2.center = btnScan.center;
    [btnScan addTarget:self action:@selector(onScan) forControlEvents:UIControlEventTouchUpInside];
    m_textDeviceSN.rightView = view2;
    m_textDeviceSN.rightViewMode = UITextFieldViewModeUnlessEditing;
    [self.view addSubview:m_textDeviceSN];
    
    m_textPort = [[UITextField alloc] init];
    m_textPort.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textPort.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.6);
    m_textPort.borderStyle = UITextBorderStyleRoundedRect;
    m_textPort.placeholder = _L(@"Device Port");
    m_textPort.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textPort.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPort.text = @"";
    m_textPort.textColor = [UIColor blackColor];
    m_textPort.font = [UIFont systemFontOfSize:24];
    m_textPort.adjustsFontSizeToFitWidth = YES;
    m_textPort.textAlignment = NSTextAlignmentLeft;
    m_textPort.rightViewMode = UITextFieldViewModeAlways;
    m_textPort.delegate = self;
    [self.view addSubview:m_textPort];
    
    m_textUser = [[UITextField alloc] init];
    m_textUser.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textUser.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.68);
    m_textUser.borderStyle = UITextBorderStyleRoundedRect;
    m_textUser.placeholder = _L(@"Device Username");
    m_textUser.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textUser.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textUser.text = @"";
    m_textUser.textColor = [UIColor blackColor];
    m_textUser.font = [UIFont systemFontOfSize:24];
    m_textUser.adjustsFontSizeToFitWidth = YES;
    m_textUser.textAlignment = NSTextAlignmentLeft;
    m_textUser.rightViewMode = UITextFieldViewModeAlways;
    m_textUser.delegate = self;
    [self.view addSubview:m_textUser];
    
    m_textPwd = [[UITextField alloc] init];
    m_textPwd.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textPwd.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.76);
    m_textPwd.borderStyle = UITextBorderStyleRoundedRect;
    m_textPwd.placeholder = _L(@"Device Password");
    m_textPwd.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPwd.text = @"";
    m_textPwd.textColor = [UIColor blackColor];
    m_textPwd.font = [UIFont systemFontOfSize:24];
    m_textPwd.adjustsFontSizeToFitWidth = YES;
    m_textPwd.textAlignment = NSTextAlignmentLeft;
    m_textPwd.rightViewMode = UITextFieldViewModeWhileEditing;
    m_textPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPwd.delegate = self;
    m_textPwd.secureTextEntry = true;
    [self.view addSubview:m_textPwd];
    
    UIImage *im3 = [UIImage imageNamed:@"mobile_closeeye.png"];
    UIImageView *iv3 = [[UIImageView alloc]initWithImage:im3];
    m_btnPwd = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [m_btnPwd setImage:im3 forState:UIControlStateNormal];
    UIView *view3 = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view3 addSubview:m_btnPwd];
    iv3.center = m_btnPwd.center;
    [m_btnPwd addTarget:self action:@selector(onSwitch2) forControlEvents:UIControlEventTouchUpInside];
    m_textPwd.rightView = view3;
    m_textPwd.rightViewMode = UITextFieldViewModeUnlessEditing;
    
    
    m_btnLogin = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnLogin.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.9);
    m_btnLogin.backgroundColor = [UIColor lightGrayColor];
    [m_btnLogin setTitle:_L(@"Login") forState:UIControlStateNormal];
    [m_btnLogin addTarget:self action:@selector(onLogin) forControlEvents:UIControlEventTouchUpInside];
    [m_btnLogin setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnLogin.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnLogin.layer.cornerRadius = 10;
    m_btnLogin.layer.borderWidth = 1;
    [self.view addSubview:m_btnLogin];
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWillShow:) name:UIKeyboardWillShowNotification object:nil];
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWillHide:) name:UIKeyboardWillHideNotification object:nil];
}
- (void) keyboardWillShow:(NSNotification *)aNotification
{
    CGRect rect = [self.firstResponderTextF.superview convertRect:self.firstResponderTextF.frame toView:self.view];
    NSDictionary *userinfo = [aNotification userInfo];
    NSValue *avalue = [userinfo objectForKey:UIKeyboardFrameEndUserInfoKey];
    CGRect keyboardRect = [avalue CGRectValue];
    NSLog(@"keyboard height : %f", keyboardRect.size.height);
    NSLog(@"keyboard width : %f", keyboardRect.size.width);
    keyboardRect = [self.view convertRect:keyboardRect fromView:self.view.window];
    CGFloat keyboardTop = keyboardRect.origin.y;
    NSNumber *animationDurationValue = [userinfo objectForKey:UIKeyboardAnimationDurationUserInfoKey];
    NSTimeInterval animationDuration = [animationDurationValue doubleValue];
    if (keyboardTop < CGRectGetMaxY(rect)) {
        CGFloat gap = keyboardTop - CGRectGetMaxY(rect) - 10;
        __weak typeof(self)weakSelf = self;
        [UIView animateWithDuration:animationDuration animations:^{
            weakSelf.view.frame = CGRectMake(weakSelf.view.frame.origin.x, gap, weakSelf.view.frame.size.width, weakSelf.view.frame.size.height);
        }];
    }
}
- (void) keyboardWillHide:(NSNotification *)aNotification
{
    NSDictionary *userInfo = [aNotification userInfo];
    NSNumber *animationDurationValue = [userInfo objectForKey:UIKeyboardAnimationDurationUserInfoKey];
    NSTimeInterval animationDuration = [animationDurationValue doubleValue];
    if (self.view.frame.origin.y < 0) {
        __weak typeof(self)weakSelf = self;
        [UIView animateWithDuration:animationDuration animations:^{
            weakSelf.view.frame = CGRectMake(weakSelf.view.frame.origin.x, 0, weakSelf.view.frame.size.width, weakSelf.view.frame.size.height);
        }];
    }
}

-(void)onScan {
    WQCodeScanner *scanner = [[WQCodeScanner alloc] init];
    [self presentViewController:scanner animated:YES completion:nil];
    scanner.resultBlock = ^(NSString *value) {
        m_textDeviceSN.text = value;
    };
}

- (void) onSwitch {
    NSLog(@"switch");
    if (m_serverSecret.secureTextEntry == true) {
        m_serverSecret.secureTextEntry = false;
        UIImage *im = [UIImage imageNamed:@"mobile_openeye.png"];
        [m_btnSecret setImage:im forState:UIControlStateNormal];
    }
    else {
        m_serverSecret.secureTextEntry = true;
        UIImage *im = [UIImage imageNamed:@"mobile_closeeye.png"];
        [m_btnSecret setImage:im forState:UIControlStateNormal];
    }
}

- (void) onSwitch2 {
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

- (void) onLogin {
    char *serverIP = (char*)[m_serverIP.text UTF8String];
    int serverPort = [m_serverPort.text intValue];
    char *serverSecret = (char*)[m_serverSecret.text UTF8String];
    char *serverUserName = (char*)[m_serverUserName.text UTF8String];
    char *deviceIP = (char*)[m_textDeviceSN.text UTF8String];
    int devicePort = [m_textPort.text intValue];
    const char *clientType = (char*)"NetSDK_iOSDemo";
    char* szDevUser = (char*)[m_textUser.text UTF8String];
    char* szDevPwd = (char*)[m_textPwd.text UTF8String];
   
    m_p2pLocalport = p2p_connect(serverIP, serverPort, serverSecret, clientType, serverUserName, deviceIP, devicePort, szDevUser, szDevPwd, 15);
    if (m_p2pLocalport < 0 || m_p2pLocalport > 65535) {
        NSLog(@"P2pLocalPort = %d", m_p2pLocalport);
        MSG(@"", _L(@"P2P Connect Failed"), @"");
        return ;
    }

//    char* szIP = (char*)"127.0.0.1";
    int nPort = m_p2pLocalport;

    
    NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginInfo = {sizeof(NET_IN_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY stLoginOut = {sizeof(NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY)};
    
    stLoginInfo.nPort = m_p2pLocalport;
    strncpy(stLoginInfo.szIP, (char*)"127.0.0.1", sizeof(stLoginInfo.szIP));
    strncpy(stLoginInfo.szUserName, (char*)[m_textUser.text UTF8String], sizeof(stLoginInfo.szUserName));
    strncpy(stLoginInfo.szPassword, (char*)[m_textPwd.text UTF8String], sizeof(stLoginInfo.szPassword));
    stLoginInfo.emSpecCap = EM_LOGIN_SPEC_CAP_TCP;
    
    g_loginID = CLIENT_LoginWithHighLevelSecurity(&stLoginInfo, &stLoginOut);
    if (g_loginID) {
        g_ChannelCount = stLoginOut.stuDeviceInfo.nChanNum;
        
        g_szIP = m_textDeviceSN.text;
        g_nPort = nPort;
        g_szUser = m_textUser.text;
        g_szPassword = m_textPwd.text;
        g_p2pUsername = m_textDeviceSN.text;
		
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
        MSG(@"", _L(@"Login Failed"), @"");
    }
}

-(void) touchesBegan:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    if ([self.firstResponderTextF isFirstResponder]) {
        [self.firstResponderTextF resignFirstResponder];
    }
}
- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_serverIP   resignFirstResponder];
    [m_serverPort  resignFirstResponder];
    [m_serverSecret  resignFirstResponder];
    [m_serverUserName  resignFirstResponder];
    [m_textDeviceSN       resignFirstResponder];
    [m_textPort     resignFirstResponder];
    [m_textUser     resignFirstResponder];
    [m_textPwd      resignFirstResponder];
}
- (BOOL) textFieldShouldBeginEditing:(UITextField *)textField {
    self.firstResponderTextF = textField;
    return YES;
}

- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_serverIP   resignFirstResponder];
    [m_serverPort  resignFirstResponder];
    [m_serverSecret  resignFirstResponder];
    [m_serverUserName  resignFirstResponder];
    [m_textDeviceSN       resignFirstResponder];
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
