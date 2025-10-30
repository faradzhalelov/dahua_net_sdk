//
//  VideoTalkViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/24.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "VideoTalkViewController.h"
#import "VideoWnd.h"
#import "playEx.h"
#import "Global.h"
#import "DHHudPrecess.h"

static LONG g_PlayPort = 100;
static LONG g_TalkPort = 0;
static BOOL m_bPlay = FALSE;

@interface VideoTalkViewController ()<UIPickerViewDelegate, UIPickerViewDataSource, UITextFieldDelegate>

@property (strong, nonatomic) UIButton *m_btnChannel;
@property (strong, nonatomic) UIButton *m_btnStream;
@property (strong, nonatomic) VideoWnd *m_playWnd;
@property (strong, nonatomic) UIButton *m_btnPlay;
@property (strong, nonatomic) UIButton *m_btnOpenDoor;
@property (strong, nonatomic) UIPickerView *m_pickerview;
@property (nonatomic) int m_nChannel;
@property (nonatomic) int m_nStream;
@property (nonatomic) int m_nPreChannel;
@property (nonatomic) int m_nPreStream;
@property (nonatomic) int m_nPlayPort;
@property (nonatomic) long m_playHandle;
@property (nonatomic) long m_TalkHandle;
@property (nonatomic) BOOL m_bPickFlag;
@property (nonatomic) BOOL m_bTouchesEnded;
@property (nonatomic) NSMutableArray *m_arrChannel;
@property (nonatomic) NSMutableArray *m_arrStream;
@end

@implementation VideoTalkViewController

@synthesize m_btnChannel, m_btnStream, m_playWnd, m_btnPlay, m_btnOpenDoor, m_pickerview,
            m_nChannel, m_nStream, m_nPreChannel, m_nPreStream, m_nPlayPort, m_playHandle, m_arrChannel, m_arrStream, m_TalkHandle, m_bPickFlag, m_bTouchesEnded;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Video Talk");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    m_bPickFlag = FALSE;
    m_bTouchesEnded = FALSE;
    
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
    m_btnStream.layer.cornerRadius = 10;
    m_btnStream.layer.borderWidth = 1;
    [self.view addSubview:m_btnStream];
    
    m_playWnd = [[VideoWnd alloc] init];
    m_playWnd.backgroundColor = [UIColor whiteColor];//BASE_BACKGROUND_COLOR;
    m_playWnd.frame = CGRectMake(0, 0, kScreenWidth, kScreenWidth*0.75);
    m_playWnd.center = CGPointMake(kScreenWidth/2, m_btnChannel.center.y + m_btnChannel.frame.size.height/2 + m_playWnd.frame.size.height/2);
    m_playWnd.layer.borderWidth = 1;
    [self.view addSubview:m_playWnd];
    
    m_btnPlay = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnPlay.center = CGPointMake(kScreenWidth/4, kScreenHeight*0.8);
    m_btnPlay.backgroundColor = [UIColor lightGrayColor];
    [m_btnPlay setTitle:_L(@"Start Video Talk") forState:UIControlStateNormal];
    [m_btnPlay addTarget:self action:@selector(onBtnPlay) forControlEvents:UIControlEventTouchUpInside];
    [m_btnPlay setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnPlay.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnPlay.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnPlay.layer.cornerRadius = 10;
    m_btnPlay.layer.borderWidth = 1;
    [self.view addSubview:m_btnPlay];
    
    m_btnOpenDoor = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth/3, kScreenHeight/20)];
    m_btnOpenDoor.center = CGPointMake(kScreenWidth*3/4, kScreenHeight*0.8);
    m_btnOpenDoor.backgroundColor = [UIColor lightGrayColor];
    [m_btnOpenDoor setTitle:_L(@"Open Door") forState:UIControlStateNormal];
    [m_btnOpenDoor addTarget:self action:@selector(onBtnOpenDoor) forControlEvents:UIControlEventTouchUpInside];
    [m_btnOpenDoor setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnOpenDoor.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnOpenDoor.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    m_btnOpenDoor.layer.cornerRadius = 10;
    m_btnOpenDoor.layer.borderWidth = 1;
    [self.view addSubview:m_btnOpenDoor];
    
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
    
}



- (void)onBtnChannel {
    
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [m_pickerview setHidden:FALSE];
        [m_btnChannel setEnabled:FALSE];
        [m_btnStream setEnabled:FALSE];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
        m_btnChannel.backgroundColor = BASE_COLOR;
        [m_btnPlay setEnabled:NO];
        [m_btnOpenDoor setEnabled:NO];
    }
}

