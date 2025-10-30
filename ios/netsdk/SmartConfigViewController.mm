//
//  SmartConfigViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/6.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "SmartConfigViewController.h"
#import "CABasicAnimation+Category.h"
#import <SystemConfiguration/CaptiveNetwork.h>
#import <MediaPlayer/MediaPlayer.h>
#import "netsdk.h"
#import "Global.h"
#import "searchIPCWifi.h"
#import "fsk.h"
#import "DHHudPrecess.h"
#import "LoadingView.h"
#import "WQCodeScanner.h"
#import <AVFoundation/AVFoundation.h>
#import <AVFoundation/AVMediaFormat.h>

static LLONG lSearchHandle = 0;


#ifndef BYTE
typedef unsigned char BYTE;
#endif

#ifndef uint32
typedef unsigned int uint32;
#endif

#define WIFI_NAME @"wifiVoiceFileName.caf" //临时保存的音频文件名称

typedef struct
{//文件头，用于标志文件类型，以便于播放
    char    riff_id[4];    //"RIFF"
    int     file_size_8;   //文件总字节数 - 8
    char    wave_fmt[8];   //"WAVEfmt "
    int     type_size;     //0x10
    short   fmt_tag;       //0x01
    short   ch_num;        //声道数
    int     sample_rate;   //采样率(Hz)
    int     bytes_per_sec; //每秒钟播放的字节数=声道数*采样率*2
    short   block_align;   //采样一次占字节数=声道数*2
    short   depth;         //0x10
    char    data_id[4];    //"data"
    int     data_size;     //文件总字节数 - 44
} WAV_Format;

