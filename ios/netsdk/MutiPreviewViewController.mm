//
//  DoublePreviewViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/11.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "MutiPreviewViewController.h"
#import "netsdk.h"
#import "playEx.h"
#import "DHHudPrecess.h"
#import "Global.h"
#import "VideoWnd.h"




@interface MutiPreviewViewController ()<UIPickerViewDelegate, UIPickerViewDataSource>

@property (strong, nonatomic) UIButton *m_btnChannel1;
@property (strong, nonatomic) UIButton *m_btnStream1;
@property (strong, nonatomic) UIButton *m_btnPlay1;
@property (strong, nonatomic) VideoWnd *m_playWnd1;

@property (strong, nonatomic) UIButton *m_btnChannel2;
@property (strong, nonatomic) UIButton *m_btnStream2;
@property (strong, nonatomic) UIButton *m_btnPlay2;
@property (strong, nonatomic) VideoWnd *m_playWnd2;

@property (strong, nonatomic) UIPickerView *m_pickerview;

@property (nonatomic) int m_nChannel1;
@property (nonatomic) int m_nStream1;
@property (nonatomic) int m_nPreChannel1;
@property (nonatomic) int m_nPreStream1;
@property (nonatomic) int m_nPlayPort1;
@property (nonatomic) long m_playHandle1;
@property (nonatomic) NSMutableArray *m_arrChannel1;
@property (nonatomic) NSMutableArray *m_arrStream1;

@property (nonatomic) int m_nChannel2;
@property (nonatomic) int m_nStream2;
@property (nonatomic) int m_nPreChannel2;
@property (nonatomic) int m_nPreStream2;
@property (nonatomic) int m_nPlayPort2;
@property (nonatomic) long m_playHandle2;
@property (nonatomic) NSMutableArray *m_arrChannel2;
@property (nonatomic) NSMutableArray *m_arrStream2;

@property (nonatomic) BOOL m_bPlay1;
@property (nonatomic) BOOL m_bPlay2;
@property (nonatomic) BOOL m_bPickFlag;
@property (nonatomic) BOOL m_bTouchesEnded;
@end

@implementation MutiPreviewViewController

