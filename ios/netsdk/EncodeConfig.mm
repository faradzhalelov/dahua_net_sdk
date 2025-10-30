//
//  EncodeConfig.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/19.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "EncodeConfig.h"
#import "Global.h"


#define BUF_LENG    1024*100


CFG_ENCODE_INFO         m_stuEncodeInfo;
NET_OUT_ENCODE_CFG_CAPS m_stuCaps;
NET_OUT_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO m_stuAudioCaps;

NSArray *arItemNames = @[_L(@"Encode Mode"), _L(@"Resolution"), _L(@"Frame Rate(FPS)"), _L(@"Bit Rate(Kb/s)")];

NSArray *arResolutions = @[@"D1", @"HD1", @"BCIF", @"CIF", @"QCIF",
                           @"VGA", @"QVGA", @"SVCD", @"QQVGA", @"SVGA",
                           @"XVGA", @"WXGA", @"SXGA", @"WSXGA", @"UXGA",
                           @"WUXGA", @"LFT", @"720P", @"1080P", @"1.3M (1280*960)",
                           @"2M (1872*1408)", @"5M (3744*1408)", @"3M (2048*1536)", @"5M (2432*2050)", @"1.2M (1216*1024)",
                           @"1408*1024", @"8M (3296*2472)", @"5M (2560*1920)", @"960H", @"960*720",
                           @"NHD", @"QNHD", @"QQNHD", @"4000*3000", @"4096*2160",
                           @"3840*2160"];

NSArray *arCompressions = @[@"MPEG4", @"MS-MPEG4", @"MPEG2", @"MPEG1", @"H.263",
                            @"MJPG", @"FCC-MPEG4", @"H.264", @"H.265", @"SVAC"];

NSArray *profileName = @[@"H264 B",@"H264 ",@"H264 E",@"H264 H"];

NSArray *arBitRate = @[@"10", @"20", @"32", @"48", @"64",
                       @"80", @"96", @"128", @"160", @"192",
                       @"224", @"256", @"320", @"384", @"448",
                       @"512", @"640", @"768", @"896", @"1024",
                       @"1280", @"1536", @"1792", @"2048", /*@"3072",*/
                       @"4096", @"6144", @"7168", @"8192", @"10240",
                       @"12288", @"14336", @"16384", @"18432", @"20480",
                       @"22528"];

NSArray *arAudioItemNames = @[_L(@"Encode Mode"), _L(@"Sampling Rate")];

NSArray *arAudioCompression = @[@"PCM", @"PCM", @"G711a", @"AMR", @"G711u",
                                @"G726",@"G723_53", @"G723_63", @"AAC", @"OGG",
                                @"G729", @"MPEG2", @"MPEG2-Layer2", @"G.722.1",
                                @"ADPCM", @"MP3"];
NSArray *arCfgAudioCompression = @[@"G711a", @"PCM", @"G711u", @"AMR", @"AAC", @"G726", @"MPEG2-Layer2", @"G729", @"G722.1"];

NSArray *arSampleRate = @[@"8000", @"16000", @"32000", @"48000", @"64000"];

int mapAudioEncode[9][65];

@implementation EncodeConfig

@synthesize m_Subtitles, m_Compressions, m_Resolutions, m_FPS, m_BitRate, m_AudioSubtitles, m_AudioCompressions, m_SampleRate;


- (void) InitArray {

    m_Subtitles = [[NSMutableArray alloc] initWithObjects:@"", @"", @"", @"", nil];
    m_Compressions = [[NSMutableArray alloc] init];
    m_Resolutions = [[NSMutableArray alloc] init];
    m_BitRate = [[NSMutableArray alloc] init];
    m_FPS = [[NSMutableArray alloc] init];
    
    m_AudioSubtitles = [[NSMutableArray alloc] initWithObjects:@"", @"", nil];
    m_AudioCompressions = [[NSMutableArray alloc] init];
    m_SampleRate = [[NSMutableArray alloc] init];
  //  memset(mapAudioEncode, 0, sizeof(mapAudioEncode));
}

-(BOOL) GetEncodeConfig : (int)nChannel StreamType:(int)streamType {
    char *szBuf = new char[BUF_LENG];
    memset(szBuf, 0, BUF_LENG);
    int nError = 0;
    BOOL bRet = CLIENT_GetNewDevConfig(g_loginID, (char*)CFG_CMD_ENCODE, nChannel, szBuf, BUF_LENG, &nError, TIME_OUT);
    if (bRet) {
        int nRetLen = 0;
        bRet = CLIENT_ParseData((char*)CFG_CMD_ENCODE, szBuf, (char*)&m_stuEncodeInfo, sizeof(CFG_ENCODE_INFO), &nRetLen);
        bRet = CLIENT_PacketData((char*)CFG_CMD_ENCODE, (char*)&m_stuEncodeInfo, sizeof(m_stuEncodeInfo), szBuf, BUF_LENG);
        if (bRet) {
            memset(&m_stuCaps, 0, sizeof(m_stuCaps));
            NET_IN_ENCODE_CFG_CAPS stuInEncodeCaps = {sizeof(stuInEncodeCaps)};
            stuInEncodeCaps.nChannelId = nChannel;
            stuInEncodeCaps.pchEncodeJson = szBuf;
            m_stuCaps.dwSize = sizeof(m_stuCaps);
            for (int i = 0; i < 3; ++i) {
                m_stuCaps.stuMainFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
                m_stuCaps.stuExtraFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
            }
            for (int i = 0; i < 2; ++i) {
                m_stuCaps.stuSnapFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
            }
            bRet = CLIENT_GetDevCaps(g_loginID, NET_ENCODE_CFG_CAPS, &stuInEncodeCaps, &m_stuCaps, TIME_OUT);
            if (bRet) {
                NSLog(@"GetDevCaps Success");
            }
            else {
                NSLog(@"GetDevCaps Failed, error is %x", CLIENT_GetLastError());
            }
        }
    }
    delete[] szBuf;
    szBuf = NULL;
    return bRet;
}

