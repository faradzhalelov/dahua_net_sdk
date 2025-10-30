package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm of record loss, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_LOST_RECORD}
 * \else
 * 丢录像事件报警, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_LOST_RECORD}
 * \endif
 */
public class ALARM_LOST_RECORD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0：停止， 1：开始
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel ID, start from 1	
	 * \else
	 * 通道号，从1开始
	 * \endif
	 */
	public int      nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Bit Stream type, 0: main stream; 1: extra stream1; 2: extra stream2; 3: extra stream3; 4: snapshot stream
	 * \else
	 * 码流类型，0：主码流；1：辅码流1；2：辅码流2；3：辅码流3；4：抓图码流
	 * \endif
	 */
	public int      nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time	
	 * \else
	 * 事件发生时间    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}
