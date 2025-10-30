//
//  LivePreviewViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "LivePreviewViewController.h"
#import "VideoWnd.h"
#import "playEx.h"
#import "Global.h"
#import "DHHudPrecess.h"
#import <fstream>
#import "DHOptionViewController.h"
#import "EncodeConfig.h"

static std::ofstream s_recordfile;
static LONG g_PlayPort = 0;
static BOOL m_bPlay = FALSE;
static BOOL m_bRecord = FALSE;


@interface LivePreviewViewController ()<UIPickerViewDelegate, UIPickerViewDataSource, UITableViewDelegate, UITableViewDataSource, OptionViewControllerDelegate, UITextFieldDelegate>

@property (strong, nonatomic) UIButton *m_btnChannel;
@property (strong, nonatomic) UIButton *m_btnStream;
@property (strong, nonatomic) UIButton *m_btnPlay;
@property (strong, nonatomic) UIButton *m_btnSnap;
@property (strong, nonatomic) UIButton *m_btnRecord;
@property (strong, nonatomic) UIButton *m_btnTimeOverlay;
@property (strong, nonatomic) UIButton *m_btnChannelOverlay;
@property (strong, nonatomic) UIButton *m_btnSetTime;
@property (strong, nonatomic) UIButton *m_btnSetChannel;
@property (strong, nonatomic) UIButton *m_btnPTZ;
@property (nonatomic, strong) UIButton *m_btnAddFocus;
@property (nonatomic, strong) UIButton *m_btnDecFocus;
@property (nonatomic, strong) UIButton *m_btnAddAperture;
@property (nonatomic, strong) UIButton *m_btnDecAperture;
@property (nonatomic, strong) UILabel *m_labPreset;
@property (nonatomic, strong) UITextField *m_textPreset;
@property (nonatomic, strong) UIButton *m_btnGo;
@property (nonatomic, strong) UIButton *m_btnAddPreset;
@property (nonatomic, strong) UIButton *m_btnDecPreset;


@property (strong, nonatomic) UIButton *m_btnEncode;
@property (strong, nonatomic) UIButton *m_btnAudioEncode;
@property (strong, nonatomic) UIPickerView *m_pickerview;
@property (strong, nonatomic) UITableView *m_tableView;
@property (strong, nonatomic) UITableView *m_tableAudioView;
@property (strong, nonatomic) UIScrollView *m_scrollView;
@property (strong, nonatomic) VideoWnd *m_playWnd;

@property (strong, nonatomic) UIView *m_TimetitleView;
@property (strong, nonatomic) UIView *m_ChanneltitleView;
@property (strong, nonatomic) UIView *m_EncodeView;
@property (strong, nonatomic) UIView *m_AudioEncodeView;
@property (strong, nonatomic) UIView *m_PTZView;
@property (strong, nonatomic) UISwitch *m_timeSwitch;
@property (strong, nonatomic) UISwitch *m_weekSwitch;
@property (strong, nonatomic) UISwitch *m_ChannelTitleSwitch;

@property (strong, nonatomic) UITextField *m_textChannel;
@property (nonatomic, strong) UITextField* firstResponderText;
@property (strong, nonatomic) MBProgressHUD* waitView;

@property (nonatomic) int m_nChannel;
@property (nonatomic) int m_nStream;
@property (nonatomic) int m_nPreChannel;
@property (nonatomic) int m_nPreStream;
@property (nonatomic) int m_nPlayPort;
@property (nonatomic) long m_playHandle;
@property (nonatomic) BOOL bPickFlag;
@property (nonatomic) BOOL bTouchsEnded;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) NSMutableArray *m_arrStream;

@property (nonatomic) NSArray *m_MainTitles;
@property (nonatomic) NSArray *m_AudioMainTitles;
@property (nonatomic) NSMutableArray *m_SubTitles;
@property (nonatomic) NSMutableArray *m_AudioSubTitles;
@property (nonatomic) NSMutableArray *m_Compressions;
@property (nonatomic) NSMutableArray *m_Resolutions;
@property (nonatomic) NSMutableArray *m_FPSs;
@property (nonatomic) NSMutableArray *m_BitRate;
@property (nonatomic) NSMutableArray *m_AudioEncodeType;
@property (nonatomic) NSMutableArray *m_SampleRate;
@property (nonatomic) NSInteger m_selectIndex;
@property (nonatomic) DHOptionViewController *m_optionController;
@property (nonatomic) EncodeConfig *m_encode;
@property (nonatomic) UIButton *m_setEncodeConfig;
@property (nonatomic) UIButton *m_setAudioEncodeConfig;
@property (nonatomic) NET_OSD_TIME_TITLE m_timeTitleInfo;
@property (nonatomic) NET_OSD_CHANNEL_TITLE m_channelTitleInfo;
@property (nonatomic) AV_CFG_ChannelName m_channelNameInfo;
@end

@implementation LivePreviewViewController

