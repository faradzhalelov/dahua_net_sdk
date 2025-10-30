package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix sub card info
 * \else
 * 矩阵子卡	
 * \endif
 */
public class SDK_MATRIX_CARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid or not
	 * \else
	 * 是否有效
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub card type
	 * \else
	 * 子卡类型
	 * \endif
	 */
	public int					dwCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal interface type, "CVBS", "VGA", "DVI"...
	 * \else
	 * 信号接口类型, "CVBS", "VGA", "DVI"...
	 * \endif
	 */
	public byte		    	szInterface[] = new byte[FinalVar.SDK_MATRIX_INTERFACE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device IP or domain name. The sub card that has no network conneciton can be null.
	 * \else
	 * 设备ip或域名, 无网络接口的子卡可以为空
	 * \endif
	 */
	public byte		    	szAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port No. The sub card that has no network conneciton can be 0.
	 * \else
	 * 端口号, 无网络接口的子卡可以为0
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition. 0=standard definition. 1=High definition
	 * \else
	 * 清晰度, 0=标清, 1=高清
	 * \endif
	 */
	public int					nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * 视频输入通道数
	 * \endif
	 */
	public int					nVideoInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * 音频输入通道数
	 * \endif
	 */
	public int					nAudioInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * 视频输出通道数
	 * \endif
	 */
	public int					nVideoOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * 音频输出通道数
	 * \endif
	 */
	public int				    nAudioOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel amount	
	 * \else
	 * 视频编码通道数
	 * \endif
	 */
	public int			    	nVideoEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel amount
	 * \else
	 * 音频编码通道数
	 * \endif
	 */
	public int				    nAudioEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel amount
	 * \else
	 * 视频解码通道数
	 * \endif
	 */
	public int			    	nVideoDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel amount
	 * \else
	 * 音频解码通道数
	 * \endif
	 */
	public int			    	nAudioDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Status: 0-OK, 1-no respond, 2-network disconnection, 3-conflict, 4-upgrading now
	 * \else
	 * 状态: 0-正常, 1-无响应, 2-网络掉线, 3-冲突, 4-正在升级
	 * \endif
	 */
	public int					nStauts;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * 串口数
	 * \endif
	 */
	public int					nCommPorts;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel min value
	 * \else
	 * 视频输入通道号最小值
	 * \endif
	 */
	public int					nVideoInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel max value
	 * \else
	 * 视频输入通道号最大值
	 * \endif
	 */
	public int					nVideoInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel min value
	 * \else
	 * 音频输入通道号最小值
	 * \endif
	 */
	public int					nAudioInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel max value
	 * \else
	 * 音频输入通道号最大值
	 * \endif
	 */
	public int					nAudioInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel min value
	 * \else
	 * 视频输出通道号最小值
	 * \endif
	 */
	public int					nVideoOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel max value
	 * \else
	 * 视频输出通道号最大值
	 * \endif
	 */
	public int					nVideoOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel min value
	 * \else
	 * 音频输出通道号最小值
	 * \endif
	 */
	public int					nAudioOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel max value
	 * \else
	 * 音频输出通道号最大值	
	 * \endif
	 */
	public int					nAudioOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel min value
	 * \else
	 * 视频编码通道号最小值
	 * \endif
	 */
	public int					nVideoEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel max value
	 * \else
	 * 视频编码通道号最大值
	 * \endif
	 */
	public int					nVideoEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel min value
	 * \else
	 * 音频编码通道号最小值
	 * \endif
	 */
	public int					nAudioEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel max value
	 * \else
	 * 音频编码通道号最大值
	 * \endif
	 */
	public int					nAudioEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel min value
	 * \else
	 * 视频解码通道号最小值
	 * \endif
	 */
	public int					nVideoDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel max value
	 * \else
	 * 视频解码通道号最大值
	 * \endif
	 */
	public int					nVideoDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel min value
	 * \else
	 * 音频解码通道号最小值
	 * \endif
	 */
	public int					nAudioDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel max value
	 * \else
	 * 音频解码通道号最大值
	 * \endif
	 */
	public int					nAudioDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of cascade channel
	 * \else
	 * 级联通道数
	 * \endif
	 */
	public int					nCascadeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Cascade channel bitrate (Mbps)
	 * \else
	 * 级联通道带宽, 单位Mbps
	 * \endif
	 */
	public int					nCascadeChannelBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输入通道数
	 * \endif
	 */
	public int					nAlarmInChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输入通道号最小值
	 * \endif
	 */
	public int					nAlarmInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输入通道号最大值
	 * \endif
	 */
	public int					nAlarmInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输出通道数
	 * \endif
	 */
	public int					nAlarmOutChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输入通道号最小值
	 * \endif
	 */
	public int					nAlarmOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 报警输入通道号最大值
	 * \endif
	 */
	public int					nAlarmOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 智能分析通道数
	 * \endif
	 */
	public int					nVideoAnalyseChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 智能分析通道号最小值
	 * \endif
	 */
	public int					nVideoAnalyseChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 智能分析通道号最大值
	 * \endif
	 */
	public int					nVideoAnalyseChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 串口号最小值
	 * \endif
	 */
	public int					nCommPortMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 串口号最大值
	 * \endif
	 */
	public int					nCommPortMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Version
	 * \else
	 * 版本信息
	 * \endif
	 */
	public byte[]               szVersion = new byte[FinalVar.SDK_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 * Build Time
	 * \else
	 * 编译时间
	 * \endif
	 */
    public NET_TIME             stuBuildTime = new NET_TIME(); 
	
}