// get audio encode config
-(BOOL) GetAudioEncodeCfg : (int)nChannel StreamType:(int)streamType {
    memset(mapAudioEncode, 0, sizeof(mapAudioEncode));
    char *szBuf = new char[BUF_LENG];
    memset(szBuf, 0, BUF_LENG);
    memset(&m_stuEncodeInfo, 0, sizeof(m_stuEncodeInfo));
    int nError = 0;
    BOOL bRet = CLIENT_GetNewDevConfig(g_loginID, (char*)CFG_CMD_ENCODE, nChannel, szBuf, BUF_LENG, &nError, TIME_OUT);
    if (bRet) {
        int nRetLen = 0;
        bRet = CLIENT_ParseData((char*)CFG_CMD_ENCODE, szBuf, (char*)&m_stuEncodeInfo, sizeof(CFG_ENCODE_INFO), &nRetLen);
    }
    
    NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO stuInAudioCaps = {sizeof(NET_IN_GET_REMOTE_CHANNEL_AUDIO_ENCODEINFO)};
    
    memset(&m_stuAudioCaps, 0, sizeof(m_stuAudioCaps));
    m_stuAudioCaps.dwSize = sizeof(m_stuAudioCaps);
    
    stuInAudioCaps.nChannel = nChannel;
    stuInAudioCaps.nStreamType = streamType;
    bRet = CLIENT_QueryDevInfo(g_loginID, NET_QUERY_GET_REMOTE_CHANNEL_AUDIO_ENCODE, &stuInAudioCaps, &m_stuAudioCaps, NULL, TIME_OUT);
    if (bRet) {
        NSLog(@"QueryDevInfo Success");
        if (0 == m_stuAudioCaps.nValidNum) {
            bRet = FALSE;
            NSLog(@"Valid Audio Encode Num is 0");
        }
    }
    else {
        NSLog(@"QueryDevInfo Failed, error is %x", CLIENT_GetLastError());
    }
    return bRet;
}

- (BOOL) setSubtitlesRange : (int)streamType {
    BOOL bVideoContain = TRUE;
    if (0 == streamType) {
        if (m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emCompression == VIDEO_FORMAT_H264) {
            if (m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emProfile == PROFILE_BASELINE) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[0]];
            }
            else if (m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emProfile == PROFILE_MAIN) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[1]];
            }
            else if (m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emProfile == PROFILE_EXTENDED) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[2]];
            }
            else if (m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emProfile == PROFILE_HIGH) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[3]];
            }
        }
        else {
            int nIndex = m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emCompression;
            [m_Subtitles replaceObjectAtIndex:0 withObject:arCompressions[nIndex]];
        }
        
        int nWidth = m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nWidth;
        int nHeight = m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nHeight;
        int nIndex = [self ResolutionIntToSize:nWidth Height:nHeight];
        if (nIndex == -1) {
            [m_Subtitles replaceObjectAtIndex:1 withObject:[NSString stringWithFormat:@"%d*%d", nWidth, nHeight]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:1 withObject:arResolutions[nIndex]];
        }
        
        [m_Subtitles replaceObjectAtIndex:2 withObject:[NSString stringWithFormat:@"%d", (int)m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nFrameRate]];
        
        [m_Subtitles replaceObjectAtIndex:3 withObject:[NSString stringWithFormat:@"%d", m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nBitRate]];
    }
    else {
        if (m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emCompression == VIDEO_FORMAT_H264) {
            if (m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emProfile == PROFILE_BASELINE) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[0]];
            }
            else if (m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emProfile == PROFILE_MAIN) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[1]];
            }
            else if (m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emProfile == PROFILE_EXTENDED) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[2]];
            }
            else if (m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emProfile == PROFILE_HIGH) {
                [m_Subtitles replaceObjectAtIndex:0 withObject:profileName[3]];
            }
        }
        else {
            int nIndex = m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emCompression;
            [m_Subtitles replaceObjectAtIndex:0 withObject:arCompressions[nIndex]];
        }
        
        int nWidth = m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nWidth;
        int nHeight = m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nHeight;
        int nIndex = [self ResolutionIntToSize:nWidth Height:nHeight];
        if (nIndex == -1) {
            [m_Subtitles replaceObjectAtIndex:1 withObject:[NSString stringWithFormat:@"%d*%d", nWidth, nHeight]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:1 withObject:arResolutions[nIndex]];
        }
        
        [m_Subtitles replaceObjectAtIndex:2 withObject:[NSString stringWithFormat:@"%d", (int)m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nFrameRate]];
        
        [m_Subtitles replaceObjectAtIndex:3 withObject:[NSString stringWithFormat:@"%d", m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nBitRate]];
    }
    if (![m_Compressions containsObject:m_Subtitles[0]]) {
        bVideoContain = FALSE;
    }
    if (![m_Resolutions containsObject:m_Subtitles[1]]) {
        bVideoContain = FALSE;
    }
    if (![m_FPS containsObject:m_Subtitles[2]]) {
        bVideoContain = FALSE;
    }