@synthesize m_btnChannel, m_btnStream, m_btnPlay, m_btnSnap, m_btnRecord, m_playWnd, m_nChannel, m_nStream, m_nPlayPort, m_playHandle, m_pickerview, m_arrChannel, m_arrStream, m_nPreChannel, m_nPreStream, m_scrollView, m_btnTimeOverlay, m_btnChannelOverlay, m_btnEncode, m_btnAudioEncode, m_tableView, m_tableAudioView, m_MainTitles, m_AudioMainTitles, m_SubTitles, m_AudioSubTitles, m_Compressions, m_Resolutions, m_FPSs, m_BitRate, m_AudioEncodeType, m_SampleRate, m_selectIndex, m_optionController, m_encode, m_setEncodeConfig, m_setAudioEncodeConfig, m_timeSwitch, m_weekSwitch, m_ChannelTitleSwitch, m_btnSetTime, m_btnSetChannel,m_textChannel, m_timeTitleInfo, m_channelTitleInfo, m_channelNameInfo, m_TimetitleView, m_ChanneltitleView, m_EncodeView, m_AudioEncodeView,
    m_btnPTZ, m_PTZView, m_btnAddFocus, m_btnDecFocus, m_btnAddAperture, m_btnDecAperture, m_labPreset, m_textPreset, m_btnGo, m_btnAddPreset, m_btnDecPreset, waitView, bPickFlag, bTouchsEnded;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Live Preview(Single Channel)");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    m_nChannel = 0;
    m_nStream = 0;
    m_nPreChannel = 0;
    m_nPreStream = 0;
    m_nPlayPort = 0;
    m_playHandle = 0;
    bPickFlag = FALSE;
    bTouchsEnded = FALSE;
    m_timeTitleInfo = {sizeof(m_timeTitleInfo)};
    m_channelTitleInfo = {sizeof(m_channelTitleInfo)};
    m_channelNameInfo = {sizeof(m_channelNameInfo)};
    
    m_MainTitles = @[_L(@"Encode Mode"), _L(@"Resolution"), _L(@"Frame Rate(FPS)"), _L(@"Bit Rate(Kb/s)")];
    m_SubTitles = [[NSMutableArray alloc] initWithObjects:@"", @"", @"", @"", nil];
    m_Compressions = [[NSMutableArray alloc] init];
    m_Resolutions = [[NSMutableArray alloc] init];
    m_FPSs = [[NSMutableArray alloc] init];
    m_BitRate = [[NSMutableArray alloc] init];
    
    m_AudioMainTitles = @[_L(@"Encode Mode"), _L(@"Sampling Rate")];
    m_AudioSubTitles = [[NSMutableArray alloc] initWithObjects:@"", @"", nil];
    m_AudioEncodeType = [[NSMutableArray alloc] init];
    m_SampleRate = [[NSMutableArray alloc] init];
    
    m_selectIndex = 0;
    m_optionController = [[DHOptionViewController alloc] init];
    m_optionController.delegate = self;
    m_optionController.bMultiSelect = NO;
    
    UILabel *m_labChannel = [[UILabel alloc] init];
    [m_labChannel setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labChannel setCenter:CGPointMake(kScreenWidth/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labChannel.text = _L(@"Channel");
    m_labChannel.textColor = UIColor.blackColor;
    m_labChannel.layer.borderWidth = 1;
    m_labChannel.layer.cornerRadius = 10;
    m_labChannel.layer.masksToBounds = YES;
    m_labChannel.backgroundColor = UIColor.whiteColor;
    m_labChannel.textAlignment = NSTextAlignmentCenter;
    [m_labChannel setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labChannel];
    
    m_btnChannel = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnChannel.center = CGPointMake(kScreenWidth*3/8, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"0") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onBtnChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    UILabel *m_labstream = [[UILabel alloc] init];
    [m_labstream setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labstream setCenter:CGPointMake(kScreenWidth*5/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labstream.text = _L(@"Stream");
    m_labstream.textColor = UIColor.blackColor;
    m_labstream.layer.borderWidth = 1;
    m_labstream.layer.cornerRadius = 10;
    m_labstream.layer.masksToBounds = YES;
    m_labstream.backgroundColor = UIColor.whiteColor;
    m_labstream.textAlignment = NSTextAlignmentCenter;
    [m_labstream setFont:[UIFont systemFontOfSize:20]];
    [self.view addSubview:m_labstream];
    
    m_btnStream = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnStream.center = CGPointMake(kScreenWidth*7/8, kScreenHeight/40+kNavigationBarHeight);
    m_btnStream.backgroundColor = [UIColor lightGrayColor];
    [m_btnStream setTitle:_L(@"Main") forState:UIControlStateNormal];
    [m_btnStream addTarget:self action:@selector(onBtnStream) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStream setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStream.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnStream.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnStream.layer.cornerRadius = 10;
    m_btnStream.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream];
    
    m_btnPlay = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnPlay.backgroundColor = [UIColor lightGrayColor];
    [m_btnPlay setTitle:_L(@"Start Play") forState:UIControlStateNormal];
    [m_btnPlay addTarget:self action:@selector(onBtnPlay) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPlay.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnPlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPlay.layer.cornerRadius = 10;
    m_btnPlay.layer.borderWidth = 1;
    
    m_btnSnap = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnSnap.backgroundColor = [UIColor lightGrayColor];
    [m_btnSnap setTitle:_L(@"Local Snap") forState:UIControlStateNormal];
    [m_btnSnap addTarget:self action:@selector(onBtnSnap) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSnap setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSnap.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnSnap.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnSnap.layer.cornerRadius = 10;
    m_btnSnap.layer.borderWidth = 1;
    
    m_btnRecord = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*2/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnRecord.backgroundColor = [UIColor lightGrayColor];
    [m_btnRecord setTitle:_L(@"Start Record") forState:UIControlStateNormal];
    [m_btnRecord addTarget:self action:@selector(onBtnRecord) forControlEvents:UIControlEventTouchUpInside];
    [m_btnRecord setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnRecord.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnRecord.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnRecord.layer.cornerRadius = 10;
    m_btnRecord.layer.borderWidth = 1;
    
    m_btnTimeOverlay = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*3/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnTimeOverlay.backgroundColor = [UIColor lightGrayColor];
    [m_btnTimeOverlay setTitle:_L(@"TimeOverlay") forState:UIControlStateNormal];
    [m_btnTimeOverlay addTarget:self action:@selector(onBtnTimeOverlay) forControlEvents:UIControlEventTouchUpInside];
    [m_btnTimeOverlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnTimeOverlay.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnTimeOverlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnTimeOverlay.layer.cornerRadius = 10;
    m_btnTimeOverlay.layer.borderWidth = 1;
    
    m_btnChannelOverlay = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*4/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnChannelOverlay.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannelOverlay setTitle:_L(@"ChannelOverlay") forState:UIControlStateNormal];
    [m_btnChannelOverlay addTarget:self action:@selector(onBtnChannelOverlay) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannelOverlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannelOverlay.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnChannelOverlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnChannelOverlay.layer.cornerRadius = 10;
    m_btnChannelOverlay.layer.borderWidth = 1;
    
    m_btnEncode = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*5/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnEncode.backgroundColor = [UIColor lightGrayColor];
    [m_btnEncode setTitle:_L(@"Video Encode") forState:UIControlStateNormal];
    [m_btnEncode addTarget:self action:@selector(onBtnEncode) forControlEvents:UIControlEventTouchUpInside];
    [m_btnEncode setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnEncode.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnEncode.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnEncode.layer.cornerRadius = 10;
    m_btnEncode.layer.borderWidth = 1;
    
    m_btnAudioEncode = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*6/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnAudioEncode.backgroundColor = [UIColor lightGrayColor];
    [m_btnAudioEncode setTitle:_L(@"Audio Encode") forState:UIControlStateNormal];
    [m_btnAudioEncode addTarget:self action:@selector(onBtnAudioEncode) forControlEvents:UIControlEventTouchUpInside];
    [m_btnAudioEncode setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnAudioEncode.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnAudioEncode.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnAudioEncode.layer.cornerRadius = 10;
    m_btnAudioEncode.layer.borderWidth = 1;
    
    m_btnPTZ = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth*7/4, 0, kScreenWidth/4, kScreenHeight/20)];
    m_btnPTZ.backgroundColor = [UIColor lightGrayColor];
    [m_btnPTZ setTitle:_L(@"PTZControl") forState:UIControlStateNormal];
    [m_btnPTZ addTarget:self action:@selector(onBtnPTZ) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPTZ setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPTZ.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnPTZ.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPTZ.layer.cornerRadius = 10;
    m_btnPTZ.layer.borderWidth = 1;
    
    //play wiew
    m_playWnd = [[VideoWnd alloc] init];
    m_playWnd.backgroundColor = [UIColor whiteColor];//BASE_BACKGROUND_COLOR;
    m_playWnd.frame = CGRectMake(0, 0, kScreenWidth, kScreenWidth*0.75);
    m_playWnd.center = CGPointMake(kScreenWidth/2, m_btnChannel.center.y + m_btnChannel.frame.size.height/2 + m_playWnd.frame.size.height/2);
    m_playWnd.layer.borderWidth = 1;
    [self.view addSubview:m_playWnd];
    
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = YES;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    
    m_arrChannel = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"%d"), i]];
    }
    
    m_arrStream = [[NSMutableArray alloc] initWithObjects:_L(@"Main"), _L(@"Extra"), nil];
    
    m_scrollView = [[UIScrollView alloc] init];
    m_scrollView.frame = CGRectMake(0, 0, kScreenWidth*0.9, kScreenHeight/20);
    m_scrollView.center = CGPointMake(kScreenWidth/2, kScreenHeight - BOTTOM_SAFE_HEIGHT - kScreenHeight/40);
    m_scrollView.backgroundColor = [UIColor whiteColor];
    m_scrollView.showsVerticalScrollIndicator = NO; // 不显示垂直方向的滚动条
    m_scrollView.showsHorizontalScrollIndicator = NO;   // 不显示水平方向的滚动条
    m_scrollView.contentSize = CGSizeMake(kScreenWidth*1.75, kScreenHeight/20);
    m_scrollView.directionalLockEnabled = YES;  // 只能在一个方向上滚动
    m_scrollView.scrollEnabled = YES;           // 控件可以滚动
    m_scrollView.pagingEnabled = NO;           // 控件可以整页翻动
    m_scrollView.bounces = NO;                  // 遇到边框不反弹
    m_scrollView.scrollsToTop = NO;
    [self.view addSubview:m_scrollView];
    
    [m_scrollView addSubview:m_btnPlay];
    [m_scrollView addSubview:m_btnSnap];
    [m_scrollView addSubview:m_btnRecord];
    [m_scrollView addSubview:m_btnTimeOverlay];
    [m_scrollView addSubview:m_btnChannelOverlay];
    [m_scrollView addSubview:m_btnEncode];
    [m_scrollView addSubview:m_btnAudioEncode];
//    [m_scrollView addSubview:m_btnPTZ];
    
 
    
    int nHeight = m_scrollView.center.y - m_scrollView.frame.size.height - m_playWnd.center.y - m_playWnd.frame.size.height/2 ;
    
    m_EncodeView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, nHeight + 54)];
    m_EncodeView.center = CGPointMake(kScreenWidth/2, m_scrollView.center.y - m_scrollView.frame.size.height/2 - nHeight/2);
    m_EncodeView.backgroundColor = BASE_BACKGROUND_COLOR;
    [self.view addSubview:m_EncodeView];
    m_EncodeView.hidden = YES;
    
    m_AudioEncodeView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, nHeight + 54)];
    m_AudioEncodeView.center = CGPointMake(kScreenWidth/2, m_scrollView.center.y - m_scrollView.frame.size.height/2 - nHeight/2);
    m_AudioEncodeView.backgroundColor = BASE_BACKGROUND_COLOR;
    [self.view addSubview:m_AudioEncodeView];
    m_AudioEncodeView.hidden = YES;
    
    m_tableView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, m_EncodeView.frame.size.height*0.8) style:UITableViewStylePlain];
    m_tableView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableView.separatorColor = [UIColor redColor];
    m_tableView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableView.backgroundColor = BASE_BACKGROUND_COLOR;
    m_tableView.delegate = self;
    m_tableView.dataSource = self;
    [m_EncodeView addSubview:m_tableView];
    
    m_tableAudioView = [[UITableView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, m_AudioEncodeView.frame.size.height*0.8) style:UITableViewStylePlain];
    m_tableAudioView.separatorStyle = UITableViewCellSeparatorStyleSingleLine;
    m_tableAudioView.separatorColor = [UIColor redColor];
    m_tableAudioView.separatorInset = UIEdgeInsetsMake(0, 0, 0, 0);
    m_tableAudioView.backgroundColor = BASE_BACKGROUND_COLOR;
    m_tableAudioView.delegate = self;
    m_tableAudioView.dataSource = self;
    [m_AudioEncodeView addSubview:m_tableAudioView];
    
    
    m_setEncodeConfig = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth/4, m_tableView.center.y + m_tableView.frame.size.height/2 + kScreenHeight/40, kScreenWidth/2, kScreenHeight/20)];
    m_setEncodeConfig.backgroundColor = [UIColor lightGrayColor];
    [m_setEncodeConfig setTitle:_L(@"Set") forState:UIControlStateNormal];
    [m_setEncodeConfig addTarget:self action:@selector(onBtnSet) forControlEvents:UIControlEventTouchUpInside];
    [m_setEncodeConfig setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_setEncodeConfig.titleLabel.font = [UIFont systemFontOfSize:20];
    m_setEncodeConfig.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_setEncodeConfig.layer.cornerRadius = 10;
    m_setEncodeConfig.layer.borderWidth = 1;
    [m_EncodeView addSubview:m_setEncodeConfig];
    
    m_setAudioEncodeConfig = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth/4, m_tableAudioView.center.y + m_tableAudioView.frame.size.height/2 + kScreenHeight/40, kScreenWidth/2, kScreenHeight/20)];
    m_setAudioEncodeConfig.backgroundColor = [UIColor lightGrayColor];
    [m_setAudioEncodeConfig setTitle:_L(@"Set") forState:UIControlStateNormal];
    [m_setAudioEncodeConfig addTarget:self action:@selector(onBtnAudioSet) forControlEvents:UIControlEventTouchUpInside];
    [m_setAudioEncodeConfig setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_setAudioEncodeConfig.titleLabel.font = [UIFont systemFontOfSize:20];
    m_setAudioEncodeConfig.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_setAudioEncodeConfig.layer.cornerRadius = 10;
    m_setAudioEncodeConfig.layer.borderWidth = 1;
    [m_AudioEncodeView addSubview:m_setAudioEncodeConfig];
    
    
    m_encode = [[EncodeConfig alloc] init];
    m_encode.m_Subtitles = m_SubTitles;
    m_encode.m_AudioSubtitles = m_AudioSubTitles;
    [m_encode InitArray];
    
    // Time title view
    m_TimetitleView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, nHeight + 44)];
    m_TimetitleView.center = CGPointMake(kScreenWidth/2, m_scrollView.center.y - m_scrollView.frame.size.height/2 - nHeight/2);
    m_TimetitleView.backgroundColor = BASE_BACKGROUND_COLOR;
    [self.view addSubview:m_TimetitleView];
    m_TimetitleView.hidden = YES;
    
    // Channel title view
    m_ChanneltitleView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, nHeight + 44)];
    m_ChanneltitleView.center = CGPointMake(kScreenWidth/2, m_scrollView.center.y - m_scrollView.frame.size.height/2 - nHeight/2);
    m_ChanneltitleView.backgroundColor = BASE_BACKGROUND_COLOR;
    [self.view addSubview:m_ChanneltitleView];
    m_ChanneltitleView.hidden = YES;
    
    UILabel *m_labTime = [[UILabel alloc] init];
    [m_labTime setFrame:CGRectMake(0, kScreenHeight/20, kScreenWidth*0.4, kScreenHeight/20)];
    m_labTime.text = _L(@"Show Time");
    m_labTime.textColor = UIColor.blackColor;
    m_labTime.layer.borderWidth = 1;
    m_labTime.layer.cornerRadius = 10;
    m_labTime.layer.masksToBounds = YES;
    m_labTime.backgroundColor = UIColor.whiteColor;
    m_labTime.textAlignment = NSTextAlignmentCenter;
    [m_labTime setFont:[UIFont systemFontOfSize:20]];
    [m_TimetitleView addSubview:m_labTime];
    
    m_timeSwitch = [[UISwitch alloc] initWithFrame:CGRectMake(kScreenWidth*3/4, kScreenHeight/20, 0, 0)];
    m_timeSwitch.backgroundColor = [UIColor whiteColor];
    m_timeSwitch.alpha = 1;
    m_timeSwitch.onTintColor = [UIColor cyanColor];
    m_timeSwitch.tintColor = [UIColor lightGrayColor];
    m_timeSwitch.thumbTintColor = [UIColor lightGrayColor];
    m_timeSwitch.backgroundColor = BASE_BACKGROUND_COLOR;
    m_timeSwitch.on = YES;
    [m_timeSwitch setOn:NO animated:YES];
    [m_timeSwitch addTarget:self action:@selector(timeSwitchValueChanged:) forControlEvents:UIControlEventValueChanged];
    [m_TimetitleView addSubview:m_timeSwitch];
    
    UILabel *m_labweek = [[UILabel alloc] init];
    [m_labweek setFrame:CGRectMake(0, kScreenHeight*3/20, kScreenWidth*0.4, kScreenHeight/20)];
    m_labweek.text = _L(@"Show Week");
    m_labweek.textColor = UIColor.blackColor;
    m_labweek.layer.borderWidth = 1;
    m_labweek.layer.cornerRadius = 10;
    m_labweek.layer.masksToBounds = YES;
    m_labweek.backgroundColor = UIColor.whiteColor;
    m_labweek.textAlignment = NSTextAlignmentCenter;
    [m_labweek setFont:[UIFont systemFontOfSize:20]];
