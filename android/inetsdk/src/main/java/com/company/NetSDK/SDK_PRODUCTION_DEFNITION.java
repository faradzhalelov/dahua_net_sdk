package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Production definition
 * \else
 * 产品定义
 * \endif
 */
public class SDK_PRODUCTION_DEFNITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int					nVideoInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * 视频输出通道数
	 * \endif
	 */
	public int					nVideoOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote decode channel amount
	 * \else
	 * 远程解码通道数
	 * \endif
	 */
	public int					nRemoteDecChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * 设备类型
	 * \endif
	 */
	public char				szDevType[] = new char[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM customer
	 * \else
	 * OEM客户
	 * \endif
	 */
	public char				szVendor[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM version
	 * \else
	 * OEM版本
	 * \endif
	 */
	public int					nOEMVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Main version No.
	 * \else
	 * 主版本号
	 * \endif
	 */
	public int					nMajorVerion;
	
	/**
	 * \if ENGLISH_LANG
	 * SUb version No.
	 * \else
	 * 次版本号
	 * \endif
	 */
	public int					nMinorVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Revision version
	 * \else
	 * 修订版本
	 * \endif
	 */
	public int					nRevision;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version
	 * \else
	 * Web版本
	 * \endif
	 */
	public char				szWebVerion[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Default setup
	 * \else
	 * 默认语言
	 * \endif
	 */
	public char				szDefLanguage[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Release time. Unit is second.
	 * \else
	 * 发布时间, 精确到秒
	 * \endif
	 */
	public NET_TIME			stuBuildDateTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * 音频输入通道数
	 * \endif
	 */
	public int					nAudioInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * 音频输出通道数
	 * \endif
	 */
	public int					nAudioOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Support schedule storage or not.
	 * \else
	 * 是否支持定时存储
	 * \endif
	 */
	public boolean				bGeneralRecord;
	
	/**
	 * \if ENGLISH_LANG
	 * Support local storage or not.
	 * \else
	 * 是否支持本地存储
	 * \endif
	 */
	public boolean				bLocalStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support network storage or not.
	 * \else
	 * 是否支持网络存储
	 * \endif
	 */
	public boolean				bRemoteStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support emergency local storage or not.
	 * \else
	 * 是否支持紧急存储到本地
	 * \endif
	 */
	public boolean				bLocalurgentStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support real-time compression storage or not.
	 * \else
	 * 是否支持实时压缩存储
	 * \endif
	 */
	public boolean				bRealtimeCompress;
	
	/**
	 * \if ENGLISH_LANG
	 * The video format supported. bit0-PAL, bit1-NTSC
	 * \else
	 * 支持的视频制式列表, bit0-PAL, bit1-NTSC
	 * \endif
	 */
	public int					dwVideoStandards;
	
	/**
	 * \if ENGLISH_LANG
	 * Default video format, 0-PAL, 1-NTSC
	 * \else
	 * 端默认视频制式, 0-PAL, 1-NTSC
	 * \endif
	 */
	public int					nDefVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Max extra stream channel amount
	 * \else
	 * 最大辅码流路数
	 * \endif
	 */
	public int					nMaxExtraStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote record channel amount
	 * \else
	 * 远程录像通道数
	 * \endif
	 */
	public int					nRemoteRecordChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote snap channel amount
	 * \else
	 * 远程抓图通道数
	 * \endif
	 */
	public int					nRemoteSnapChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote video analysis channel amount
	 * \else
	 * 远程视频分析通道数
	 * \endif
	 */
	public int					nRemoteVideoAnalyseChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote real-time stream transmit max channel amount
	 * \else
	 * 远程实时流转发最大通道数
	 * \endif
	 */
	public int					nRemoteTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote transmit file channel amount
	 * \else
	 * 远程文件流竹筏通道通道数
	 * \endif
	 */
	public int					nRemoteTransmitFileChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max network transmit channel amount
	 * \else
	 * 最大网络传输通道总数
	 * \endif
	 */
	public int					nStreamTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max read file channel amount
	 * \else
	 * 最大读文件流通道总数
	 * \endif
	 */
	public int					nStreamReadChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network send capability, kbps
	 * \else
	 * 最大码流网络发送能力, kbps
	 * \endif
	 */
	public int					nMaxStreamSendBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network interface capability, kbps
	 * \else
	 * 最大码流网络接口能力, kbps
	 * \endif
	 */
	public int					nMaxStreamRecvBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Old compression file or not. Delete P frame and save I frame.
	 * \else
	 * 是否压缩旧文件, 去除P帧, 保留I帧
	 * \endif
	 */
	public boolean				bCompressOldFile;
	
	/**
	 * \if ENGLISH_LANG
	 * Support RAID or not.
	 * \else
	 * 是否支持RAID
	 * \endif
	 */
	public boolean				bRaid;
	
	/**
	 * \if ENGLISH_LANG
	 * Max pre-record time.Unit is second.
	 * \else
	 * 最大预录时间, s
	 * \endif
	 */
	public int					nMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ alarm or not.
	 * \else
	 * 是否支持云台报警
	 * \endif
	 */
	public boolean				bPtzAlarm;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ or not.
	 * \else
	 * 是否支持云台
	 * \endif
	 */
	public boolean				bPtz;
	
	/**
	 * \if ENGLISH_LANG
	 * Support corresponding function of the ATM or not.
	 * \else
	 * 是否显示ATM相关功能
	 * \endif
	 */
	public boolean				bATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Support 3G module or not.
	 * \else
	 * 是否支持3G模块
	 * \endif
	 */
	public boolean				b3G;
	
	/**
	 * \if ENGLISH_LANG
	 * With number button or not.
	 * \else
	 * 是否带数字键
	 * \endif
	 */
	public boolean				bNumericKey;
	
	/**
	 * \if ENGLISH_LANG
	 * With Shift button or not.
	 * \else
	 * 是否带Shift键
	 * \endif
	 */
	public boolean			bShiftKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Number character map sheet is right or not.
	 * \else
	 * 数字字母映射表是否正确
	 * \endif
	 */
	public boolean				bCorrectKeyMap;
	
	/**
	 * \if ENGLISH_LANG
	 * The new 2nd ATM front panel.
	 * \else
	 * 新的二代ATM前面板
	 * \endif
	 */
	public boolean				bNewATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder or not
	 * 是否是解码器
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder info. Valid when bDecoder=true.bDecoder=true
	 * \else
	 * 解码器信息, bDecoder=true时有效
	 * \endif
	 */
	public DEV_DECODER_INFO		stuDecoderInfo = new DEV_DECODER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Integration ceiling screen output channel
	 * \else
	 * 融合屏输出通道上限
	 * \endif
	 */
	public int					nVideoOutputCompositeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Support WPS or not
	 * \else
	 * 是否支持WPS功能
	 * \endif
	 */
	public boolean                bSupportedWPS;
	
	/**
	 * \if ENGLISH_LANG
	 * VGA video output channel number
	 * \else
	 * VGA视频输出通道数
	 * \endif
	 */
	public int					nVGAVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * TV video output channel number
	 * \else
	 * TV视频输出通道数
	 * \endif
	 */
	public int					nTVVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of remote channels
	 * \else
	 * 最大远程通道数
	 * \endif
	 */
	public int					nMaxRemoteInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of matrix channels
	 * \else
	 * 最大矩阵通道数
	 * \endif
	 */
	public int					nMaxMatrixInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of road ways 1~6
	 * \else
	 * 智能交通最大车道数 1~6
	 * \endif
	 */
	public int                 nMaxRoadWays;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of screen when docking with the camera 0~20
	 * \else
	 * 和相机对接最多支持的区域屏个数 0~20
	 * \endif
	 */
	public int                 nMaxParkingSpaceScreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台水平最小角度, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台水平最大角度, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台垂直最小角度, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台垂直最大角度, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 是否支持云台功能菜单
	 * \endif
	 */
	public boolean				bPtzFunctionMenu;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 是否支持灯光控制
	 * \endif
	 */
	public boolean				bLightingControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 手动灯光控制模式, 按位, 见NET_LIGHTING_CTRL_ON_OFF
	 * \endif
	 */
	public int				dwLightingControlMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 近光灯组数量, 0表示不支持
	 * \endif
	 */
	public int					nNearLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 远光灯组数量, 0表示不支持
	 * \endif
	 */
	public int					nFarLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 是否支持控制聚焦
	 * \endif
	 */
	public boolean				bFocus;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 是否支持控制光圈
	 * \endif
	 */
	public boolean				bIris;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 云台支持的协议列表, 可以是多个, 每个用';'分隔
	 * \endif
	 */
	public char				szPtzProtocolList[] = new char[FinalVar.SDK_COMMON_STRING_1024];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 是否支持雨刷控制
	 * \endif
	 */
	public boolean			bRainBrushControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 雨刷数量, 为0时表示不支持
	 * \endif
	 */
	public int					nBrushNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix input channel, the subscript corresponding matrix number
	 * \else
	 * 下位矩阵视频输入通道, 下标对应矩阵编号
	 * \endif
	 */
	public int                 szLowerMatrixInputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix output channel, the subscript corresponding matrix number
	 * \else
	 * 下位矩阵视频输出通道, 下标对应矩阵编号
	 * \endif
	 */
	public int				   szLowerMatrixOutputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * support intelligent analysis or not
	 * \else
	 * 是否支持智能分析
	 * \endif
	 */
	public boolean             bSupportVideoAnalyse;                   
	
	/**
	 * \if ENGLISH_LANG
	 * support intelligent tracking or not
	 * \else
	 * 是否支持智能跟踪
	 * \endif
	 */
    public boolean             bSupportIntelliTracker; 

	/**
	 * \if ENGLISH_LANG
	 * support intelligent tracking or not
     * device supported violation type mask(by bit Get )
     * 0-run the red light 1-cross line  2-retrogradation  3-under speed 4-over speed 5-car in lane 6-yellow plate in lane 7-violation driving￡¨left, right, u-turn￡?
     * 8-violation enter waiting zone 9-illegal parking 10-Traffic jam 11-driving not by lane 12-illegal lane change 13-cross yellow line 14-should driving
     * 15-manual snapshot 16-illegal retention 17-cross-walk pedestration first 18-over flow 19-under flow 20-illegal in lane 21-illegal back car
     * 22-cross stop line 23-run yellow light 24-yellow grid line parking 25-car in parking 26-car not in parking 27-car in parking cross line  28-limited plate
     * 29-no pass 30-unfasten seat belt 31-driver smoking
	 * \else
	 * 设备支持的类型掩码(按位获取)
	 * 0-闯红灯 1-压线 2-逆行 3-欠速 4-超速 5-有车占道 6-黄牌占道 7-行驶（左转、右转、调头）
     * 8-进入待行区 9-停车 10-交通拥堵 11-不按车道行驶 12-变道 13-压黄线 14-路肩行驶
     * 15-手动抓拍 16-滞留 17-斑马线行人优先 18-流量过大 19-流量过小 20-占道 21-倒车
     * 22-压停止线 23-闯黄灯 24-黄网格线停车 25-车位有车 26-车位无车 27-车位有车压线 28-受限车牌
     * 29-禁行 30-不系安全带 31-驾驶员抽烟
	 * \endif
	 */
    public int                 nSupportBreaking;                       

	/**
	 * \if ENGLISH_LANG
	 * 0-driver call 1-traffic-pedestrian red-light running 2-Traffic Jam Forbid Into 3-Pass Not In Order
	 * \else
	 * 0-驾驶员打电话 1-行人闯红灯 2-车辆拥堵禁入 3-未按规定依次交替通行
	 * \endif
	 */
    public int               nSupportBreaking1;
    
	/**
	 * \if ENGLISH_LANG
	 * IVS
	 * \else
	 * 智能分析
	 * \endif
	 */
    public NET_PD_VIDEOANALYSE stuVideoAnalyse = new NET_PD_VIDEOANALYSE();
    
	/**
	 * \if ENGLISH_LANG
	 * support talk-transfer or not
	 * \else
	 * 是否支持转发对讲功能
	 * \endif
	 */
    public boolean                bTalkTransfer;

	/**
	 * \if ENGLISH_LANG
	 * support PTZ function or not
	 * \else
	 * 是否支持球机摄像头属性页面
	 * \endif
	 */
	public boolean				bCameraAttribute;

	/**
	 * \if ENGLISH_LANG
	 * support audio properties or not
	 * \else
	 * 是否支持由应用主控的云台功能逻辑
	 * \endif
	 */
	public boolean				bPTZFunctionViaApp;

	/**
	 * \if ENGLISH_LANG
	 * support camera id osd or not
	 * \else
	 * 喇叭是否支持语音播报
	 * \endif
	 */
	public boolean				bAudioProperties;

	/**
	 * \if ENGLISH_LANG
	 * support place osd or not
	 * \else
	 * 是否支持摄像机编号叠加
	 * \endif
	 */
	public boolean				bIsCameraIDOsd;

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * 是否支持地点信息叠加
	 * \endif
	 */
	public boolean				bIsPlaceOsd;

	/**
	 * \if ENGLISH_LANG
	 * the audio channel type
	 * \else
	 * 地理位置叠加最大支持行数
	 * \endif
	 */
	public int		nMaxGeographyTitleLine;

	/**
	 * \if ENGLISH_LANG
	 * Vendor abbreviation {@link EM_AUDIO_CHANNEL_TYPE}
	 * \else
	 * 设备声道支持类型 {@link EM_AUDIO_CHANNEL_TYPE}
	 * \endif
	 */
	public int emAudioChannel;

	/**
	 * \if ENGLISH_LANG
	 * Software release type
	 * \else
	 * 厂商缩写
	 * \endif
	 */
	public byte				szVendorAbbr[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 * Is video nexus or not
	 * \else
	 * 软件发布类型
	 * \endif
	 */
	public byte				szTypeVersion[] = new byte[FinalVar.SDK_COMMON_STRING_32];

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * 是否是基线
	 * \endif
	 */
	public boolean				bIsVideoNexus;

	/**
	 * \if ENGLISH_LANG
	 * WIFI scan and config support version type  {@link EM_WLAN_SCAN_AND_CONFIG_TYPE}
	 * \else
	 * WIFI扫描及配置支持的版本类型 {@link EM_WLAN_SCAN_AND_CONFIG_TYPE}
	 * \endif
	 */
	public int emWlanScanAndConfig;

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * IPC是否支持镜头调节到负角度，进行结构遮挡
	 * \endif
	 */
	public boolean                bSupportLensMasking;
}

