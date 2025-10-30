//
//  SnapManagerViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/6.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "TalkViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "playEx.h"

static LLONG g_TalkHandle = 0;
static int m_nPort = 99;

@interface TalkViewController ()<UIPickerViewDelegate, UIPickerViewDataSource>

@property (strong, nonatomic) UIButton *m_btnMode;
@property (strong, nonatomic) UIButton *m_btnChannel;
@property (strong, nonatomic) UIButton *m_btnTalk;

@property (strong, nonatomic) UIPickerView *m_pickerview;

@property (nonatomic) int m_nMode;
@property (nonatomic) int m_nChannel;
@property (nonatomic) BOOL m_bTalk;

@property (nonatomic) NSMutableArray *m_arrMode;
@property (nonatomic) NSMutableArray *m_arrChannel;

@end

@implementation TalkViewController

@synthesize m_btnMode, m_btnChannel, m_btnTalk, m_pickerview, m_nMode, m_nChannel, m_bTalk, m_arrMode, m_arrChannel;

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Talk");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    m_nMode = 0;
    m_nChannel = 0;
    m_bTalk = FALSE;
    
    UILabel* m_labTitle = [[UILabel alloc]initWithFrame:CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20)];
    m_labTitle.center = CGPointMake(kScreenWidth/4, kScreenHeight*0.15);
    m_labTitle.text = _L(@"Talk Mode");
    m_labTitle.font = [UIFont systemFontOfSize:24];
    m_labTitle.textAlignment = NSTextAlignmentCenter;
    m_labTitle.adjustsFontSizeToFitWidth = YES;
    m_labTitle.backgroundColor = [UIColor lightGrayColor];
    m_labTitle.layer.borderWidth = 1;
    [self.view addSubview:m_labTitle];
    
    UILabel* m_labTitle2 = [[UILabel alloc]initWithFrame:CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20)];
    m_labTitle2.center = CGPointMake(kScreenWidth/4, kScreenHeight*0.25);
    m_labTitle2.text = _L(@"Channel");
    m_labTitle2.font = [UIFont systemFontOfSize:24];
    m_labTitle2.textAlignment = NSTextAlignmentCenter;
    m_labTitle2.adjustsFontSizeToFitWidth = YES;
    m_labTitle2.backgroundColor = [UIColor lightGrayColor];
    m_labTitle2.layer.borderWidth = 1;
    [self.view addSubview:m_labTitle2];
    
    m_btnMode = [[UIButton alloc] init];
    m_btnMode.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnMode.center = CGPointMake(kScreenWidth*3/4, kScreenHeight*0.15);
    m_btnMode.backgroundColor = [UIColor lightGrayColor];
    [m_btnMode setTitle:_L(@"Local(not transmit)") forState:UIControlStateNormal];
    [m_btnMode addTarget:self action:@selector(onSelectMode) forControlEvents:UIControlEventTouchUpInside];
    [m_btnMode setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnMode.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnMode.layer.cornerRadius = 10;
    m_btnMode.layer.borderWidth = 1;
    [self.view addSubview:m_btnMode];
    
    m_btnChannel = [[UIButton alloc] init];
    m_btnChannel.frame = CGRectMake(0, 0, kScreenWidth/2, kScreenHeight/20);
    m_btnChannel.center = CGPointMake(kScreenWidth*3/4, kScreenHeight*0.25);
    m_btnChannel.backgroundColor = [UIColor lightGrayColor];
    [m_btnChannel setTitle:_L(@"0") forState:UIControlStateNormal];
    [m_btnChannel addTarget:self action:@selector(onSelectChannel) forControlEvents:UIControlEventTouchUpInside];
    [m_btnChannel setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnChannel.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnChannel.layer.cornerRadius = 10;
    m_btnChannel.layer.borderWidth = 1;
    [self.view addSubview:m_btnChannel];
    
    m_btnTalk = [[UIButton alloc] init];
    m_btnTalk.frame = CGRectMake(0, 0, kScreenWidth/3, kScreenWidth/3);
    m_btnTalk.center = CGPointMake(kScreenWidth/2, kScreenHeight*0.8);
    m_btnTalk.backgroundColor = [UIColor lightGrayColor];
    [m_btnTalk setTitle:_L(@"Start Talk") forState:UIControlStateNormal];
    m_btnTalk.titleLabel.adjustsFontSizeToFitWidth = true;
    [m_btnTalk addTarget:self action:@selector(onStartTalk) forControlEvents:UIControlEventTouchUpInside];
    [m_btnTalk setTitleColor:UIColor.blackColor forState:UIControlStateNormal];
    m_btnTalk.titleLabel.font = [UIFont systemFontOfSize:20];
    m_btnTalk.layer.cornerRadius = kScreenWidth/6;
    m_btnTalk.layer.borderWidth = 1;
    [self.view addSubview:m_btnTalk];
    
    
    m_pickerview = [[UIPickerView alloc] initWithFrame:CGRectMake(0, 0, kScreenWidth, kScreenHeight/3)];
    m_pickerview.center = CGPointMake(kScreenWidth/2, kScreenHeight/2);
    m_pickerview.backgroundColor = [UIColor lightGrayColor];
    m_pickerview.showsSelectionIndicator = YES;
    m_pickerview.dataSource = self;
    m_pickerview.delegate = self;
    m_pickerview.hidden = TRUE;
    [m_pickerview selectRow:0 inComponent:0 animated:TRUE];
    [self.view addSubview: m_pickerview];
    
    m_arrChannel = [[NSMutableArray alloc] initWithCapacity:g_ChannelCount];
    for (int i = 0; i < g_ChannelCount; ++i) {
        [m_arrChannel addObject:[[NSString alloc] initWithFormat:_L(@"%d"), i]];
    }
    
    m_arrMode = [[NSMutableArray alloc] initWithObjects:_L(@"Local(not transmit)"), _L(@"Remote(transmit)"), nil];
    
}

- (void) viewDidAppear:(BOOL)animated {
    
//    if (1 >= g_ChannelCount) {
//        [m_btnMode setEnabled:FALSE];
//        [m_btnChannel setEnabled:FALSE];
//    }
}

- (void)onSelectMode {
    if (TRUE == m_pickerview.isHidden) {
        if (TRUE ==  m_bTalk) {
            [self onStartTalk];
        }
        [m_pickerview setHidden:FALSE];
        [m_btnTalk setEnabled:FALSE];
        m_pickerview.tag = 1;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nMode inComponent:0 animated:TRUE];
    }
    else {
        [m_pickerview setHidden:TRUE];
        [m_btnTalk setEnabled:TRUE];
    }
}