//    if (![m_BitRate containsObject:m_Subtitles[3]]) {
//        bVideoContain = FALSE;
//    }
    return bVideoContain;
    
    
}

- (BOOL) setAudioSubtitlesRange : (int)streamType {
    BOOL bContain = TRUE;
    
    if (0 == streamType) {
        int nIndex = m_stuEncodeInfo.stuMainStream[0].stuAudioFormat.emCompression;
        if (nIndex >= [arCfgAudioCompression count]) {
            return FALSE;
        }
            [m_AudioSubtitles replaceObjectAtIndex:0 withObject:arCfgAudioCompression[nIndex]];
        [m_AudioSubtitles replaceObjectAtIndex:1 withObject:[NSString stringWithFormat:@"%d", m_stuEncodeInfo.stuMainStream[0].stuAudioFormat.nFrequency]];
    }
    else {
        int nIndex = m_stuEncodeInfo.stuExtraStream[0].stuAudioFormat.emCompression;
        if (nIndex >= [arCfgAudioCompression count]) {
            return FALSE;
        }
        [m_AudioSubtitles replaceObjectAtIndex:0 withObject:arCfgAudioCompression[nIndex]];
        [m_AudioSubtitles replaceObjectAtIndex:1 withObject:[NSString stringWithFormat:@"%d", m_stuEncodeInfo.stuExtraStream[0].stuAudioFormat.nFrequency]];
    }
    if (![m_AudioCompressions containsObject:m_AudioSubtitles[0]]) {
        bContain = FALSE;
    }
    if (![m_SampleRate containsObject:m_AudioSubtitles[1]]) {
        bContain = FALSE;
    }
    return bContain;
    
}

