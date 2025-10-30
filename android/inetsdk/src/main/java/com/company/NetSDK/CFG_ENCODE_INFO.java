package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Channel Attribute:Picture Channel Attribute, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ENCODE}
 * \else
 * 图像通道属性信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ENCODE}
 * \endif
 */
public class CFG_ENCODE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No. 1~ Max Channel Num 
	 * \else
	 * 通道号(0开始)
	 * \endif
	 */
	public int                  nChannelID;							

	/**
	 * \if ENGLISH_LANG
	 * Channel Name 
	 * \else
	 * 通道名称
	 * \endif
	 */
	public char					szChnName[] = new char[FinalVar.MAX_CHANNELNAME_LEN];		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream.0-Normal Record;1-Detect Record;2-Alarm Record
	 * \else
	 * 主码流,0－普通录像,1-动检录像,2－报警录像
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuMainStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Substream.0-Substream1;1-Substream2;2-Substream1;
	 * \else
	 * 辅码流,0－辅码流1,1－辅码流2,2－辅码流3
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuExtraStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Snapshot.0-Normal Snapshot;1-Detect Snapshot;2-Alarm Snapshot;
	 * \else
	 * 抓图,0－普通抓图,1－动检抓图,2－报警抓图
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuSnapFormat[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Supported Area Cover Type(Capability Introduction,Read Only):Mask,First Bte:Device Local Preview；Second Bit:Record And networkMonitor 
	 * \else
	 * 区域遮盖能力掩码,按位分别是本地预览、录像及网络预览
	 * \endif
	 */
	public int					dwCoverAbilityMask;					

	/**
	 * \if ENGLISH_LANG
	 * Area Cover Switch 0x00 Not Enable COver，0x01 Only Cover Preview，0x10 Only Cover Record，0x11 Cover All 
	 * \else
	 * 区域遮盖使能掩码,按位分别是本地预览、录像及网络预览
	 * \endif
	 */
	public int					dwCoverEnableMask;					

	/**
	 * \if ENGLISH_LANG
	 * Video Cover 
	 * \else
	 * 区域覆盖
	 * \endif
	 */
	public CFG_VIDEO_COVER		stuVideoCover = new CFG_VIDEO_COVER();						

	/**
	 * \if ENGLISH_LANG
	 * Channel Title 
	 * \else
	 * 通道标题
	 * \endif
	 */
	public CFG_OSD_INFO			stuChnTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Time Title 
	 * \else
	 * 时间标题
	 * \endif
	 */
	public CFG_OSD_INFO			stuTimeTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Video Color 
	 * \else
	 * 画面颜色
	 * \endif
	 */
	public CFG_COLOR_INFO		stuVideoColor = new CFG_COLOR_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Audio Format,{@link CFG_AUDIO_FORMAT}
	 * \else
	 * 音频格式,{@link CFG_AUDIO_FORMAT}
	 * \endif
	 */
	public int				    emAudioFormat;                      

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read Only 
	 * \else
	 * 协议版本号, 只读
	 * \endif
	 */
	public int					nProtocolVer;		
	
	/**
	 * \if ENGLISH_LANG
	 * the array of stuMainStream return valid count
	 * \else
	 * 返回的stuMainStream数组中实际有效的个数
	 * \endif
	 */
	public int                  nValidCountMainStream;
	
	/**
	 * \if ENGLISH_LANG
	 * the array of stuSnapFormat return valid count
	 * \else
	 * 返回的stuSnapFormat数组中实际有效的个数
	 * \endif
	 */
	public int                  nValidCountSnapFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * the array of stuExtraStream return valid count
	 * \else
	 * 返回的stuExtraStream数组中实际有效的个数
	 * \endif
	 */
	public int                  nValidCountExtraStream;
	
	public CFG_ENCODE_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEOSTREAM_NUM; i++) {
			stuMainStream[i] = new CFG_VIDEOENC_OPT();
			stuExtraStream[i] = new CFG_VIDEOENC_OPT();
			stuSnapFormat[i] = new CFG_VIDEOENC_OPT();
		}
	}
}
