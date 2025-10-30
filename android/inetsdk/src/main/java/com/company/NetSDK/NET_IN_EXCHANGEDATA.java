package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ExChangeData} port input  structure
 * \else
 * {@link INetSDK#ExChangeData} 接口输入结构体
 * \endif
 */
public class NET_IN_EXCHANGEDATA implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * serial port no
	 * \else
	 * 串口号
	 * \endif
	 */
	public int							nChannel;				
	
	/**
	 * \if ENGLISH_LANG
	 * TRUE is to send data and wait for response?ê?FALSE is to collect data
	 * \else
	 * TRUE 为发送数据并等待回复，FALSE 只是采集数据
	 * \endif
	 */
	public boolean						bFlag;					
	
	/**
	 * \if ENGLISH_LANG
	 * Serial collection time length(unit:ms)
	 * \else
	 * 串口采集时长(单位：毫秒)
	 * \endif
	 */
	public int							nCollectTime;			
	
	/**
	 * \if ENGLISH_LANG
	 * send data length, bFlag = TRUE valid
	 * \else
	 * 发送数据长度，bFlag = TRUE 有效
	 * \endif
	 */
	public int							nSendDataLength;		
	
	/**
	 * \if ENGLISH_LANG
	 * send data content, bFlag = TRUE valid
	 * \else
	 * 发送数据内容，bFlag = TRUE 有效
	 * \endif
	 */
	public char[]						pSendData;				
}