- (void)onBtnStream {
    if (TRUE == m_pickerview.isHidden) {
        m_bPickFlag = FALSE;
        m_bTouchesEnded = FALSE;
        [m_pickerview setHidden:FALSE];
        [m_btnChannel setEnabled:FALSE];
        [m_btnStream setEnabled:FALSE];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nStream inComponent:0 animated:TRUE];
        m_btnStream.backgroundColor = BASE_COLOR;
        [m_btnPlay setEnabled:NO];
        [m_btnOpenDoor setEnabled:NO];
    }
}

static void CALLBACK AudioCallFunction(LPBYTE pDataBuffer, DWORD DataLength, void* pUserData){
    char* pCbData = NULL;
    pCbData = new char[102400];
    if (NULL == pCbData)
    {
        return;
    }
    int  iCbLen = 0;
    
    pCbData[0]=0x00;
    pCbData[1]=0x00;
    pCbData[2]=0x01;
    pCbData[3]=0xF0;
    
    pCbData[4]=0x0C;
    pCbData[5]=0x02;
    
    *(DWORD*)(pCbData+6)=DataLength;
    memcpy(pCbData+8, pDataBuffer, DataLength);
    
    iCbLen = 8+DataLength;
    CLIENT_TalkSendData(*(LLONG*)pUserData, (char*)pCbData, iCbLen);
    delete pCbData;
    pCbData = NULL;
}
-(BOOL) StartAudioRecord
{
    //定义帧长
    int nFrameLength = 1024;
    BOOL bRet = FALSE;
    
    //    Then call PLAYSDK library to begin recording audio
    bool bOpenRet = PLAY_OpenStream(g_TalkPort,0,0,1024*100);
    if(bOpenRet)
    {
        BOOL bPlayRet = PLAY_Play(g_TalkPort,0);
        if(bPlayRet)
        {
            PLAY_PlaySoundShare(g_TalkPort);
            BOOL bSuccess = PLAY_OpenAudioRecord(AudioCallFunction,16,8000,nFrameLength,0,&m_TalkHandle);
            if(bSuccess)
            {
                bRet = TRUE;
            }
            else
            {
                PLAY_StopSoundShare(g_TalkPort);
                PLAY_Stop(g_TalkPort);
                PLAY_CloseStream(g_TalkPort);
            }
        }
        else
        {
            PLAY_CloseStream(g_TalkPort);
        }
    }
    return bRet;
}

-(void)stopAudioRecord {
    PLAY_CloseAudioRecord();
    PLAY_Stop(g_TalkPort);
    PLAY_StopSoundShare(g_TalkPort);
    PLAY_CloseStream(g_TalkPort);
}

- (void)onStartTalk {
 
    DHDEV_TALKDECODE_INFO stuTalkMode = {};
    stuTalkMode.encodeType = DH_TALK_PCM;
    stuTalkMode.dwSampleRate = 8000;
    stuTalkMode.nAudioBit = 16;
    stuTalkMode.nPacketPeriod = 25;
    CLIENT_SetDeviceMode(g_loginID, DH_TALK_ENCODE_TYPE, &stuTalkMode);
    
    CLIENT_SetDeviceMode(g_loginID, DH_TALK_CLIENT_MODE, NULL);
    
    NET_SPEAK_PARAM stParam = {sizeof(stParam)};
    stParam.nMode = 0;
    stParam.bEnableWait = NO;
    CLIENT_SetDeviceMode(g_loginID, DH_TALK_SPEAK_PARAM, &stParam);
    
    BOOL bRet = [self StartAudioRecord];
    if (bRet) {
        m_TalkHandle = CLIENT_StartTalkEx(g_loginID, AudioDataCallBack,(LDWORD)self);
        if(m_TalkHandle == 0){
            CLIENT_StopTalkEx(m_TalkHandle);
        }
    }

}

- (void)onStopTalk {
    [self stopAudioRecord];
    CLIENT_StopTalkEx(m_TalkHandle);
    m_TalkHandle = 0;
}


static void CALLBACK AudioDataCallBack(LLONG lTalkHandle, char *pDataBuf, DWORD dwBufSize, BYTE byAudioFlag, LDWORD dwUser){
    if (1 == byAudioFlag) {
        PLAY_InputData(g_TalkPort, (BYTE*)pDataBuf, dwBufSize);
    }
}