static unsigned   int   crc32_table[256]   =
{
    0x00000000,   0x77073096,   0xee0e612c,   0x990951ba,   0x076dc419,
    0x706af48f,   0xe963a535,   0x9e6495a3,   0x0edb8832,   0x79dcb8a4,
    0xe0d5e91e,   0x97d2d988,   0x09b64c2b,   0x7eb17cbd,   0xe7b82d07,
    0x90bf1d91,   0x1db71064,   0x6ab020f2,   0xf3b97148,   0x84be41de,
    0x1adad47d,   0x6ddde4eb,   0xf4d4b551,   0x83d385c7,   0x136c9856,
    0x646ba8c0,   0xfd62f97a,   0x8a65c9ec,   0x14015c4f,   0x63066cd9,
    0xfa0f3d63,   0x8d080df5,   0x3b6e20c8,   0x4c69105e,   0xd56041e4,
    0xa2677172,   0x3c03e4d1,   0x4b04d447,   0xd20d85fd,   0xa50ab56b,
    0x35b5a8fa,   0x42b2986c,   0xdbbbc9d6,   0xacbcf940,   0x32d86ce3,
    0x45df5c75,   0xdcd60dcf,   0xabd13d59,   0x26d930ac,   0x51de003a,
    0xc8d75180,   0xbfd06116,   0x21b4f4b5,   0x56b3c423,   0xcfba9599,
    0xb8bda50f,   0x2802b89e,   0x5f058808,   0xc60cd9b2,   0xb10be924,
    0x2f6f7c87,   0x58684c11,   0xc1611dab,   0xb6662d3d,   0x76dc4190,
    0x01db7106,   0x98d220bc,   0xefd5102a,   0x71b18589,   0x06b6b51f,
    0x9fbfe4a5,   0xe8b8d433,   0x7807c9a2,   0x0f00f934,   0x9609a88e,
    0xe10e9818,   0x7f6a0dbb,   0x086d3d2d,   0x91646c97,   0xe6635c01,
    0x6b6b51f4,   0x1c6c6162,   0x856530d8,   0xf262004e,   0x6c0695ed,
    0x1b01a57b,   0x8208f4c1,   0xf50fc457,   0x65b0d9c6,   0x12b7e950,
    0x8bbeb8ea,   0xfcb9887c,   0x62dd1ddf,   0x15da2d49,   0x8cd37cf3,
    0xfbd44c65,   0x4db26158,   0x3ab551ce,   0xa3bc0074,   0xd4bb30e2,
    0x4adfa541,   0x3dd895d7,   0xa4d1c46d,   0xd3d6f4fb,   0x4369e96a,
    0x346ed9fc,   0xad678846,   0xda60b8d0,   0x44042d73,   0x33031de5,
    0xaa0a4c5f,   0xdd0d7cc9,   0x5005713c,   0x270241aa,   0xbe0b1010,
    0xc90c2086,   0x5768b525,   0x206f85b3,   0xb966d409,   0xce61e49f,
    0x5edef90e,   0x29d9c998,   0xb0d09822,   0xc7d7a8b4,   0x59b33d17,
    0x2eb40d81,   0xb7bd5c3b,   0xc0ba6cad,   0xedb88320,   0x9abfb3b6,
    0x03b6e20c,   0x74b1d29a,   0xead54739,   0x9dd277af,   0x04db2615,
    0x73dc1683,   0xe3630b12,   0x94643b84,   0x0d6d6a3e,   0x7a6a5aa8,
    0xe40ecf0b,   0x9309ff9d,   0x0a00ae27,   0x7d079eb1,   0xf00f9344,
    0x8708a3d2,   0x1e01f268,   0x6906c2fe,   0xf762575d,   0x806567cb,
    0x196c3671,   0x6e6b06e7,   0xfed41b76,   0x89d32be0,   0x10da7a5a,
    0x67dd4acc,   0xf9b9df6f,   0x8ebeeff9,   0x17b7be43,   0x60b08ed5,
    0xd6d6a3e8,   0xa1d1937e,   0x38d8c2c4,   0x4fdff252,   0xd1bb67f1,
    0xa6bc5767,   0x3fb506dd,   0x48b2364b,   0xd80d2bda,   0xaf0a1b4c,
    0x36034af6,   0x41047a60,   0xdf60efc3,   0xa867df55,   0x316e8eef,
    0x4669be79,   0xcb61b38c,   0xbc66831a,   0x256fd2a0,   0x5268e236,
    0xcc0c7795,   0xbb0b4703,   0x220216b9,   0x5505262f,   0xc5ba3bbe,
    0xb2bd0b28,   0x2bb45a92,   0x5cb36a04,   0xc2d7ffa7,   0xb5d0cf31,
    0x2cd99e8b,   0x5bdeae1d,   0x9b64c2b0,   0xec63f226,   0x756aa39c,
    0x026d930a,   0x9c0906a9,   0xeb0e363f,   0x72076785,   0x05005713,
    0x95bf4a82,   0xe2b87a14,   0x7bb12bae,   0x0cb61b38,   0x92d28e9b,
    0xe5d5be0d,   0x7cdcefb7,   0x0bdbdf21,   0x86d3d2d4,   0xf1d4e242,
    0x68ddb3f8,   0x1fda836e,   0x81be16cd,   0xf6b9265b,   0x6fb077e1,
    0x18b74777,   0x88085ae6,   0xff0f6a70,   0x66063bca,   0x11010b5c,
    0x8f659eff,   0xf862ae69,   0x616bffd3,   0x166ccf45,   0xa00ae278,
    0xd70dd2ee,   0x4e048354,   0x3903b3c2,   0xa7672661,   0xd06016f7,
    0x4969474d,   0x3e6e77db,   0xaed16a4a,   0xd9d65adc,   0x40df0b66,
    0x37d83bf0,   0xa9bcae53,   0xdebb9ec5,   0x47b2cf7f,   0x30b5ffe9,
    0xbdbdf21c,   0xcabac28a,   0x53b39330,   0x24b4a3a6,   0xbad03605,
    0xcdd70693,   0x54de5729,   0x23d967bf,   0xb3667a2e,   0xc4614ab8,
    0x5d681b02,   0x2a6f2b94,   0xb40bbe37,   0xc30c8ea1,   0x5a05df1b,
    0x2d02ef8d
};

static unsigned int crc32_byte(unsigned int crc, const unsigned char data)
{
    return ((crc >> 8) & 0x00FFFFFF) ^ crc32_table[(crc ^ data) & 0xFF];
}

uint32_t dhcrc32 (uint8_t const* buffer, size_t length)
{
    uint32_t crc;
    unsigned long i;
    
    crc = 0xFFFFFFFF;
    for (i = 0; i < length; i++)
    {
        crc = crc32_byte(crc, *buffer++);
    }
    return (crc ^ 0xFFFFFFFF);
}

WAV_Format m_wavHeader;//定义文件头，在组音频文件时赋值，写文件时保存

