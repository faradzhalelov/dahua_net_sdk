//
//  EncodeConfig.h
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/19.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface EncodeConfig : NSObject


@property (nonatomic) NSMutableArray *m_Resolutions;
@property (nonatomic) NSMutableArray *m_Compressions;
@property (nonatomic) NSMutableArray *m_BitRate;
@property (nonatomic) NSMutableArray *m_FPS;
@property (nonatomic) NSMutableArray *m_Subtitles;

@property (nonatomic) NSMutableArray *m_AudioCompressions;
@property (nonatomic) NSMutableArray *m_SampleRate;
@property (nonatomic) NSMutableArray *m_AudioSubtitles;

- (void) InitArray;


- (BOOL) GetEncodeConfig : (int)nChannel StreamType:(int)streamType;
- (void) InitEncodeCtrl : (int)streamType;
- (BOOL) setSubtitlesRange : (int)streamType;
- (BOOL) UpdateEncodeCaps : (int)nChannel StreamType:(int)streamType;
- (BOOL) SetConfig :(int)nChannel;

- (BOOL) setAudioSubtitlesRange : (int)streamType;
- (void) InitAudioEncodeCtrl:(int)streamType;
- (BOOL) GetAudioEncodeCfg : (int)nChannel StreamType:(int)streamType;
- (BOOL) UpdateAudioEncodeCaps : (int)nChannel StreamType:(int)streamType;


@end