//    [m_TimetitleView addSubview:m_labweek];
    
    m_weekSwitch = [[UISwitch alloc] initWithFrame:CGRectMake(kScreenWidth*3/4, kScreenHeight*3/20, 0, 0)];
    m_weekSwitch.backgroundColor = [UIColor whiteColor];
    m_weekSwitch.alpha = 1;
    m_weekSwitch.onTintColor = [UIColor cyanColor];
    m_weekSwitch.tintColor = [UIColor lightGrayColor];
    m_weekSwitch.thumbTintColor = [UIColor lightGrayColor];
    m_weekSwitch.backgroundColor = BASE_BACKGROUND_COLOR;
    m_weekSwitch.on = YES;
    [m_weekSwitch setOn:NO animated:YES];
    [m_weekSwitch addTarget:self action:@selector(weekSwitchValueChanged:) forControlEvents:UIControlEventValueChanged];
//    [m_TimetitleView addSubview:m_weekSwitch];
    
    m_btnSetTime = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth/4, kScreenHeight*5/20, kScreenWidth/2, kScreenHeight/20)];
    m_btnSetTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnSetTime setTitle:_L(@"Set") forState:UIControlStateNormal];
    [m_btnSetTime addTarget:self action:@selector(onBtnSetTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSetTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSetTime.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnSetTime.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnSetTime.layer.cornerRadius = 10;
    m_btnSetTime.layer.borderWidth = 1;
    [m_TimetitleView addSubview:m_btnSetTime];
    
    UILabel *m_labChannelTitle = [[UILabel alloc] init];
    [m_labChannelTitle setFrame:CGRectMake(0, kScreenHeight/20, kScreenWidth*0.4, kScreenHeight/20)];
    m_labChannelTitle.text = _L(@"Show Channel Title");
    m_labChannelTitle.textColor = UIColor.blackColor;
    m_labChannelTitle.layer.borderWidth = 1;
    m_labChannelTitle.layer.cornerRadius = 10;
    m_labChannelTitle.layer.masksToBounds = YES;
    m_labChannelTitle.backgroundColor = UIColor.whiteColor;
    m_labChannelTitle.textAlignment = NSTextAlignmentCenter;
    m_labChannelTitle.adjustsFontSizeToFitWidth = YES;
    [m_labChannelTitle setFont:[UIFont systemFontOfSize:20]];
    [m_ChanneltitleView addSubview:m_labChannelTitle];
    
    m_ChannelTitleSwitch = [[UISwitch alloc] initWithFrame:CGRectMake(kScreenWidth*3/4, kScreenHeight/20, 0, 0)];
    m_ChannelTitleSwitch.backgroundColor = [UIColor whiteColor];
    m_ChannelTitleSwitch.alpha = 1;
    m_ChannelTitleSwitch.onTintColor = [UIColor cyanColor];
    m_ChannelTitleSwitch.tintColor = [UIColor lightGrayColor];
    m_ChannelTitleSwitch.thumbTintColor = [UIColor lightGrayColor];
    m_ChannelTitleSwitch.backgroundColor = BASE_BACKGROUND_COLOR;
    [m_ChannelTitleSwitch addTarget:self action:@selector(ChannelTitleSwitchValueChanged:) forControlEvents:UIControlEventValueChanged];
    [m_ChanneltitleView addSubview:m_ChannelTitleSwitch];
    
    UILabel *m_labChannelname = [[UILabel alloc] init];
    [m_labChannelname setFrame:CGRectMake(0, kScreenHeight*3/20, kScreenWidth*0.4, kScreenHeight/20)];
    m_labChannelname.text = _L(@"Channel Name");
    m_labChannelname.textColor = UIColor.blackColor;
    m_labChannelname.layer.borderWidth = 1;
    m_labChannelname.layer.cornerRadius = 10;
    m_labChannelname.layer.masksToBounds = YES;
    m_labChannelname.backgroundColor = UIColor.whiteColor;
    m_labChannelname.textAlignment = NSTextAlignmentCenter;
    m_labChannelname.adjustsFontSizeToFitWidth = YES;
    [m_labChannelname setFont:[UIFont systemFontOfSize:20]];
    [m_ChanneltitleView addSubview:m_labChannelname];
    
    m_textChannel = [[UITextField alloc] init];
    m_textChannel.frame = CGRectMake(kScreenWidth*2/4, kScreenHeight*3/20, kScreenWidth*0.5, kScreenHeight/20);
    m_textChannel.borderStyle = UITextBorderStyleRoundedRect;
    m_textChannel.placeholder = _L(@"Channel Name");
    m_textChannel.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textChannel.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textChannel.textColor = [UIColor blackColor];
    m_textChannel.layer.borderColor = [UIColor blackColor].CGColor;
    m_textChannel.layer.borderWidth = 1;
    m_textChannel.font = [UIFont systemFontOfSize:20];
    m_textChannel.adjustsFontSizeToFitWidth = YES;
    m_textChannel.textAlignment = NSTextAlignmentLeft;
    m_textChannel.rightViewMode = UITextFieldViewModeAlways;
    m_textChannel.delegate = self;
    [m_ChanneltitleView addSubview:m_textChannel];
    
    m_btnSetChannel = [[UIButton alloc] initWithFrame:CGRectMake(kScreenWidth/4, kScreenHeight*5/20, kScreenWidth/2, kScreenHeight/20)];
    m_btnSetChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnSetChannel setTitle:_L(@"Set") forState:UIControlStateNormal];
    [m_btnSetChannel addTarget:self action:@selector(onBtnSetChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSetChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSetChannel.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnSetChannel.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnSetChannel.layer.cornerRadius = 10;
    m_btnSetChannel.layer.borderWidth = 1;
    [m_ChanneltitleView addSubview:m_btnSetChannel];
    
    
    m_PTZView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, nHeight)];
    m_PTZView.center = CGPointMake(kScreenWidth/2, m_scrollView.center.y - m_scrollView.frame.size.height/2 - nHeight/2);
    m_PTZView.backgroundColor = BASE_BACKGROUND_COLOR;
    [self.view addSubview:m_PTZView];
    m_PTZView.hidden = YES;
    
    // AddFocus
    m_btnAddFocus = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnAddFocus setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnAddFocus.frame = CGRectMake(0, kScreenHeight/20, kScreenWidth/4, kScreenHeight/20);
    m_btnAddFocus.backgroundColor = [UIColor lightGrayColor];
    [m_btnAddFocus setTitle:_L(@"Focus +") forState:UIControlStateNormal];
    m_btnAddFocus.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnAddFocus.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnAddFocus.layer.cornerRadius = 10;
    m_btnAddFocus.layer.borderWidth = 1;
    [m_btnAddFocus addTarget:self action:@selector(OnPTZControlPressDown:) forControlEvents:UIControlEventTouchDown];
    [m_btnAddFocus addTarget:self action:@selector(OnPTZControlPressUp:) forControlEvents:UIControlEventTouchUpInside];
    [m_PTZView addSubview:m_btnAddFocus];

    
    m_btnDecFocus = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnDecFocus setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnDecFocus.frame = CGRectMake(kScreenWidth/4, kScreenHeight/20, kScreenWidth/4, kScreenHeight/20);
    m_btnDecFocus.backgroundColor = [UIColor lightGrayColor];
    [m_btnDecFocus setTitle:_L(@"Focus -") forState:UIControlStateNormal];
    m_btnDecFocus.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnDecFocus.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnDecFocus.layer.cornerRadius = 10;
    m_btnDecFocus.layer.borderWidth = 1;
    [m_btnDecFocus addTarget:self action:@selector(OnPTZControlPressDown:) forControlEvents:UIControlEventTouchDown];
    [m_btnDecFocus addTarget:self action:@selector(OnPTZControlPressUp:) forControlEvents:UIControlEventTouchUpInside];
    [m_PTZView addSubview:m_btnDecFocus];

    
    // AddAperture
    m_btnAddAperture = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnAddAperture setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnAddAperture.frame = CGRectMake(0, kScreenHeight*3/20, kScreenWidth/4, kScreenHeight/20);
    m_btnAddAperture.backgroundColor = [UIColor lightGrayColor];
    [m_btnAddAperture setTitle:_L(@"Iris +") forState:UIControlStateNormal];
    m_btnAddAperture.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnAddAperture.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnAddAperture.layer.cornerRadius = 10;
    m_btnAddAperture.layer.borderWidth = 1;
    [m_btnAddAperture addTarget:self action:@selector(OnPTZControlPressDown:) forControlEvents:UIControlEventTouchDown];
    [m_btnAddAperture addTarget:self action:@selector(OnPTZControlPressUp:) forControlEvents:UIControlEventTouchUpInside];
    [m_PTZView addSubview:m_btnAddAperture];

    
    m_btnDecAperture = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnDecAperture setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnDecAperture.frame = CGRectMake(kScreenWidth/4, kScreenHeight*3/20, kScreenWidth/4, kScreenHeight/20);
    m_btnDecAperture.backgroundColor = [UIColor lightGrayColor];
    [m_btnDecAperture setTitle:_L(@"Iris -") forState:UIControlStateNormal];
    m_btnDecAperture.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnDecAperture.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnDecAperture.layer.cornerRadius = 10;
    m_btnDecAperture.layer.borderWidth = 1;
    [m_btnDecAperture addTarget:self action:@selector(OnPTZControlPressDown:) forControlEvents:UIControlEventTouchDown];
    [m_btnDecAperture addTarget:self action:@selector(OnPTZControlPressUp:) forControlEvents:UIControlEventTouchUpInside];
    [m_PTZView addSubview:m_btnDecAperture];

    // preset
    m_labPreset = [[UILabel alloc] initWithFrame:CGRectMake(kScreenWidth*2/4, kScreenHeight/20, kScreenWidth/4, kScreenHeight/20)];
    m_labPreset.text = _L(@"Preset ID");
    m_labPreset.backgroundColor = [UIColor whiteColor];
    m_labPreset.textColor = [UIColor lightGrayColor];
    m_labPreset.textAlignment = NSTextAlignmentCenter;
    m_labPreset.font = [UIFont systemFontOfSize:20];
    m_labPreset.adjustsFontSizeToFitWidth = YES;
    m_labPreset.layer.cornerRadius = 10;
    m_labPreset.layer.borderWidth = 1;
    [m_PTZView addSubview:m_labPreset];

    
    m_textPreset = [[UITextField alloc] initWithFrame:CGRectMake(kScreenWidth*3/4, kScreenHeight/20, kScreenWidth/4, kScreenHeight/20)];
    m_textPreset.text = _L(@"1");
    m_textPreset.textAlignment = NSTextAlignmentCenter;
    m_textPreset.borderStyle = UITextBorderStyleRoundedRect;
    m_textPreset.keyboardType = UIKeyboardTypeDefault;
    m_textPreset.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textPreset.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textPreset.placeholder = _L(@"1");
    m_textPreset.font = [UIFont systemFontOfSize:20];
    m_textPreset.adjustsFontSizeToFitWidth = YES;
    m_textPreset.layer.cornerRadius = 10;
    m_textPreset.layer.borderWidth = 1;
    m_textPreset.delegate = self;
    [m_PTZView addSubview:m_textPreset];

    
    m_btnGo = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnGo setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnGo.frame = CGRectMake(kScreenWidth*5/8, kScreenHeight*3/20, kScreenWidth/4, kScreenHeight/20);
    [m_btnGo setTitle:_L(@"Goto") forState:UIControlStateNormal];
    m_btnGo.backgroundColor = [UIColor lightGrayColor];
    [m_btnGo addTarget:self action:@selector(OnPresetGo:) forControlEvents:UIControlEventTouchUpInside];
    m_btnGo.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnGo.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnGo.layer.cornerRadius = 10;
    m_btnGo.layer.borderWidth = 1;
    [m_PTZView addSubview:m_btnGo];

    
    m_btnAddPreset = [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnAddPreset setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnAddPreset.frame = CGRectMake(kScreenWidth*2/4, kScreenHeight*3/20, kScreenWidth/8, kScreenHeight/20);
    [m_btnAddPreset setTitle:_L(@"+") forState:UIControlStateNormal];
    m_btnAddPreset.backgroundColor = [UIColor lightGrayColor];
    [m_btnAddPreset addTarget:self action:@selector(OnPresetAdd:) forControlEvents:UIControlEventTouchUpInside];
    m_btnAddPreset.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnAddPreset.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnAddPreset.layer.cornerRadius = 10;
    m_btnAddPreset.layer.borderWidth = 1;
    [m_PTZView addSubview:m_btnAddPreset];

    
    m_btnDecPreset= [UIButton buttonWithType:UIButtonTypeSystem];
    [m_btnDecPreset setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    m_btnDecPreset.frame = CGRectMake(kScreenWidth*7/8, kScreenHeight*3/20, kScreenWidth/8, kScreenHeight/20);
    [m_btnDecPreset setTitle:_L(@"-") forState:UIControlStateNormal];
    m_btnDecPreset.backgroundColor = [UIColor lightGrayColor];
    [m_btnDecPreset addTarget:self action:@selector(OnPresetDel:) forControlEvents:UIControlEventTouchUpInside];
    m_btnDecPreset.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnDecPreset.titleLabel.adjustsFontSizeToFitWidth = YES;
    m_btnDecPreset.layer.cornerRadius = 10;
    m_btnDecPreset.layer.borderWidth = 1;
    [m_PTZView addSubview:m_btnDecPreset];
    
    
    // 添加手势
//    UIPanGestureRecognizer *recognizer = [[UIPanGestureRecognizer alloc] initWithTarget:self action:@selector(handlePan:)];
//    recognizer.minimumNumberOfTouches = 1;
//    recognizer.maximumNumberOfTouches = 1;
//    [m_playWnd addGestureRecognizer:recognizer];
//
//    UIPinchGestureRecognizer* PinRecognizer = [[UIPinchGestureRecognizer alloc] initWithTarget:self action:@selector(PinRecognizerTap:)];
//    [m_playWnd addGestureRecognizer:PinRecognizer];
    
    self.navigationItem.backBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:_L(@"Back") style:UIBarButtonItemStylePlain target:nil action:nil];
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWillShow:) name:UIKeyboardWillShowNotification object:nil];
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(keyboardWillHide:) name:UIKeyboardWillHideNotification object:nil];
}


