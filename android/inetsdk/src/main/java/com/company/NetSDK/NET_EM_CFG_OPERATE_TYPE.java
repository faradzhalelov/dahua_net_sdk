package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetConfig}/{@link INetSDK#SetConfig} operate type
 * \else
 * {@link INetSDK#GetConfig}/{@link INetSDK#SetConfig} 操作类型
 * \endif
 */
public class NET_EM_CFG_OPERATE_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap Mode Config of device , corresponding to {@link NET_SNAP_MODE}
	 * \else
	 * 抓图模式配置,对应结构体 {@link NET_SNAP_MODE}
	 * \endif
	 */
	public static final int NET_EM_CFG_SNAP_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Railway record config,corresponding to struct {@link NET_DEV_CAR_COACH_INFO}
	 * \else
	 * 铁路记录配置, 对应结构体 {@link NET_DEV_CAR_COACH_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_DEV_CAR_COACH = 1;

	/**
	 * \if ENGLISH_LANG
	 * media global config,corresponding to struct {@link NET_MEDIA_GLOBAL_INFO}
	 * \else
	 * 媒体组件全局配置, 对应结构体 {@link NET_MEDIA_GLOBAL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_MEDIA_GLOBAL = 3;

	/**
	 * \if ENGLISH_LANG
	 * Coaxial Light Config, corresponding to struct {@link NET_CFG_COAXIAL_LIGHT_INFO}
	 * \else
	 * 白光灯视频通道配置, 对应结构体 {@link NET_CFG_COAXIAL_LIGHT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_COAXIAL_LIGHT = 6;

	/**
	 * \if ENGLISH_LANG
	 * media encrypt config, corresponding to struct {@link NET_MEDIA_ENCRYPT_INFO}
	 * \else
	 * 媒体数据加密配置, 对应结构体 {@link NET_MEDIA_ENCRYPT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_MEDIA_ENCRYPT = 9;

	/**
	 * \if ENGLISH_LANG
	 * Video standard config,not related to channels,ChannelID must be fill in -1, device currently not support SECAM  {@link NET_CFG_VIDEOSTANDARD_INFO}
	 * \else
	 * 视频制式配置,与通道不相关,通道号需要填成-1, 目前设备不支持配置SECAM制式 {@link NET_CFG_VIDEOSTANDARD_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOSTANDARD = 11;

	/**
	 * \if ENGLISH_LANG
	 * RTMP config, corresponding to NET_CFG_RTMP_INFO,not related to channels,ChannelID must be fill in -1 {@link NET_CFG_RTMP_INFO}
	 * \else
	 * RTMP 配置，对应结构体 NET_CFG_RTMP_INFO，与通道不相关,通道号需要填成-1 {@link NET_CFG_RTMP_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_RTMP = 17;

	/**
	 * \if ENGLISH_LANG
	 * Debug info redirection, corresponding to {@link NET_CFG_DEBUGINFO_REDIR_INFO}
	 * \else
	 * 串口日志重定向配置, {@link NET_CFG_DEBUGINFO_REDIR_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_DEBUGINFO_REDIR = 21;

	/**
	 * \if ENGLISH_LANG
	 * Motion Detect configuration, corresponding to {@link NET_CFG_MOTION_DETECT_INFO}
	 * \else
	 * 动态检测报警配置, {@link NET_CFG_MOTION_DETECT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_MOTION_DETECT = 38;

	/**
	 * \if ENGLISH_LANG
	 * LLDPConfig Global Configuration,not related to channels, ChannelID must be fill in -1, corresponding to {@link NET_CFG_LLDP_GLOBAL_INFO}
	 * \else
	 * LLDPConfig 全局配置,与通道不相关,通道号需要填成-1, {@link NET_CFG_LLDP_GLOBAL_INFO}
	 * \endif
	 */
	public static final int	NET_EM_CFG_LLDP_GLOBAL = 55;

	/**
	 * \if ENGLISH_LANG
	 * Hibernation policy configuration, corresponding to {@link NET_CFG_PASSENGER_FLOW_STAT_INFO}
	 * \else
	 * 休眠策略配置, {@link NET_CFG_PASSENGER_FLOW_STAT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_SLEEPING_CONTROL = 74;

	/**
	 * \if ENGLISH_LANG
	 * Passenger Flow statistics Config, corresponding to {@link NET_CFG_PASSENGER_FLOW_STAT_INFO}
	 * \else
	 * 控制每路外部报警是否开启对应的客流统计功能, {@link NET_CFG_PASSENGER_FLOW_STAT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_PASSENGER_FLOW_STAT = 75;

	/**
	 * \if ENGLISH_LANG
	 * RemoteLLDPGlobal Global configuration, corresponding to {@link NET_CFG_REMOTE_LLDP_GLOBAL_INFO}
	 * \else
	 * RemoteLLDPGlobal 全局配置, {@link NET_CFG_REMOTE_LLDP_GLOBAL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_REMOTE_LLDP_GLOBAL = 83;

	/**
	 * \if ENGLISH_LANG
	 * Acupick mode configuration, corresponding to {@link NET_CFG_ACUPICK_MODE_INFO}
	 * \else
	 * Acupick模式配置, {@link NET_CFG_ACUPICK_MODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ACUPICK_MODE = 89;

	 /*********OSD叠加相关配置*******************/
	 /**
	 * \if ENGLISH_LANG
	 * Encode widget-channel title config, corresponding to struct {@link NET_OSD_CHANNEL_TITLE}, emOsdBlendType in struct must be set
	 * \else
	 * 叠加通道标题属性配置，对应结构体 {@link NET_OSD_CHANNEL_TITLE}，其中结构体中的emOsdBlendType为必填参数
	 * \endif
	 */
	public static final int NET_EM_CFG_CHANNELTITLE = 1000;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode widget-Time title config, corresponding to {@link NET_OSD_TIME_TITLE}, emOsdBlendType in struct must be set
	 * \else
	 * 叠加时间标题属性配置，对应结构体 {@link NET_OSD_TIME_TITLE}，其中结构体中的emOsdBlendType为必填参数
	 * \endif
	 */
	public static final int NET_EM_CFG_TIMETITLE = 1001;               	
	
	/**
	 * \if ENGLISH_LANG
	 * Encode widget-Self-defined title config, corresponding to {@link NET_OSD_CUSTOM_TITLE}, emOsdBlendType  in struct must be set
	 * \else
	 * 叠加自定义标题属性配置，对应结构体 {@link NET_OSD_CUSTOM_TITLE}，其中结构体中的stuCustomTitle.emOsdBlendType为必填参数
	 * \endif
	 */
	public static final int NET_EM_CFG_CUSTOMTITLE = 1002;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode widget-Self-defined title alignment config, corresponding to {@link NET_OSD_CUSTOM_TITLE_TEXT_ALIGN}
	 * \else
	 * 叠加自定义标题对齐方式属性配置，对应结构体 {@link NET_OSD_CUSTOM_TITLE_TEXT_ALIGN}
	 * \endif
	 */
	public static final int NET_EM_CFG_CUSTOMTITLETEXTALIGN = 1003;  
	
	/**
	 * \if ENGLISH_LANG
	 * Encode widget-common info config, corresponding to {@link NET_OSD_COMM_INFO}
	 * \else
	 * 叠加公共属性配置，对应结构体 {@link NET_OSD_COMM_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_OSDCOMMINFO = 1004;             	
	
	/**
	 * \if ENGLISH_LANG
	 *  Encode widget-PTZ zoom config, corresponding to {@link NET_OSD_PTZZOOM_INFO}
	 * \else
	 * 变倍叠加配置，对应结构体{@link NET_OSD_PTZZOOM_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_OSD_PTZZOOM = 1005;

	/**
	 * \if ENGLISH_LANG
	 *  Picture title,corresponding to {@link NET_OSD_PICTURE_TITLE}
	 * \else
	 * 图片标题,对应结构体{@link NET_OSD_PICTURE_TITLE}
	 * \endif
	 */
	public static final int NET_EM_CFG_PICTURETITLE = 1009;

	/**
	 * \if ENGLISH_LANG
	 *  User defined OSD title,corresponding to {@link NET_OSD_USER_DEF_TITLE}
	 * \else
	 * 用户自定义OSD标题,对应结构体{@link NET_OSD_USER_DEF_TITLE}
	 * \endif
	 */
	public static final int NET_EM_CFG_USER_DEF_TITLE = 1018;

	/**
	 * \if ENGLISH_LANG
	 *  Video OSD national standard mode configuration,corresponding to {@link NET_CFG_GBMODE_INFO}
	 * \else
	 * 视频OSD国标模式配置,对应结构体{@link NET_CFG_GBMODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_GBMODE = 1021;

	/*********encode 相关配置*******************************/
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video options config, corresponding to {@link NET_ENCODE_VIDEO_INFO}
	 * \else
	 * 编码视频格式属性配置，对应结构体 {@link NET_ENCODE_VIDEO_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_VIDEO = 1100; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video pack options config, corresponding to {@link NET_ENCODE_VIDEO_PACK_INFO}
	 * \else
	 * 编码视频格式打包模式配置，对应结构体 {@link NET_ENCODE_VIDEO_PACK_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_VIDEO_PACK = 1101;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video SVC options config, corresponding to {@link NET_ENCODE_VIDEO_SVC_INFO}
	 * \else
	 * 编码视频格式SVC配置，对应结构体 {@link NET_ENCODE_VIDEO_SVC_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_VIDEO_SVC = 1102;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video profile options config, corresponding to {@link NET_ENCODE_VIDEO_PROFILE_INFO}
	 * \else
	 * 编码视频格式profile配置，对应结构体 {@link NET_ENCODE_VIDEO_PROFILE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_VIDEO_PROFILE = 1103; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video audio compression options config, corresponding to {@link NET_ENCODE_AUDIO_COMPRESSION_INFO}
	 * \else
	 * 编码音频压缩格式配置，对应结构体 {@link NET_ENCODE_AUDIO_COMPRESSION_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_AUDIO_COMPRESSION = 1104; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video audio options config, corresponding to {@link NET_ENCODE_AUDIO_INFO}
	 * \else
	 * 编码音频格式配置，对应结构体 {@link NET_ENCODE_AUDIO_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_AUDIO_INFO = 1105; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video snap options config, corresponding to {@link NET_ENCODE_SNAP_INFO}
	 * \else
	 * 编码抓图配置，对应结构体 {@link NET_ENCODE_SNAP_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_SNAP_INFO = 1106;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode-video snap time options config, corresponding to {@link NET_ENCODE_SNAP_TIME_INFO}
	 * \else
	 * 编码抓图时间相关配置，对应结构体 {@link NET_ENCODE_SNAP_TIME_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_SNAPTIME = 1107;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio-input audio source config, corresponding to {@link NET_ENCODE_CHANNELTITLE_INFO}
	 * \else
	 * 通道名称配置，对应结构体 {@link NET_ENCODE_CHANNELTITLE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_CHANNELTITLE = 1108; 	
	
	/**********音频相关配置************************************/
	
	/**
	 * \if ENGLISH_LANG
	 * Audio-denoise config, corresponding to {@link NET_AUDIOIN_DENOISE_INFO}
	 * \else
	 * 音频输入类型配置，对应结构体 {@link NET_AUDIOIN_DENOISE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_AUDIOIN_SOURCE = 1200; 
	
	/**
	 * \if ENGLISH_LANG
	 * Audio-denoise config, corresponding to {@link NET_AUDIOIN_DENOISE_INFO}
	 * \else
	 * 音频降噪配置，对应结构体 {@link NET_AUDIOIN_DENOISE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_AUDIOIN_DENOISE = 1201;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio-volume of audio input, corresponding to {@link NET_AUDIOIN_VOLUME_INFO}
	 * \else
	 * 音频输入音量配置，对应结构体 {@link NET_AUDIOIN_VOLUME_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_AUDIOIN_VOLUME = 1202;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio-volume of audio output, corresponding to {@link NET_AUDIOOUT_VOLUME_INFO}
	 * \else
	 * 音频输出音量配置，对应结构体 {@link NET_AUDIOOUT_VOLUME_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_AUDIOOUT_VOLUME = 1203; 
	
	/**********videoin 相关配置***************/
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-switch mode config, corresponding to {@link NET_VIDEOIN_SWITCH_MODE_INFO}
	 * \else
	 * 切换模式配置，对应结构体 {@link NET_VIDEOIN_SWITCH_MODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_SWITCHMODE = 1300;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-color options config, corresponding to {@link NET_VIDEOIN_COLOR_INFO}	
	 * \else
	 * 视频输入颜色配置，对应结构体 {@link NET_VIDEOIN_COLOR_INFO}				
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_COLOR = 1301; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-image options config, corresponding to {@link NET_VIDEOIN_IMAGE_INFO}
	 * \else
	 * 图像属性配置，对应结构体 {@link NET_VIDEOIN_IMAGE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_IMAGE_OPT = 1302;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-stable config, corresponding to {@link NET_VIDEOIN_STABLE_INFO}
	 * \else
	 *  图像防抖配置，对应结构体 {@link NET_VIDEOIN_STABLE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_STABLE = 1303;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-auto iris config-, corresponding to {@link NET_VIDEOIN_IRISAUTO_INFO}
	 * \else
	 * 自动光圈配置，对应结构体 {@link NET_VIDEOIN_IRISAUTO_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_IRISAUTO = 1304;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-image enhancement config, corresponding to {@link NET_VIDEOIN_IMAGEENHANCEMENT_INFO}
	 * \else
	 * 图像增强配置，对应结构体 {@link NET_VIDEOIN_IMAGEENHANCEMENT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_IMAGEENHANCEMENT = 1305; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-normal exposure config, corresponding to {@link NET_VIDEOIN_EXPOSURE_NORMAL_INFO}
	 * \else
	 * 曝光通用属性配置，对应结构体 {@link NET_VIDEOIN_EXPOSURE_NORMAL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_EXPOSURE_NORMAL = 1306;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-other exposure config, corresponding to {@link NET_VIDEOIN_EXPOSURE_OTHER_INFO}
	 * \else
	 * 其他曝光属性配置，对应结构体 {@link NET_VIDEOIN_EXPOSURE_OTHER_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_EXPOSURE_OTHER = 1307;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-exposure shutter config, corresponding to {@link NET_VIDEOIN_EXPOSURE_SHUTTER_INFO}
	 * \else
	 * 曝光快门配置，对应结构体 {@link NET_VIDEOIN_EXPOSURE_SHUTTER_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_EXPOSURE_SHUTTER = 1308; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-back light config, corresponding to {@link NET_VIDEOIN_BACKLIGHT_INFO}
	 * \else
	 * 背光配置，对应结构体 {@link NET_VIDEOIN_BACKLIGHT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_BACKLIGHT = 1309; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-Intensity config, corresponding to {@link NET_VIDEOIN_INTENSITY_INFO}
	 * \else
	 * 场景自适应对比度强度配置，对应结构体 {@link NET_VIDEOIN_INTENSITY_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_INTENSITY = 1310; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-lighting config, corresponding to {@link NET_VIDEOIN_LIGHTING_INFO}
	 * \else
	 * 补光灯配置，对应结构体 {@link NET_VIDEOIN_LIGHTING_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_LIGHTING = 1311; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-defog config, corresponding to {@link NET_VIDEOIN_DEFOG_INFO}
	 * \else
	 * 透雾配置，对应结构体 {@link NET_VIDEOIN_DEFOG_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_DEFOG = 1312; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-focus mode config, corresponding to {@link NET_VIDEOIN_FOCUSMODE_INFO}
	 * \else
	 * 聚焦模式配置，对应结构体 {@link NET_VIDEOIN_FOCUSMODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_FOCUSMODE = 1313;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-focus options config, corresponding to {@link NET_VIDEOIN_FOCUSVALUE_INFO}
	 * \else
	 * 聚焦信息配置，对应结构体 {@link NET_VIDEOIN_FOCUSVALUE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_FOCUSVALUE = 1314; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-white balance config, corresponding to {@link NET_VIDEOIN_WHITEBALANCE_INFO}
	 * \else
	 * 白平衡配置，对应结构体 {@link NET_VIDEOIN_WHITEBALANCE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_WHITEBALANCE = 1315;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-day night config, corresponding to {@link NET_VIDEOIN_DAYNIGHT_INFO}
	 * \else
	 * 日夜模式配置，对应结构体 {@link NET_VIDEOIN_DAYNIGHT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_DAYNIGHT = 1316; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-ICR config, corresponding to {@link NET_VIDEOIN_DAYNIGHT_ICR_INFO}
	 * \else
	 * 日夜模式ICR切换类型配置，对应结构体 {@link NET_VIDEOIN_DAYNIGHT_ICR_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_DAYNIGHT_ICR = 1317; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-shrpness config, corresponding to {@link NET_VIDEOIN_SHARPNESS_INFO}
	 * \else
	 * 锐度配置，对应结构体 {@link NET_VIDEOIN_SHARPNESS_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_SHARPNESS = 1318;
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-comm denoise config, corresponding to {@link NET_VIDEOIN_DENOISE_INFO}
	 * \else
	 * 通用降噪配置，对应结构体 {@link NET_VIDEOIN_DENOISE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_COMM_DENOISE = 1319; 
	
	/**
	 * \if ENGLISH_LANG
	 * VideoIn-3D denoise config, corresponding to {@link NET_VIDEOIN_3D_DENOISE_INFO}
	 * \else
	 * 3D 降噪配置，对应结构体 {@link NET_VIDEOIN_3D_DENOISE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_3D_DENOISE = 1320;

	/**
	 * \if ENGLISH_LANG
	 * VideoIn Lighting，refer to {@link NET_CFG_VIDEOIN_LIGHTING_SCHEME_INFO}
	 * \else
	 * 灯光方案，对应结构体 {@link NET_CFG_VIDEOIN_LIGHTING_SCHEME_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_LIGHTING_SCHEME = 1324;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Lighting，refer to {@link NET_CFG_VIDEOIN_ALARM_LIGHTING_INFO}
	 * \else
	 * 警戒灯光，对应结构体 {@link NET_CFG_VIDEOIN_ALARM_LIGHTING_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_ALARM_LIGHTING = 1325;

	/**
	 * \if ENGLISH_LANG
	 * Video in Target Autoexposure，refer to {@link NET_CFG_VIDEOIN_FACE_AUTOEXPOSURE_INFO}
	 * \else
	 * 智能规则检测目标，根据检测区域自动曝光, 对应结构体 {@link NET_CFG_VIDEOIN_FACE_AUTOEXPOSURE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_FACE_AUTOEXPOSURE = 1326;

	/**
	 * \if ENGLISH_LANG
	 * Video day and night configuration switching mode，refer to {@link NET_CFG_VIDEO_IN_MODE_INFO}
	 * \else
	 * 视频日夜配置切换模式,对应结构体 {@link NET_CFG_VIDEO_IN_MODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEO_IN_MODE=1327;

	/**
	 * \if ENGLISH_LANG
	 * Anti fill light overexposure configuration，refer to {@link NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE}
	 * \else
	 * 防补光过曝配置,对应结构体 {@link NET_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE}
	 * \endif
	 */
	public static final int NET_EM_CFG_VIDEOIN_ANTI_FILL_LIGHT_OVER_EXPOSURE=1328;

	/***********庭审相关配置*************************/
	
	/**
	 * \if ENGLISH_LANG
	 * Case-the plan config of encode, corresponding to {@link NET_ENCODE_PLAN_INFO}
	 * \else
	 * 刻录光盘编码计划, 对应结构体  {@link NET_ENCODE_PLAN_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ENCODE_PLAN = 1400;

	/**********报警网关相关配置***********************************************************************************************/
	
	/**
	 * \if ENGLISH_LANG
	 * alarm sound config of alarm gateway, corresponding to {@link NET_ALARM_SOUND_INFO} 
	 * \else
	 * 报警网关语音配置, 对应结构体  {@link NET_ALARM_SOUND_INFO}  
	 * \endif
	 */
	public static final int NET_EM_CFG_ALARM_SOUND = 1500;

	/**
	 * \if ENGLISH_LANG
	 * Local ext alarm config,corresponding to {@link NET_LOCAL_EXT_ALARM_INFO},ChannelID is invalid
	 * \else
	 * 报警盒子配置,对应结构体{@link NET_LOCAL_EXT_ALARM_INFO},通道无关
	 * \endif
	 */
	public static final int NET_EM_CFG_LOCAL_EXT_ALARM = 1501;

	/**
	 * \if ENGLISH_LANG
	 * Remote Alarm Bell Config, corresponding to struct {@link NET_CFG_REMOTE_ALARM_BELL_INFO}
	 * \else
	 * 前端相机警号配置, 对应结构体 {@link NET_CFG_REMOTE_ALARM_BELL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_REMOTE_ALARM_BELL = 1502;

	/**
	 * \if ENGLISH_LANG
	 * coaxial local alarm config,, corresponding to struct {@link NET_COAXIAL_ALARMLOCAL_INFO}
	 * \else
	 * CVI 外部报警配置, 对应结构体 {@link NET_COAXIAL_ALARMLOCAL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_COAXIAL_ALARMLOCAL = 1506;
	
    /**********网络应用相关配置***********************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * WIFI server configuration(access point),corresponding to {@link NET_NETAPP_ACCESSPOINT}
	 * \else
	 * 用于WiFi服务端配置(热点功能), 对应结构体 {@link NET_NETAPP_ACCESSPOINT}
	 * \endif
	 */
	public static final int NET_EM_CFG_ACCESS_POINT = 1600;
	/**************安全基线需求***************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * DDNS config {@link NET_DDNS_INFO}
	 * \else
	 * DDNS 配置, 对应结构体 {@link NET_DDNS_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_DDNS = 1703;
	/**************SCADA配置需求**************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Controller config, corresponding to {@link NET_CFG_SCADA_CONTROLLER_SITE_INFO}
	 * \elseS
	 * 控制器配置，对应结构体 {@link NET_CFG_SCADA_CONTROLLER_SITE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_SCADA_CONTROLLER_SITE = 1802;

	/**
	 * \if ENGLISH_LANG
	 * Communication list config(not related to channels,ChannelID must be fill in -1), corresponding to {@link NET_NETAPP_COMMUNICATION_LIST_CFG}
	 * \elseS
	 * 通讯录配置, 对应结构体(与通道不相关,通道号需要填成-1) {@link NET_NETAPP_COMMUNICATION_LIST_CFG}
	 * \endif
	 */
	public static final int NET_EM_CFG_NETAPP_COMMUNICATION_LIST = 1902;

	/**
	 * \if ENGLISH_LANG
	 * Web Server config, corresponding to {@link NET_NETAPP_WEB_CFG}
	 * \elseS
	 * Web服务器设置 {@link NET_NETAPP_WEB_CFG}
	 * \endif
	 */
	public static final int NET_EM_CFG_NETAPP_WEB = 1903;

	/**
	 * \if ENGLISH_LANG
	 * Smart motion detect configuration, corresponding to {@link NET_CFG_SMART_MOTION_DETECT}
	 * \elseS
	 * 智能动态检测配置, 对应结构体 {@link NET_CFG_SMART_MOTION_DETECT}
	 * \endif
	 */
	public static final int NET_EM_CFG_SMART_MOTION_DETECT = 2109;

	/**
	 * \if ENGLISH_LANG
	 * Classroom behavior rule configuration, corresponding to {@link NET_CFG_CLASSROOM_BEHAVIOR_INFO}
	 * \elseS
	 * 课堂行为分析规则配置, 对应结构体 {@link NET_CFG_CLASSROOM_BEHAVIOR_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_CLASSROOM_BEHAVIOR = 2120;

	/**
	 * \if ENGLISH_LANG
	 * Door opening and closing detection configuration, corresponding to {@link NET_CFG_DOOR_STATE_DETECTION_INFO}
	 * \elseS
	 * 开关门检测配置, 对应结构体 {@link NET_CFG_DOOR_STATE_DETECTION_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_DOOR_STATE_DETECTION = 2122;

	/**
	 * \if ENGLISH_LANG
	 * Elevator trapped person detection configuration, corresponding to {@link NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO}
	 * \elseS
	 * 电梯困人检测配置, 对应结构体 {@link NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_TRAPPED_IN_LIFT_DETECTION = 2124;
	/**********雷达配置*****************************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * radar configuration, corresponding to {@link DEV_RADAR_CONFIG}
	 * \else
	 * 雷达配置，对应结构体 {@link DEV_RADAR_CONFIG}
	 * \endif
	 */
	public static final int NET_EM_CFG_RADAR 		= 2200;

	/**********视频对讲电话通用配置***********************************************************************************/

	/**
	 * \if ENGLISH_LANG
	 * registar server configuration, corresponding {@link NET_CFG_REGISTAR_INFO}
	 * \else
	 * 注册服务器配置 对应结构体 {@link NET_CFG_REGISTAR_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_REGISTAR   = 2301;

	/**
	 * \if ENGLISH_LANG
	 * sip configuration, corresponding {@link NET_CFG_SIPSERVER_INFO}
	 * \else
	 * sip配置, 对应结构体 {@link NET_CFG_SIPSERVER_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_SIP         = 2302;

	/**********报警主机相关配置***************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * automatic arming schedule configuration,corresponding to {@link NET_CFG_ARMSCHEDULE_INFO}
	 * \else
	 * 自动布撤防计划配置，对应结构体 {@link NET_CFG_ARMSCHEDULE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ARMSCHEDULE      = 2600;

	/**********录像抓图功能相关配置***********************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * aface snap shot, corresponding to  {@link NET_CFG_FACESNAPSHOT_INFO}
	 * \else
	 * IPC智能目标抓拍配置 对应结构体 {@link NET_CFG_FACESNAPSHOT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_FACESNAPSHOT = 3612;

	/**
	 * \if ENGLISH_LANG
	 * aface snap shot, corresponding to  {@link NET_CFG_RECORD_DOWNLOAD_SPEED_ALL_INFO}
	 * \else
	 * IPC智能目标抓拍配置 对应结构体 {@link NET_CFG_RECORD_DOWNLOAD_SPEED_ALL_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_RECORD_DOWNLOAD_SPEED_ALL = 3614;

	/***********配置******************************************************************************************/

	/**
	 * \if ENGLISH_LANG
	 * Relay state config,corresponding to {@link NET_CFG_RELAY_STATE_INFO}
	 * \else
	 * 继电器状态配置，对应结构体 {@link NET_CFG_RELAY_STATE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_RELAY_STATE		= 4012;

	/**
	 * \if ENGLISH_LANG
	 * IPC supporting app display working mode,corresponding to {@link NET_CFG_WORK_MODE_INFO}
	 * \else
	 * IPC配套APP显示工作模式，对应结构体 {@link NET_CFG_WORK_MODE_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_WORK_MODE                    = 4017;

	/**
	 * \if ENGLISH_LANG
	 * Elevator floor alarm related configuration,  corresponding to {@link NET_CFG_ELEVATOR_ALARM_CONFIG_INFO}
	 * \else
	 * 电梯楼层报警相关配置, 对应结构体 {@link NET_CFG_ELEVATOR_ALARM_CONFIG_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ELEVATOR_ALARM_CONFIG                    = 4026;

	/**
	 * \if ENGLISH_LANG
	 * Elevator floor osd related configuration,  corresponding to {@link NET_CFG_ELEVATOR_FLOOR_OSD_INFO}
	 * \else
	 * 电梯当前楼层OSD配置, 对应结构体 {@link NET_CFG_ELEVATOR_FLOOR_OSD_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ELEVATOR_FLOOR_OSD                    = 4027;

	/**
	 * \if ENGLISH_LANG
	 * Elevator floor counter related configuration,  corresponding to {@link NET_CFG_ELEVATOR_FLOOR_COUNTER_INFO}
	 * \else
	 * 电梯当前楼层计数器配置, 对应结构体 {@link NET_CFG_ELEVATOR_FLOOR_COUNTER_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_ELEVATOR_FLOOR_COUNTER                    = 4028;

	/***********Ptz configuration************************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * AutoScan configuration, corresponding to {@link NET_CFG_AUTOSCAN_INFO}
	 * \else
	 * 自动线扫设置,对应结构体{@link NET_CFG_AUTOSCAN_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_AUTOSCAN = 7002;

	/***********LC摄像头配置************************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * NVR cascade control IPC light configuration,corresponding to {@link NET_CFG_CASCADE_LIGHT_INFO}
	 * \else
	 * NVR级联控制IPC灯光配置，对应结构体 {@link NET_CFG_CASCADE_LIGHT_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_CASCADE_LIGHT      = 8000;

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * LC简易智能追踪，对应结构体 {@link NET_CFG_LE_SMARTTRACK_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_LE_SMARTTRACK      = 8001;

	/**
	 * \if ENGLISH_LANG
	 *
	 * \else
	 * LC镜头遮挡配置，对应结构体 {@link NET_CFG_LE_LENS_MASK_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_LE_LENS_MASK      = 8002;

	/***********第三方配置************************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * lecheng cloud register config configuration , corresponding to {@link NET_CFG_VSP_PAAS_INFO}
	 * \else
	 * LC云注册配置修改, 对应结构体 {@link NET_CFG_VSP_PAAS_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_VSP_PAAS    			= 9000;

	/**
	 * \if ENGLISH_LANG
	 * Public security 1 platform input config(GB server),corresponding to NET_CFG_VSP_GAYS_SERVER_INFO,ChannelID must be -1
	 * \else
	 * 平台接入配置(国标服务端),对应结构体 NET_CFG_VSP_GAYS_SERVER_INFO,对应通道为-1
	 * \endif
	 */
	public static final int NET_EM_CFG_VSP_GAYS_SERVER    			= 9001;


	/**
	 * \if ENGLISH_LANG
	 * Access configuration of public security video and image information application system. Corresponding to  , corresponding to {@link NET_CFG_VSP_GAVI_INFO},ChannelID must be -1
	 * \else
	 * 公安视频图像信息应用系统接入配置,对应结构体{@link NET_CFG_VSP_GAVI_INFO},对应通道为-1
	 * \endif
	 */
	public static final int NET_EM_CFG_VSP_GAVI    			= 9003;

	/**
	 * \if ENGLISH_LANG
	 * ONVIF service configuration, corresponding to {@link NET_CFG_VSP_ONVIF_INFO},ChannelID must be -1
	 * \else
	 * ONVIF服务配置, 对应结构体{@link NET_CFG_VSP_ONVIF_INFO},对应通道为-1
	 * \endif
	 */
	public static final int NET_EM_CFG_VSP_ONVIF    			= 9004;

	/**
	 * \if ENGLISH_LANG
	 * gateway configuration, corresponding to {@link NET_CFG_TRAFFICSTROBE_INFO},ChannelID must be -1
	 * \else
	 * 道闸配置, 对应结构体{@link NET_CFG_TRAFFICSTROBE_INFO},对应通道为-1
	 * \endif
	 */
	public static final int NET_EM_CFG_TRAFFICSTROBE    		 = 9100;

	/***********布撤防配置************************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Unable linkage configuration,corresponding to {@link NET_CFG_DISABLE_LINKAGE}
	 * \else
	 *一键撤防配置,对应结构体{@link NET_CFG_DISABLE_LINKAGE}, 与通道不相关,通道号需要填成-1
	 * \endif
	 */
	public static final int NET_EM_CFG_DISABLE_LINKAGE 	= 9300;

	/**
	 * \if ENGLISH_LANG
	 * Unable linkage time section configuration, corresponding to {@link NET_CFG_DISABLE_LINKAGE_TIME_SECTION},not related to channels,ChannelID must be fill in -1
	 * \else
	 *周期撤防联动项功能总开关, 对应结构体 {@link NET_CFG_DISABLE_LINKAGE_TIME_SECTION}, 与通道不相关,通道号需要填成-1
	 * \endif
	 */
	public static final int NET_EM_CFG_DISABLE_LINKAGE_TIME_SECTION = 9301;

	/***********DoorBell门铃相关配置******************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * External door bell configuration, corresponding to {@link NET_CFG_DOORBELL_EXTERNALDOORBELL}, not related to channels,ChannelID must be fill in -1
	 * \else
	 * 外接门铃配置,对应结构体 {@link NET_CFG_DOORBELL_EXTERNALDOORBELL}, 与通道不相关,通道号需要填成-1
	 * \endif
	 */
	public static final int NET_EM_CFG_DOORBELL_EXTERNALDOORBELL = 11000;

/***********DoorBell门铃相关配置******************************************************************************************/
	/**
	 * \if ENGLISH_LANG
	 * Standard blackbody configuration of human body ARGtemp_meas, corresponding to {@link NET_CFG_RADIO_REGULATOR},ChannelID must not be fill in -1
	 * \else
	 * 人体测温标准黑体配置,对应结构体 {@link NET_CFG_RADIO_REGULATOR}, 通道号不能填成-1
	 * \endif
	 */
	public static final int NET_EM_CFG_RADIO_REGULATOR = 11102;


	/***********热成像相关配置******************************************************************************************/

	/**
	 * \if ENGLISH_LANG
	 * Telescope configuration,corresponding to {@link NET_CFG_TELESCOPE_OPTIONS_INFO}
	 * \else
	 * 望远镜配置,对应结构体 {@link NET_CFG_TELESCOPE_OPTIONS_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_TELESCOPE_OPTIONS = 11104;

	/**
	 * \if ENGLISH_LANG
	 * Burn warning configuration,corresponding to {@link NET_CFG_BURNING_CHECK_INFO}
	 * \else
	 * 灼伤预警配置,对应结构体 {@link NET_CFG_BURNING_CHECK_INFO}
	 * \endif
	 */
	public static final int NET_EM_CFG_BURNING_CHECK = 11107;

	/**
	 * \if ENGLISH_LANG
	 * Device install param config, corresponding to NET_CFG_WIFI_INSTALL_PARAM, not related to channels,ChannelID must be fill in -1
	 * \else
	 * 设备安装信息配置, 对应结构体 NET_CFG_WIFI_INSTALL_PARAM, 与通道不相关,通道号需要填成-1
	 * \endif
	 */
	public static final int NET_EM_CFG_WIFI_INSTALL_PARAM = 12200;



}