static void CALLBACK realDataCallback(LLONG lRealHandle, DWORD dwDataType, BYTE *pBuffer, DWORD dwBufSize, LDWORD dwUser) {
    
    PLAY_InputData(g_PlayPort, pBuffer, dwBufSize);
}


- (void)onBtnPlay {
    
    if (FALSE ==  m_bPlay) {
        [m_playWnd setHidden:FALSE];
        PLAY_GetFreePort(&g_PlayPort);
        PLAY_OpenStream(g_PlayPort, nil, 0, 3*1024*1024);
        PLAY_Play(g_PlayPort, (__bridge void*)m_playWnd);
        
        DH_RealPlayType emStream = DH_RType_Realplay_0;
        if (0 == m_nStream) {
            emStream = DH_RType_Realplay_0;
        }
        else {
            emStream = DH_RType_Realplay_1;
        }
        m_playHandle = CLIENT_RealPlayEx(g_loginID, m_nChannel, NULL, emStream);
        if (m_playHandle) {
            CLIENT_SetRealDataCallBack(m_playHandle, realDataCallback, (LDWORD)self);
            m_bPlay = TRUE;
            [m_btnPlay setTitle:_L(@"Stop Video Talk") forState:UIControlStateNormal];
            m_btnPlay.backgroundColor = BASE_COLOR;
            [self onStartTalk];
        }
        else {
            MSG(@"", _L(@"Start Real Play Failed"), @"");
        }
    }
    else {
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
        [m_btnPlay setTitle:_L(@"Start Video Talk") forState:UIControlStateNormal];
        m_btnPlay.backgroundColor = [UIColor lightGrayColor];
        [self onStopTalk];
    }
}

- (void) onBtnOpenDoor {
    
    NET_CTRL_ACCESS_OPEN st = {sizeof(st)};
    st.nChannelID = m_nChannel;
    BOOL bRet = CLIENT_ControlDevice(g_loginID, DH_CTRL_ACCESS_OPEN, &st, TIME_OUT);
    if (bRet) {
        MSG(@"", _L(@"Open Door Success"), @"");
    }
    else {
        NSLog(@"CLIENT_ControlDevice Failed, error is %x", CLIENT_GetLastError());
        MSG(@"", _L(@"Open Door Failed"), @"");
    }
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
    m_bPickFlag = TRUE;
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
    if (m_bTouchesEnded) {
        if (m_bPlay) {
            NSLog(@"pick current m_nPreStream is %d", m_nPreStream);
            NSLog(@"pick current m_nStream is %d", m_nStream);
            NSLog(@"pick current m_nPreChannel is %d", m_nPreChannel);
            NSLog(@"pick current m_nChannel is %d", m_nChannel);
            if (m_nPreChannel != m_nChannel || m_nPreStream != m_nStream
                ) {
                [self onBtnPlay];
            }
        }
        m_nPreChannel = m_nChannel;
        m_nPreStream = m_nStream;
        m_bTouchesEnded = FALSE;
    }
    
}


- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    NSLog(@"m_bPickFlag is %d", m_bPickFlag);
    if (FALSE == m_pickerview.isHidden) {
        if (m_bPickFlag) {
            if (m_bPlay) {
                NSLog(@"current m_nPreStream is %d", m_nPreStream);
                NSLog(@"current m_nStream is %d", m_nStream);
                if (m_nPreChannel != m_nChannel || m_nPreStream != m_nStream
                    ) {
                    [self onBtnPlay];
                }
            }
            m_nPreChannel = m_nChannel;
            m_nPreStream = m_nStream;
            m_bPickFlag = FALSE;
        }

        m_bTouchesEnded = TRUE;
        [m_pickerview setHidden:TRUE];
        [m_btnChannel setEnabled:TRUE];
        [m_btnStream setEnabled:TRUE];
        m_btnChannel.backgroundColor = [UIColor lightGrayColor];
        m_btnStream.backgroundColor = [UIColor lightGrayColor];
    }

    [m_btnChannel setEnabled:YES];
    [m_btnStream setEnabled:YES];
    [m_btnPlay setEnabled:YES];
    [m_btnOpenDoor setEnabled:YES];

}


- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    if (!parent) {
        if (m_bPlay) {
            [self onBtnPlay];
        }
        [m_pickerview setHidden:YES];
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