- (void)onSelectChannel {
    
    if (0 == m_nMode) {
        return;
    }
    
    if (TRUE == m_pickerview.isHidden) {
        if (TRUE ==  m_bTalk) {
            [self onStartTalk];
        }
        [m_pickerview setHidden:FALSE];
        [m_btnTalk setEnabled:FALSE];
        m_pickerview.tag = 2;
        [m_pickerview reloadAllComponents];
        [m_pickerview selectRow:m_nChannel inComponent:0 animated:TRUE];
    }
    else {
        [m_pickerview setHidden:TRUE];
        [m_btnTalk setEnabled:TRUE];
    }
}

- (void)onStartTalk {
    
    if (FALSE == m_bTalk) {
        [m_btnMode setEnabled:FALSE];
        [m_btnChannel setEnabled:FALSE];
        
        DHDEV_TALKDECODE_INFO stuTalkMode = {};
        stuTalkMode.encodeType = DH_TALK_PCM;
        stuTalkMode.dwSampleRate = 8000;
        stuTalkMode.nAudioBit = 16;
        BOOL bSul = CLIENT_SetDeviceMode(g_loginID, DH_TALK_ENCODE_TYPE, &stuTalkMode);
        
        
        NET_TALK_TRANSFER_PARAM stTransfer = {sizeof(stTransfer)};
        if (0 == m_nMode) {
            stTransfer.bTransfer = FALSE;
        }
        else {
            stTransfer.bTransfer = TRUE;
            bSul = CLIENT_SetDeviceMode(g_loginID, DH_TALK_TALK_CHANNEL, &m_nChannel);
        }
        bSul = CLIENT_SetDeviceMode(g_loginID, DH_TALK_TRANSFER_MODE, &stTransfer);
        
        BOOL bRet = [self StartAudioRecord];
        if (bRet) {
            g_TalkHandle = CLIENT_StartTalkEx(g_loginID, AudioDataCallBack,NULL);
            if(g_TalkHandle == 0){
                CLIENT_StopTalkEx(g_TalkHandle);
            }
            [m_btnTalk setTitle:_L(@"Stop Talk") forState:UIControlStateNormal];
            m_bTalk = TRUE;
        }
    }
    else {
        [self stopAudioRecord];
        CLIENT_StopTalkEx(g_TalkHandle);
        g_TalkHandle = 0;
        [m_btnTalk setTitle:_L(@"Start Talk") forState:UIControlStateNormal];
        [m_btnMode setEnabled:TRUE];
        [m_btnChannel setEnabled:TRUE];
        m_bTalk = FALSE;
    }
    
}


