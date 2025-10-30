//
//  ControlDeviceViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "ControlDeviceViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "DHHudPrecess.h"

@interface ControlDeviceViewController ()

//@property (strong, nonatomic) UILabel *m_DeviceTime;
@property (strong, nonatomic) UITextField *m_DeviceTime;

@end

@implementation ControlDeviceViewController

@synthesize m_DeviceTime;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Control Device");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    UIButton *m_btnReboot = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnReboot.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.2);
    m_btnReboot.backgroundColor = [UIColor lightGrayColor];
    [m_btnReboot setTitle:_L(@"Reboot Device") forState:UIControlStateNormal];
    [m_btnReboot addTarget:self action:@selector(onReboot) forControlEvents:UIControlEventTouchUpInside];
    [m_btnReboot setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnReboot.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnReboot.layer.cornerRadius = 10;
    m_btnReboot.layer.borderWidth = 1;
    [self.view addSubview:m_btnReboot];
    
    UIButton *m_btnQueryDeviceTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnQueryDeviceTime.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.3);
    m_btnQueryDeviceTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnQueryDeviceTime setTitle:_L(@"Query Device Time") forState:UIControlStateNormal];
    [m_btnQueryDeviceTime addTarget:self action:@selector(onQueryDeviceTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnQueryDeviceTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnQueryDeviceTime.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnQueryDeviceTime.layer.cornerRadius = 10;
    m_btnQueryDeviceTime.layer.borderWidth = 1;
    [self.view addSubview:m_btnQueryDeviceTime];
    
    UIButton *m_btnSetupDeviceTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnSetupDeviceTime.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.4);
    m_btnSetupDeviceTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnSetupDeviceTime setTitle:_L(@"Sync Device Time") forState:UIControlStateNormal];
    [m_btnSetupDeviceTime addTarget:self action:@selector(onSetupDeviceTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSetupDeviceTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSetupDeviceTime.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnSetupDeviceTime.layer.cornerRadius = 10;
    m_btnSetupDeviceTime.layer.borderWidth = 1;
    [self.view addSubview:m_btnSetupDeviceTime];
 
    
    m_DeviceTime = [[UITextField alloc] init];
    m_DeviceTime.frame = CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight*0.05);
    m_DeviceTime.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.7);
    m_DeviceTime.borderStyle = UITextBorderStyleRoundedRect;
    m_DeviceTime.placeholder = _L(@"Device Time");
    m_DeviceTime.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_DeviceTime.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_DeviceTime.textColor = [UIColor blackColor];
    m_DeviceTime.adjustsFontSizeToFitWidth = YES;
    m_DeviceTime.font = [UIFont systemFontOfSize:24];
    m_DeviceTime.adjustsFontSizeToFitWidth = TRUE;
    m_DeviceTime.textAlignment = NSTextAlignmentCenter;
    m_DeviceTime.rightViewMode = UITextFieldViewModeAlways;
    m_DeviceTime.delegate = self;
    [self.view addSubview:m_DeviceTime];
}


- (void)onReboot {
    
    UIAlertController *alert = [UIAlertController alertControllerWithTitle:_L(@"Confirm") message:_L(@"Reboot Device?") preferredStyle:UIAlertControllerStyleAlert];
    UIAlertAction *yesAction = [UIAlertAction actionWithTitle:_L(@"YES") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
        NSLog(@"YES");
        BOOL bRet = CLIENT_RebootDev(g_loginID);
        if (!bRet) {
            MSG(@"", _L(@"Reboot Device Failed"), "");
            NSLog(@"error is %x", CLIENT_GetLastError());
        }
        else{
            MSG(@"",_L(@"Reboot Device Success"), @"");
        }
    }];
    [alert addAction:yesAction];
    UIAlertAction *noAction = [UIAlertAction actionWithTitle:_L(@"NO") style:UIAlertActionStyleDefault handler:^(UIAlertAction * _Nonnull action) {
        NSLog(@"NO");
    }];
    [alert addAction:noAction];
    
    [self presentViewController:alert animated:TRUE completion:nil];
}

- (void)onQueryDeviceTime {
    
    NET_TIME stTime = {0};
    BOOL bRet = CLIENT_QueryDeviceTime(g_loginID, &stTime, 3000);
    if (!bRet) {
        MSG(@"", _L(@"Query Device Time Failed"), "");
        NSLog(@"error is %x", CLIENT_GetLastError());
    }
    else{
        MSG(@"",_L(@"Query Device Time Success"), @"");
    }
    
    NSString *strTime = [NSString stringWithFormat:_L(@"%04d-%02d-%02d %02d:%02d:%02d"),stTime.dwYear, stTime.dwMonth, stTime.dwDay, stTime.dwHour, stTime.dwMinute, stTime.dwSecond];
    m_DeviceTime.text = strTime;
}

- (void)onSetupDeviceTime {
    
    NSDate *time= [NSDate date];
    NSLog(@"now time is: %@", time);
    NSCalendar *calendar = [NSCalendar currentCalendar];
    NSUInteger unitFlags = NSCalendarUnitYear | NSCalendarUnitMonth | NSCalendarUnitDay
    | NSCalendarUnitHour | NSCalendarUnitMinute | NSCalendarUnitSecond;
    NSDateComponents *dateCom = [calendar components:unitFlags fromDate:time];
    NET_TIME pLocalTime = {0};
    pLocalTime.dwYear = (int)[dateCom year];
    pLocalTime.dwMonth = (int)[dateCom month];
    pLocalTime.dwDay = (int) [dateCom day];
    pLocalTime.dwHour = (int) [dateCom hour];
    pLocalTime.dwMinute = (int) [dateCom minute];
    pLocalTime.dwSecond = (int) [dateCom second];
    BOOL bRet = CLIENT_SetupDeviceTime(g_loginID, &pLocalTime);
    if (!bRet) {
        MSG(@"", _L(@"Sync Device Time Failed"), "");
        NSLog(@"error is %x", CLIENT_GetLastError());
    }
    else{
        MSG(@"",_L(@"Sync Device Time Success"), @"");
    }
    
}

- (BOOL)textFieldShouldBeginEditing:(UITextField *)textField {
    
    if (textField == m_DeviceTime) {
        return FALSE;
    }
    else {
        return TRUE;
    }
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    [m_DeviceTime setText:@""];
    
//    [m_DeviceTime setText:_L(@"Device Time")];
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
