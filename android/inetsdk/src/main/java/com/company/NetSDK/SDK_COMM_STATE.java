package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial port status
 * \else
 * 串口基本属性
 * \endif
 */
public class SDK_COMM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * 是否开启
	 * \endif
	 */
	public int					uBeOpened;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 波特率
	 * \endif
	 */
	public int					uBaudRate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 数据位
	 * \endif
	 */
	public int					uDataBites;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 停止位
	 * \endif
	 */
	public int					uStopBits;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 校验位
	 * \endif
	 */
	public int					uParity;
}