void CALLBACK AudioDataCallBack(LLONG lTalkHandle, char *pDataBuf, DWORD dwBufSize, BYTE byAudioFlag, LDWORD dwUser){
    if (1 == byAudioFlag) {
        PLAY_InputData(m_nPort, (BYTE*)pDataBuf, dwBufSize);
    }
}
void CALLBACK AudioCallFunction(LPBYTE pDataBuffer, DWORD DataLength, void* pUserData){
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
    bool bOpenRet = PLAY_OpenStream(m_nPort,0,0,1024*100);
    if(bOpenRet)
    {
        BOOL bPlayRet = PLAY_Play(m_nPort,0);
        if(bPlayRet)
        {
            PLAY_PlaySoundShare(m_nPort);
            BOOL bSuccess = PLAY_OpenAudioRecord(AudioCallFunction,16,8000,nFrameLength,0,&g_TalkHandle);
            if(bSuccess)
            {
                bRet = TRUE;
            }
            else
            {
                PLAY_StopSoundShare(m_nPort);
                PLAY_Stop(m_nPort);
                PLAY_CloseStream(m_nPort);
            }
        }
        else
        {
            PLAY_CloseStream(m_nPort);
        }
    }
    
    return bRet;
}

-(void)stopAudioRecord {
    PLAY_CloseAudioRecord();
    PLAY_Stop(m_nPort);
    PLAY_StopSoundShare(m_nPort);
    PLAY_CloseStream(m_nPort);
}

- (NSInteger) numberOfComponentsInPickerView:(UIPickerView *)pickerView {
    return 1;
}

- (NSInteger) pickerView: (UIPickerView *) pickerView numberOfRowsInComponent:(NSInteger)component {
    
    if (1 == m_pickerview.tag) {
        return m_arrMode.count;
    }
    else {
        return m_arrChannel.count;
    }
    
}

- (NSString *)pickerView: (UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component{
    
    if (1 == m_pickerview.tag) {
        return [m_arrMode objectAtIndex:row];
    }
    else {
        return [m_arrChannel objectAtIndex:row];
    }
}

-(void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component {
    
    if (1 == pickerView.tag) {
        [m_arrMode objectAtIndex:row];
        if (0 == row) {
            m_nMode = 0;
        }
        else if (1 == row)
        {
            m_nMode = 1;
        }
        [m_btnMode setTitle:[m_arrMode objectAtIndex:row]forState:UIControlStateNormal];
        
    }
    else if (2 == pickerView.tag) {
        [m_arrChannel objectAtIndex:row];
        m_nChannel = (int)row;
        [m_btnChannel setTitle:[m_arrChannel objectAtIndex:row]forState:UIControlStateNormal];
    }
    [m_pickerview setHidden:TRUE];
    [m_btnTalk setEnabled:TRUE];
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_pickerview setHidden:TRUE];
    [m_btnTalk setEnabled:TRUE];
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        [m_pickerview setHidden:TRUE];
        [m_btnTalk setEnabled:TRUE];
        if (TRUE == m_bTalk) {
            [self onStartTalk];
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
