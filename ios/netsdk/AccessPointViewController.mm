//
//  AccessPointViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/11/8.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "AccessPointViewController.h"
#import "Global.h"
#import "DHHudPrecess.h"
#import <ifaddrs.h>
#import <arpa/inet.h>
#import <SystemConfiguration/CaptiveNetwork.h>
#import <AVFoundation/AVFoundation.h>
#import <AVFoundation/AVMediaFormat.h>

#import "DeviceInfoViewController.h"

@interface AccessPointViewController ()

@property (strong, nonatomic) UILabel *m_labSSID;
@property (nonatomic) BOOL bFlag;

@property (nonatomic) NSString *strSN;
@end

@implementation AccessPointViewController

@synthesize m_labSSID;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    self.title = _L(@"APConfig");
    
    UIButton *btn = [[UIButton alloc] init];
    btn.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    btn.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    btn.layer.cornerRadius = 10;
    btn.layer.borderWidth = 1;
    [btn setTitle:_L(@"Next") forState:UIControlStateNormal];
    btn.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [btn setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    btn.titleLabel.font = [UIFont systemFontOfSize:20];
    [btn addTarget:self action:@selector(onBtn) forControlEvents:UIControlEventTouchUpInside];
    [self.view addSubview:btn];

    m_labSSID = [[UILabel alloc] init];
    m_labSSID.frame = CGRectMake(0, 0, kScreenWidth, kScreenHeight/10);
    m_labSSID.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.3);
    m_labSSID.layer.cornerRadius = 10;
    m_labSSID.layer.borderWidth = 1;
    m_labSSID.adjustsFontSizeToFitWidth = YES;
    m_labSSID.font = [UIFont systemFontOfSize:20];
    m_labSSID.textAlignment = NSTextAlignmentCenter;
    m_labSSID.textColor = [UIColor blueColor];
    [self.view addSubview:m_labSSID];
    
    self.bFlag = NO;


}

-(void)viewDidAppear:(BOOL)animated {
    
    id info = nil;
    NSString *ssid = _L(@"Current Wifi:");
    NSString *strSSID = @"";
    NSArray *ifs = (id)CFBridgingRelease(CNCopySupportedInterfaces());
    for (NSString *ifnam in ifs) {
        info = (id)CFBridgingRelease(CNCopyCurrentNetworkInfo((__bridge CFStringRef)ifnam));
        strSSID = [[info objectForKey:@"SSID"] copy];
        self.bFlag = YES;
    }
    if (strSSID.length == 0) {
        strSSID = _L(@"Unconneted");
    }
    ssid = [ssid stringByAppendingString:strSSID];
    m_labSSID.text = ssid;
    
}


- (void)onBtn {
    
    if (self.bFlag) {
        DeviceInfoViewController *deviceInfo = [[DeviceInfoViewController alloc] init];
        [self.navigationController pushViewController:deviceInfo animated:YES];
    }
    else {
        MSG(@"", _L(@"Please connect device hotspot!"), @"");
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
