package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Common Attribute
 * \else
 * 串口基本属性
 * \endif
 */
public class CFG_COMM_PROP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DataBit;0:5，1:6，2:7，3:8
	 * \else
	 * 数据位;0:5，1:6，2:7，3:8
	 * \endif
	 */
	public byte				byDataBit;
	
	/**
	 * \if ENGLISH_LANG
	 * StopBit;0:1位，1:1.5位，2:2位
	 * \else
	 * 停止位;0:1位，1:1.5位，2:2位
	 * \endif
	 */
	public byte				byStopBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Parity Bit;0:No Check，1:Odd Check;2:Even Check
	 * \else
	 * 校验位;0:无校验，1:奇校验;2:偶校验
	 * \endif
	 */
	public byte				byParity;
	
	/**
	 * \if ENGLISH_LANG
	 * BaudRate;0:300，1:600，2:1200，3:2400，4:4800，	
	 * 5:9600，6:19200，7:38400，8:57600，9:115200
	 * \else
	 * 波特率;0:300，1:600，2:1200，3:2400，4:4800，	
	 * 5:9600，6:19200，7:38400，8:57600，9:115200
	 * \endif
	 */
	public byte				byBaudRate;
}