@interface SmartConfigViewController () 

@property (strong, nonatomic) UITextField *m_textDeviceSN;
@property (strong, nonatomic) UITextField *m_textSSID;
@property (strong, nonatomic) UITextField *m_textSSIDPsw;
@property (strong, nonatomic) UILabel *m_labIP;
@property (strong, nonatomic) UITextField *m_textIP;
@property (strong, nonatomic) MBProgressHUD* waitView;
@property (nonatomic) BOOL bFind;

@property (strong, nonatomic) UIViewController * vc;
@property (strong, nonatomic) AVAudioPlayer *NotificationSound;
@end

@implementation SmartConfigViewController

@synthesize m_textDeviceSN, m_textSSID, m_textSSIDPsw, m_labIP, m_textIP, vc, NotificationSound, waitView;




- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view.
    
    self.title = _L(@"Smart Config");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    m_textDeviceSN = [[UITextField alloc] init];
    m_textDeviceSN.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textDeviceSN.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.2);
    m_textDeviceSN.borderStyle = UITextBorderStyleRoundedRect;
    m_textDeviceSN.placeholder = _L(@"Device SN");
    m_textDeviceSN.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textDeviceSN.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textDeviceSN.textColor = [UIColor blackColor];
    m_textDeviceSN.adjustsFontSizeToFitWidth = YES;
    m_textDeviceSN.textAlignment = NSTextAlignmentLeft;
    UIImage *im = [UIImage imageNamed:@"scan.png"];
    UIImageView *iv = [[UIImageView alloc]initWithImage:im];
    UIButton* btnScan = [[UIButton alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [btnScan setImage:im forState:UIControlStateNormal];
    UIView *view = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 40, kScreenHeight/20)];
    [view addSubview:btnScan];
    iv.center = btnScan.center;
    [btnScan addTarget:self action:@selector(onScan) forControlEvents:UIControlEventTouchUpInside];
    m_textDeviceSN.rightView = view;
    m_textDeviceSN.rightViewMode = UITextFieldViewModeUnlessEditing;
    m_textDeviceSN.delegate = self;
    
    m_textSSID = [[UITextField alloc] init];
    m_textSSID.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textSSID.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.3);
    m_textSSID.borderStyle = UITextBorderStyleRoundedRect;
    m_textSSID.placeholder = _L(@"SSID");
    m_textSSID.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textSSID.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textSSID.textColor = [UIColor blackColor];
    m_textSSID.adjustsFontSizeToFitWidth = YES;
    m_textSSID.textAlignment = NSTextAlignmentLeft;
    m_textSSID.delegate = self;
    
    m_textSSIDPsw = [[UITextField alloc] init];
    m_textSSIDPsw.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textSSIDPsw.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.4);
    m_textSSIDPsw.borderStyle = UITextBorderStyleRoundedRect;
    m_textSSIDPsw.placeholder = _L(@"WLAN Password");
    m_textSSIDPsw.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textSSIDPsw.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textSSIDPsw.textColor = [UIColor blackColor];
    m_textSSIDPsw.adjustsFontSizeToFitWidth = YES;
    m_textSSIDPsw.textAlignment = NSTextAlignmentLeft;
    m_textSSIDPsw.delegate = self;
    
    
    UIButton* btnWirelessConfig = [[UIButton alloc] init];
    btnWirelessConfig.frame = CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20);
    btnWirelessConfig.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.5);
    [btnWirelessConfig setTitle:_L(@"WirelessConfig") forState:UIControlStateNormal];
    [btnWirelessConfig setBackgroundColor:[UIColor lightGrayColor]];
    [btnWirelessConfig setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    btnWirelessConfig.layer.cornerRadius = 10;
    btnWirelessConfig.layer.borderWidth = 1;
    [btnWirelessConfig addTarget:self action:@selector(onWirelessConfig) forControlEvents:UIControlEventTouchUpInside];
    
    UIButton* btnSoundWaveConfig = [[UIButton alloc] init];
    btnSoundWaveConfig.frame = CGRectMake(0, 0, kScreenWidth*0.4, kScreenHeight/20);
    btnSoundWaveConfig.center = CGPointMake(kScreenWidth*0.75, kScreenHeight*0.5);
    [btnSoundWaveConfig setTitle:_L(@"SoundWaveConfig") forState:UIControlStateNormal];
    [btnSoundWaveConfig setBackgroundColor:[UIColor lightGrayColor]];
    [btnSoundWaveConfig setTitleColor:[UIColor blackColor] forState:UIControlStateNormal];
    btnSoundWaveConfig.titleLabel.adjustsFontSizeToFitWidth = TRUE;
    btnSoundWaveConfig.layer.cornerRadius = 10;
    btnSoundWaveConfig.layer.borderWidth = 1;
    [btnSoundWaveConfig addTarget:self action:@selector(onSoundWaveConfig) forControlEvents:UIControlEventTouchUpInside];
    
    m_textIP = [[UITextField alloc] init];
    m_textIP.frame = CGRectMake(0, 0, kScreenWidth*0.7, kScreenHeight*0.05);
    m_textIP.center = CGPointMake(kScreenWidth*0.5, kScreenHeight*0.7);
    m_textIP.borderStyle = UITextBorderStyleRoundedRect;
    m_textIP.placeholder = _L(@"Device IP");
    m_textIP.clearButtonMode = UITextFieldViewModeWhileEditing;
    m_textIP.autocapitalizationType = UITextAutocapitalizationTypeNone;
    m_textIP.textColor = [UIColor blackColor];
    m_textIP.font = [UIFont systemFontOfSize:24];
    m_textIP.adjustsFontSizeToFitWidth = TRUE;
    m_textIP.textAlignment = NSTextAlignmentCenter;
    m_textIP.rightViewMode = UITextFieldViewModeAlways;
    m_textIP.delegate = self;
    [self.view addSubview:m_textIP];

    id info = nil;
    NSArray *ifs = (id)CNCopySupportedInterfaces();
    for (NSString *ifnam in ifs) {
        info = (id)CNCopyCurrentNetworkInfo((__bridge CFStringRef)ifnam);
        NSString *strSSID = [[info objectForKey:@"SSID"] copy];
        NSLog(@"strSSID :   %@", strSSID);
        m_textSSID.text = strSSID;
    }
    
    [self.view addSubview:m_textDeviceSN];
    [self.view addSubview:m_textSSID];
    [self.view addSubview:m_textSSIDPsw];
    
    [self.view addSubview:btnWirelessConfig];
//    [self.view addSubview:btnSoundWaveConfig];
    

}