- (void)onBtnChannel {
    
    if (TRUE == m_pickerview.isHidden) {
        bPickFlag = FALSE;
        bTouchsEnded = FALSE;
        [m_pickerview setHidden:FALSE];
        [m_btnChannel setEnabled:FALSE];
        [m_btnStream setEnabled:FALSE];
        [m_scrollView setHidden:YES];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
        m_btnChannel.backgroundColor = BASE_COLOR;
    }
}

- (void)onBtnStream {
    if (TRUE == m_pickerview.isHidden) {
        bPickFlag = FALSE;
        bTouchsEnded = FALSE;
        [m_pickerview setHidden:FALSE];
        [m_btnChannel setEnabled:FALSE];
        [m_btnStream setEnabled:FALSE];
        [m_scrollView setHidden:YES];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream inComponent:0 animated:TRUE];
        m_btnStream.backgroundColor = BASE_COLOR;
    }


    
}

static void CALLBACK realDataCallback(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LDWORD dwUser) {

    PLAY_InputData(g_PlayPort, pBuffer, dwBufSize);
    if (m_bRecord) {
        s_recordfile.write((char *)pBuffer, dwBufSize);
    }
}

-(void) viewDidAppear:(BOOL)animated {
    
}

- (void)onBtnPlay {
    
    if (FALSE ==  m_bPlay) {
        [m_playWnd setHidden:FALSE];
        PLAY_GetFreePort(&g_PlayPort);
        PLAY_OpenStream(g_PlayPort, nil, 0, 3*1024*1024);
        PLAY_Play(g_PlayPort, (__bridge void*)m_playWnd);
        PLAY_PlaySoundShare(g_PlayPort);
        
        DH_RealPlayType emStream = DH_RType_Realplay_0;
        if (0 == m_nStream) {
            emStream = DH_RType_Realplay_0;
        }
        else {
            emStream = DH_RType_Realplay_1;
        }
        
        // 延迟播放
        if (0 == PLAY_SetDelayTime(g_PlayPort, 500, 1000)) {
           MSG(@"", _L(@"Set delay time failed"), @"");
        }
        m_playHandle = CLIENT_RealPlayEx(g_loginID, m_nChannel, NULL, emStream);
        if (m_playHandle) {
            CLIENT_SetRealDataCallBack(m_playHandle, realDataCallback, (LDWORD)self);
            m_bPlay = TRUE;
            [m_btnPlay setTitle:_L(@"Stop Play") forState:UIControlStateNormal];
            m_btnPlay.backgroundColor = BASE_COLOR;
        }
        else {

        }
    }
    else {
        if (m_bRecord) {
            [self onBtnRecord];
        }
        CLIENT_StopRealPlayEx(m_playHandle);
        m_playHandle = 0;
        PLAY_CleanScreen(g_PlayPort, 236/255.0, 236/255.0, 244/255.0, 1, 0);
        PLAY_StopSound();
        PLAY_Stop(g_PlayPort);
        PLAY_CloseStream(g_PlayPort);
        PLAY_ResetBuffer(g_PlayPort, 0);
        PLAY_ResetBuffer(g_PlayPort, 1);
        PLAY_ResetBuffer(g_PlayPort, 2);
        PLAY_ResetBuffer(g_PlayPort, 3);
        m_bPlay = FALSE;
        [m_btnPlay setTitle:_L(@"Start Play") forState:UIControlStateNormal];
        m_btnPlay.backgroundColor = [UIColor lightGrayColor];
    }
}

