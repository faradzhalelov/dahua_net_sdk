package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * every video input chennel's video analyse source configuration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ANALYSESOURCE}
 * \else
 * 每个视频输入通道对应的视频分析资源配置信息, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ANALYSESOURCE}
 * \endif
 */
public class CFG_ANALYSESOURCE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video analyse enable
	 * \else
	 * 视频分析使能
	 * \endif
	 */
	public boolean				bEnable;							
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analyse former video channel number
	 * \else
	 * 智能分析的前端视频通道号
	 * \endif
	 */
	public int					nChannelID;								
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligent analyse former stream type,0:snap; 1:main; 2:sub1; 3:sub2; 4:sub3;(sustain 0)
	 * \else
	 * 智能分析的前端视频码流类型，0:抓图码流; 1:主码流; 2:子码流1; 3:子码流2; 4:子码流3; 5:物体流
	 * \endif
	 */
	public int					nStreamType;							
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte				    szRemoteDevice[] = new byte[FinalVar.MAX_NAME_LEN];			
	
	/**
	 * \if ENGLISH_LANG
	 * Device info is efficiency or not
	 * \else
	 * 设备信息是否有效
	 * \endif
	 */
	public boolean				abDeviceInfo;				       
	
	/**
	 * \if ENGLISH_LANG
	 * Device info
	 * \else
	 * 设备信息
	 * \endif
	 */
	public AV_CFG_RemoteDevice  stuDeviceInfo;					       
	
	/**
	 * \if ENGLISH_LANG
	 * The Source Type of Video Analysis, refer to {@link CFG_VIDEO_SOURCE_TYPE}
	 * \else
	 *  视频分析源类型，取值参考 {@link CFG_VIDEO_SOURCE_TYPE}
	 * \endif
	 */
	public int                  emSourceType;                        
	
	/**
	 * \if ENGLISH_LANG
	 * Valid When The Source Type of Video Analysis is {@link CFG_VIDEO_SOURCE_TYPE#CFG_VIDEO_SOURCE_FILESTREAM}
	 * \else
	 * 当视频分析源类型emSourceType为 {@link CFG_VIDEO_SOURCE_TYPE#CFG_VIDEO_SOURCE_FILESTREAM} 时，有效
	 * \endif
	 */
	public CFG_SOURCE_FILE_INFO stuSourceFile = new CFG_SOURCE_FILE_INFO();                          
	
	public CFG_ANALYSESOURCE_INFO(int nMaxVideoInputs) {
		stuDeviceInfo  = new AV_CFG_RemoteDevice(nMaxVideoInputs);
	}
}
