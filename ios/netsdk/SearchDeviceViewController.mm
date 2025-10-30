//
//  SearchDeviceViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "SearchDeviceViewController.h"
#import "netsdk.h"
#import <list>



static LLONG g_SearchHandle = 0;
static NSMutableArray *arrIP;
static NSMutableArray *arrSN;
static std::list<DEVICE_NET_INFO_EX*> m_lstDeviceInfo;

@interface SearchDeviceViewController ()

@property (strong, nonatomic) UITableView *m_tableView;
@property (strong, nonatomic) UIButton *m_btnSearch;

@end

@implementation SearchDeviceViewController

@synthesize m_tableView, m_btnSearch;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Search Device");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    arrIP = [[NSMutableArray alloc] init];
    arrSN = [[NSMutableArray alloc] init];
    
    
    m_tableView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.7) style:UITableViewStylePlain];
    m_tableView.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_tableView.rowHeight = 60;
    m_tableView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableView.separatorColor = [UIColor redColor];
    m_tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableView.backgroundColor = [UIColor whiteColor];
    UILabel *headerLabel = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, m_tableView.rowHeight)];
    headerLabel.text = _L(@"Device List");
    headerLabel.font = [UIFont systemFontOfSize:24];
    headerLabel.textAlignment = NSTextAlignmentCenter;
    headerLabel.textColor = [UIColor blackColor];
    //m_tableView.tableHeaderView = headerLabel;
    m_tableView.delegate = self;
    m_tableView.dataSource = self;
    [self.view addSubview:m_tableView];
    
    m_btnSearch = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnSearch.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.9);
    m_btnSearch.backgroundColor = [UIColor lightGrayColor];
    [m_btnSearch setTitle:_L(@"Start Search Device") forState:UIControlStateNormal];
    [m_btnSearch addTarget:self action:@selector(OnStartSearchDevice) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSearch setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSearch.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnSearch.layer.cornerRadius = 10;
    m_btnSearch.layer.borderWidth = 1;
    [self.view addSubview:m_btnSearch];

}

static void searchDevicesCB(DEVICE_NET_INFO_EX *pDevNetInfo, void* pUserData) {

    if (4 != pDevNetInfo->iIPVersion) {
        return;
    }
    NSLog(@"ip: %s", pDevNetInfo->szIP);
    
    char *szDeviceSN = pDevNetInfo->szSerialNo;
    std::list<DEVICE_NET_INFO_EX*>::iterator it = m_lstDeviceInfo.begin();
    BOOL bFlag = FALSE;
    for (; it != m_lstDeviceInfo.end(); ++it) {
        DEVICE_NET_INFO_EX* pInfo = *it;
        if (NULL != pInfo) {
            if (0 == strcmp(pInfo->szSerialNo, szDeviceSN)) {
                bFlag = TRUE;
                break;
            }
        }
    }
    if (bFlag) {
        return;
    }
    SearchDeviceViewController *pself = (__bridge SearchDeviceViewController*)pUserData;
    DEVICE_NET_INFO_EX* pInfo = new DEVICE_NET_INFO_EX;
    memset(pInfo, 0, sizeof(DEVICE_NET_INFO_EX));
    memcpy(pInfo, pDevNetInfo, sizeof(DEVICE_NET_INFO_EX));
    m_lstDeviceInfo.push_back(pInfo);
    
    NSString *strIP = [NSString stringWithFormat:_L(@"IP: %s"), pInfo->szIP];
    NSString *strSN = [NSString stringWithFormat:_L(@"SN: %s"), pInfo->szSerialNo];
    [arrIP addObject:strIP];
    [arrSN addObject:strSN];
    
    dispatch_async(dispatch_get_main_queue(), ^{
        [pself.m_tableView reloadData];
    });
}

- (void)OnStartSearchDevice {
    
    if (0 == g_SearchHandle) {
        
        std::list<DEVICE_NET_INFO_EX*>::iterator it = m_lstDeviceInfo.begin();
        for(;it != m_lstDeviceInfo.end(); ++it)
        {
            DEVICE_NET_INFO_EX* pInfo = *it;
            if (pInfo != NULL)
            {
                delete pInfo;
                pInfo = NULL;
            }
        }
        m_lstDeviceInfo.clear();
        [arrIP removeAllObjects];
        [arrSN removeAllObjects];
        [self.m_tableView reloadData];
        


        g_SearchHandle = CLIENT_StartSearchDevices(searchDevicesCB, (__bridge void*)self);
        if (g_SearchHandle) {
            [m_btnSearch setTitle:_L(@"Stop Search Device") forState:UIControlStateNormal];
        }
        NSLog(@"Start Search Device");
    }
    else {
        [m_btnSearch setTitle:_L(@"Start Search Device") forState:UIControlStateNormal];
        CLIENT_StopSearchDevices(g_SearchHandle);
        g_SearchHandle = 0;
        NSLog(@"Stop Search Device");
    }
    
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    if (!parent) {
        if (0 != g_SearchHandle) {
            [self OnStartSearchDevice];
        }
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


- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {
    
    return 1;
}


- (nonnull UITableViewCell *)tableView:(nonnull UITableView *)tableView cellForRowAtIndexPath:(nonnull NSIndexPath *)indexPath {
    
    static NSString *identifier = @"CELL";
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:identifier];
    if (!cell) {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:identifier];
        cell.accessoryType = UITableViewCellAccessoryNone;
    }
    cell.textLabel.text = [arrIP objectAtIndex:indexPath.row];
    cell.textLabel.font = [UIFont systemFontOfSize:18];
    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
    cell.detailTextLabel.text = [arrSN objectAtIndex:indexPath.row];
    cell.detailTextLabel.font = [UIFont systemFontOfSize:18];
    cell.detailTextLabel.adjustsFontSizeToFitWidth = TRUE;
    return cell;
}

- (NSInteger)tableView:(nonnull UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    
    return [arrIP count];
}


@end
