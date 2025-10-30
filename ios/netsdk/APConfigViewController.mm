//
//  APConfigViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/10.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "APConfigViewController.h"
#import "Global.h"
#import "DHHudPrecess.h"


@interface APConfigViewController ()<UITextFieldDelegate>



@property (strong, nonatomic) UILabel *m_labSSID;
@property (strong, nonatomic) UILabel *m_labPwd;

@property (strong, nonatomic) UITextField *m_txtSSID;
@property (strong, nonatomic) UITextField *m_txtPwd;
@property (strong, nonatomic) MBProgressHUD* waitView;
@end

@implementation APConfigViewController

@synthesize m_labSSID, m_labPwd, m_txtSSID, m_txtPwd, waitView;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.title = _L(@"APConfig");
    
    
    m_txtSSID = [[UITextField alloc] init];
    [m_txtSSID setFrame:CGRectMake(0, 0, kScreenWidth*0.6, kScreenHeight/20)];
    [m_txtSSID setCenter:CGPointMake(kScreenWidth*0.65, kScreenHeight*0.3)];
    m_txtSSID.borderStyle    = UITextBorderStyleRoundedRect;
    m_txtSSID.keyboardType   = UIKeyboardTypeURL;
    m_txtSSID.returnKeyType  = UIReturnKeyNext;
    m_txtSSID.font = [UIFont systemFontOfSize:20];
    m_txtSSID.layer.borderWidth = 1;
    m_txtSSID.layer.cornerRadius = 10;
    m_txtSSID.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_txtSSID.autocapitalizationType = UITextAutocapitalizationTypeNone;
    [m_txtSSID setPlaceholder:_L(@"SSID")];
    m_txtSSID.adjustsFontSizeToFitWidth = TRUE;
    m_txtSSID.text = _m_strSSID;
    [self.view addSubview: m_txtSSID];
    m_txtSSID.delegate = self;
    
    
    m_labSSID = [[UILabel alloc] init];
    [m_labSSID setFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    [m_labSSID setCenter:CGPointMake(kScreenWidth*0.2, kScreenHeight*0.3)];
    m_labSSID.text = _L(@"SSID");
    m_labSSID.adjustsFontSizeToFitWidth = TRUE;
    m_labSSID.textColor = UIColor.blackColor;
    m_labSSID.layer.borderWidth = 1;
    m_labSSID.layer.cornerRadius = 10;
    m_labSSID.layer.masksToBounds = YES;
    m_labSSID.backgroundColor = UIColor.whiteColor;
    m_labSSID.textAlignment = NSTextAlignmentCenter;
    [m_labSSID setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labSSID];
    
    
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
    [btn setTitle:_L(@"Config") forState:UIControlStateNormal];
    btn.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [btn setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    btn.titleLabel.font = [UIFont systemFontOfSize:20];
    [btn addTarget:self action:@selector(onBtnConfig) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:btn];
    
    UIButton *btnHome = [[UIButton alloc] init];
    btnHome.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    btnHome.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.7);
    btnHome.layer.cornerRadius = 10;
    btnHome.layer.borderWidth = 1;
    [btnHome setTitle:_L(@"Back to Main") forState:UIControlStateNormal];
    btnHome.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [btnHome setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    btnHome.titleLabel.font = [UIFont systemFontOfSize:20];
    [btnHome addTarget:self action:@selector(onBtnBackHome) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:btnHome];
    
}

- (void) onBtnBackHome {
    
    [self.navigationController popToRootViewControllerAnimated:TRUE];
    
}

- (void) onBtnConfig {
    NSLog(@"config");
    
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
        int nEncryption = [self getValue:_m_nAuthMode EncryAlgr:_m_nEncrAlgr];
        [self WlanConfig:nEncryption];
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            MSG(@"", _L(@"Configuration Completed"), @"");
        });
    });
}


