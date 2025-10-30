//
//  WifiListViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/10.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "WifiListViewController.h"
#import "Global.h"
#import <list>
#import "APConfigViewController.h"


@interface WifiInfo : NSObject
@property (retain, nonatomic) NSString *SSID;
@property (nonatomic) int nAuthMode;
@property (nonatomic) int nEncrAlgr;
@end
@implementation WifiInfo
@end

@interface WifiListViewController ()
@property (strong, nonatomic) UITableView *m_tableView;

@property (strong, nonatomic) NSMutableArray *m_arrWifi;

@property (nonatomic) NSString *m_szSubscribeTime;
@end

@implementation WifiListViewController

@synthesize m_tableView;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.title = _L(@"WiFi Config");
    
    _m_arrWifi = [[NSMutableArray alloc] init];
    
    
    UILabel *lab = [[UILabel alloc] init];
    lab.frame = CGRectMake(0, 0, kScreenWidth, kScreenHeight/5);
    lab.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.2);
    lab.text = _L(@"Please select WiFi to config");
    lab.font = [UIFont systemFontOfSize:24];
    lab.textAlignment = NSTextAlignmentCenter;
    lab.adjustsFontSizeToFitWidth = YES;
    lab.numberOfLines = 1;
    [self.view addSubview:lab];
    
    m_tableView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.6) style:UITableViewStylePlain];
    m_tableView.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.6);
    m_tableView.rowHeight = 60;
    m_tableView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableView.separatorColor = [UIColor redColor];
    m_tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableView.backgroundColor = [UIColor whiteColor];

    m_tableView.delegate = self;
    m_tableView.dataSource = self;
    [self.view addSubview:m_tableView];
    
    
    //_lLoginID = [self login];
    [self getWifiList:_lLoginID];
    
}


- (void)getWifiList : (long)lLoginID {

    if (_lLoginID) {
        
        // Search wlan device list Ex(MaxNum is 128)
        DHDEV_WLAN_DEVICE_LIST_EX2 st = {sizeof(st)};
        unsigned int retLen = 0;
        BOOL bRet = CLIENT_GetDevConfig(_lLoginID, DH_DEV_WLAN_DEVICE_CFG_EX2, -1, &st, sizeof(st), &retLen, 5000);
        if (bRet) {
            for (int i = 0; i < st.bWlanDevCount; ++i) {
                NSLog(@"SSID: %s", st.lstWlanDev[i].szSSID);
                NSString *strSSID = [NSString stringWithUTF8String: st.lstWlanDev[i].szSSID];
                WifiInfo *wifi = [[WifiInfo alloc] init];
                wifi.SSID = strSSID;
                wifi.nAuthMode = st.lstWlanDev[i].byAuthMode;
                wifi.nEncrAlgr = st.lstWlanDev[i].byEncrAlgr;
                [_m_arrWifi addObject:wifi];

            }
        }
        
        else {
            NSLog(@"error is %d", CLIENT_GetLastError()&0x7fffffff);
        }

        dispatch_async(dispatch_get_main_queue(), ^{
            [self.m_tableView reloadData];
        });
    }
}


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
    
    return 1;
}

- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath
{
    return kScreenHeight/10;
}

- (nonnull UITableViewCell *)tableView:(nonnull UITableView *)tableView cellForRowAtIndexPath:(nonnull NSIndexPath *)indexPath {
    
    static NSString *identifier = @"CELL";
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:identifier];
    if (!cell) {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:identifier];
        cell.accessoryType = UITableViewCellAccessoryNone;
    }
    WifiInfo* wifi = [_m_arrWifi objectAtIndex:indexPath.row];
    
    cell.textLabel.text = wifi.SSID;
    cell.textLabel.font = [UIFont systemFontOfSize:18];
    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;

    return cell;
}

- (NSInteger)tableView:(nonnull UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    
    return [_m_arrWifi count];
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    
    APConfigViewController *apconfig = [[APConfigViewController alloc] init];
    WifiInfo* wifi = [_m_arrWifi objectAtIndex:indexPath.row];
    apconfig.m_strSSID = wifi.SSID;
    apconfig.m_nAuthMode = wifi.nAuthMode;
    apconfig.m_nEncrAlgr = wifi.nEncrAlgr;
    apconfig.lLoginID = _lLoginID;
    [self.navigationController pushViewController:apconfig animated:YES];
    
    
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
