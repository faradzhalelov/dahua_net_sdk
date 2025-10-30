//
//  AlarmListenViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/9/4.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "AlarmListenViewController.h"
#import "Global.h"
#import "DHHudPrecess.h"

static NSMutableArray *arrayAlarm;
static NSArray *s_AlarmName = @[_L(@"AlarmLocal"),
                                _L(@"VideoMotion"),
                                _L(@"VideoLoss"),
                                _L(@"VideoBlind"),
                                _L(@"StorageLowSpace"),
                                _L(@"StorageFailure")];
static int nIndex = 1;
static NSMutableArray *arrChannel[6];

@interface AlarmListenViewController ()

@property (strong, nonatomic) UITableView *m_tableView;
@property (strong, nonatomic) UIButton *m_btnListen;
@property (nonatomic) BOOL m_bListen;

@end

@implementation AlarmListenViewController

@synthesize m_tableView, m_btnListen, m_bListen;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Alarm Listen");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    arrayAlarm = [[NSMutableArray alloc] init];
    for (int i = 0; i < 6; ++i) {
        arrChannel[i] = [[NSMutableArray alloc] init];
    }
    
    m_tableView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight*0.7) style:UITableViewStylePlain];
    m_tableView.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_tableView.rowHeight = 60;
    m_tableView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableView.separatorColor = [UIColor redColor];
    m_tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableView.backgroundColor = [UIColor whiteColor];
    UILabel *headerLabel = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, m_tableView.rowHeight)];
    headerLabel.text = _L(@"Alarm List");
    headerLabel.font = [UIFont systemFontOfSize:24];
    headerLabel.textAlignment = NSTextAlignmentCenter;
    headerLabel.textColor = [UIColor blackColor];
    //m_tableView.tableHeaderView = headerLabel;
    m_tableView.delegate = self;
    m_tableView.dataSource = self;
    [self.view addSubview:m_tableView];
    
    m_btnListen = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.8, kScreenHeight/20)];
    m_btnListen.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.9);
    m_btnListen.backgroundColor = [UIColor lightGrayColor];
    [m_btnListen setTitle:_L(@"Start Listen") forState:UIControlStateNormal];
    [m_btnListen addTarget:self action:@selector(OnStartListen) forControlEvents:UIControlEventTouchUpInside];
    [m_btnListen setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnListen.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnListen.layer.cornerRadius = 10;
    m_btnListen.layer.borderWidth = 1;
    [self.view addSubview:m_btnListen];
    
}


int ConvertAlarm2Int(LONG lCommand) {
    //int i = -1;
    switch (lCommand) {
        case DH_ALARM_ALARM_EX:
            return 0;
        case DH_MOTION_ALARM_EX:
            return 1;
        case DH_VIDEOLOST_ALARM_EX:
            return 2;
        case DH_SHELTER_ALARM_EX:
            return 3;
        case DH_DISKFULL_ALARM_EX:
            return 4;
        case DH_DISKERROR_ALARM_EX:
            return 5;
            
        default:
            return -1;
    }
}


