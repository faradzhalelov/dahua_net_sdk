//
//  InitDevAccountViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/6.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "InitDevAccountViewController.h"
#import "netsdk.h"
#import "DHHudPrecess.h"
#import "LoadingView.h"
#import <AVFoundation/AVFoundation.h>
#import <AVFoundation/AVMediaFormat.h>
#import "WQCodeScanner.h"

BOOL bFind = FALSE;
unsigned char cPwdReset = ' ';
char s_szIP[64] = "";
static LLONG lSearchHandle = 0;

@interface InitDevAccountViewController ()<UITextFieldDelegate>

@property (strong, nonatomic) UITextField *m_txtDeviceSN;
@property (strong, nonatomic) UITextField *m_txtMac;
@property (strong, nonatomic) UITextField *m_txtUser;
@property (strong, nonatomic) UITextField *m_txtPwd;
@property (strong, nonatomic) UITextField *m_txtPhone;
@property (strong, nonatomic) UITextField *m_txtMail;

@property (strong, nonatomic) UILabel *m_labMac;
@property (strong, nonatomic) UILabel *m_labUser;
@property (strong, nonatomic) UILabel *m_labPwd;
@property (strong, nonatomic) UILabel *m_labPhone;
@property (strong, nonatomic) UILabel *m_labMail;

@property (strong, nonatomic) UIButton *m_btnInit;

@property (strong, nonatomic) NSString *m_strSN;
@property (strong, nonatomic) UIViewController * vc;

@property (nonatomic, strong) UITextField* firstResponderTextF;
-(void)SetTextHidden:(BOOL)bHidden Phone:(BOOL)bPhone Mail:(BOOL)bMail;

@end

@implementation InitDevAccountViewController