@synthesize m_btnChannel1, m_btnStream1, m_btnPlay1, m_playWnd1, m_btnChannel2, m_btnStream2, m_btnPlay2, m_playWnd2, m_pickerview, m_nChannel1, m_nStream1, m_nPlayPort1, m_playHandle1, m_arrChannel1, m_arrStream1, m_nChannel2, m_nStream2, m_nPlayPort2, m_playHandle2,  m_arrChannel2, m_arrStream2, m_bPlay1, m_bPlay2, m_nPreChannel1, m_nPreStream1, m_nPreChannel2, m_nPreStream2, m_bPickFlag, m_bTouchesEnded;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Live Preview(Double Channel)");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    m_nChannel1 = 0;
    m_nStream1 = 0;
    m_nPreChannel1 = 0;
    m_nPreStream1 = 0;
    m_nPlayPort1 = 0;
    m_playHandle1 = 0;
    m_nChannel2 = 0;
    m_nStream2 = 0;
    m_nPreChannel2 = 0;
    m_nPreStream2 = 0;
    m_nPlayPort2 = 0;
    m_playHandle2 = 0;
    m_bPlay1 = FALSE;
    m_bPlay2 = FALSE;
    m_bPickFlag = FALSE;
    m_bTouchesEnded = FALSE;
    
    m_arrChannel1 = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel1 addObject:[[NSString alloc] initWithFormat:_L(@"Channel%d"), i]];
    }
    
    m_arrStream1 = [[NSMutableArray alloc] initWithObjects:_L(@"Main"), _L(@"Extra"), nil];
    
    m_arrChannel2 = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel2 addObject:[[NSString alloc] initWithFormat:_L(@"Channel%d"), i]];
    }
    
    m_arrStream2 = [[NSMutableArray alloc] initWithObjects:_L(@"Main"), _L(@"Extra"), nil];

    
    m_btnChannel1 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnChannel1.center = CGPointMake(kScreenWidth*1/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnChannel1.backgroundColor = [UIColor lightGrayColor];
    NSString *str1 = [NSString stringWithFormat:_L(@"Channel%d"), 0];
    m_btnChannel1.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [m_btnChannel1 setTitle:str1 forState:UIControlStateNormal];
    [m_btnChannel1 addTarget:self action:@selector(onBtnChannel1) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel1 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel1.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnChannel1.layer.cornerRadius = 10;
    m_btnChannel1.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel1];
    
    m_btnStream1 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnStream1.center = CGPointMake(kScreenWidth*3/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnStream1.backgroundColor = [UIColor lightGrayColor];
    [m_btnStream1 setTitle:_L(@"Main") forState:UIControlStateNormal];
    [m_btnStream1 addTarget:self action:@selector(onBtnStream1) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStream1 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStream1.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStream1.layer.cornerRadius = 10;
    m_btnStream1.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream1];
    
    m_btnPlay1 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnPlay1.center = CGPointMake(kScreenWidth*5/6, kScreenHeight/40+kNavigationBarHeight);
    m_btnPlay1.backgroundColor = [UIColor lightGrayColor];
    [m_btnPlay1 setTitle:_L(@"Start Play") forState:UIControlStateNormal];
    [m_btnPlay1 addTarget:self action:@selector(onBtnPlay1) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPlay1 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPlay1.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnPlay1.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPlay1.layer.cornerRadius = 10;
    m_btnPlay1.layer.borderWidth = 1;
    [self.view addSubview:m_btnPlay1];
    
    m_playWnd1 = [[VideoWnd alloc] init];
    m_playWnd1.backgroundColor = [UIColor whiteColor];
    m_playWnd1.frame = CGRectMake(0, 0, kScreenWidth*0.9, kScreenWidth*0.9*0.75);
    m_playWnd1.center = CGPointMake(kScreenWidth/2, m_btnChannel1.center.y + m_btnChannel1.frame.size.height/2 + m_playWnd1.frame.size.height/2);
    //m_playWnd1.layer.borderWidth = 1;
    [self.view addSubview:m_playWnd1];
    
    m_btnChannel2 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnChannel2.center = CGPointMake(kScreenWidth*1/6, m_playWnd1.center.y + m_btnChannel1.frame.size.height/2 + m_playWnd1.frame.size.height/2);
    m_btnChannel2.backgroundColor = [UIColor lightGrayColor];
    NSString *str2 = [NSString stringWithFormat:_L(@"Channel%d"), 0];
    [m_btnChannel2 setTitle:str2 forState:UIControlStateNormal];
    m_btnChannel2.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    [m_btnChannel2 addTarget:self action:@selector(onBtnChannel2) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel2 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel2.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnChannel2.layer.cornerRadius = 10;
    m_btnChannel2.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel2];
    
    m_btnStream2 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnStream2.center = CGPointMake(kScreenWidth*3/6, m_playWnd1.center.y + m_btnChannel1.frame.size.height/2 + m_playWnd1.frame.size.height/2);
    m_btnStream2.backgroundColor = [UIColor lightGrayColor];
    [m_btnStream2 setTitle:_L(@"Main") forState:UIControlStateNormal];
    [m_btnStream2 addTarget:self action:@selector(onBtnStream2) forControlEvents:UIControlEventTouchUpInside];
    [m_btnStream2 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnStream2.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnStream2.layer.cornerRadius = 10;
    m_btnStream2.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream2];
    
    m_btnPlay2 = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnPlay2.center = CGPointMake(kScreenWidth*5/6, m_playWnd1.center.y + m_btnChannel1.frame.size.height/2 + m_playWnd1.frame.size.height/2);
    m_btnPlay2.backgroundColor = [UIColor lightGrayColor];
    [m_btnPlay2 setTitle:_L(@"Start Play") forState:UIControlStateNormal];
    [m_btnPlay2 addTarget:self action:@selector(onBtnPlay2) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPlay2 setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPlay2.titleLabel.font = [UIFont systemFontOfSize:24];
    m_btnPlay2.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPlay2.layer.cornerRadius = 10;
    m_btnPlay2.layer.borderWidth = 1;
    [self.view addSubview:m_btnPlay2];
    
    m_playWnd2 = [[VideoWnd alloc] init];
    m_playWnd2.backgroundColor = [UIColor whiteColor];
    m_playWnd2.frame = CGRectMake(0, 0, kScreenWidth*0.9, kScreenWidth*0.9*3/4);
    m_playWnd2.center = CGPointMake(kScreenWidth/2, m_btnChannel2.center.y + m_btnChannel2.frame.size.height/2 + m_playWnd2.frame.size.height/2);
    //m_playWnd2.layer.borderWidth = 1;
    [self.view addSubview:m_playWnd2];
    
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = YES;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    
}

- (void) HiddenButtons :(BOOL)bFlags {
    [m_btnChannel1 setHidden:bFlags];
    [m_btnStream1 setHidden:bFlags];
    [m_btnPlay1 setHidden:bFlags];
    [m_btnChannel2 setHidden:bFlags];
    [m_btnStream2 setHidden:bFlags];
    [m_btnPlay2 setHidden:bFlags];

    [m_playWnd1 setHidden:bFlags];
    [m_playWnd2 setHidden:bFlags];
}
- (void) onBtnChannel1 {
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self HiddenButtons:TRUE];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel1 inComponent:0 animated:TRUE];
    }
}