- (void)onBtnSnap {
    
    if (m_bPlay) {
        NSString *strFileName = [self str_now];
        const std::string strFilePath = g_docFolder + "/Snap/" + [strFileName UTF8String] + ".jpg";
        NSLog(@"111111 %s", g_docFolder.c_str());

        PLAY_CatchPicEx(g_PlayPort, (char*)strFilePath.c_str(), PicFormat_JPEG);
        MSG(@"", _L(@"Snap Success"), @"");
    }
    else {
        MSG(@"", _L(@"Start Play First"), @"");
    }
    
    
}

- (void)onBtnRecord {
    
    if (m_bPlay) {
        
        if (!m_bRecord) {
            NSString *str = [self str_now];
            std::string strTime = [str UTF8String];
            const std::string strFilename = g_docFolder + "/Record/" + strTime + ".dav";
            s_recordfile.open(strFilename.c_str(), std::ios_base::out|std::ios_base::binary);
            [m_btnRecord setTitle:_L(@"Stop Record") forState:UIControlStateNormal];
            m_btnRecord.backgroundColor = BASE_COLOR;
            m_bRecord = TRUE;
        }
        else {
            s_recordfile.close();
            [m_btnRecord setTitle:_L(@"Start Record") forState:UIControlStateNormal];
            m_btnRecord.backgroundColor = [UIColor lightGrayColor];
            m_bRecord = NO;
            
        }
        
    }
    else {
        MSG(@"", _L(@"Start Play First"), @"");
    }
}


- (void)onBtnTimeOverlay {
    NSLog(@"onBtnTimeOverlay");
    
    [self getTimeTitle];
}

- (void) getTimeTitle {
    
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    m_timeTitleInfo.emOsdBlendType = NET_EM_OSD_BLEND_TYPE_MAIN;
    // Get time title
        BOOL bRet = CLIENT_GetConfig(g_loginID, NET_EM_CFG_TIMETITLE, m_nChannel, &m_timeTitleInfo, sizeof(m_timeTitleInfo), TIME_OUT, NULL);
        if (!bRet){
            dispatch_async(dispatch_get_main_queue(), ^{
                [waitView hide:YES];
        NSLog(@"NET_EM_CFG_TIMETITLE Error is %d", CLIENT_GetLastError()&0x7fffffff);
        MSG(@"", _L(@"Get Time Title Failed"), @"");
            });
    }
        else {
            dispatch_async(dispatch_get_main_queue(), ^{
                [m_btnChannel setBackgroundColor:[UIColor lightGrayColor]];
                [m_btnStream setBackgroundColor:[UIColor lightGrayColor]];
                [m_pickerview setHidden:YES];
                [m_scrollView setHidden:YES];
    if (m_timeTitleInfo.bEncodeBlend) {
        [m_timeSwitch setOn:YES animated:NO];
        
    }
    else{
        [m_timeSwitch setOn:NO animated:NO];
        [m_weekSwitch setOn:NO animated:NO];
    }
                [m_TimetitleView setHidden:NO];
                [m_btnChannel setEnabled:NO];
                [m_btnStream setEnabled:NO];
                [waitView hide:YES];
            });
        }
    });
}

- (void)onBtnChannelOverlay {
    NSLog(@"onBtnChannelOverlay");
    
    [self getChannelTitle];
}

- (void) getChannelTitle {
    
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    m_channelTitleInfo.emOsdBlendType = NET_EM_OSD_BLEND_TYPE_MAIN;
    // Get channel title
        BOOL bRet = CLIENT_GetConfig(g_loginID, NET_EM_CFG_CHANNELTITLE, m_nChannel, &m_channelTitleInfo, sizeof(m_channelTitleInfo), TIME_OUT, NULL);
        if (!bRet) {
            dispatch_async(dispatch_get_main_queue(), ^{
                [waitView hide:YES];
                NSLog(@"NET_EM_CFG_CHANNELTITLE Error is %d", CLIENT_GetLastError()&0x7fffffff);
        MSG(@"", _L(@"Get Channel Title Failed"), @"");
            });
    }
        else {
    // Get channel name
    char *szOutBuffer = new char[32*1024];
    memset(szOutBuffer, 0, 32*1024);
    int nerror = 0;
    int nRetLen = 0;
        bRet = CLIENT_GetNewDevConfig(g_loginID, (char *)CFG_CMD_CHANNELTITLE, m_nChannel, szOutBuffer, 32*1024, &nerror, TIME_OUT);
            if (!bRet) {
                dispatch_async(dispatch_get_main_queue(), ^{
                    [waitView hide:YES];
                    NSLog(@"CFG_CMD_CHANNELTITLE Error is %d", CLIENT_GetLastError()&0x7fffffff);
            MSG(@"", _L(@"Get channel name failed!"), @"");
                });
            }
            else{
                CLIENT_ParseData((char *)CFG_CMD_CHANNELTITLE, (char *)szOutBuffer, &m_channelNameInfo, sizeof(m_channelNameInfo), &nRetLen);
        dispatch_async(dispatch_get_main_queue(), ^{
//            [m_btnChannel setBackgroundColor:[UIColor lightGrayColor]];
//            [m_btnStream setBackgroundColor:[UIColor lightGrayColor]];
//            [m_pickerview setHidden:YES];
            [m_scrollView setHidden:YES];
            if (m_channelTitleInfo.bEncodeBlend) {
                [m_ChannelTitleSwitch setOn:YES animated:NO];
    }
    else{
                [m_ChannelTitleSwitch setOn:NO animated:NO];
    }
            m_textChannel.text = [NSString stringWithUTF8String:m_channelNameInfo.szName];
            [m_ChanneltitleView setHidden:NO];
//            [m_btnChannel setEnabled:NO];
//            [m_btnStream setEnabled:NO];
            [waitView hide:YES];
        });
            }
        }
    });
}