- (void) InitEncodeCtrl : (int)streamType {
    
    if (streamType == 0) {
        //frame rate
        [m_FPS removeAllObjects];
        if (m_stuCaps.stuMainFormatCaps[0].nFPSMax == 0) {
            m_stuCaps.stuMainFormatCaps[0].nFPSMax = 25;
        }
        for (int i = 0; i < m_stuCaps.stuMainFormatCaps[0].nFPSMax; ++i) {
            [m_FPS addObject:[NSString stringWithFormat:@"%d",i+1]];
        }
        // encode mode
        [m_Compressions removeAllObjects];
        int nH264ProfileRankNum = m_stuCaps.stuMainFormatCaps[0].nH264ProfileRankNum;
        BYTE *bH264ProfileRank = m_stuCaps.stuMainFormatCaps[0].bH264ProfileRank;
        for (int i = 0; i < arCompressions.count; ++i) {
            if (m_stuCaps.stuMainFormatCaps[0].dwEncodeModeMask & (0x01<<i)) {
                if (i == VIDEO_FORMAT_H264 && nH264ProfileRankNum) {
                    for (int j = 0; j < nH264ProfileRankNum; ++j) {
                        [m_Compressions addObject:[NSString stringWithFormat:@"%@",profileName[bH264ProfileRank[j]-1]]];
                    }
                }
                else {
                    [m_Compressions addObject:[NSString stringWithFormat:@"%@", arCompressions[i]]];
                }
            }
        }
        //resolution
        [m_Resolutions removeAllObjects];
        if (!m_stuCaps.stuMainFormatCaps[0].abIndivResolution) {
            for (int i = 0; i < m_stuCaps.stuMainFormatCaps[0].nResolutionTypeNum; ++i) {
                int nWidth = m_stuCaps.stuMainFormatCaps[0].stuResolutionTypes[i].snWidth;
                int nHeight = m_stuCaps.stuMainFormatCaps[0].stuResolutionTypes[i].snHight;
                int dwImageSizeMask = [self ResolutionIntToSize:nWidth Height:nHeight];
                if (-1 == dwImageSizeMask) {
                    [m_Resolutions addObject:[NSString stringWithFormat:@"%d*%d", nWidth, nHeight]];
                }
                else {
                    [m_Resolutions addObject:arResolutions[dwImageSizeMask]];
                }
            }
        }
        else {
            for (int i = 0; i < arResolutions.count; ++i) {
                if (m_stuCaps.stuMainFormatCaps[0].dwEncodeModeMask & (0x01<<i)) {
                    for (int j = 0; j < m_stuCaps.stuMainFormatCaps[0].nIndivResolutionNums[i]; ++j) {
                        int nWidth = m_stuCaps.stuMainFormatCaps[0].stuIndivResolutionTypes[i][j].snWidth;
                        int nHeight = m_stuCaps.stuMainFormatCaps[0].stuIndivResolutionTypes[i][j].snHight;
                        int dwImageSizeMask = [self ResolutionIntToSize:nWidth Height:nHeight];
                        if (-1 == dwImageSizeMask) {
                            [m_Resolutions addObject:[NSString stringWithFormat:@"%d*%d",nWidth, nHeight]];
                        }
                        else {
                            [m_Resolutions addObject:arResolutions[dwImageSizeMask]];
                        }
                    }
                    break;
                }
            }
        }
        //bitrate
        [m_BitRate removeAllObjects];
        int nMinBitRate = 0;
        int nMaxBitRate = 0;
        for (int i = 0; i < arBitRate.count; ++i) {
            if (0 == nMinBitRate && m_stuCaps.stuMainFormatCaps[0].nMinBitRateOptions <= [arBitRate[i] intValue]) {
                nMinBitRate = i;
                break;
            }
        }
        for (int i = (int)arBitRate.count - 1; i >= 0; --i) {
            if (0 == nMaxBitRate && m_stuCaps.stuMainFormatCaps[0].nMaxBitRateOptions >= [arBitRate[i] intValue]) {
                nMaxBitRate = i;
                break;
            }
        }
        for (int i = 0; i < (nMaxBitRate - nMinBitRate + 1); ++i) {
            [m_BitRate addObject:arBitRate[nMinBitRate+i]];
        }
    }
    else if (streamType == 1) {
        //framerate
        [m_FPS removeAllObjects];
        if (m_stuCaps.stuExtraFormatCaps[0].nFPSMax == 0) {
            m_stuCaps.stuExtraFormatCaps[0].nFPSMax = 25;
        }
        for (int i = 0; i < m_stuCaps.stuExtraFormatCaps[0].nFPSMax; ++i) {
            [m_FPS addObject:[NSString stringWithFormat:@"%d", i+1]];
        }
        //encode mode
        [m_Compressions removeAllObjects];
        int nH264ProfileRankNum = m_stuCaps.stuExtraFormatCaps[0].nH264ProfileRankNum;
        BYTE *bH264ProfileRank = m_stuCaps.stuExtraFormatCaps[0].bH264ProfileRank;
        for (int i = 0; i < arCompressions.count; ++i) {
            if (m_stuCaps.stuExtraFormatCaps[0].dwEncodeModeMask & (0x01<<i)) {
                if (i == VIDEO_FORMAT_H264 && nH264ProfileRankNum) {
                    for (int j = 0; j < nH264ProfileRankNum; ++j) {
                        [m_Compressions addObject:[NSString stringWithFormat:@"%@",profileName[bH264ProfileRank[j]-1]]];
                    }
                }
                else {
                    [m_Compressions addObject:[NSString stringWithFormat:@"%@", arCompressions[i]]];
                }
            }
        }
        //resolution
        [m_Resolutions removeAllObjects];
        if (!m_stuCaps.stuExtraFormatCaps[0].abIndivResolution) {
            for (int i = 0; i < m_stuCaps.stuExtraFormatCaps[0].nResolutionTypeNum; ++i) {
                int nWidth = m_stuCaps.stuExtraFormatCaps[0].stuResolutionTypes[i].snWidth;
                int nHeight = m_stuCaps.stuExtraFormatCaps[0].stuResolutionTypes[i].snHight;
                int dwImageSizeMask = [self ResolutionIntToSize:nWidth Height:nHeight];
                if (-1 == dwImageSizeMask) {
                    [m_Resolutions addObject:[NSString stringWithFormat:@"%d*%d", nWidth, nHeight]];
                }
                else {
                    [m_Resolutions addObject:arResolutions[dwImageSizeMask]];
                }
            }
        }
        else {
            for (int i = 0; i < arResolutions.count; ++i) {
                if (m_stuCaps.stuExtraFormatCaps[0].dwEncodeModeMask & (0x01<<i)) {
                    for (int j = 0; j < m_stuCaps.stuExtraFormatCaps[0].nIndivResolutionNums[i]; ++j) {
                        int nWidth = m_stuCaps.stuExtraFormatCaps[0].stuIndivResolutionTypes[i][j].snWidth;
                        int nHeight = m_stuCaps.stuExtraFormatCaps[0].stuIndivResolutionTypes[i][j].snHight;
                        int dwImageSizeMask = [self ResolutionIntToSize:nWidth Height:nHeight];
                        if (-1 == dwImageSizeMask) {
                            [m_Resolutions addObject:[NSString stringWithFormat:@"%d*%d",nWidth, nHeight]];
                        }
                        else {
                            [m_Resolutions addObject:arResolutions[dwImageSizeMask]];
                        }
                    }
                    break;
                }
            }
        }
        //bitrate
        [m_BitRate removeAllObjects];
        int nMinBitRate = 0;
        int nMaxBitRate = 0;
//        for (int i = 0; i < 32; ++i) {
//            if (m_stuCaps.stuExtraFormatCaps[0].nMinBitRateOptions == [arBitRate[i] intValue]) {
//                nMinBitRate = i;
//            }
//            if (m_stuCaps.stuExtraFormatCaps[0].nMaxBitRateOptions == [arBitRate[i] intValue]) {
//                nMaxBitRate = i;
//            }
//        }
//        for (int i = 0; i < (nMaxBitRate - nMinBitRate + 1); ++i) {
//            [m_BitRate addObject:arBitRate[nMinBitRate+i]];
//        }
        for (int i = 0; i < arBitRate.count; ++i) {
            if (0 == nMinBitRate && m_stuCaps.stuExtraFormatCaps[0].nMinBitRateOptions <= [arBitRate[i] intValue]) {
                nMinBitRate = i;
                break;
            }
        }
        for (int i = (int)arBitRate.count - 1; i >= 0; --i) {
            if (0 == nMaxBitRate && m_stuCaps.stuExtraFormatCaps[0].nMaxBitRateOptions >= [arBitRate[i] intValue]) {
                nMaxBitRate = i;
                break;
            }
        }
        for (int i = 0; i < (nMaxBitRate - nMinBitRate + 1); ++i) {
            [m_BitRate addObject:arBitRate[nMinBitRate+i]];
        }
    }
}