- (BOOL)WlanConfig : (int)nEncryption{

    char *pszBuf = new char[1024*10];
    memset(pszBuf, 0, 1024*10);
    int nError = 0;
    BOOL bRet = CLIENT_GetNewDevConfig(_lLoginID, (char*)CFG_CMD_WLAN, -1, pszBuf, 1024*10, &nError, 10000);
    if (bRet) {
        CFG_NETAPP_WLAN stCfg;
        CLIENT_ParseData((char*)CFG_CMD_WLAN, pszBuf, &stCfg, sizeof(stCfg), NULL);
        
        // wifi SSID
        char *szWlanSSID = (char*)[m_txtSSID.text UTF8String];
        strncpy(stCfg.stuWlanInfo[0].szSSID, szWlanSSID, sizeof(stCfg.stuWlanInfo[0].szSSID));
        // wifi Pwd
        char *szPwd = (char*)[m_txtPwd.text UTF8String];
        strncpy(stCfg.stuWlanInfo[0].szKeys[0], szPwd, sizeof(stCfg.stuWlanInfo[0].szKeys[0]));
        
        stCfg.stuWlanInfo[0].bEnable = YES;
        stCfg.stuWlanInfo[0].bConnectEnable = YES;
        stCfg.stuWlanInfo[0].nKeyID = 0;
        stCfg.stuWlanInfo[0].bKeyFlag = NO;
        stCfg.stuWlanInfo[0].bLinkEnable = YES;
        stCfg.stuWlanInfo[0].nLinkMode = 0;
        
        // Encryption depends on byAuthMode && byEncrAlgr
        stCfg.stuWlanInfo[0].nEncryption = nEncryption;
        
        strncpy(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0], "8.8.8.8", sizeof(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[0]));
        strncpy(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1], "8.8.4.4", sizeof(stCfg.stuWlanInfo[0].stuNetwork.szDnsServers[1]));
        
        memset(pszBuf, 0, 1024*10);
        
        CLIENT_PacketData((char*)CFG_CMD_WLAN, &stCfg, sizeof(stCfg), pszBuf, 1024*10);
        
        bRet = CLIENT_SetNewDevConfig(_lLoginID, (char*)CFG_CMD_WLAN, -1, pszBuf, 1024*10, &nError, NULL, 10000);
        if (bRet) {
            NSLog(@"set success");
        }
        else {
            NSLog(@"error is %d", CLIENT_GetLastError()&0x7fffffff);
        }
        
    }
    else {
        NSLog(@"error is %d", CLIENT_GetLastError()&0x7fffffff);
    }
    delete[] pszBuf;
    pszBuf = NULL;
    return bRet;
}



/**
 *  加密模式
 *  二代byAuthMode  , byEncrAlgr  与二代映射关系
 *  Authentication认证方式          DataEncryption数据加密方式     Encryption加密模式
 *  WPA-NONE 6                      NONE      0                     WPA-NONE       0
 *  OPEN     0                      NONE      0                     On			   1
 *  OPEN     0                      WEP       4                     WEP-OPEN	   2
 *  SHARED   1                      WEP       4                     WEP-SHARED     3
 *  WPA      2                      TKIP      5                     WPA-TKIP       4
 *  WPA-PSK  3                      TKIP      5                     WPA-PSK-TKIP   5
 *  WPA2     4                      TKIP      5                     WPA2-TKIP      6
 *  WPA2-PSK 5                      TKIP      5                     WPA2-PSK-TKIP  7
 *  WPA      2                      AES(CCMP) 6                     WPA-AES        8
 *  WPA-PSK  3                      AES(CCMP) 6                     WPA-PSK-AES    9
 *  WPA2     4                      AES(CCMP) 6                     WPA2-AES       10
 *  WPA2-PSK 5                      AES(CCMP) 6                     WPA2-PSK-AES   11
 *  WPA      2                      TKIP+AES( mix Mode) 7           WPA-TKIP或者WPA-AES  4或8
 *  WPA-PSK  3                      TKIP+AES( mix Mode) 7           WPA-PSK-TKIP或者WPA-PSK-AES 5或9
 *  WPA2     4                      TKIP+AES( mix Mode) 7           WPA2-TKIP或者WPA2-AES   6或10
 *  WPA2-PSK 5                      TKIP+AES( mix Mode) 7           WPA2-PSK-TKIP或者WPA2-PSK-AES 7或11
 *
 * 以下是混合模式
 * WPA-PSK|WPA2-PSK 7
 * WPA|WPA2         8
 * WPA|WPA-PSK      9
 * WPA2|WPA2-PSK    10
 * WPA|WPA-PSK|WPA2|WPA2-PSK 11
 */