-(void)timeSwitchValueChanged:(UISwitch *) sender{
    m_timeSwitch = (UISwitch*)sender;
}

-(void)weekSwitchValueChanged:(UISwitch *) sender{
    m_weekSwitch = (UISwitch*)sender;
}

-(void)onBtnSetTime{
    BOOL TimeisButtonOn = [m_timeSwitch isOn];
    //BOOL weekisButtonOn = [m_weekSwitch isOn];
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{

    // Set show time
    m_timeTitleInfo.dwSize = sizeof(m_timeTitleInfo);
    m_timeTitleInfo.emOsdBlendType = NET_EM_OSD_BLEND_TYPE_MAIN;
    if (TimeisButtonOn){
        
        m_timeTitleInfo.bEncodeBlend = TRUE;
    }
    else{
        m_timeTitleInfo.bEncodeBlend = FALSE;
    }
    
    BOOL bRet = CLIENT_SetConfig(g_loginID, NET_EM_CFG_TIMETITLE, m_nChannel, &m_timeTitleInfo, sizeof(m_timeTitleInfo), 5000, NULL, NULL);
    
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            [m_TimetitleView setHidden:YES];
            [m_scrollView setHidden:NO];
            if (bRet) {
                MSG(@"", _L(@"Set success"), @"");
            }
            else{
                MSG(@"", _L(@"Set failed"), @"");
            }

        });
    });
}

-(void)ChannelTitleSwitchValueChanged:(UISwitch *) sender{
    m_ChannelTitleSwitch = (UISwitch*)sender;
}

-(void)onBtnSetChannel{
    
    BOOL channelisButtonOn = [m_ChannelTitleSwitch isOn];
    
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    m_channelTitleInfo.dwSize = sizeof(m_channelTitleInfo);
    m_channelTitleInfo.emOsdBlendType = NET_EM_OSD_BLEND_TYPE_MAIN;
    if (channelisButtonOn){
        
        // Set
        m_channelTitleInfo.bEncodeBlend = TRUE;
        //  MSG(@"", _L(@"Show channel title"), @"");
    }
    else{
        m_channelTitleInfo.bEncodeBlend = FALSE;
    }
    BOOL bRet = CLIENT_SetConfig(g_loginID, NET_EM_CFG_CHANNELTITLE, m_nChannel, &m_channelTitleInfo, sizeof(m_channelTitleInfo), 5000, NULL, NULL);
    if (!bRet) {
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
        MSG(@"", _L(@"Set failed"), @"");
            });
    }
    else{
    
    // Set channel name
    char *szOutBuffer = new char[32*1024];
    memset(szOutBuffer, 0, 32*1024);
    int nerror = 0;
    int nrestart = 0;
    
    strncpy(m_channelNameInfo.szName, (char*)[m_textChannel.text UTF8String], sizeof(m_channelNameInfo.szName)-1);
        bRet = CLIENT_PacketData((char*)CFG_CMD_CHANNELTITLE, &m_channelNameInfo, sizeof(m_channelNameInfo), szOutBuffer, 32*1024);
    if (bRet) {
        bRet = CLIENT_SetNewDevConfig(g_loginID, (char*)CFG_CMD_CHANNELTITLE, m_nChannel, szOutBuffer, 32*1024, &nerror, &nrestart, 5000);
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            [m_ChanneltitleView setHidden:YES];
            [m_scrollView setHidden:NO];
        if (bRet) {
            MSG(@"", _L(@"Set success"), @"");
        }
        else{
            NSLog(@"error is %d", CLIENT_GetLastError()&0x7fffffff);
            MSG(@"", _L(@"Set channel name failed"), @"");
            }
        });
        }
    else {
        dispatch_async(dispatch_get_main_queue(), ^{
            [m_ChanneltitleView setHidden:YES];
            [m_scrollView setHidden:NO];
            [waitView hide:YES];
        NSLog(@"CLIENT_PacketData: CFG_CMD_CHANNELTITLE failed!");
        MSG(@"", _L(@"Set success"), @"");
            });
    }
    }
    });
}

- (void)onBtnEncode {
    NSLog(@"onBtnEncode");
    
    m_tableView.tag = 1;
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    BOOL bRet = [m_encode GetEncodeConfig:m_nChannel StreamType:m_nStream];
    if (!bRet) {
            dispatch_async(dispatch_get_main_queue(), ^{
                [waitView hide:YES];
                NSLog(@"Error is %d", CLIENT_GetLastError()&0x7fffffff);
        MSG(@"", _L(@"Get Video Encode Config Failed"), @"");
            });
    }
        else {
            dispatch_async(dispatch_get_main_queue(), ^{
                [m_encode InitEncodeCtrl:m_nStream];
               BOOL bVideoContain = [m_encode setSubtitlesRange:m_nStream];
                if (!bVideoContain) {
                    [waitView hide:YES];
                    NSLog(@"Current videoCfg is not in Caps");
                    MSG(@"", _L(@"Get Video Encode Config Failed"), @"");
                } else {
                [m_btnChannel setBackgroundColor:[UIColor lightGrayColor]];
                [m_btnStream setBackgroundColor:[UIColor lightGrayColor]];
                [m_pickerview setHidden:YES];
                [m_scrollView setHidden:YES];
                
    
    
    m_SubTitles = m_encode.m_Subtitles;
    m_Compressions = m_encode.m_Compressions;
    m_Resolutions = m_encode.m_Resolutions;
    m_FPSs = m_encode.m_FPS;
    m_BitRate = m_encode.m_BitRate;
    
    [m_tableView reloadData];
    
    [m_EncodeView setHidden:NO];
    [m_btnChannel setEnabled:NO];
    [m_btnStream setEnabled:NO];
                [waitView hide:YES];
                }
            });
        }
    });
    
}

- (void)onBtnAudioEncode {
    
    NSLog(@"onBtnAudioEncode");
    m_tableView.tag = 2;
    
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
        BOOL bRet = [m_encode GetAudioEncodeCfg:m_nChannel StreamType:m_nStream];
        if (!bRet) {
            dispatch_async(dispatch_get_main_queue(), ^{
                [waitView hide:YES];
                NSLog(@"Error is %d", CLIENT_GetLastError()&0x7fffffff);
                MSG(@"", _L(@"Get Audio Encode Config Failed"), @"");
            });
        }
        else {
            dispatch_async(dispatch_get_main_queue(), ^{
                [m_encode InitAudioEncodeCtrl:m_nStream];
               BOOL bContain = [m_encode setAudioSubtitlesRange:m_nStream];
                if (!bContain) {
                    [waitView hide:YES];
                    NSLog(@"Current is not in Caps!");
                    MSG(@"", _L(@"Get Audio Encode Config Failed"), @"");  
                }
                else
                {
                [m_btnChannel setBackgroundColor:[UIColor lightGrayColor]];
                [m_btnStream setBackgroundColor:[UIColor lightGrayColor]];
                [m_pickerview setHidden:YES];
                [m_scrollView setHidden:YES];
                

                
                m_AudioSubTitles = m_encode.m_AudioSubtitles;
                m_AudioEncodeType = m_encode.m_AudioCompressions;
                m_SampleRate = m_encode.m_SampleRate;
                
                [m_tableView reloadData];
                [m_tableAudioView reloadData];
                
                [m_AudioEncodeView setHidden:NO];
                [m_btnChannel setEnabled:NO];
                [m_btnStream setEnabled:NO];
                [waitView hide:YES];
                }
            });
        }
    });
    
    


}

- (void)onBtnSet {
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
    [m_encode UpdateEncodeCaps:m_nChannel StreamType:m_nStream];
    BOOL bRet = [m_encode SetConfig:m_nChannel];
        
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            [m_EncodeView setHidden:YES];
            [m_scrollView setHidden:NO];
    if (bRet) {
        NSLog(@"set config success!");
        MSG(@"", _L(@"Set Success!"), @"");
    }
    else {
        NSLog(@"set config failed!");
        MSG(@"", _L(@"Set Failed!"), @"");
    }
        });
    });
}

- (void)onBtnAudioSet {
    waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
    dispatch_async(dispatch_get_global_queue(DISPATCH_QUEUE_PRIORITY_DEFAULT, 0), ^{
        [m_encode UpdateAudioEncodeCaps:m_nChannel StreamType:m_nStream];
        BOOL bRet = [m_encode SetConfig:m_nChannel];
        
        dispatch_async(dispatch_get_main_queue(), ^{
            [waitView hide:YES];
            [m_AudioEncodeView setHidden:YES];
            [m_scrollView setHidden:NO];
            if (bRet) {
                NSLog(@"set config success!");
                MSG(@"", _L(@"Set Success!"), @"");
            }
            else {
                NSLog(@"set config failed!");
                MSG(@"", _L(@"Set Failed!"), @"");
            }
        });
    });

}