- (void) InitAudioEncodeCtrl : (int)streamType {
    
    // audio encode mode
    [m_AudioCompressions removeAllObjects];
    
    for (int j = 0; j < m_stuAudioCaps.nValidNum; j++) {
        if (1 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            2 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            3 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            4 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            5 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            8 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            10 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            12 == m_stuAudioCaps.stuListAudioEncode[j].encodeType ||
            13 == m_stuAudioCaps.stuListAudioEncode[j].encodeType) {
                int emAudioCmp = m_stuAudioCaps.stuListAudioEncode[j].encodeType;
                int emCfgAudioCmp = 0;
                if (2 == emAudioCmp) {
                    emCfgAudioCmp = 0;///g711a
                }
                else if (1 == emAudioCmp){
                    emCfgAudioCmp = 1;///pcm
                }
                else if (4 == emAudioCmp){
                    emCfgAudioCmp = 2;///g711u
                }
                else if (3 == emAudioCmp){
                    emCfgAudioCmp = 3;///amr
                }
                else if (8 == emAudioCmp){
                    emCfgAudioCmp = 4;//aac
                }
                else if (5 == emAudioCmp){
                    emCfgAudioCmp = 5;//g726
                }
                else if (12 == emAudioCmp){
                    emCfgAudioCmp = 6;//MPEG2-Layer2
                }
                else if (10 == emAudioCmp){
                    emCfgAudioCmp = 7;//g729
                }
                else if (13 == emAudioCmp){
                    emCfgAudioCmp = 8;//g.722.1
                }
                
                if (![m_AudioCompressions containsObject:arCfgAudioCompression[emCfgAudioCmp]]) {
                    [m_AudioCompressions addObject:arCfgAudioCompression[emCfgAudioCmp]];
                }
            
            unsigned int nFrequency = m_stuAudioCaps.stuListAudioEncode[j].dwSampleRate;
            ++mapAudioEncode[emCfgAudioCmp][0];
            mapAudioEncode[emCfgAudioCmp][mapAudioEncode[emCfgAudioCmp][0]] = nFrequency;
       
            }

        
        }
    [self UpdateSampleRatetable:streamType];
}

- (void) UpdateSampleRatetable : (int)streamType {
    
    // Sample Rate
    [m_SampleRate removeAllObjects];
    
    int nCompression = 0;
    if (streamType == 0) {
        nCompression = m_stuEncodeInfo.stuMainStream[0].stuAudioFormat.emCompression;
    }else {
        nCompression = m_stuEncodeInfo.stuExtraStream[0].stuAudioFormat.emCompression;
    }
    
    for (int i = 1; i <= mapAudioEncode[nCompression][0]; ++i) {
        
        int dwFrequency = [self SampleRateIntToSize:mapAudioEncode[nCompression][i]];
        if (![m_SampleRate containsObject:arSampleRate[dwFrequency]])
        {
            [m_SampleRate addObject:arSampleRate[dwFrequency]];
        }
    }
}