@synthesize m_txtDeviceSN, m_txtMac, m_txtUser, m_txtPwd, m_txtPhone, m_txtMail, m_labMac, m_labUser, m_labPwd, m_labPhone, m_labMail, m_btnInit, m_strSN, vc;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Init Dev Account");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    m_txtDeviceSN = [[UITextField alloc] init];
    [m_txtDeviceSN setFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    [m_txtDeviceSN setCenter:CGPointMake(kScreenWidth/2, kScreenHeight*0.15)];
    
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
    
    UIButton *m_btnSearch = [[UIButton alloc] init];
    [m_btnSearch setFrame:CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20)];
    [m_btnSearch setCenter:CGPointMake(kScreenWidth/2, kScreenHeight*0.25)];
    m_btnSearch.layer.cornerRadius = kScreenHeight/40;
    m_btnSearch.layer.borderWidth = 1;
    [m_btnSearch setTitle:_L(@"Search Device") forState:UIControlStateNormal];
    [m_btnSearch setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSearch.titleLabel.font = [UIFont systemFontOfSize:20];
    [m_btnSearch addTarget:self action:@selector(onSearch) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:m_btnSearch];
    
    
    m_txtMac = [[UITextField alloc] init];
    [m_txtMac setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtMac setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.35)];
    m_txtMac.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtMac.keyboardType   = UIKeyboardTypeURL;
    m_txtMac.returnKeyType  = UIReturnKeyDone;
    m_txtMac.font = [UIFont systemFontOfSize:20];
    m_txtMac.layer.borderWidth = 1;
    m_txtMac.layer.cornerRadius = 10;//kScreenHeight/40;
    m_txtMac.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtMac.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtMac setPlaceholder:_L(@"Mac Address")];
    [self.view addSubview: m_txtMac];
    m_txtMac.delegate = self;
    
    m_labMac = [[UILabel alloc] init];
    [m_labMac setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labMac setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.35)];
    m_labMac.text = _L(@"Mac");
    m_labMac.textColor = UIColor.blackColor;
    m_labMac.layer.borderWidth = 1;
    m_labMac.layer.cornerRadius = 10;
    m_labMac.layer.masksToBounds = YES;
    m_labMac.backgroundColor = UIColor.whiteColor;
    m_labMac.textAlignment = NSTextAlignmentCenter;
    [m_labMac setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labMac];
    
    m_txtUser = [[UITextField alloc] init];
    [m_txtUser setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtUser setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.45)];
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
    m_txtUser.text = @"admin";
    [self.view addSubview: m_txtUser];
    m_txtUser.delegate = self;
    
    
    m_labUser = [[UILabel alloc] init];
    [m_labUser setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labUser setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.45)];
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
    [m_txtPwd setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.55)];
    m_txtPwd.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtPwd.keyboardType   = UIKeyboardTypeURL;
    m_txtPwd.returnKeyType  = UIReturnKeyNext;
    m_txtPwd.font = [UIFont systemFontOfSize:20];
    m_txtPwd.layer.borderWidth = 1;
    m_txtPwd.layer.cornerRadius = 10;
    m_txtPwd.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtPwd.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtPwd setPlaceholder:_L(@"Password")];
    m_txtPwd.adjustsFontSizeToFitWidth = TRUE;
    [self.view addSubview: m_txtPwd];
    m_txtPwd.delegate = self;
    
    m_labPwd = [[UILabel alloc] init];
    [m_labPwd setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labPwd setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.55)];
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
    
    m_txtPhone = [[UITextField alloc] init];
    [m_txtPhone setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtPhone setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.65)];
    m_txtPhone.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtPhone.keyboardType   = UIKeyboardTypeURL;
    m_txtPhone.returnKeyType  = UIReturnKeyNext;
    m_txtPhone.font = [UIFont systemFontOfSize:20];
    m_txtPhone.layer.borderWidth = 1;
    m_txtPhone.layer.cornerRadius = 10;
    m_txtPhone.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtPhone.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtPhone setPlaceholder:_L(@"CellPhone")];
    m_txtPhone.adjustsFontSizeToFitWidth = TRUE;
    [self.view addSubview: m_txtPhone];
    m_txtPhone.delegate = self;
    
    m_labPhone = [[UILabel alloc] init];
    [m_labPhone setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labPhone setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.65)];
    m_labPhone.text = _L(@"CellPhone");
    m_labPhone.adjustsFontSizeToFitWidth = TRUE;
    m_labPhone.textColor = UIColor.blackColor;
    m_labPhone.layer.borderWidth = 1;
    m_labPhone.layer.cornerRadius = 10;
    m_labPhone.layer.masksToBounds = YES;
    m_labPhone.backgroundColor = UIColor.whiteColor;
    m_labPhone.textAlignment = NSTextAlignmentCenter;
    [m_labPhone setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labPhone];
    
    m_txtMail = [[UITextField alloc] init];
    [m_txtMail setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtMail setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.75)];
    m_txtMail.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtMail.keyboardType   = UIKeyboardTypeURL;
    m_txtMail.returnKeyType  = UIReturnKeyNext;
    m_txtMail.font = [UIFont systemFontOfSize:20];
    m_txtMail.layer.borderWidth = 1;
    m_txtMail.layer.cornerRadius = 10;
    m_txtMail.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtMail.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtMail setPlaceholder:_L(@"EMail")];
    m_txtMail.adjustsFontSizeToFitWidth = TRUE;
    [self.view addSubview: m_txtMail];
    m_txtMail.delegate = self;
    
    m_labMail = [[UILabel alloc] init];
    [m_labMail setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labMail setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.75)];
    m_labMail.text = _L(@"EMail");
    m_labMail.adjustsFontSizeToFitWidth = TRUE;
    m_labMail.textColor = UIColor.blackColor;
    m_labMail.layer.borderWidth = 1;
    m_labMail.layer.cornerRadius = 10;
    m_labMail.layer.masksToBounds = YES;
    m_labMail.backgroundColor = UIColor.whiteColor;
    m_labMail.textAlignment = NSTextAlignmentCenter;
    [m_labMail setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labMail];
    
    m_btnInit = [[UIButton alloc] init];
    [m_btnInit setFrame:CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20)];
    [m_btnInit setCenter:CGPointMake(kScreenWidth/2, kScreenHeight*0.85)];
    m_btnInit.layer.cornerRadius = 10;
    m_btnInit.layer.borderWidth = 1;
    [m_btnInit setTitle:_L(@"Init Dev Account") forState:UIControlStateNormal];
    m_btnInit.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [m_btnInit setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnInit.titleLabel.font = [UIFont systemFontOfSize:20];
    [m_btnInit addTarget:self action:@selector(onInitDevAccount) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:m_btnInit];
    
    
    [self SetTextHidden:TRUE Phone:TRUE Mail:TRUE];
    
    vc = [[UIViewController alloc] init];
    vc.view.backgroundColor = [UIColor clearColor];
    
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

- (void) viewDidAppear:(BOOL)animated {
    vc = [[UIViewController alloc] init];
    vc.view.backgroundColor = [UIColor clearColor];
}

-(void)SetTextHidden:(BOOL)bHidden Phone:(BOOL)bPhone Mail:(BOOL)bMail
{
    [m_txtMac setHidden:bHidden];
    [m_txtUser setHidden:bHidden];
    [m_txtPwd setHidden:bHidden];
    
    [m_labMac setHidden:bHidden];
    [m_labUser setHidden:bHidden];
    [m_labPwd setHidden:bHidden];
    
    [m_txtPhone setHidden:bPhone];
    [m_txtMail setHidden:bMail];
    [m_labPhone setHidden:bPhone];
    [m_labMail setHidden:bMail];
    
    [m_btnInit setHidden:bHidden];
    
}

-(void)onScan {
    NSLog(@"Scan!");
    WQCodeScanner *scanner = [[WQCodeScanner alloc] init];
    [self presentViewController:scanner animated:YES completion:nil];
    scanner.resultBlock = ^(NSString *value) {
        self.m_txtDeviceSN.text = value;
    };
}

static void OnSearchDeviceCB(DEVICE_NET_INFO_EX *pDevNetInfo, void* pUserData)
{
    if (bFind == FALSE) {
        InitDevAccountViewController* pself = (__bridge InitDevAccountViewController*)pUserData;
        const char *szDeviceSN = [pself.m_strSN UTF8String];
        if ((strcmp(pDevNetInfo->szSerialNo, szDeviceSN) == 0)) {
            NSLog(@"ip : %s", pDevNetInfo->szIP);
            NSLog(@"11===========%x, %x", pDevNetInfo->byInitStatus, pDevNetInfo->byPwdResetWay);
            
            NSString *strMac = [NSString stringWithFormat:@"%s",pDevNetInfo->szMac];
            if (strMac.length == 0) {
                return ;
            }
            if ((0 == (pDevNetInfo->byInitStatus & 0x01)) && (1 != (pDevNetInfo->byInitStatus>>1 & 0x01))) {
                bFind = TRUE;
                dispatch_async(dispatch_get_main_queue(), ^{
                    MSG(@"", _L(@"Old Device, Not Support Init"), @"");
                    [pself StopSearchDevice];
                    [LoadingView hide];
                    [pself.vc.view removeFromSuperview];
//                    [pself.vc removeFromParentViewController];
                });
                return ;
            }
            else if ((0 == (pDevNetInfo->byInitStatus & 0x01)) && (1 == (pDevNetInfo->byInitStatus>>1 & 0x01))) {
                
                bFind = TRUE;
                dispatch_async(dispatch_get_main_queue(), ^{
                    MSG(@"", _L(@"Device has Inited"), @"");
                    [pself StopSearchDevice];
                    [LoadingView hide];
                    [pself.vc.view removeFromSuperview];
//                    [pself.vc removeFromParentViewController];
                });
                return ;
            }
            else {
                BOOL bPhone = TRUE;
                BOOL bMail = TRUE;
                cPwdReset = pDevNetInfo->byPwdResetWay;
                NSLog(@"22===========%x, %x", pDevNetInfo->byInitStatus, pDevNetInfo->byPwdResetWay);
                if ((pDevNetInfo->byPwdResetWay & 0x01) == 1) {
                    bPhone = FALSE;
                }
                if ((pDevNetInfo->byPwdResetWay>>1 & 0x01) == 1) {
                    bMail = FALSE;
                }
                strncpy(s_szIP, pDevNetInfo->szIP, strlen(pDevNetInfo->szIP));
                bFind = TRUE;
                dispatch_async(dispatch_get_main_queue(), ^{
                    [pself.m_txtMac setText:strMac];
                    [pself SetTextHidden:FALSE Phone:bPhone Mail:bMail];
                    [pself StopSearchDevice];
                    [LoadingView hide];
                    [pself.vc.view removeFromSuperview];
//                    [pself.vc removeFromParentViewController];
                });
            }
        }
    }
}
- (void)StopSearchDevice {
    CLIENT_StopSearchDevices(lSearchHandle);
    lSearchHandle = 0;
}

-(void)onSearch
{

    [m_txtDeviceSN resignFirstResponder];
    if (m_txtDeviceSN.text.length == 0) {
        MSG(@"", _L(@"Device SN is NULL"), @"");
        return;
    }
    self.m_strSN = m_txtDeviceSN.text;
    NSLog(@"Search!");
    bFind = FALSE;
    [self SetTextHidden:TRUE Phone:TRUE Mail:TRUE];
    if (lSearchHandle != 0)
    {
        CLIENT_StopSearchDevices(lSearchHandle);
    }
    lSearchHandle = CLIENT_StartSearchDevices(OnSearchDeviceCB, (__bridge void*)self);
    
    [LoadingView showCircleView:vc.view];
    [self.view addSubview:vc.view];
    dispatch_time_t time = dispatch_time(DISPATCH_TIME_NOW, 10*NSEC_PER_SEC);
    dispatch_after(time, dispatch_get_main_queue(), ^{
        [LoadingView hide];
        [vc.view removeFromSuperview];
//        [vc removeFromParentViewController];
        CLIENT_StopSearchDevices(lSearchHandle);
        NSLog(@"CLIENT_StopService");
    });
    
}

- (void)onInitDevAccount {
    
    if(0 == m_txtPwd.text.length)
    {
        MSG(@"", _L(@"Password is NULL"), @"");
        return ;
    }
    
    NET_IN_INIT_DEVICE_ACCOUNT stIn = {sizeof(stIn)};
    strncpy(stIn.szMac, [m_txtMac.text UTF8String], sizeof(stIn.szMac));
    strncpy(stIn.szUserName, [m_txtUser.text UTF8String], sizeof(stIn.szUserName));
    strncpy(stIn.szPwd, [m_txtPwd.text UTF8String], sizeof(stIn.szPwd));
    
    if (m_txtPhone.text.length != 0) {
        strncpy(stIn.szCellPhone, [m_txtPhone.text UTF8String], sizeof(stIn.szCellPhone));
    }
    if (m_txtMail.text.length != 0) {
        strncpy(stIn.szMail, [m_txtMail.text UTF8String], sizeof(stIn.szMail));
    }
    stIn.byPwdResetWay = cPwdReset;
    NET_OUT_INIT_DEVICE_ACCOUNT stOut = {sizeof(stOut)};
    BOOL bRet = CLIENT_InitDevAccount(&stIn, &stOut, 3000, NULL);
    if(!bRet)
    {
        bRet = CLIENT_InitDevAccountByIP(&stIn, &stOut, 3000, NULL, s_szIP);
    }
    if (bRet) {
        NSLog(@"Success");
//        MSG(@"", _L(@"Init Dev Account Success"), @"");
        NSString *str = [NSString stringWithFormat:_L(@"Init Dev Account Success")];
        UIAlertController *alert = [UIAlertController alertControllerWithTitle:_L(@"") message:str preferredStyle:UIAlertControllerStyleAlert];
        UIAlertAction *okAction = [UIAlertAction actionWithTitle:_L(@"OK") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
            NSLog(@"OK Action");
        }];
        [alert addAction:okAction];
        [self presentViewController:alert animated:TRUE completion:nil];
    }
    else {
        NSLog(@"Failed, error is %x", CLIENT_GetLastError());
//        MSG(@"", _L(@"Init Dev Account Failed!"), @"");
        NSString *str = [NSString stringWithFormat:_L(@"Init Dev Account Failed")];
        UIAlertController *alert = [UIAlertController alertControllerWithTitle:_L(@"") message:str preferredStyle:UIAlertControllerStyleAlert];
        UIAlertAction *okAction = [UIAlertAction actionWithTitle:_L(@"OK") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
            NSLog(@"OK Action");
        }];
        [alert addAction:okAction];
        [self presentViewController:alert animated:TRUE completion:nil];
    }
}

-(BOOL)textFieldShouldBeginEditing:(UITextField *)textField
{
    if (textField == m_txtUser || textField == m_txtMac) {
        return NO;
    }
    self.firstResponderTextF = textField;
    return YES;
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField
{
    [m_txtDeviceSN  resignFirstResponder];
    [m_txtPwd       resignFirstResponder];
    [m_txtPhone     resignFirstResponder];
    [m_txtMail      resignFirstResponder];
    return YES;
}

- (void)touchesBegan:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event
{
    if ([self.firstResponderTextF isFirstResponder]) {
        [self.firstResponderTextF resignFirstResponder];
    }
}
- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_txtDeviceSN  resignFirstResponder];
    [m_txtPwd       resignFirstResponder];
    [m_txtPhone     resignFirstResponder];
    [m_txtMail      resignFirstResponder];
}


- (void)didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        [vc.view removeFromSuperview];
        [vc removeFromParentViewController];
        [m_txtDeviceSN setText:@""];
        [self SetTextHidden:TRUE Phone:TRUE Mail:TRUE];
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