- (void) onBtnStream1 {
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self HiddenButtons:TRUE];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream1 inComponent:0 animated:TRUE];
    }
}

- (void) onBtnChannel2 {
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self HiddenButtons:TRUE];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 3;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel2 inComponent:0 animated:TRUE];
    }
}

- (void) onBtnStream2 {
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [self HiddenButtons:TRUE];
        [m_pickerview setHidden:FALSE];
        m_pickerview.tag = 4;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream2 inComponent:0 animated:TRUE];
    }
}

void CALLBACK realDataCallback1(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LDWORD dwUser) {
    
    MutiPreviewViewController* pself = (__bridge  MutiPreviewViewController*)(void *)dwUser;
    
    
    if (pself.m_playHandle1 == lRealHandle) {
        PLAY_InputData(pself.m_nPlayPort1, pBuffer, dwBufSize);
    }
    else if (pself.m_playHandle2 == lRealHandle){
        PLAY_InputData(pself.m_nPlayPort2, pBuffer, dwBufSize);
    }
    
}

- (void) onBtnPlay1 {
    if (FALSE ==  m_bPlay1) {
        [m_playWnd1 setHidden:FALSE];
        PLAY_GetFreePort(&m_nPlayPort1);
        PLAY_OpenStream(m_nPlayPort1, nil, 0, 3*1024*1024);
        PLAY_Play(m_nPlayPort1, (__bridge void*)m_playWnd1);
 
        DH_RealPlayType emStream = DH_RType_Realplay_0;
        if (0 == m_nStream1) {
            emStream = DH_RType_Realplay_0;
        }
        else {
            emStream = DH_RType_Realplay_1;
        }
        m_playHandle1 = CLIENT_RealPlayEx(g_loginID, m_nChannel1, NULL, emStream);
        if (m_playHandle1) {
            CLIENT_SetRealDataCallBack(m_playHandle1, realDataCallback1, (LDWORD)self);
            m_bPlay1 = TRUE;
            [m_btnPlay1 setTitle:_L(@"Stop Play") forState:UIControlStateNormal];
        }
        else {
            
        }
    }
    else {
        [m_playWnd1 setHidden:TRUE];
        CLIENT_StopRealPlayEx(m_playHandle1);
        m_playHandle1 = 0;
        PLAY_CleanScreen(m_nPlayPort1, 236/255.0, 236/255.0, 244/255.0, 1, 0);
        PLAY_Stop(m_nPlayPort1);
        PLAY_CloseStream(m_nPlayPort1);
        PLAY_ResetBuffer(m_nPlayPort1, 0);
        PLAY_ResetBuffer(m_nPlayPort1, 1);
        PLAY_ResetBuffer(m_nPlayPort1, 2);
        PLAY_ResetBuffer(m_nPlayPort1, 3);
        m_bPlay1 = FALSE;
        [m_btnPlay1 setTitle:_L(@"Start Play") forState:UIControlStateNormal];
    }
}