- (void)onBtnPTZ {
    NSLog(@"onBtnPTZ");

    [m_PTZView setHidden:NO];
    [m_scrollView setHidden:YES];
    [m_btnChannel setEnabled:NO];
    [m_btnStream setEnabled:NO];
}


-(void) OnPresetGo: (id)sender{
    int PresetId = [m_textPreset.text intValue];
    BOOL bRet = CLIENT_DHPTZControlEx(g_loginID, m_nChannel, DH_PTZ_POINT_MOVE_CONTROL, 0, PresetId, 0, NO);
    if (!bRet) {
        NSLog(@"turn to the preset point error!");
    }
}

-(void)OnPresetAdd: (id)sender{
    int PresetId = [m_textPreset.text intValue];
    BOOL bRet = CLIENT_DHPTZControlEx(g_loginID, m_nChannel, DH_PTZ_POINT_SET_CONTROL, 0, PresetId, 0, NO);
    if (!bRet) {
        NSLog(@"Add the preset point error!");
    }
}
-(void)OnPresetDel:(id)sender{
    int PresetId = [m_textPreset.text intValue];
    BOOL bRet = CLIENT_DHPTZControlEx(g_loginID, m_nChannel, DH_PTZ_POINT_DEL_CONTROL, 0, PresetId, 0, NO);
    if (!bRet) {
        NSLog(@"Delete the preset point error!");
    }
}
-(void)OnPTZControlPressUp: (id)sender{
    UIButton* clickBtn = sender;
    
    if ([m_btnAddFocus isEqual:clickBtn]) {
        NSLog(@"====Add Focus Up====");
        [self PTZControl: DH_PTZ_FOCUS_ADD_CONTROL:YES];
    }
    else if ([m_btnDecFocus isEqual:clickBtn]){
        NSLog(@"====Dec Focus Up====");
        [self PTZControl: DH_PTZ_FOCUS_DEC_CONTROL:YES];
    }
    else if ([m_btnAddAperture isEqual:clickBtn]){
        NSLog(@"====Add Iris Up====");
        [self PTZControl: DH_PTZ_APERTURE_ADD_CONTROL:YES];
    }
    else if ([m_btnDecAperture isEqual:clickBtn]){
        NSLog(@"====Dec Iris Up====");
        [self PTZControl: DH_PTZ_APERTURE_DEC_CONTROL:YES];
    }
}

-(void)OnPTZControlPressDown: (id)sender{
    UIButton* clickBtn = sender;
    if ([m_btnAddFocus isEqual:clickBtn]) {
        NSLog(@"====Add Focus Down====");
        [self PTZControl: DH_PTZ_FOCUS_ADD_CONTROL:NO];
    }
    else if ([m_btnDecFocus isEqual:clickBtn]){
        NSLog(@"====Dec Focus Down====");
        [self PTZControl: DH_PTZ_FOCUS_DEC_CONTROL:NO];
    }
    else if ([m_btnAddAperture isEqual:clickBtn]){
        NSLog(@"====Add Iris Down====");
        [self PTZControl: DH_PTZ_APERTURE_ADD_CONTROL:NO];
    }
    else if ([m_btnDecAperture isEqual:clickBtn]){
        NSLog(@"====Dec Iris Down====");
        [self PTZControl: DH_PTZ_APERTURE_DEC_CONTROL:NO];
    }
}

-(void) PTZControl: (int) type :(BOOL) stop{
    int iChannel = m_nChannel;
    BYTE param1= 0,param2 = 0;
    switch (type) {
        case DH_PTZ_UP_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_PTZ_DOWN_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_PTZ_RIGHT_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_PTZ_LEFT_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_PTZ_ZOOM_DEC_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_EXTPTZ_RIGHTDOWN:
            param1 = 4;
            param2 = 4;
            break;
        case DH_EXTPTZ_RIGHTTOP:
            param1 = 4;
            param2 = 4;
            break;
        case DH_EXTPTZ_LEFTDOWN:
            param1 = 4;
            param2 = 4;
            break;
        case DH_EXTPTZ_LEFTTOP:
            param1 = 4;
            param2 = 4;
            break;
        case DH_PTZ_ZOOM_ADD_CONTROL:
            param1 = 0;
            param2 = 4;
            break;
        case DH_PTZ_FOCUS_DEC_CONTROL:
            //Focus zoom in
            param1= 0;
            param2= 4;
            break;
        case DH_PTZ_FOCUS_ADD_CONTROL:
            //Focus zoom out
            param1= 0;
            param2= 4;
            break;
        case DH_PTZ_APERTURE_DEC_CONTROL:
            //Aperture zoom out
            param1= 0;
            param2= 4;
            break;
        case DH_PTZ_APERTURE_ADD_CONTROL:
            //Aperture zoom in
            param1= 0;
            param2= 4;
            break;
        default:
            break;
    }
    NSLog(@"channel:%d", iChannel);
    CLIENT_DHPTZControl(g_loginID, iChannel, type, param1, param2, 0, stop);
}

-(void) handlePan: (UIPanGestureRecognizer*)recognizer {
    
    if (recognizer.state == UIGestureRecognizerStateBegan ||
        recognizer.state == UIGestureRecognizerStateChanged) {
        CGPoint v = [recognizer velocityInView:m_playWnd];
        
        if (abs(v.x) + abs(v.y) < 100) {
            // velocity too small
            return;
        }
        
        int cmd = -1;
        float absTanV = fabs(v.y/v.x);
        
        if (absTanV < 0.33) {
            if (v.x > 0) {
                cmd = DH_PTZ_RIGHT_CONTROL;
            }
            else {
                cmd = DH_PTZ_LEFT_CONTROL;
            }
        }
        else if (absTanV > 3) {
            if (v.y > 0) {
                cmd = DH_PTZ_DOWN_CONTROL;
            }
            else {
                cmd = DH_PTZ_UP_CONTROL;
            }
        }
        else {
            if (v.x > 0 && v.y > 0) {
                cmd = DH_EXTPTZ_RIGHTDOWN;
            }
            else if (v.x < 0 && v.y > 0) {
                cmd = DH_EXTPTZ_LEFTDOWN;
            }
            else if (v.x > 0 && v.y < 0) {
                cmd = DH_EXTPTZ_RIGHTTOP;
            }
            else {
                cmd = DH_EXTPTZ_LEFTTOP;
            }
        }
        
        [self PTZControl:cmd:NO];
        usleep(100*1000);
        [self PTZControl:cmd:YES];
    }
}


- (void) PinRecognizerTap: (UIPinchGestureRecognizer*) PinRecognizer{
    NSLog(@"=======Pinch Tarch!=========");
    int cmd = -1;
    if (PinRecognizer.state == UIGestureRecognizerStateBegan ||
        PinRecognizer.state == UIGestureRecognizerStateChanged) {
        CGFloat scale = PinRecognizer.scale;
        NSLog(@"scale =====%f", scale);
        if (scale>1.0) {
            cmd = DH_PTZ_ZOOM_ADD_CONTROL;
        }
        if (scale<1.0) {
            cmd = DH_PTZ_ZOOM_DEC_CONTROL;
        }
    }
    [self PTZControl:cmd:NO];
    usleep(200*1000);
    [self PTZControl:cmd:YES];
    PinRecognizer.scale = 1.0;
    
}


- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {
    
    if (1 == m_pickerview.tag) {
        return m_arrChannel.count;
    }
    else {
        return m_arrStream.count;
    }

}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{
    
    if (1 == m_pickerview.tag) {
        return [m_arrChannel objectAtIndex:row];
    }
    else {
        return [m_arrStream objectAtIndex:row];
    }
}

// 由于touchesEnded有时会在didSelectRow还没来得及执行前先执行（目前根因还没找到）, 因此增加两个判断标志，使得无论怎样都会执行判断码流，通道，录像类型有无变化和onBtnPlay
-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    bPickFlag = TRUE;
    NSLog(@"Enter pickerView didSelectRow");
    if (1 == pickerView.tag) {
        [m_arrChannel objectAtIndex:row];
        m_nChannel = (int)row;
        NSLog(@"Row m_nChannel is %d", m_nChannel);
        [m_btnChannel setTitle:[m_arrChannel objectAtIndex:row]forState:UIControlStateNormal];
        
    }
    else if (2 == pickerView.tag) {
        [m_arrStream objectAtIndex:row];
        m_nStream = (int)row;
        NSLog(@"Row m_nStream is %d", m_nStream);
        [m_btnStream setTitle:[m_arrStream objectAtIndex:row]forState:UIControlStateNormal];
    }
    if (bTouchsEnded) {
        NSLog(@"bTouchsEnded is %d", bTouchsEnded);
        if (m_bPlay) {
            NSLog(@"pick current m_nPreStream is %d", m_nPreStream);
            NSLog(@"pick current m_nStream is %d", m_nStream);
            NSLog(@"pick current m_nPreChannel is %d", m_nPreChannel);
            NSLog(@"pick current m_nChannel is %d", m_nChannel);
            if (m_nPreChannel != m_nChannel || m_nPreStream != m_nStream
                ) {
                NSLog(@"pick Channel or Stream is changed, current stream is %d", m_nStream);
                [self onBtnPlay];
            }
        }
        m_nPreChannel = m_nChannel;
        m_nPreStream = m_nStream;
        bTouchsEnded = FALSE;
    }
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {
    if (1 == m_tableView.tag) {
        return 4;
    }
    else {
        return 2;
    }
//        return 4;
}

- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath {
    if (1 == m_tableView.tag) {
        return m_tableView.frame.size.height/4;
    }
    else
    {
        return m_tableView.frame.size.height/2;
    }

}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    
//    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:@"cell" forIndexPath:indexPath];
    
    static NSString *identifier = @"CELL";
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:identifier];
    if (!cell) {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleSubtitle reuseIdentifier:identifier];
        cell.accessoryType = UITableViewCellAccessoryNone;
        
       UILabel * subcell = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, cell.frame.size.width/2, cell.frame.size.height)];
        subcell.center = CGPointMake(cell.frame.size.width*0.75, cell.frame.size.height/2);
        subcell.tag = 1000;
        subcell.textAlignment = NSTextAlignmentRight;
        subcell.font = [UIFont systemFontOfSize:20];
        subcell.adjustsFontSizeToFitWidth = YES;
        [cell addSubview:subcell];
    }
    if (1 == m_tableView.tag) {
        if (indexPath.row < 4) {
            UILabel * subcell = [cell viewWithTag:1000];
            subcell.text = m_SubTitles[indexPath.row];
        }
        
        
        cell.textLabel.text = m_MainTitles[indexPath.row];
        cell.textLabel.font = [UIFont systemFontOfSize:20];
        cell.backgroundColor = BASE_BACKGROUND_COLOR;
        cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
        cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;

    } else {
        if (indexPath.row < 2) {
            UILabel * subcell = [cell viewWithTag:1000];
            subcell.text = m_AudioSubTitles[indexPath.row];
            
            cell.textLabel.text = m_AudioMainTitles[indexPath.row];
            cell.textLabel.font = [UIFont systemFontOfSize:20];
            cell.backgroundColor = BASE_BACKGROUND_COLOR;
            cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
            cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
        }
        
        
        

    }

    
    
    return cell;
}


- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    
    NSInteger index = 0;
    NSInteger select = indexPath.row;
    m_selectIndex = indexPath.row;
    
    if (1 == m_tableView.tag) {
        if (0 == select) {
            m_optionController.title = m_MainTitles[select];
            m_optionController.options = m_Compressions;
            index = [m_Compressions indexOfObject:m_SubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }
        else if (1 == select) {
            m_optionController.title = m_MainTitles[select];
            m_optionController.options = m_Resolutions;
            index = [m_Resolutions indexOfObject:m_SubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }
        else if (2 == select) {
            m_optionController.title = m_MainTitles[select];
            m_optionController.options = m_FPSs;
            index = [m_FPSs indexOfObject:m_SubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }
        else if (3 == select) {
            m_optionController.title = m_MainTitles[select];
            m_optionController.options = m_BitRate;
            index = [m_BitRate indexOfObject:m_SubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }
        
    }
    else {
        if (0 == select) {
            m_optionController.title = m_AudioMainTitles[select];
            m_optionController.options = m_AudioEncodeType;
            index = [m_AudioEncodeType indexOfObject:m_AudioSubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }
        else if (1 == select) {
            m_optionController.title = m_AudioMainTitles[select];
            m_optionController.options = m_SampleRate;
            index = [m_SampleRate indexOfObject:m_AudioSubTitles[select]];
            
            m_optionController.selectIndexes = [[NSMutableArray alloc] initWithObjects:[NSString stringWithFormat:@"%ld", (long)index], nil];
            
            [self.navigationController pushViewController:m_optionController animated:YES];
        }

    }
    
}

- (void) Controller:(DHOptionViewController*)controller didSelectedIndexes:(NSArray*)indexes {
    
    NSUInteger select = [indexes[0] intValue];

    if (1 == m_tableView.tag) {
        NSString *tmp = [NSString stringWithFormat:@"%@", controller.options[select]];
        [m_SubTitles replaceObjectAtIndex:m_selectIndex withObject:tmp];
        m_encode.m_Subtitles = m_SubTitles;
        [m_encode UpdateEncodeCaps:m_nChannel StreamType:m_nStream];
        m_SubTitles = m_encode.m_Subtitles;
    }
    else
    {
        NSString *tmp = [NSString stringWithFormat:@"%@", controller.options[select]];
        [m_AudioSubTitles replaceObjectAtIndex:m_selectIndex withObject:tmp];
        m_encode.m_AudioSubtitles = m_AudioSubTitles;
        [m_encode UpdateAudioEncodeCaps:m_nChannel StreamType:m_nStream];
        m_AudioSubTitles = m_encode.m_AudioSubtitles;
    }
    
    
    [self.navigationController popViewControllerAnimated:YES];
    
    [self.m_tableView reloadData];
    [self.m_tableAudioView reloadData];

}

- (NSString *)str_now
{
    time_t t;
    time(&t);
    tm* stTime = localtime(&t);
    
    NSString *str = [NSString stringWithFormat:@"%04d%02d%2d_%02d%02d%02d_ch%d",stTime->tm_year + 1900, stTime->tm_mon+1, stTime->tm_mday, stTime->tm_hour, stTime->tm_min, stTime->tm_sec, m_nChannel];
    
    return str;
}

-(void) touchesBegan:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    if ([self.firstResponderText isFirstResponder]) {
        [self.firstResponderText resignFirstResponder];
    }
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    NSLog(@"bPickFlag is %d", bPickFlag);
    if (FALSE == m_pickerview.isHidden) {
        NSLog(@"Enter touches Ended and pickerview is hidden1");
        if (bPickFlag) {
            if (m_bPlay) {
                NSLog(@"current m_nPreStream is %d", m_nPreStream);
                NSLog(@"current m_nStream is %d", m_nStream);
                if (m_nPreChannel != m_nChannel || m_nPreStream != m_nStream
                    ) {
                    NSLog(@"Channel or Stream is changed, current stream is %d", m_nStream);
                    [self onBtnPlay];
                }
            }
            m_nPreChannel = m_nChannel;
            m_nPreStream = m_nStream;
            bPickFlag = FALSE;
        }

        bTouchsEnded = TRUE;
        [m_pickerview setHidden:TRUE];
        [m_btnChannel setEnabled:TRUE];
        [m_btnStream setEnabled:TRUE];
        m_btnChannel.backgroundColor = [UIColor lightGrayColor];
        m_btnStream.backgroundColor = [UIColor lightGrayColor];
    }
    m_btnTimeOverlay.backgroundColor = [UIColor lightGrayColor];
    m_btnChannelOverlay.backgroundColor = [UIColor lightGrayColor];
    [m_TimetitleView setHidden:YES];
    [m_ChanneltitleView setHidden:YES];
    [m_EncodeView setHidden:YES];
    [m_AudioEncodeView setHidden:YES];
    [m_PTZView setHidden:YES];
    [m_textChannel  resignFirstResponder];
    [m_scrollView setHidden:NO];
    [m_btnChannel setEnabled:YES];
    [m_btnStream setEnabled:YES];
    [m_textPreset   resignFirstResponder];
}

- (BOOL) textFieldShouldBeginEditing:(UITextField *)textField {
    // 当将要开始编辑的时候，获取当前的textField
    self.firstResponderText = textField;
    return YES;
}
- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_textChannel  resignFirstResponder];
    [m_textPreset   resignFirstResponder];
    return TRUE;
}
- (void) keyboardWillShow:(NSNotification *)aNotification
{
    CGRect rect = [self.firstResponderText.superview convertRect:self.firstResponderText.frame toView:self.view];
    NSDictionary *userinfo = [aNotification userInfo];
    // 获取弹出键盘的frame的value值
    NSValue *avalue = [userinfo objectForKey:UIKeyboardFrameEndUserInfoKey];
    CGRect keyboardRect = [avalue CGRectValue];
    // 获取键盘相对于self.view的frame，传window和传nil是一样的
    keyboardRect = [self.view convertRect:keyboardRect fromView:self.view.window];
    CGFloat keyboardTop = keyboardRect.origin.y;
    // 获取键盘弹出动画时间值
    NSNumber *animationDurationValue = [userinfo objectForKey:UIKeyboardAnimationDurationUserInfoKey];
    NSTimeInterval animationDuration = [animationDurationValue doubleValue];
    // 如果键盘盖住了输入框
    if (keyboardTop < CGRectGetMaxY(rect)) {
        // 计算需要往上移动的偏移量(输入框底部离键盘顶部为10的间距)
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
    // 如果有偏移，当隐藏键盘的时候就复原
    if (self.view.frame.origin.y < 0) {
        __weak typeof(self)weakSelf = self;
        [UIView animateWithDuration:animationDuration animations:^{
            weakSelf.view.frame = CGRectMake(weakSelf.view.frame.origin.x, 0, weakSelf.view.frame.size.width, weakSelf.view.frame.size.height);
        }];
    }
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    if (!parent) {
        if (m_bPlay) {
            [self onBtnPlay];
        }
        [m_pickerview setHidden:YES];
        [m_TimetitleView setHidden:YES];
        [m_ChanneltitleView setHidden:YES];
        [m_EncodeView setHidden:YES];
        [m_AudioEncodeView setHidden:YES];
        [m_PTZView setHidden:YES];
        [m_scrollView setHidden:NO];
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
