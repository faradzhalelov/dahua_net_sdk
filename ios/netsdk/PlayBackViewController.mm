//
//  PlayBackViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/9/6.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "PlayBackViewController.h"
#import "VideoWnd.h"
#import "playEx.h"
#import "Global.h"
#import "DHHudPrecess.h"
#import <fstream>
#import "UnlockFileViewController.h"
#import "DownloadViewController.h"
#import "PlayStream.hpp"

static std::ofstream s_recordfile;

@class VideoWnd;

@interface PlayBackViewController ()<UIPickerViewDelegate, UIPickerViewDataSource>

@property (nonatomic, strong) UILabel *m_labChannel;
@property (nonatomic, strong) UILabel *m_labStream;
@property (nonatomic, strong) UIButton *m_btnChannel;
@property (nonatomic, strong) UIButton *m_btnStream;
@property (nonatomic, strong) UIButton *m_btnType;
@property (nonatomic, strong) UIButton *m_btnPlay;
@property (nonatomic, strong) UIButton *m_btnSnap;
@property (nonatomic, strong) UIButton *m_btnPause;
@property (nonatomic, strong) UIPickerView *m_pickerview;
@property (nonatomic, strong) VideoWnd *m_playWnd;
@property (nonatomic, strong) UIButton *m_btnStartTime;
@property (nonatomic, strong) UILabel *m_labStartTime;
@property (nonatomic, strong) UILabel *m_labEndTime;
@property (nonatomic, strong) UIDatePicker *m_datepicker;
@property (nonatomic, strong) UISlider *m_slider;
@property (nonatomic, strong) UILabel *m_labSpeedLevel;
@property (nonatomic, strong) UIStepper *m_stepper;
@property (nonatomic, strong) UIButton *m_btnNormalPlay;
@property (nonatomic, strong) UIButton *m_btnDownload;
@property (nonatomic, strong) UIButton *m_btnUnlock;
@property (nonatomic, strong) UILabel *m_SliderCurLabel;


@property (nonatomic) CPlayStream *m_PlayStream;
@property (nonatomic) int m_nChannel;
@property (nonatomic) int m_nStream;
@property (nonatomic) int m_nType;
@property (nonatomic) int m_nPreChannel;
@property (nonatomic) int m_nPreStream;
@property (nonatomic) int m_nPreType;
@property (nonatomic) int m_nPlayPort;
@property (nonatomic) double m_previousValue;
@property (nonatomic) BOOL bDownlaod;
@property (nonatomic) NSTimer *timer;
@property (nonatomic) NET_TIME m_stuStartTime;
@property (nonatomic) NET_TIME m_stuEndTime;
@property (nonatomic) NET_TIME m_stuOSDTime;
@property (nonatomic) LLONG m_PlayHandle;
@property (nonatomic) BOOL m_bPause;
@property (nonatomic) LLONG m_DownloadHandle;
@property (nonatomic) UITapGestureRecognizer *m_GestureRecognizer;
@property (nonatomic,strong) NSTimer *m_PlayTimer;
@property (nonatomic) DWORD m_dwTotalSize;
@property (nonatomic) DWORD m_dwCurValue;
@property (nonatomic) BOOL m_bSlideing;
@property (nonatomic) BOOL m_bReStart;
@property (nonatomic) BOOL m_bPickFlag;
@property (nonatomic) BOOL m_bTouchesEnded;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) NSMutableArray *m_arrStream;
@property (nonatomic) NSMutableArray *m_arrType;
@property (nonatomic) NSMutableArray *m_arrSpeed;

@end

@implementation PlayBackViewController