- (void) onBtnPlay2 {
    if (FALSE ==  m_bPlay2) {
        [m_playWnd2 setHidden:FALSE];
        PLAY_GetFreePort(&m_nPlayPort2);
        PLAY_OpenStream(m_nPlayPort2, nil, 0, 3*1024*1024);
        PLAY_Play(m_nPlayPort2, (__bridge void*)m_playWnd2);
        
        DH_RealPlayType emStream = DH_RType_Realplay_0;
        if (0 == m_nStream2) {
            emStream = DH_RType_Realplay_0;
        }
        else {
            emStream = DH_RType_Realplay_1;
        }
        m_playHandle2 = CLIENT_RealPlayEx(g_loginID, m_nChannel2, NULL, emStream);
        if (m_playHandle2) {
            CLIENT_SetRealDataCallBack(m_playHandle2, realDataCallback1, (LDWORD)self);
            m_bPlay2 = TRUE;
            [m_btnPlay2 setTitle:_L(@"Stop Play") forState:UIControlStateNormal];
        }
        else {
            
        }
    }
    else {
        [m_playWnd2 setHidden:TRUE];
        CLIENT_StopRealPlayEx(m_playHandle2);
        m_playHandle2 = 0;
        PLAY_CleanScreen(m_nPlayPort2, 236/255.0, 236/255.0, 244/255.0, 1, 0);
        PLAY_Stop(m_nPlayPort2);
        PLAY_CloseStream(m_nPlayPort2);
        PLAY_ResetBuffer(m_nPlayPort2, 0);
        PLAY_ResetBuffer(m_nPlayPort2, 1);
        PLAY_ResetBuffer(m_nPlayPort2, 2);
        PLAY_ResetBuffer(m_nPlayPort2, 3);
        m_bPlay2 = FALSE;
        [m_btnPlay2 setTitle:_L(@"Start Play") forState:UIControlStateNormal];
    }
}


- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {
    
    if (1 == m_pickerview.tag) {
        return m_arrChannel1.count;
    }
    else if (2 == m_pickerview.tag) {
        return m_arrStream1.count;
    }
    else if (3 == m_pickerview.tag) {
        return m_arrChannel2.count;
    }
    else {
        return m_arrStream2.count;
    }
    
}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{
    
    if (1 == m_pickerview.tag) {
        return [m_arrChannel1 objectAtIndex:row];
    }
    else if (2 == m_pickerview.tag) {
        return [m_arrStream1 objectAtIndex:row];
    }
    else if (3 == m_pickerview.tag) {
        return [m_arrChannel2 objectAtIndex:row];
    }
    else {
        return [m_arrStream2 objectAtIndex:row];
    }
}