-(void) viewDidAppear:(BOOL)animated {
    _bFind = NO;
    vc = [[UIViewController alloc] init];
    vc.view.backgroundColor = [UIColor clearColor];
}

- (void) onScan {
    
    WQCodeScanner *scanner = [[WQCodeScanner alloc] init];
    [self presentViewController:scanner animated:YES completion:nil];
    scanner.resultBlock = ^(NSString *value) {
        self.m_textDeviceSN.text = value;
    };
}

static void searchDeviceCB(DEVICE_NET_INFO_EX *pDevNetInfo, void* pUserData)
{
    
    if (pDevNetInfo->iIPVersion == 4) {
        NSLog(@"%@", [NSString stringWithUTF8String:pDevNetInfo->szIP]);
        SmartConfigViewController* pself = (__bridge SmartConfigViewController*)pUserData;
        if (pself.bFind) {
            return;
        }
        
        const char *pszSN = [pself.m_textDeviceSN.text UTF8String];
        if (0 == strcmp(pszSN, pDevNetInfo->szSerialNo)) {
            if (6 >= strlen(pDevNetInfo->szIP)) {
                return ;
            }
            pself.bFind = YES;
            NSString *strIP = [NSString stringWithUTF8String:pDevNetInfo->szIP];
            NSLog(@"IP: %@", strIP);
            dispatch_async(dispatch_get_main_queue(), ^{
                [pself.m_textIP setText:strIP];
                [pself stopSearchDevices];
                [pself.waitView hide:YES];
            });
        }
    }
}

- (void) startSearchDevices {
    CLIENT_StopSearchDevices(lSearchHandle);
    lSearchHandle = 0;
    lSearchHandle = CLIENT_StartSearchDevices(searchDeviceCB, (__bridge void*)self);
}

-(void) stopSearchDevices {
    CLIENT_StopSearchDevices(lSearchHandle);
    lSearchHandle = 0;
    [NotificationSound stop];
}