-(int) getValue:(int) byAuthMode EncryAlgr:(int) byEncrAlgr {
        int nEncryption = 0;

        if(byAuthMode == 6 && byEncrAlgr == 0)
        {
            nEncryption = 0;
        }
        else if(byAuthMode == 0 && byEncrAlgr == 0)
        {
            nEncryption = 1;
        }
        else  if(byAuthMode == 0 && byEncrAlgr == 4)
        {
            nEncryption = 2;
        }
        else  if(byAuthMode == 1 && byEncrAlgr == 4)
        {
            nEncryption = 3;
        }
        else  if(byAuthMode == 2 && byEncrAlgr == 5)
        {
            nEncryption = 4;
        }
        else  if(byAuthMode == 3 && byEncrAlgr == 5)
        {
            nEncryption = 5;
        }
        else  if(byAuthMode == 4 && byEncrAlgr == 5)
        {
            nEncryption = 6;
        }
        else  if(byAuthMode == 5 && byEncrAlgr == 5)
        {
            nEncryption = 7;
        }
        else  if(byAuthMode == 2 && byEncrAlgr == 6)
        {
            nEncryption = 8;
        }
        else  if(byAuthMode == 3 && byEncrAlgr == 6)
        {
            nEncryption = 9;
        }
        else  if(byAuthMode == 4 && byEncrAlgr == 6)
        {
            nEncryption = 10;
        }
        else  if(byAuthMode == 5 && byEncrAlgr == 6)
        {
            nEncryption = 11;
        }
        else  if(byAuthMode == 2 && byEncrAlgr == 7)
        {
            nEncryption = 8;  // 4或者8
        }
        else  if(byAuthMode == 3 && byEncrAlgr == 7)
        {
            nEncryption = 9;  // 5或9
        }
        else  if(byAuthMode == 4 && byEncrAlgr == 7)
        {
            nEncryption = 10;  // 6或10
        }
        else  if(byAuthMode == 5 && byEncrAlgr == 7)
        {
            nEncryption = 11;  // 7或11
        }
        else if(byAuthMode == 7)  // 混合模式WPA-PSK|WPA2-PSK   3或5
        {
            if(byEncrAlgr == 5) {
                nEncryption = 7;  // 5或7
            }
            else if(byEncrAlgr == 6)
            {
                nEncryption = 11;  // 9或11
            }
            else if(byEncrAlgr == 7)
            {
                nEncryption = 11;  // 5或7或9或11
            }
            else {
                nEncryption = 12;
            }
        }
        else if(byAuthMode == 8)  // 混合模式WPA|WPA2    2或4
        {
            if(byEncrAlgr == 5) {
                nEncryption = 6;  // 4或6
            }
            else if(byEncrAlgr == 6)
            {
                nEncryption = 10;  // 8或10
            }
            else if(byEncrAlgr == 7)
            {
                nEncryption = 10;  // 4或6或8或10
            }
            else {
                nEncryption = 12;
            }
        }
        else if(byAuthMode == 9)  // 混合模式WPA|WPA-PSK  2或3
        {
            if(byEncrAlgr == 5) {
                nEncryption = 5;  // 4或5
            }
            else if(byEncrAlgr == 6)
            {
                nEncryption = 9;  // 8或9
            }
            else if(byEncrAlgr == 7)
            {
                nEncryption = 9;  // 4或5或8或9
            }
            else {
                nEncryption = 12;
            }
        }
        else if(byAuthMode == 10)  // 混合模式WPA2|WPA2-PSK  4或5
        {
            if(byEncrAlgr == 5) {
                nEncryption = 7;  // 6或7
            }
            else if(byEncrAlgr == 6)
            {
                nEncryption = 11;  // 10或11
            }
            else if(byEncrAlgr == 7)
            {
                nEncryption = 11;  // 6或7或10或11
            }
            else {
                nEncryption = 12;
            }
        }
        else if(byAuthMode == 11)  // 混合模式WPA|WPA-PSK|WPA2|WPA2-PSK  2或3或4或5
        {
            if(byEncrAlgr == 5) {
                nEncryption = 7;  // 4或5或6或7
            }
            else if(byEncrAlgr == 6)
            {
                nEncryption = 11;  // 8或9或10或11
            }
            else if(byEncrAlgr == 7)
            {
                nEncryption = 11;  // 4或5或6或7或8或9或10或11
            }
            else {
                nEncryption = 12;
            }
        } else {
            nEncryption = 12;
        }
    return nEncryption;
    }


- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_txtSSID       resignFirstResponder];
    [m_txtPwd      resignFirstResponder];
}

- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_txtSSID       resignFirstResponder];
    [m_txtPwd      resignFirstResponder];
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