// 由于touchesEnded有时会在didSelectRow还没来得及执行前先执行（目前根因还没找到）, 因此增加两个判断标志，使得无论怎样都会执行判断码流，通道，录像类型有无变化和onBtnPlay
-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    m_bPickFlag = TRUE;
    NSLog(@"Enter pickerView didSelectRow");
    if (1 == pickerView.tag) {
        [m_arrChannel1 objectAtIndex:row];
        m_nChannel1 = (int)row;
        NSLog(@"Row m_nChannel1 is %d", m_nChannel1);
        [m_btnChannel1 setTitle:[m_arrChannel1 objectAtIndex:row]forState:UIControlStateNormal];
    }
    else if (2 == pickerView.tag) {
        [m_arrStream1 objectAtIndex:row];
        m_nStream1 = (int)row;
        NSLog(@"Row m_nStream1 is %d", m_nStream1);
        [m_btnStream1 setTitle:[m_arrStream1 objectAtIndex:row]forState:UIControlStateNormal];
    }
    else if (3 == pickerView.tag) {
        [m_arrChannel2 objectAtIndex:row];
        m_nChannel2 = (int)row;
        NSLog(@"Row m_nChannel2 is %d", m_nChannel2);
        [m_btnChannel2 setTitle:[m_arrChannel2 objectAtIndex:row]forState:UIControlStateNormal];
    }
    else if (4 == pickerView.tag) {
        [m_arrStream2 objectAtIndex:row];
        m_nStream2 = (int)row;
        NSLog(@"Row m_nStream2 is %d", m_nStream2);
        [m_btnStream2 setTitle:[m_arrStream2 objectAtIndex:row]forState:UIControlStateNormal];
    }
    if (m_bTouchesEnded) {
        if (m_bPlay1) {
            NSLog(@"pick current m_nPreStream1 is %d", m_nPreStream1);
            NSLog(@"pick current m_nStream1 is %d", m_nStream1);
            NSLog(@"pick current m_nPreChannel1 is %d", m_nPreChannel1);
            NSLog(@"pick current m_nChannel1 is %d", m_nChannel1);
            if (m_nPreChannel1 != m_nChannel1 || m_nPreStream1 != m_nStream1
                ) {
                [self onBtnPlay1];
            }
        }
        if (m_bPlay2) {
            NSLog(@"pick current m_nPreStream2 is %d", m_nPreStream2);
            NSLog(@"pick current m_nStream2 is %d", m_nStream2);
            NSLog(@"pick current m_nPreChannel2 is %d", m_nPreChannel2);
            NSLog(@"pick current m_nChannel2 is %d", m_nChannel2);
            if (m_nPreChannel2 != m_nChannel2 || m_nPreStream2 != m_nStream2
                ) {
                [self onBtnPlay2];
            }
        }
        m_nPreChannel1 = m_nChannel1;
        m_nPreStream1 = m_nStream1;
        m_nPreChannel2 = m_nChannel2;
        m_nPreStream2 = m_nStream2;
        m_bTouchesEnded = FALSE;
    }
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    NSLog(@"m_bPickFlag is %d", m_bPickFlag);
    if (FALSE == m_pickerview.isHidden) {
        if (m_bPickFlag) {
            if (m_bPlay1) {
                NSLog(@"current m_nPreStream1 is %d", m_nPreStream1);
                NSLog(@"current m_nStream1 is %d", m_nStream1);
                if (m_nPreChannel1 != m_nChannel1 || m_nPreStream1 != m_nStream1
                    ) {
                    [self onBtnPlay1];
                }
            }
            if (m_bPlay2) {
                NSLog(@"current m_nPreStream2 is %d", m_nPreStream2);
                NSLog(@"current m_nStream2 is %d", m_nStream2);
                if (m_nPreChannel2 != m_nChannel2 || m_nPreStream2 != m_nStream2
                    ) {
                    [self onBtnPlay2];
                }
            }
            m_nPreChannel1 = m_nChannel1;
            m_nPreStream1 = m_nStream1;
            m_nPreChannel2 = m_nChannel2;
            m_nPreStream2 = m_nStream2;
            m_bPickFlag = FALSE;
        }
        
        m_bTouchesEnded = TRUE;
        [m_pickerview setHidden:TRUE];
        [self HiddenButtons:FALSE];
    }
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        if (m_bPlay1) {
            [self onBtnPlay1];
        }
        if (m_bPlay2) {
            [self onBtnPlay2];
        }
        [m_pickerview setHidden:TRUE];
        [self HiddenButtons:FALSE];
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