- (BOOL) UpdateEncodeCaps : (int)nChannel StreamType:(int)streamType {
    
    CFG_VIDEO_COMPRESSION emCmp = VIDEO_FORMAT_MPEG4;
    CFG_H264_PROFILE_RANK emProfile = PROFILE_BASELINE;
    BOOL bFind = FALSE;
    bFind = [profileName containsObject: m_Subtitles[0]];
    if (bFind) {
        emCmp = VIDEO_FORMAT_H264;
        NSUInteger nIndex = [profileName indexOfObject:m_Subtitles[0]];
        emProfile = (CFG_H264_PROFILE_RANK)(nIndex + 1);
    }
    if (FALSE == bFind) {
        bFind = [arCompressions containsObject:m_Subtitles[0]];
        if (bFind) {
            NSUInteger nIndex = [arCompressions indexOfObject:m_Subtitles[0]];
            emCmp = (CFG_VIDEO_COMPRESSION)nIndex;
        }
    }
    bFind = FALSE;
    int nWidth = 0;
    int nHeight = 0;
    bFind = [arResolutions containsObject:m_Subtitles[1]];
    if (bFind) {
        NSUInteger i = [arResolutions indexOfObject:m_Subtitles[1]];
        [self ResolutionSizeToInt:(int)i Width:nWidth Height:nHeight];
    }
    if (FALSE == bFind) {
        NSArray *arr = [m_Subtitles[1] componentsSeparatedByString:@"*"];
        nWidth = [arr[0] intValue];
        nHeight = [arr[1] intValue];
    }
    bFind = FALSE;
    int nFPS = [m_Subtitles[2] intValue];
    int nBitRate = [m_Subtitles[3] intValue];
    
    // updateencodecaps
    if (0 == streamType) {
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emCompression = emCmp;
        if (emCmp == VIDEO_FORMAT_H264) {
            m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.abProfile = TRUE;
            m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.emProfile = emProfile;
        }
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nWidth = nWidth;
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nHeight = nHeight;
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nFrameRate = nFPS * 1.0f;
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nBitRate = nBitRate;
        m_stuEncodeInfo.stuMainStream[0].stuVideoFormat.nIFrameInterval = nFPS * 2;
    }
    else {
    
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emCompression = emCmp;
        if (emCmp == VIDEO_FORMAT_H264) {
            m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.abProfile = TRUE;
            m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.emProfile = emProfile;
        }
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nWidth = nWidth;
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nHeight = nHeight;
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nFrameRate = nFPS * 1.0f;
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nBitRate = nBitRate;
        m_stuEncodeInfo.stuExtraStream[0].stuVideoFormat.nIFrameInterval = nFPS * 2;
    }
    
    
    
    char *szBuf = new char[BUF_LENG];
    memset(szBuf, 0, BUF_LENG);
    BOOL bRet = CLIENT_PacketData((char*)CFG_CMD_ENCODE, (char*)&m_stuEncodeInfo, sizeof(CFG_ENCODE_INFO), szBuf, BUF_LENG);
    if (bRet) {
        memset(&m_stuCaps, 0, sizeof(NET_OUT_ENCODE_CFG_CAPS));
        NET_IN_ENCODE_CFG_CAPS stuInEncodeCaps = {sizeof(stuInEncodeCaps)};
        stuInEncodeCaps.nChannelId = nChannel;
        stuInEncodeCaps.pchEncodeJson = szBuf;
        m_stuCaps.dwSize = sizeof(NET_OUT_ENCODE_CFG_CAPS);
        for (int i = 0; i < 3; ++i) {
            m_stuCaps.stuMainFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
            m_stuCaps.stuExtraFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
        }
        for (int i = 0; i < 2; ++i) {
            m_stuCaps.stuSnapFormatCaps[i].dwSize = sizeof(NET_STREAM_CFG_CAPS);
        }
        bRet = CLIENT_GetDevCaps(g_loginID, NET_ENCODE_CFG_CAPS, &stuInEncodeCaps, &m_stuCaps, TIME_OUT);
        if (bRet) {
            [self InitEncodeCtrl:streamType];
            [self checkCompression];
            [self checkResolution];
            [self checkFrameRateRange];
            [self checkBitRateRange];
        }
    }
    delete [] szBuf;
    szBuf = NULL;
    return bRet;
}

- (BOOL) UpdateAudioEncodeCaps : (int)nChannel StreamType:(int)streamType {
    
    CFG_AUDIO_FORMAT emAudioCmp = AUDIO_FORMAT_G711A;
    BOOL bFind = FALSE;
    bFind = [arCfgAudioCompression containsObject:m_AudioSubtitles[0]];
    if (bFind) {
        NSUInteger nIndex = [arCfgAudioCompression indexOfObject:m_AudioSubtitles[0]];
        emAudioCmp = (CFG_AUDIO_FORMAT)nIndex;
    }


    bFind = FALSE;
    int nFrequency = [m_AudioSubtitles[1] intValue];
    
    // update audio encode caps
    if (0 == streamType) {
        m_stuEncodeInfo.stuMainStream[0].stuAudioFormat.emCompression = emAudioCmp;
        m_stuEncodeInfo.stuMainStream[0].stuAudioFormat.nFrequency = nFrequency;
    }
    else {
        m_stuEncodeInfo.stuExtraStream[0].stuAudioFormat.emCompression = emAudioCmp;
        m_stuEncodeInfo.stuExtraStream[0].stuAudioFormat.nFrequency = nFrequency;

    }
    
    char *szBuf = new char[BUF_LENG];
    memset(szBuf, 0, BUF_LENG);
    BOOL bRet = CLIENT_PacketData((char*)CFG_CMD_ENCODE, (char*)&m_stuEncodeInfo, sizeof(CFG_ENCODE_INFO), szBuf, BUF_LENG); 
        if (bRet) {
            [self UpdateSampleRatetable:streamType];
          //  [self InitAudioEncodeCtrl:streamType];
            [self checkAudioCompression];
            [self checkSampleRate];
        }
        else
        {
            NSLog(@"error is %x",CLIENT_GetLastError());
        }
    return bRet;
    }