- (void)onWirelessConfig {
    NSLog(@"onWirelessConfig");
    _bFind = NO;
    
    m_textIP.text = @"";
    
    [m_textDeviceSN   resignFirstResponder];
    [m_textSSID  resignFirstResponder];
    [m_textSSIDPsw  resignFirstResponder];
    
    if (0 < m_textDeviceSN.text.length && 0 < m_textSSID.text.length) {
        char* szDeviceSN = (char*)[m_textDeviceSN.text UTF8String];
        char* szSSID = (char*)[m_textSSID.text UTF8String];
        char* szSSIDPassword = (char*)[m_textSSIDPsw.text UTF8String];
        [self startSearchDevices];
        
        waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
        dispatch_async(dispatch_get_main_queue(), ^{
            CLIENT_ConfigIPCWifi(szDeviceSN, szSSID, szSSIDPassword, 10);
        
            dispatch_time_t time = dispatch_time(DISPATCH_TIME_NOW, 10*NSEC_PER_SEC);
        dispatch_after(time, dispatch_get_main_queue(), ^{
                NSLog(@"onWirelessConfig End");
                [waitView hide:YES];
        });

        });
    }
    else {
        MSG(@"", _L(@"Device SN or SSID is NULL"), @"");
    }
}

- (void)onSoundWaveConfig {
    NSLog(@"onSoundWaveConfig");
    _bFind = NO;
    
    m_textIP.text = @"";
    [m_textDeviceSN   resignFirstResponder];
    [m_textSSID  resignFirstResponder];
    [m_textSSIDPsw  resignFirstResponder];
    
    if (0 < m_textDeviceSN.text.length && 0 < m_textSSID.text.length) {
        [self startSearchDevices];
        [self startAudioConfig];
    }
    else {
        MSG(@"", _L(@"Device SN or SSID is NULL"), @"");
    }
}


-(void) startAudioConfig
{
    NSString *wavPath = [self startSmartConfig:m_textDeviceSN.text ssid:m_textSSID.text password:m_textSSIDPsw.text];
    
    if (wavPath != nil && [wavPath length]>10) {
        MPVolumeView *volumeView = [[MPVolumeView alloc] init];
        UISlider* volumeViewSlider = nil;
        for (UIView *view in [volumeView subviews]){
            if ([view.class.description isEqualToString:@"MPVolumeSlider"]){
                volumeViewSlider = (UISlider*)view;
                break;
            }
        }
        [volumeViewSlider setValue:1.0f animated:YES];
        [volumeViewSlider sendActionsForControlEvents:UIControlEventTouchUpInside];
        NSURL *newURL = [[NSURL alloc] initFileURLWithPath:wavPath];
        NotificationSound = [[AVAudioPlayer alloc] initWithContentsOfURL:newURL error:nil];
        NotificationSound.numberOfLoops = 45;
        waitView = [MBProgressHUD showHUDAddedTo:self.view animated:YES];
        dispatch_async(dispatch_get_main_queue(), ^{
        [NotificationSound play];
        
        dispatch_time_t time = dispatch_time(DISPATCH_TIME_NOW, 100*NSEC_PER_SEC);
        dispatch_after(time, dispatch_get_main_queue(), ^{
                [waitView hide:YES];
        });
        });
    }
}

