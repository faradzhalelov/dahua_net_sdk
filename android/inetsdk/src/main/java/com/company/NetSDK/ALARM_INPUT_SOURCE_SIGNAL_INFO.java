package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm input source signal events, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_INPUT_SOURCE_SIGNAL}
 * \else
 * 报警输入源信号事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_INPUT_SOURCE_SIGNAL}
 * \endif
 */
public class ALARM_INPUT_SOURCE_SIGNAL_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道号  
	 * \endif
	 */
    public int             nChannelID;                         
    
	/**
	 * \if ENGLISH_LANG
	 * 0=Start 1=Stop 
	 * \else
	 * 0:开始 1:停止  
	 * \endif
	 */
    public int             nAction;                            
    
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Begin Time
	 * \else
	 * 报警事件发生的时间  
	 * \endif
	 */
    public NET_TIME        stuTime = new NET_TIME();                           
}