- (void) checkCompression {
    BOOL bRet = [m_Compressions containsObject:m_Subtitles[0]];
    if (!bRet) {
        if (m_Compressions.count > 0) {
            [m_Subtitles replaceObjectAtIndex:0 withObject:m_Compressions[m_Compressions.count - 1]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:0 withObject:@""];
        }
    }
}

- (void) checkResolution {
    
    BOOL bRet = [m_Resolutions containsObject:m_Subtitles[1]];
    if (!bRet) {
        if (m_Resolutions.count > 0) {
            [m_Subtitles replaceObjectAtIndex:1 withObject:m_Resolutions[m_Resolutions.count-1]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:1 withObject:@""];
        }
    }
}

- (void) checkFrameRateRange {
    BOOL bRet = [m_FPS containsObject:m_Subtitles[2]];
    if (!bRet) {
        if (m_FPS.count > 0) {
            [m_Subtitles replaceObjectAtIndex:2 withObject:m_FPS[m_FPS.count - 1]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:2 withObject:@""];
        }
    }
}

- (void) checkBitRateRange {
    BOOL bRet = [m_BitRate containsObject:m_Subtitles[3]];
    if (!bRet) {
        if (m_BitRate.count > 0) {
            [m_Subtitles replaceObjectAtIndex:3 withObject:m_BitRate[m_BitRate.count - 1]];
        }
        else {
            [m_Subtitles replaceObjectAtIndex:3 withObject:@""];
        }
    }
}

- (void) checkAudioCompression {
    BOOL bRet = [m_AudioCompressions containsObject:m_AudioSubtitles[0]];
    if (!bRet) {
        if (m_AudioCompressions.count > 0) {
            [m_AudioSubtitles replaceObjectAtIndex:0 withObject:m_AudioCompressions[m_AudioCompressions.count - 1]];
        }
        else {
            [m_AudioSubtitles replaceObjectAtIndex:0 withObject:@""];
        }
    }
}

- (void) checkSampleRate {
    
    BOOL bRet = [m_SampleRate containsObject:m_AudioSubtitles[1]];
    if (!bRet) {
        if (m_SampleRate.count > 0) {
            [m_AudioSubtitles replaceObjectAtIndex:1 withObject:m_SampleRate[m_SampleRate.count-1]];
        }
        else {
            [m_AudioSubtitles replaceObjectAtIndex:1 withObject:@""];
        }
    }
}

- (BOOL) SetConfig :(int)nChannel {
    
    char *szBuf = new char[BUF_LENG];
    memset(szBuf, 0, BUF_LENG);
    int nError = 0;
    int nRestart = 0;
    BOOL bRet = CLIENT_PacketData((char*)CFG_CMD_ENCODE, &m_stuEncodeInfo, sizeof(m_stuEncodeInfo), szBuf, BUF_LENG);
    if (bRet) {
        bRet = CLIENT_SetNewDevConfig(g_loginID, (char*)CFG_CMD_ENCODE, nChannel, szBuf, BUF_LENG, &nError, &nRestart, TIME_OUT);
        if (!bRet) {
            NSLog(@"error is %x",CLIENT_GetLastError());
        }
    }
    
    
    
    return bRet;
}


- (int) ResolutionIntToSize : (int)nWidth Height:(int)nHeight {
    
    int nResolution = 0;
    if (nWidth == 704 && nHeight == 576)
    {
        nResolution = 0;
    }
    else if (nWidth == 352 && nHeight == 576)
    {
        nResolution = 1;
    }
    else if (nWidth == 704 && nHeight == 288)
    {
        nResolution = 2;
    }
    else if (nWidth == 352 && nHeight == 288)
    {
        nResolution = 3;
    }
    else if (nWidth == 176 && nHeight == 144)
    {
        nResolution = 4;
    }
    else if (nWidth == 640 && nHeight == 480)
    {
        nResolution = 5;
    }
    else if (nWidth == 320 && nHeight == 240)
    {
        nResolution = 6;
    }
    else if (nWidth == 480 && nHeight == 480)
    {
        nResolution = 7;
    }
    else if (nWidth == 160 && nHeight == 128)
    {
        nResolution = 8;
    }
    else if (nWidth == 800 && nHeight == 592)
    {
        nResolution = 9;
    }
    else if (nWidth == 1024 && nHeight == 768)
    {
        nResolution = 10;
    }
    else if (nWidth == 1280 && nHeight == 800)
    {
        nResolution = 11;
    }
    else if (nWidth == 1280 && nHeight == 1024)
    {
        nResolution = 12;
    }
    else if (nWidth == 1600 && nHeight == 1024)
    {
        nResolution = 13;
    }
    else if (nWidth == 1600 && nHeight == 1200)
    {
        nResolution = 14;
    }
    else if (nWidth == 1920 && nHeight == 1200)
    {
        nResolution = 15;
    }
    else if (nWidth == 240 && nHeight == 192)
    {
        nResolution = 16;
    }
    else if (nWidth == 1280 && nHeight == 720)
    {
        nResolution = 17;
    }
    else if (nWidth == 1920 && nHeight == 1080)
    {
        nResolution = 18;
    }
    else if (nWidth == 1280 && nHeight == 960)
    {
        nResolution = 19;
    }
    else if (nWidth == 1872 && nHeight == 1408)
    {
        nResolution = 20;
    }
    else if (nWidth == 3744 && nHeight == 1408)
    {
        nResolution = 21;
    }
    else if (nWidth == 2048 && nHeight == 1536)
    {
        nResolution = 22;
    }
    else if (nWidth == 2432 && nHeight == 2050)
    {
        nResolution = 23;
    }
    else if (nWidth == 1216 && nHeight == 1024)
    {
        nResolution = 24;
    }
    else if (nWidth == 1408 && nHeight == 1024)
    {
        nResolution = 25;
    }
    else if (nWidth == 3296 && nHeight == 2472)
    {
        nResolution = 26;
    }
    else if (nWidth == 2560 && nHeight == 1920)
    {
        nResolution = 27;
    }
    else if (nWidth == 960 && nHeight == 576)
    {
        nResolution = 28;
    }
    else if (nWidth == 960 && nHeight == 720)
    {
        nResolution = 29;
    }
    else if (nWidth == 640 && nHeight == 360)
    {
        nResolution = 30;
    }
    else if (nWidth == 320 && nHeight == 180)
    {
        nResolution = 31;
    }
    else if (nWidth == 160 && nHeight == 90)
    {
        nResolution = 32;
    }
    else if (nWidth == 4000 && nHeight == 3000)
    {
        nResolution = 33;
    }
    else if (nWidth == 4096 && nHeight == 2160)
    {
        nResolution = 34;
    }
    else if (nWidth == 3840 && nHeight == 2160)
    {
        nResolution = 35;
    }
    else
    {
        nResolution = -1;
    }
    return nResolution;
    
}