-(NSString *) startSmartConfig:(NSString *)deviceID ssid:(NSString *)ssid password:(NSString *)password
{
    if (ssid == nil || [[ssid stringByTrimmingCharactersInSet:[NSCharacterSet whitespaceCharacterSet]] isEqualToString:@""]) {
        return nil;
    }
    
    int m_nPacketLen = 254;
    BYTE* pDataBuf = (BYTE*)malloc(m_nPacketLen);
    memset(pDataBuf, 0, m_nPacketLen);
    
    *(uint32 *)pDataBuf = 0x10;
    *(uint32 *)(pDataBuf + 1) = 0xFF;//标志位，和设备约定的值
    
    const char * strSsidUTF8 = [ssid UTF8String];
    int ssidLen = (int)strlen(strSsidUTF8);
    
    *(uint32 *)(pDataBuf + 2) = ssidLen;
    memcpy(pDataBuf + 3, strSsidUTF8, ssidLen);
    
    const char *strPassUTF8 = [password UTF8String];
    int ssidPassLen;
    
    if ([password length] == 0) {
        ssidPassLen = 0;
    }
    else {
        ssidPassLen = (int)strlen(strPassUTF8);
    }
    
    *(uint32 *)(pDataBuf+3+ssidLen) = ssidPassLen;
    memcpy(pDataBuf+4+ssidLen, strPassUTF8, ssidPassLen);
    
    const char *strDeviceSnUTF8 = [deviceID UTF8String];
    int deviceCodeLen = (int)strlen(strDeviceSnUTF8);
    *(uint32 *)(pDataBuf + 4 + ssidLen + ssidPassLen) = deviceCodeLen;
    
    memcpy(pDataBuf + 5 + ssidLen + ssidPassLen, strDeviceSnUTF8, deviceCodeLen);
    uint32 sum = dhcrc32(pDataBuf, 5+ssidLen+ssidPassLen+deviceCodeLen);
    BYTE crc[4] = {0};
    BYTE src[4] = {0};
    memcpy(src, &sum, 4);
    for (int i=0; i<4; i++) {
        crc[i] = src[4-1-i];
    }
    memcpy(pDataBuf+5+ssidLen+ssidPassLen+deviceCodeLen, crc, 4);
    
    //linkIPC_start(pDataBuf, 5 + ssidPassLen + ssidLen + deviceCodeLen + 4, NULL, NULL);
    //CLIENT_ConfigIPCWifi([deviceID UTF8String], [ssid UTF8String], [password UTF8String], 5);
    
    NSString *path = [self processDataToWav:pDataBuf length:5+ssidPassLen+ssidLen+deviceCodeLen+4];
    
    free(pDataBuf);
    pDataBuf = nil;
    
    return path;
}
-(NSString *)processDataToWav:(unsigned char*)buffer length:(int)length
{
    Audio_Handle    hFsk;
    AudioBuf        outAudio;
    Fsk_Format      format;
    FSK_RESULT      flag;
    
    char            *txDataBuf = NULL;
    
    /* 初始化ASR */
    flag = fsk_init( &hFsk );
    if ( FSK_RUN_OK != flag )
    {
        NSLog(@"fsk_init is failed, ret = %d", flag );
        return nil;
    }
    
    /* 配置FSK，该函数可多次调用，即重新配置无需注销后再初始化 */
    /* 配置参数初始化 */
    memset(&format, 0, sizeof(format));
    //int bg_type = 0;
    format.frequency = 44100;
    format.base_freq  = 17000;
    format.data_rate  = 300;
    format.fsk_ctrl  = 3 ;//| ( ( bg_type & 3 ) << 1 );
    format.out_offset = 2;
    
    flag = fsk_setFormat( hFsk, &format );
    if ( FSK_RUN_OK != flag )
    {
        NSLog(@"fsk_setFormat is failed, ret = %d", flag );
        return nil;
    }
    int txDataBufLength = 0;
    fsk_getSize(hFsk, length, 1, &txDataBufLength);
    txDataBuf = (char *)malloc( txDataBufLength );
    /* 输入音频参数初始化 */
    outAudio.pData   = txDataBuf;//放产生出来的声音文件
    /* 发送数据处理，生成pcm格式音频数据 */
    flag = fsk_tx( hFsk, buffer, length, &outAudio );
    
    if ( FSK_RUN_OK != flag )
    {
        NSLog(@"fsk_tx is failed, ret = %d", flag );
        return nil;
    }
    
    
    [self wav_header_init:&m_wavHeader];//准备wav文件头，文件格式头初始化
    m_wavHeader.file_size_8 = outAudio.dataLen+26;
    m_wavHeader.ch_num = outAudio.channels;
    m_wavHeader.sample_rate = outAudio.frequency;
    m_wavHeader.bytes_per_sec = outAudio.frequency * outAudio.channels *2;
    m_wavHeader.block_align = 2;
    m_wavHeader.depth = outAudio.depth;
    m_wavHeader.data_size = outAudio.dataLen;
    
    NSString *path = [self writeFile:txDataBuf length:outAudio.dataLen];//写文件并播放写好的文件
    fsk_deInit( &hFsk );
    
    return path;
}
- (void) wav_header_init:( WAV_Format *)pWAVHeader
{//初始化
    pWAVHeader->riff_id[0] = 0x52;
    pWAVHeader->riff_id[1] = 0x49;
    pWAVHeader->riff_id[2] = 0x46;
    pWAVHeader->riff_id[3] = 0x46;
    pWAVHeader->wave_fmt[0]= 0x57;
    pWAVHeader->wave_fmt[1]= 0x41;
    pWAVHeader->wave_fmt[2]= 0x56;
    pWAVHeader->wave_fmt[3]= 0x45;
    pWAVHeader->wave_fmt[4]= 0x66;
    pWAVHeader->wave_fmt[5]= 0x6D;
    pWAVHeader->wave_fmt[6]= 0x74;
    pWAVHeader->wave_fmt[7]= 0x20;
    pWAVHeader->type_size  = 0x10;
    pWAVHeader->fmt_tag    = 0x01;
    pWAVHeader->depth      = 0x10;
    pWAVHeader->data_id[0] = 0x64;
    pWAVHeader->data_id[1] = 0x61;
    pWAVHeader->data_id[2] = 0x74;
    pWAVHeader->data_id[3] = 0x61;
};