@synthesize m_labChannel, m_labStream, m_btnChannel, m_btnStream, m_btnPlay, m_btnSnap, m_btnPause, m_playWnd, m_nChannel, m_nStream, m_nPlayPort, m_PlayHandle, m_pickerview, m_arrChannel, m_arrStream, m_btnStartTime, m_labStartTime, m_labEndTime, m_slider, m_stepper, m_btnNormalPlay, m_labSpeedLevel, m_arrSpeed, m_btnDownload, m_btnUnlock, m_datepicker, m_stuStartTime, m_stuEndTime, m_bPause, m_GestureRecognizer, m_SliderCurLabel, m_arrType, m_nType, m_btnType, m_PlayTimer, m_dwTotalSize, m_dwCurValue, m_bSlideing, m_PlayStream, m_bReStart, m_nPreChannel, m_nPreStream, m_nPreType, m_bPickFlag, m_bTouchesEnded;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    
    
    self.title = _L(@"Playback");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    self.navigationItem.backBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:_L(@"Back") style:UIBarButtonItemStylePlain target:nil action:nil];
    
    m_nChannel = 0;
    m_nStream = 0;
    m_nType = 0;
    m_nPlayPort = 0;
    m_PlayHandle = 0;
    m_nPreChannel = 0;
    m_nPreStream = 0;
    m_nPreType = 0;
    self.bDownlaod = FALSE;
    m_bPause = FALSE;
    m_PlayTimer = nil;
    m_dwTotalSize = 0;
    m_dwCurValue = 0;
    m_bReStart = FALSE;
    m_bPickFlag = FALSE;
    m_bTouchesEnded = FALSE;
    
    m_labChannel = [[UILabel alloc] init];
    [m_labChannel setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labChannel setCenter:CGPointMake(kScreenWidth/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labChannel.text = _L(@"Channel");
    m_labChannel.textColor = UIColor.blackColor;
    m_labChannel.layer.borderWidth = 1;
    m_labChannel.layer.cornerRadius = 10;
    m_labChannel.layer.masksToBounds = YES;
    m_labChannel.backgroundColor = UIColor.whiteColor;
    m_labChannel.textAlignment = NSTextAlignmentCenter;
    [m_labChannel setFont:[UIFont systemFontOfSize:24]];
    //[self.view addSubview:m_labChannel];
    
    m_btnChannel = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnChannel.center = CGPointMake(kScreenWidth*1/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"Channel0") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onBtnChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    m_labStream = [[UILabel alloc] init];
    [m_labStream setFrame:CGRectMake(0, 0, kScreenWidth*0.24, kScreenHeight/20)];
    [m_labStream setCenter:CGPointMake(kScreenWidth*5/8, kScreenHeight/40+kNavigationBarHeight)];
    m_labStream.text = _L(@"Stream");
    m_labStream.textColor = UIColor.blackColor;
    m_labStream.layer.borderWidth = 1;
    m_labStream.layer.cornerRadius = 10;
    m_labStream.layer.masksToBounds = YES;
    m_labStream.backgroundColor = UIColor.whiteColor;
    m_labStream.textAlignment = NSTextAlignmentCenter;
    [m_labStream setFont:[UIFont systemFontOfSize:24]];
    //[self.view addSubview:m_labStream];
    
    m_btnStream = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnStream.center = CGPointMake(kScreenWidth*3/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnStream.backgroundColor = [UIColor lightGrayColor];
    [m_btnStream setTitle:_L(@"Main") forState:UIControlStateNormal];
    [m_btnStream addTarget:self action:@selector(onBtnStream) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStream setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStream.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStream.layer.cornerRadius = 10;
    m_btnStream.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream];
    
    m_btnType = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnType.center = CGPointMake(kScreenWidth*5/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnType.backgroundColor = [UIColor lightGrayColor];
    [m_btnType setTitle:_L(@"All Record") forState:UIControlStateNormal];
    [m_btnType addTarget:self action:@selector(onBtnType) forControlEvents:UIControlEventTouchUpInside];
    [m_btnType setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnType.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnType.layer.cornerRadius = 10;
    m_btnType.layer.borderWidth = 1;
    m_btnType.titleLabel.adjustsFontSizeToFitWidth = YES;
    [self.view addSubview:m_btnType];
    
    //play wiew
    m_playWnd = [[VideoWnd alloc] init];
    m_playWnd.backgroundColor = BASE_BACKGROUND_COLOR;
    m_playWnd.frame = CGRectMake(0, 0, kScreenWidth, kScreenWidth*0.75);
    m_playWnd.center = CGPointMake(kScreenWidth/2, m_labChannel.center.y + m_labChannel.frame.size.height/2 + m_playWnd.frame.size.height/2);
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
        [m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"Channel%d"), i]];
    }
    
    m_arrStream = [[NSMutableArray alloc] initWithObjects:_L(@"Main"), _L(@"Extra"), nil];
    
    m_arrType = [[NSMutableArray alloc] initWithObjects:_L(@"All Record"), _L(@"Alarm Record"), nil];
    
    m_arrSpeed = [[NSMutableArray alloc] initWithObjects:_L(@"X1/8"), _L(@"X1/4"), _L(@"X1/2"), _L(@"X1"),_L(@"X2"), _L(@"X4"),_L(@"X8"), nil];
    
    
    
    
    m_slider = [[UISlider alloc] init];
    m_slider.frame = CGRectMake(0, 0, kScreenWidth, kScreenHeight/40);
    m_slider.center = CGPointMake(kScreenWidth/2, m_playWnd.center.y+m_playWnd.frame.size.height/2+kScreenHeight/40);
    m_slider.minimumValue = 0;
    m_slider.maximumValue = 24 *3600;
    m_slider.value = 0;
    m_slider.userInteractionEnabled = FALSE;
    m_slider.continuous = FALSE;
    [m_slider addTarget:self action:@selector(OnSliderDidChange) forControlEvents:UIControlEventValueChanged];
    [self.view addSubview:m_slider];
    
//    m_GestureRecognizer =[[UITapGestureRecognizer alloc] initWithTarget:self action:@selector(actionTapGesture:)];
//    [m_slider addGestureRecognizer:m_GestureRecognizer];
    
    m_SliderCurLabel = [[UILabel alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/5, kScreenHeight/40)];
    m_SliderCurLabel.center = CGPointMake(kScreenWidth/10, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
    m_SliderCurLabel.font = [UIFont systemFontOfSize:14.0];
    [m_SliderCurLabel setText:_L(@"00:00:00")];
    m_SliderCurLabel.textAlignment = NSTextAlignmentRight;
    [self.view addSubview:m_SliderCurLabel];
    
    m_btnStartTime = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnStartTime.center = CGPointMake(kScreenWidth*1/6, m_SliderCurLabel.center.y+m_SliderCurLabel.frame.size.height+kScreenHeight/40);
    m_btnStartTime.backgroundColor = [UIColor lightGrayColor];
    [m_btnStartTime setTitle:_L(@"Start Time") forState:UIControlStateNormal];
    [m_btnStartTime addTarget:self action:@selector(onSelectStartTime) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStartTime setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStartTime.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStartTime.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnStartTime.layer.cornerRadius = 10;
    m_btnStartTime.layer.borderWidth = 1;
    [self.view addSubview:m_btnStartTime];
    
    m_labStartTime = [[UILabel alloc] init];
    m_labStartTime.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_labStartTime.center = CGPointMake(kScreenWidth*0.7, m_btnStartTime.center.y);
    m_labStartTime.font = [UIFont systemFontOfSize:24];
    m_labStartTime.textAlignment = NSTextAlignmentCenter;
    m_labStartTime.adjustsFontSizeToFitWidth = YES;
    [self.view addSubview:m_labStartTime];
    
    
    
    m_datepicker = [[UIDatePicker alloc] init];
    m_datepicker.center = self.view.center;
//    m_datepicker.locale = [NSLocale localeWithLocaleIdentifier:@"zh_CN"];
    m_datepicker.backgroundColor = [UIColor lightGrayColor];
    [m_datepicker setDate:[NSDate date] animated:TRUE];
    m_datepicker.datePickerMode = UIDatePickerModeDateAndTime;
    [m_datepicker addTarget:self action:@selector(ondateChange:) forControlEvents:UIControlEventValueChanged];
    m_datepicker.hidden = TRUE;
    [self.view addSubview:m_datepicker];
    
    m_btnPlay = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnPlay.center = CGPointMake(kScreenWidth*3/6, m_btnStartTime.center.y+kScreenHeight/20*1.5);
    m_btnPlay.backgroundColor = [UIColor lightGrayColor];
    [m_btnPlay setTitle:_L(@"Play") forState:UIControlStateNormal];
    [m_btnPlay addTarget:self action:@selector(onPlay:) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPlay.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnPlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPlay.layer.cornerRadius = 10;
    m_btnPlay.layer.borderWidth = 1;
    [self.view addSubview:m_btnPlay];
    
    m_btnSnap = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnSnap.center = CGPointMake(kScreenWidth*1/6, m_btnPlay.center.y);
    m_btnSnap.backgroundColor = [UIColor whiteColor];
    [m_btnSnap setTitle:_L(@"Local Snap") forState:UIControlStateNormal];
    [m_btnSnap addTarget:self action:@selector(onBtnSnap) forControlEvents:UIControlEventTouchUpInside];
    [m_btnSnap setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnSnap.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnSnap.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnSnap.layer.cornerRadius = 10;
    m_btnSnap.layer.borderWidth = 1;
    [self.view addSubview:m_btnSnap];

    m_btnPause = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnPause.center = CGPointMake(kScreenWidth*5/6, m_btnPlay.center.y);
    m_btnPause.backgroundColor = [UIColor whiteColor];
    [m_btnPause setTitle:_L(@"Pause") forState:UIControlStateNormal];
    [m_btnPause addTarget:self action:@selector(onBtnPause) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPause setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPause.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnPause.layer.cornerRadius = 10;
    m_btnPause.layer.borderWidth = 1;
    [self.view addSubview:m_btnPause];
    
    
    m_labSpeedLevel = [[UILabel alloc] init];
    [m_labSpeedLevel setFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    [m_labSpeedLevel setCenter:CGPointMake(kScreenWidth*1/6, m_btnSnap.center.y+kScreenHeight/20*1.5)];
    m_labSpeedLevel.text = _L(@"x1");
    m_labSpeedLevel.textColor = UIColor.blackColor;
    m_labSpeedLevel.layer.borderWidth = 1;
    m_labSpeedLevel.layer.cornerRadius = 10;
    m_labSpeedLevel.layer.masksToBounds = YES;
    m_labSpeedLevel.backgroundColor = UIColor.whiteColor;
    m_labSpeedLevel.textAlignment = NSTextAlignmentCenter;
    [m_labSpeedLevel setFont:[UIFont systemFontOfSize:24]];
    [self.view addSubview:m_labSpeedLevel];
    
    m_stepper = [[UIStepper alloc] init];
    m_stepper.frame = CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20);
    m_stepper.center = CGPointMake(kScreenWidth*3/6, m_labSpeedLevel.center.y);
    m_stepper.minimumValue = -3;
    m_stepper.maximumValue = 3;
    m_stepper.value = 0;
    m_stepper.stepValue = 1;
    [m_stepper addTarget:self action:@selector(OnSpeedChange) forControlEvents:UIControlEventValueChanged];
    [self.view addSubview:m_stepper];
    self.m_previousValue = 0.0;
    
    
    
    m_btnNormalPlay = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnNormalPlay.center = CGPointMake(kScreenWidth*5/6, m_labSpeedLevel.center.y);
    m_btnNormalPlay.backgroundColor = [UIColor whiteColor];
    [m_btnNormalPlay setTitle:_L(@"Normal") forState:UIControlStateNormal];
    [m_btnNormalPlay addTarget:self action:@selector(onBtnNormalPlay) forControlEvents:UIControlEventTouchUpInside];
    [m_btnNormalPlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnNormalPlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnNormalPlay.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnNormalPlay.layer.cornerRadius = 10;
    m_btnNormalPlay.layer.borderWidth = 1;
    [self.view addSubview:m_btnNormalPlay];
    
    m_btnDownload = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnDownload.center = CGPointMake(kScreenWidth*1/6, m_labSpeedLevel.center.y+kScreenHeight/20*1.5);
    m_btnDownload.backgroundColor = [UIColor lightGrayColor];
    [m_btnDownload setTitle:_L(@"Download") forState:UIControlStateNormal];
    [m_btnDownload addTarget:self action:@selector(onBtnDownload) forControlEvents:UIControlEventTouchUpInside];
    [m_btnDownload setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnDownload.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnDownload.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnDownload.layer.cornerRadius = 10;
    m_btnDownload.layer.borderWidth = 1;
    [self.view addSubview:m_btnDownload];
    
    
    m_btnUnlock = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth*0.3, kScreenHeight/20)];
    m_btnUnlock.center = CGPointMake(kScreenWidth*5/6, m_btnDownload.center.y);
    m_btnUnlock.backgroundColor = [UIColor lightGrayColor];
    [m_btnUnlock setTitle:_L(@"Lock") forState:UIControlStateNormal];
    m_btnUnlock.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [m_btnUnlock addTarget:self action:@selector(onBtnUnlock) forControlEvents:UIControlEventTouchUpInside];
    [m_btnUnlock setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnUnlock.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnUnlock.layer.cornerRadius = 10;
    m_btnUnlock.layer.borderWidth = 1;
    [self.view addSubview:m_btnUnlock];
    
}

- (void) viewDidAppear:(BOOL)animated {
    NSDate *date = [NSDate date];
    NSDateFormatter *formatter = [[NSDateFormatter alloc] init];
    [formatter setDateFormat:@"yyyy-MM-dd"];
    NSString *string = [formatter stringFromDate:date];
    NSLog(@"%@", string);
    [m_labStartTime setText:string];
    NSCalendar* calendar = [NSCalendar currentCalendar];
    NSDateComponents* dateComp = [calendar components:(NSCalendarUnitYear|NSCalendarUnitMonth|NSCalendarUnitDay|NSCalendarUnitHour|NSCalendarUnitMinute|NSCalendarUnitSecond) fromDate:date];
    m_stuStartTime.dwYear = (DWORD)[dateComp year];
    m_stuStartTime.dwMonth = (DWORD)[dateComp month];
    m_stuStartTime.dwDay = (DWORD)[dateComp day];
    m_stuStartTime.dwHour = 0;
    m_stuStartTime.dwMinute = 0;
    m_stuStartTime.dwSecond = 0;
    m_stuEndTime.dwYear = (DWORD)[dateComp year];
    m_stuEndTime.dwMonth = (DWORD)[dateComp month];
    m_stuEndTime.dwDay = (DWORD)[dateComp day];
    m_stuEndTime.dwHour = 23;
    m_stuEndTime.dwMinute = 59;
    m_stuEndTime.dwSecond = 59;
    [self EnableButton:FALSE];
    [self StartPlayTimer];
}

-(void) viewDidDisappear:(BOOL)animated
{
    [self StopPlayTimer];
}

- (void) EnableButton : (BOOL)bFlag {
    [m_btnSnap setEnabled:bFlag];
    [m_btnPause setEnabled:bFlag];
    [m_btnNormalPlay setEnabled:bFlag];
    [m_stepper setEnabled:bFlag];
    if (bFlag) {
        m_btnSnap.backgroundColor = [UIColor lightGrayColor];
        m_btnPause.backgroundColor = [UIColor lightGrayColor];
        m_btnNormalPlay.backgroundColor = [UIColor lightGrayColor];
    }
    else {
        m_btnSnap.backgroundColor = [UIColor whiteColor];
        m_btnPause.backgroundColor = [UIColor whiteColor];
        m_btnNormalPlay.backgroundColor = [UIColor whiteColor];
    }
}


- (void)onShowSubview : (BOOL)bFlag {
    [m_labChannel setHidden:bFlag];
    [m_btnChannel setHidden:bFlag];
    [m_labStream setHidden:bFlag];
    [m_btnStream setHidden:bFlag];
    [m_btnType setHidden:bFlag];
    [m_playWnd setHidden:bFlag];
    [m_slider setHidden:bFlag];
    [m_btnStartTime setHidden:bFlag];
    [m_labStartTime setHidden:bFlag];
    [m_labEndTime setHidden:bFlag];
    [m_btnSnap setHidden:bFlag];
    [m_btnPlay setHidden:bFlag];
    [m_btnPause setHidden:bFlag];
    [m_labSpeedLevel setHidden:bFlag];
    [m_btnNormalPlay setHidden:bFlag];
    [m_btnDownload setHidden:bFlag];
    [m_stepper setHidden:bFlag];
    [m_btnUnlock setHidden:bFlag];
    [m_SliderCurLabel setHidden:bFlag];
}

- (void)onBtnChannel {
    
    if (m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self onShowSubview:TRUE];
        //[self onBtnStop];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
    }
}

- (void)onBtnStream {
    if (m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self onShowSubview:TRUE];
        //[self onBtnStop];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream inComponent:0 animated:TRUE];
    }
}

- (void)onBtnType {
    if (m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self onShowSubview:TRUE];
        //[self onBtnStop];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 3;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nType inComponent:0 animated:TRUE];
    }
}

- (void)ondateChange:(UIDatePicker *)datePicker {
    NSDateFormatter *formatter = [[NSDateFormatter alloc] init];
    formatter.dateFormat = @"yyyy-MM-dd";
    NSString *dateStr = [formatter stringFromDate:datePicker.date];
    if (1 == m_datepicker.tag) {
        m_labStartTime.text = dateStr;
    }
    else {
        m_labEndTime.text = dateStr;
    }
}

- (void)onSelectStartTime {
    
    if (m_datepicker.isHidden) {
        [self onShowSubview:TRUE];
        [self onBtnStop];
        m_datepicker.tag = 1;
        m_datepicker.datePickerMode = UIDatePickerModeDate;
        [m_datepicker setHidden:FALSE];
    }
    else {
        [m_datepicker setHidden:TRUE];
    }
}

-(void)OnSliderDidChange {

    static bool bFirst = YES;
    if (bFirst)
    {
        m_bSlideing = TRUE;
        bFirst = NO;
        m_slider.continuous = NO;
        return ;
    }
    if (m_PlayHandle) {
        LONG lCurTime = m_slider.value;
        NSLog(@"m_slider.value is %d", lCurTime);
        [self onPlay:nil];
        DWORD dwHour = lCurTime/3600;
        DWORD dwMinute = lCurTime%3600/60;
        DWORD dwSec = lCurTime%60;
        NSLog(@"cur time is %02d:%02d:%02d",dwHour, dwMinute,dwSec);
        NSLog(@"Start time is %02d:%02d:%02d",m_stuStartTime.dwHour, m_stuStartTime.dwMinute, m_stuStartTime.dwSecond);
        
//        m_stuStartTime.dwHour = dwHour;
//        m_stuStartTime.dwMinute = dwMinute;
//        m_stuStartTime.dwSecond = dwSec;
        
        [self onPlay:nil];
    }
    m_slider.continuous = YES;
    m_bSlideing = FALSE;
    bFirst = TRUE;
    
}

-(void) actionTapGesture:(UITapGestureRecognizer *)sender
{
    CGPoint touchPoint = [sender locationInView:m_slider];
    CGFloat value = (m_slider.maximumValue - m_slider.minimumValue)*(touchPoint.x/m_slider.frame.size.width);
    [m_slider setValue:value animated:YES];

    m_bSlideing = TRUE;
    if (m_PlayHandle)
    {
        LONG lCurTime = m_slider.value;
        NSLog(@"action m_bSlideing:  %lf", m_slider.value);
        [self onPlay:nil];
        DWORD dwHour = lCurTime/3600;
        DWORD dwMinute = lCurTime%3600/60;
        DWORD dwSec = lCurTime%60;

        m_stuStartTime.dwHour = dwHour;
        m_stuStartTime.dwMinute = dwMinute;
        m_stuStartTime.dwSecond = dwSec;

        [self onPlay:nil];
    }
    m_bSlideing = FALSE;
    
}





-(void) OnPlayTimerProc:(id) sender
{
    if (!m_PlayHandle || !m_PlayStream)
    {
        return;
    }
    
    if (m_bSlideing)
    {
        LONG lCurTime = m_slider.value;
        NSLog(@"onPlayTimerProc m_slider.value:  %d", lCurTime);
        DWORD dwHour = lCurTime/3600;
        DWORD dwMinute = lCurTime%3600/60;
        DWORD dwSec = lCurTime%60;
        [self.m_SliderCurLabel setText:[NSString stringWithFormat:_L(@"%02d:%02d:%02d"),dwHour,dwMinute,dwSec]];
        NSLog(@"m_bSlideing  %@", self.m_SliderCurLabel.text);
        m_stuStartTime.dwHour = dwHour;
        m_stuStartTime.dwMinute = dwMinute;
        m_stuStartTime.dwSecond = dwSec;
        CGFloat xPoint = kScreenWidth*m_slider.value/24/3600;
        if (kScreenWidth - xPoint < kScreenWidth/10)
        {
            xPoint = kScreenWidth*9/10;
        }
        else if (xPoint < kScreenWidth/10)
        {
            xPoint = kScreenWidth/10;
        }
        m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
        return;
    }
    
    if (m_dwTotalSize != 0 && m_dwCurValue != -1)
    {
        NET_TIME ntTime = {0};
        BOOL bRet = m_PlayStream->GetOSDTime(&ntTime);
        if (bRet)
        {
            if (ntTime.dwDay == m_stuStartTime.dwDay)
            {
                LONG lCurrentTime = ntTime.dwHour *3600 + ntTime.dwMinute*60+ntTime.dwSecond;
                NSLog(@"OnPlayTimerProc lCurrentTime is %d", lCurrentTime);
                LONG lEndTime = m_stuEndTime.dwHour *3600 + m_stuEndTime.dwMinute*60+m_stuEndTime.dwSecond;
                if (lCurrentTime > lEndTime)
                {
                    //stop play
                    [self onPlay:nil];
                    return;
                }
                m_slider.value = lCurrentTime;
                [self.m_SliderCurLabel setText:[NSString stringWithFormat:_L(@"%02d:%02d:%02d"),ntTime.dwHour,ntTime.dwMinute,ntTime.dwSecond]];
                NSLog(@"%@", self.m_SliderCurLabel.text);
                CGFloat xPoint = kScreenWidth*lCurrentTime/24/3600;
                if (kScreenWidth - xPoint < kScreenWidth/10)
                {
                    xPoint = kScreenWidth*9/10;
                }
                else if (xPoint < kScreenWidth/10)
                {
                    xPoint = kScreenWidth/10;
                }
                m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
            }
        }
        else
        {
            NSLog(@"GetOSDTime Falied");
        }
    }
    else if (m_dwTotalSize !=0 && m_dwCurValue== -1)
    {
        BOOL bPlayEnd = TRUE;
        if (bPlayEnd)
        {
            //[self onPlay:nil];
        }
    }
}


int CALLBACK cbPlaybackData(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LDWORD dwUser)
{
    PlayBackViewController* pSelf = (__bridge PlayBackViewController*)((void*)dwUser);
    return pSelf.m_PlayStream->InputData(pBuffer, dwBufSize);
}

void CALLBACK cbDownLoadPos(LLONG lPlayHandle, DWORD dwTotalSize, DWORD dwDownLoadSize, LDWORD dwUser)
{
    PlayBackViewController* pSelf = (__bridge PlayBackViewController*)((void*)dwUser);
    pSelf.m_dwCurValue = dwDownLoadSize;
    pSelf.m_dwTotalSize = dwTotalSize;
}

-(BOOL) StartPlayBackByTime
{
    if (m_PlayHandle)
    {
        return FALSE;
    }
    
    
    BOOL bRet = FALSE;
    m_PlayStream = new CPlayStream;
    if (!m_PlayStream)
    {
        NSLog(@"new playstream failed");
        return FALSE;
    }
    
    int nRecordStreamType = 0;
    int nRecordType = 0;
    bRet = m_PlayStream->StartPlay((__bridge void *)m_playWnd, STREAME_FILE);
    if (FALSE == bRet)
    {
        NSLog(@"start play failed");
        goto ERR_PROC;
    }
    
    if (0 == m_nStream) {
        nRecordStreamType = 1;
    }
    else if (1 == m_nStream) {
        nRecordStreamType = 2;
    }
    CLIENT_SetDeviceMode(g_loginID, DH_RECORD_STREAM_TYPE, &nRecordStreamType);
    
    
    if (m_nType == 0) {
        nRecordType = NET_RECORD_TYPE_ALL;
    }
    else if (1 == m_nType) {
        nRecordType = NET_RECORD_TYPE_ALARM;
    }
    //query all
    CLIENT_SetDeviceMode(g_loginID, DH_RECORD_TYPE, &nRecordType);
    
    m_PlayHandle = CLIENT_PlayBackByTimeEx(g_loginID, m_nChannel, &m_stuStartTime, &m_stuEndTime, NULL, cbDownLoadPos, (LDWORD)self, cbPlaybackData, (LDWORD)self);
    if (0 == m_PlayHandle)
    {
        NSLog(@"playback by time failed, error:%x", CLIENT_GetLastError());
        MSG(@"", _L(@"Playback Failed"), @"");
        goto ERR_PROC;
    }
    
    NSLog(@"playback by time success");
    m_bSlideing = FALSE;
    m_slider.continuous = YES;
    return TRUE;
    
ERR_PROC:
    if (m_PlayStream)
    {
        delete m_PlayStream;
        m_PlayStream = NULL;
    }
    
    return FALSE;
}


- (void)StartPlayTimer {
    if (!m_PlayTimer)
    {
        m_PlayTimer = [NSTimer scheduledTimerWithTimeInterval:0.5 target:self selector:@selector(OnPlayTimerProc:) userInfo:nil repeats:YES];
    }
}

- (void)StopPlayTimer {
    if (m_PlayTimer) {
        [m_PlayTimer invalidate];
        m_PlayTimer = nil;
    }
}


/*
- (void)onBtnPlay :(id)sender {

    if (sender)
    {
        m_stuStartTime.dwHour = 0;
        m_stuStartTime.dwMinute = 0;
        m_stuStartTime.dwSecond = 0;
    }
    
    if (0 == m_PlayHandle) {
        NSLog(@"play!");
        [m_playWnd setHidden:FALSE];
        PLAY_GetFreePort(&g_PlayPort);
        PLAY_SetStreamOpenMode(g_PlayPort, STREAME_FILE);
        PLAY_OpenStream(g_PlayPort, NULL, 0, 3*1024*1024);
        PLAY_Play(g_PlayPort, (__bridge void*)m_playWnd);
        PLAY_PlaySoundShare(g_PlayPort);
        
        int nRecordStreamType = m_nStream;
        CLIENT_SetDeviceMode(g_loginID, DH_RECORD_STREAM_TYPE, &nRecordStreamType);
        
        int nRecordType = NET_RECORD_TYPE_ALL;
        if (0 == m_nType) {
            nRecordType = NET_RECORD_TYPE_ALL;
        }
        else if (1 == m_nType) {
            nRecordType = NET_RECORD_TYPE_ALARM;
        }
        CLIENT_SetDeviceMode(g_loginID, DH_RECORD_TYPE, &nRecordType);
        
        self.m_PlayHandle = CLIENT_PlayBackByTimeEx(g_loginID, m_nChannel, &m_stuStartTime, &m_stuEndTime, NULL, cbDownLoadPos, (LDWORD)self, cbPlaybackData, (LDWORD)self);
        if (self.m_PlayHandle) {
            [m_btnPlay setTitle:_L(@"Pause") forState:UIControlStateNormal];
            [self EnableButton:TRUE];
            m_btnSnap.backgroundColor = [UIColor lightGrayColor];
            m_btnStop.backgroundColor = [UIColor lightGrayColor];
            m_btnNormalPlay.backgroundColor = [UIColor lightGrayColor];
            m_bSlideing = FALSE;
            m_slider.continuous = YES;
            m_slider.userInteractionEnabled = TRUE;
        }
        else {
            m_slider.value = 0;
            [m_SliderCurLabel setText:_L(@"00:00:00")];
            CGFloat xPoint = 0;
            if (kScreenWidth - xPoint < kScreenWidth/10) {
                xPoint = kScreenWidth*9/10;
            }
            else if (xPoint < kScreenWidth/10) {
                xPoint = kScreenWidth/10;
            }
            m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
            m_stuStartTime.dwHour = 0;
            m_stuStartTime.dwMinute = 0;
            m_stuStartTime.dwSecond = 0;
            MSG(@"", _L(@"Playback Failed"), @"");
        }
    }
    else {
        if (FALSE == m_bPause) {
            BOOL bRet = CLIENT_PausePlayBack(self.m_PlayHandle, TRUE);
            PLAY_Pause(g_PlayPort, TRUE);
            if (bRet) {
                m_bPause = TRUE;
                [m_btnPlay setTitle:_L(@"Play") forState:UIControlStateNormal];
                [self onBtnNormalPlay];
            }
        }
        else {
            BOOL bRet = CLIENT_PausePlayBack(self.m_PlayHandle, FALSE);
            PLAY_Pause(g_PlayPort, FALSE);
            if (bRet) {
                m_bPause = FALSE;
                [m_btnPlay setTitle:_L(@"Pause") forState:UIControlStateNormal];
            }
        }
    }
}
 */

- (NSString *)str_now
{
    time_t t;
    time(&t);
    tm* stTime = localtime(&t);
    
    NSString *str = [NSString stringWithFormat:@"%04d%02d%2d_%02d%02d%02d_ch%d",stTime->tm_year + 1900, stTime->tm_mon+1, stTime->tm_mday, stTime->tm_hour, stTime->tm_min, stTime->tm_sec, m_nChannel];
    
    return str;
}

- (void)onBtnSnap {
    NSLog(@"snap!");
    if (m_PlayHandle) {
        NSString *strFileName = [self str_now];
        const std::string strFilePath = g_docFolder + "/Snap/" + [strFileName UTF8String] + ".jpg";
        NSLog(@"111111 %s", g_docFolder.c_str());

        BOOL bRet = m_PlayStream->SnapPicture((char*)strFilePath.c_str(), PicFormat_JPEG);
        if (bRet) {
        MSG(@"", _L(@"Snap Success"), @"");
        }
        else {
            MSG(@"", _L(@"Snap Failed"), @"");
        }
    }
    else {
        MSG(@"", _L(@"Start Play First"), @"");
    }
}

- (void)onBtnStop {
    if (self.m_PlayHandle) {
        [self onBtnNormalPlay];
        [self StopPlayBackByTime];
        
        m_bPause = FALSE;
        [m_btnPause setTitle:_L(@"Pause") forState:UIControlStateNormal];
        [m_btnPlay setTitle:_L(@"Play") forState:UIControlStateNormal];
        [self EnableButton:FALSE];
        m_slider.userInteractionEnabled = FALSE;
        [m_stepper setValue:0];
        self.m_previousValue = m_stepper.value;
        m_labSpeedLevel.text = [NSString stringWithFormat:@"x1"];
        m_slider.value = 0;
        [m_SliderCurLabel setText:_L(@"00:00:00")];
        CGFloat xPoint = 0;
        if (kScreenWidth - xPoint < kScreenWidth/10) {
            xPoint = kScreenWidth*9/10;
        }
        else if (xPoint < kScreenWidth/10) {
            xPoint = kScreenWidth/10;
        }
        m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
        m_stuStartTime.dwHour = 0;
        m_stuStartTime.dwMinute = 0;
        m_stuStartTime.dwSecond = 0;
    }

}

- (void)onBtnPause {
    NSLog(@"Pause!");

    if (m_bPause)
    {
        CLIENT_PausePlayBack(m_PlayHandle, FALSE);
        m_PlayStream->PausePlay(false);
        m_bPause = FALSE;
        [m_btnPause setTitle:_L(@"Pause") forState:UIControlStateNormal];
    }
    else
    {
        CLIENT_PausePlayBack(m_PlayHandle, TRUE);
        m_PlayStream->PausePlay(true);
        m_bPause = TRUE;
        [m_btnPause setTitle:_L(@"Resume") forState:UIControlStateNormal];
    }
}

-(void) StopPlayBackByTime
{
    if (m_PlayHandle)
    {
        CLIENT_StopPlayBack(m_PlayHandle);
        m_PlayHandle = 0;
    }
    
    if (m_PlayStream)
    {
        delete m_PlayStream;
        m_PlayStream = NULL;
    }
    NSLog(@"stop play back");
}

- (void)onPlay:(id)sender
{
    if (sender)
    {
        m_stuStartTime.dwHour = 0;
        m_stuStartTime.dwMinute = 0;
        m_stuStartTime.dwSecond = 0;
    }
    
    if (!m_PlayHandle) {
        BOOL bRet = [self StartPlayBackByTime];
        if (TRUE ==  bRet)
        {
            [self EnableButton:TRUE];
            [m_btnPlay setTitle:_L(@"Stop") forState:UIControlStateNormal];
            m_slider.userInteractionEnabled = YES;
            m_slider.continuous = YES;
        }
        else
        {
            m_slider.value = 0;
            [self.m_SliderCurLabel setText:[NSString stringWithFormat:_L(@"%02d:%02d:%02d"),0,0,0]];
            CGFloat xPoint = 0;
            if (kScreenWidth - xPoint < kScreenWidth/10)
            {
                xPoint = kScreenWidth*9/10;
            }
            else if (xPoint < kScreenWidth/10)
            {
                xPoint = kScreenWidth/10;
            }
            m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
        }
    }
    else
    {
        [self EnableButton:FALSE];
        [self onBtnNormalPlay];
        [self StopPlayBackByTime];
        m_bPause = FALSE;
        [m_btnPause setTitle:_L(@"Pause") forState:UIControlStateNormal];
        if (sender)
        {
            m_slider.value = 0;
            [self.m_SliderCurLabel setText:[NSString stringWithFormat:_L(@"%02d:%02d:%02d"),0,0,0]];
            CGFloat xPoint = 0;
            if (kScreenWidth - xPoint < kScreenWidth/10)
            {
                xPoint = kScreenWidth*9/10;
            }
            else if (xPoint < kScreenWidth/10)
            {
                xPoint = kScreenWidth/10;
            }
            m_SliderCurLabel.center = CGPointMake(xPoint, m_slider.center.y+m_slider.frame.size.height/2+kScreenHeight/40);
        }
        m_slider.userInteractionEnabled = NO;
        [m_btnPlay setTitle:_L(@"Play") forState:UIControlStateNormal];
    }
}

- (void)OnSpeedChange {
    NSLog(@"%lf", m_stepper.value);
    if (m_stepper.value > self.m_previousValue) {
        NSLog(@"+");
        CLIENT_FastPlayBack(self.m_PlayHandle);
        self.m_previousValue = m_stepper.value;
        
    }
    else if (m_stepper.value < self.m_previousValue) {
        NSLog(@"-");
        CLIENT_SlowPlayBack(self.m_PlayHandle);
        self.m_previousValue = m_stepper.value;
    }

    
    if (m_PlayHandle) {
        m_PlayStream->SetPlaySpeed(exp2(m_stepper.value));
    }
    
    m_labSpeedLevel.text = [NSString stringWithFormat:@""];
    if (m_stepper.value >= 0) {
        m_labSpeedLevel.text = [NSString stringWithFormat:@"x%d", 1<<(int)m_stepper.value];
    }
    else {
        m_labSpeedLevel.text = [NSString stringWithFormat:@"x1/%d", 1<<(int)-m_stepper.value];
    }
}

- (void)onBtnNormalPlay {
    NSLog(@"onBtnNormalPlay!");

    BOOL bRet = CLIENT_NormalPlayBack(self.m_PlayHandle);
    CLIENT_SetPlayBackSpeed(self.m_PlayHandle, EM_PLAY_BACK_SPEED_NORMAL);
    m_PlayStream->SetPlaySpeed(exp2(0));
    if (bRet) {
        [m_stepper setValue:0];
        self.m_previousValue = m_stepper.value;
        m_labSpeedLevel.text = [NSString stringWithFormat:@"x1"];
    }
    else {
        MSG(@"", _L(@"Return Normal Speed Failed"), @"");
    }
    
}



- (void)onBtnDownload {
    NSLog(@"onBtnDownload!");
    [self onBtnStop];
    DownloadViewController *download = [[DownloadViewController alloc] init];
    [self.navigationController pushViewController:download animated:TRUE];
}


- (void)onBtnUnlock {
    NSLog(@"onBtnUnlock");
    [self onBtnStop];
    UnlockFileViewController *unlock = [[UnlockFileViewController alloc] init];
    [self.navigationController pushViewController:unlock animated:TRUE];
}


- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {

    if (1 == m_pickerview.tag) {
        return m_arrChannel.count;
    }
    else if (2 == m_pickerview.tag) {
        return m_arrStream.count;
    }
    else if (3 == m_pickerview.tag) {
        return m_arrType.count;
    }
    return 0;
}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{

    if (1 == m_pickerview.tag) {
        return [m_arrChannel objectAtIndex:row];
    }
    else if (2 == m_pickerview.tag) {
        return [m_arrStream objectAtIndex:row];
    }
    else if (3 == m_pickerview.tag) {
        return [m_arrType objectAtIndex:row];
    }
    return @"";
}

// 由于touchesEnded有时会在didSelectRow还没来得及执行前先执行（目前根因还没找到）, 因此增加两个判断标志，使得无论怎样都会执行判断码流，通道，录像类型有无变化和onBtnPlay
-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    m_bPickFlag = TRUE;
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
    else if (3 == pickerView.tag) {
        [m_arrType objectAtIndex:row];
        m_nType = (int)row;
        NSLog(@"Row m_nType is %d", m_nType);
        [m_btnType setTitle:[m_arrType objectAtIndex:row]forState:UIControlStateNormal];
    }
    if (m_bTouchesEnded) {
        NSLog(@"pick m_nPreChannel is %d", m_nPreChannel);
        NSLog(@"pick m_nChannel is %d", m_nChannel);
        NSLog(@"pick m_nPreStream is %d", m_nPreStream);
        NSLog(@"pick m_nStream is %d", m_nStream);
        NSLog(@"pick m_nPreType is %d", m_nPreType);
        NSLog(@"pikc m_nType is %d", m_nType);
        if (m_nChannel != m_nPreChannel || m_nStream != m_nPreStream || m_nType != m_nPreType) {
            [self onBtnStop];
        }
        m_nPreChannel = m_nChannel;
        m_nPreStream = m_nStream;
        m_nPreType = m_nType;
        m_bTouchesEnded = FALSE;
    }
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    NSLog(@"m_bPickFlag is %d", m_bPickFlag);
    if (FALSE == m_pickerview.isHidden) {
        [m_pickerview setHidden:TRUE];
        [m_btnPlay setEnabled:TRUE];
        if (m_bPickFlag) {
            NSLog(@"m_nPreChannel is %d", m_nPreChannel);
            NSLog(@"m_nChannel is %d", m_nChannel);
            NSLog(@"m_nPreStream is %d", m_nPreStream);
            NSLog(@"m_nStream is %d", m_nStream);
            NSLog(@"m_nPreType is %d", m_nPreChannel);
            NSLog(@"m_nPreChannel is %d", m_nType);
            if (m_nChannel != m_nPreChannel || m_nStream != m_nPreStream || m_nType != m_nPreType) {
                [self onBtnStop];
            }
            m_nPreChannel = m_nChannel;
            m_nPreStream = m_nStream;
            m_nPreType = m_nType;
            m_bPickFlag = FALSE;
        }
        m_bTouchesEnded = TRUE;

    }
    if (FALSE == m_datepicker.isHidden) {
        NSDateFormatter *formatter = [[NSDateFormatter alloc] init];
        formatter.dateFormat = @"yyyy-MM-dd";
        NSString *dateStr = [formatter stringFromDate:m_datepicker.date];
            m_labStartTime.text = dateStr;
            NSCalendar* calendar = [NSCalendar currentCalendar];
            NSDateComponents* dateComp = [calendar components:(NSCalendarUnitYear|NSCalendarUnitMonth|NSCalendarUnitDay|NSCalendarUnitHour|NSCalendarUnitMinute|NSCalendarUnitSecond) fromDate:m_datepicker.date];
            m_stuStartTime.dwYear = (DWORD)[dateComp year];
            m_stuStartTime.dwMonth = (DWORD)[dateComp month];
            m_stuStartTime.dwDay = (DWORD)[dateComp day];
            m_stuStartTime.dwHour = 0;
            m_stuStartTime.dwMinute = 0;
            m_stuStartTime.dwSecond = 0;
            m_stuEndTime.dwYear = (DWORD)[dateComp year];
            m_stuEndTime.dwMonth = (DWORD)[dateComp month];
            m_stuEndTime.dwDay = (DWORD)[dateComp day];
            m_stuEndTime.dwHour = 23;
            m_stuEndTime.dwMinute = 59;
            m_stuEndTime.dwSecond = 59;

        [m_datepicker setHidden:TRUE];
    }
    [self onShowSubview:FALSE];
}


- (void) didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {

        [self onBtnStop];
        m_bPause = FALSE;
        [m_SliderCurLabel setText:_L(@"00:00:00")];
        m_SliderCurLabel.center = CGPointMake(kScreenWidth/10, m_slider.center.y+m_slider.frame.size.height/2+20);
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
