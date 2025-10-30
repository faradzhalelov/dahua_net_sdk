package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * power sequence control parameter
 * \else
 * 电源时序器控制参数
 * \endif
 */
public class NET_CTRL_SEQPOWER_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * device ID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public String				pszDeviceID; 
	
	/**
	 * \if ENGLISH_LANG
	 * output or output sequence
	 * \else
	 * 输出口或输出组序号
	 * \endif
	 */
	public int					nChannel; 
}