//文件读写
- (NSString *) writeFile:(const void *)pointer length:(NSUInteger)length
{
    //创建文件管理器
    NSFileManager *fileManager = [NSFileManager defaultManager];
    //获取路径
    //1 参数NSDocumentDirectory要获取的那种路径
    NSArray * paths = NSSearchPathForDirectoriesInDomains(NSDocumentDirectory, NSUserDomainMask, YES);
    //2 得到相应的Documents的路径
    NSString *DocumentDirectory = [paths objectAtIndex:0];
    //3 更改到带操作的目录下
    [fileManager changeCurrentDirectoryPath:[DocumentDirectory stringByExpandingTildeInPath]];
    //4 创建文件fileName文件名称，contents文件的内容，如果开始没有内容可以设置为nil，attribute文件的属性，初始为nil
    [fileManager removeItemAtPath:WIFI_NAME error:nil];//WIFI_NAME 为文件名称，如@“wifi.caf”
    NSString *path = [DocumentDirectory stringByAppendingPathComponent:WIFI_NAME];
    
    //5 创建数据缓冲区
    NSMutableData *writer = [[NSMutableData alloc] init];
    //6 将wav文件头添加到缓冲中
    [writer appendBytes:&m_wavHeader length:44];
    //7 将其它数据添加到缓冲中
    [writer appendBytes:pointer length:length];
    //保存文件
    [writer writeToFile:path atomically:YES];
    
    
    //    //静音开关忽略
    //    AVAudioSession *audioSession = [AVAudioSession sharedInstance];
    //    [audioSession setCategory:AVAudioSessionCategoryPlayback error:nil];
    //
    //    //    CFStringRef state;
    //    //    UInt32 propertySize = sizeof(CFStringRef);
    //    AudioSessionInitialize(nil, nil, nil, nil);
    //    MPMusicPlayerController *mp = [MPMusicPlayerController applicationMusicPlayer];
    //    mp.volume = 1.0;//音量控制
    //
    //    NSURL *newURL = [[NSURL alloc] initFileURLWithPath: path];//播放文件
    //    NotificationSound = [[AVAudioPlayer alloc] initWithContentsOfURL: newURL error: nil];//初始化播放
    //    NotificationSound.numberOfLoops = 45;//-1无限循环直到失败；
    //    [NotificationSound play];//播放
    //    [newURL release];
    return [path copy];
}


- (void) touchesEnded:(NSSet<UITouch *> *)touches withEvent:(UIEvent *)event {
    [m_textDeviceSN resignFirstResponder];
    [m_textSSID     resignFirstResponder];
    [m_textSSIDPsw  resignFirstResponder];
}




- (BOOL) textFieldShouldReturn:(UITextField *)textField {
    [m_textDeviceSN resignFirstResponder];
    [m_textSSID     resignFirstResponder];
    [m_textSSIDPsw  resignFirstResponder];
    return TRUE;
}

- (BOOL)textFieldShouldBeginEditing:(UITextField *)textField {
    
    if (textField == m_textIP) {
        return FALSE;
    }
    else {
        return TRUE;
    }
}

- (void) didMoveToParentViewController:(UIViewController *)parent {
    if (!parent) {
        m_textIP.text = @"";
        [vc.view removeFromSuperview];
        [vc removeFromParentViewController];
        [self stopSearchDevices];
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