static BOOL CALLBACK cbMessage(LONG lCommand, LLONG lLoginID, char *pBuf, DWORD dwBufLen,char *pchDVRIP,LONG nDVRPort, LDWORD dwUser)
{
    NSLog(@"Command: %08x", lCommand);
    AlarmListenViewController *pself = (__bridge AlarmListenViewController*)(void *)dwUser;

    switch (lCommand) {
        case DH_ALARM_ALARM_EX:
        case DH_MOTION_ALARM_EX:
        case DH_VIDEOLOST_ALARM_EX:
        case DH_SHELTER_ALARM_EX:
        case DH_DISKFULL_ALARM_EX:
        case DH_DISKERROR_ALARM_EX:
        {
            int nAlarm = ConvertAlarm2Int(lCommand);
            for (int i = 0; i < dwBufLen; ++i) {
                if (1 == pBuf[i]) {
                    if (FALSE == [arrChannel[nAlarm] containsObject:[NSString stringWithFormat:@"%d", i]]) {
                        [arrChannel[nAlarm] addObject:[NSString stringWithFormat:@"%d", i]];
                        
                        NSString *index = [NSString stringWithFormat:_L(@"%d "), nIndex++];
                        NSDate *date = [NSDate date];
                        NSDateFormatter *forMatter = [[NSDateFormatter alloc] init];
                        [forMatter setDateFormat:@"yyyy-MM-dd HH:mm:ss "];
                        NSString *dateStr = [forMatter stringFromDate:date];
                        dateStr = [index stringByAppendingString:dateStr];
                        
                        NSString *channel = [NSString stringWithFormat:_L(@"Ch:%d "), i];
                        dateStr = [dateStr stringByAppendingString:channel];
                        
                        NSString *temp = s_AlarmName[nAlarm];
                        dateStr = [dateStr stringByAppendingString:temp];
                        NSString *Action = _L(@" Start");
                        dateStr = [dateStr stringByAppendingString:Action];
                        if (arrayAlarm.count >= 10) {
                            [arrayAlarm removeLastObject];
                        }
                        [arrayAlarm insertObject:dateStr atIndex:0];
                        
                        dispatch_async(dispatch_get_main_queue(), ^{
                            [pself.m_tableView reloadData];
                        });
                    }
                }
                else {
                    if (TRUE == [arrChannel[nAlarm] containsObject:[NSString stringWithFormat:@"%d", i]]) {
                        [arrChannel[nAlarm] removeObject:[NSString stringWithFormat:@"%d", i]];
                        NSString *index = [NSString stringWithFormat:_L(@"%d "), nIndex++];
                        NSDate *date = [NSDate date];
                        NSDateFormatter *forMatter = [[NSDateFormatter alloc] init];
                        [forMatter setDateFormat:@"yyyy-MM-dd HH:mm:ss "];
                        NSString *dateStr = [forMatter stringFromDate:date];
                        dateStr = [index stringByAppendingString:dateStr];
                        
                        NSString *channel = [NSString stringWithFormat:_L(@"Ch:%d "), i];
                        dateStr = [dateStr stringByAppendingString:channel];
                        NSString *temp = s_AlarmName[nAlarm];
                        dateStr = [dateStr stringByAppendingString:temp];
                        NSString *Action = _L(@" Stop");
                        dateStr = [dateStr stringByAppendingString:Action];
                        if (arrayAlarm.count >= 10) {
                            [arrayAlarm removeLastObject];
                        }
                        [arrayAlarm insertObject:dateStr atIndex:0];
                        
                        dispatch_async(dispatch_get_main_queue(), ^{
                            [pself.m_tableView reloadData];
                        });
                    }
                }
            }
            break;
        }
        default:
            break;
    }

    return TRUE;
}

-(void)viewDidAppear:(BOOL)animated
{
    m_bListen = FALSE;
    CLIENT_SetDVRMessCallBack(cbMessage, (LDWORD)self);
}

- (void)OnStartListen {
    
    if (!m_bListen) {
        NSLog(@"Start Listen");
        if (CLIENT_StartListenEx(g_loginID)) {
            
            m_bListen = TRUE;
            MSG(@"", _L(@"Start Listen Success"), @"");
            [self.m_btnListen setTitle:_L(@"Stop Listen") forState:UIControlStateNormal];
        }
        else {
            NSLog(@"error is %x", CLIENT_GetLastError());
            MSG(@"", _L(@"Start Listen Failed"), @"");
        }
    }
    else {
        NSLog(@"Stop Listen");
        if (CLIENT_StopListen(g_loginID)) {
            [arrayAlarm removeAllObjects];
            for (int i = 0; i < 6; ++i) {
                [arrChannel[i] removeAllObjects];
            }
            [m_tableView reloadData];
            m_bListen = FALSE;
            nIndex = 1;
            [self.m_btnListen setTitle:_L(@"Start Listen") forState:UIControlStateNormal];
        }
    }
    
    
}

- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath {
    return m_tableView.frame.size.height / 10;
}

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
    cell.textLabel.font = [UIFont systemFontOfSize:18];
    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
    cell.textLabel.text = [arrayAlarm objectAtIndex:indexPath.row];
    
    return cell;
}

- (NSInteger)tableView:(nonnull UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    
    return [arrayAlarm count];
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        if (m_bListen) {
            [self OnStartListen];
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

@end