- (void) ResolutionSizeToInt : (int)nSize Width:(int&)nWidth Height:(int&)nHeight {
    switch (nSize)
    {
        case 0:
            nWidth = 704 ; nHeight = 576 ;
            break;
        case 1:
            nWidth = 352 ; nHeight = 576 ;
            break;
        case 2:
            nWidth = 704 ; nHeight = 288 ;
            break;
        case 3:
            nWidth = 352 ; nHeight = 288 ;
            break;
        case 4:
            nWidth = 176 ; nHeight = 144 ;
            break;
        case 5:
            nWidth = 640 ; nHeight = 480 ;
            break;
        case 6:
            nWidth = 320 ; nHeight = 240 ;
            break;
        case 7:
            nWidth = 480 ; nHeight = 480 ;
            break;
        case 8:
            nWidth = 160 ; nHeight = 128 ;
            break;
        case 9:
            nWidth = 800 ; nHeight = 592 ;
            break;
        case 10:
            nWidth = 1024 ; nHeight = 768 ;
            break;
        case 11:
            nWidth = 1280 ; nHeight = 800 ;
            break;
        case 12:
            nWidth = 1280 ; nHeight = 1024 ;
            break;
        case 13:
            nWidth = 1600 ; nHeight = 1024 ;
            break;
        case 14:
            nWidth = 1600 ; nHeight = 1200 ;
            break;
        case 15:
            nWidth = 1920 ; nHeight = 1200 ;
            break;
        case 16:
            nWidth = 240 ; nHeight = 192 ;
            break;
        case 17:
            nWidth = 1280 ; nHeight = 720 ;
            break;
        case 18:
            nWidth = 1920 ; nHeight = 1080 ;
            break;
        case 19:
            nWidth = 1280 ; nHeight = 960 ;
            break;
        case 20:
            nWidth = 1872 ; nHeight = 1408 ;
            break;
        case 21:
            nWidth = 3744 ; nHeight = 1408 ;
            break;
        case 22:
            nWidth = 2048 ; nHeight = 1536 ;
            break;
        case 23:
            nWidth = 2432 ; nHeight = 2050 ;
            break;
        case 24:
            nWidth = 1216 ; nHeight = 1024 ;
            break;
        case 25:
            nWidth = 1408 ; nHeight = 1024 ;
            break;
        case 26:
            nWidth = 3296 ; nHeight = 2472 ;
            break;
        case 27:
            nWidth = 2560 ; nHeight = 1920 ;
            break;
        case 28:
            nWidth = 960 ; nHeight = 576 ;
            break;
        case 29:
            nWidth = 960 ; nHeight = 720 ;
            break;
        case 30:
            nWidth = 640 ; nHeight = 360 ;
            break;
        case 31:
            nWidth = 320 ; nHeight = 180 ;
            break;
        case 32:
            nWidth = 160 ; nHeight = 90 ;
            break;
        case 33:
            nWidth = 4000; nHeight = 3000;
            break;
        case 34:
            nWidth = 4096; nHeight = 2160;
            break;
        case 35:
            nWidth = 3840; nHeight = 2160;
            break;
        default:
            break;
    }
}


- (int) SampleRateIntToSize : (int)nFrequency {
    int dwFrequency = 0;
    switch (nFrequency) {
        case 8000:
            dwFrequency = 0;
            break;
        case 16000:
            dwFrequency = 1;
            break;
        case 32000:
            dwFrequency = 2;
            break;
        case 48000:
            dwFrequency = 3;
            break;
        case 64000:
            dwFrequency = 4;
            break;
            
        default:
            break;
    }
    return dwFrequency;
    
}


@end
