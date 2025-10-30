package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * 端口序号
 * \endif
 */
public class NET_CB_ExChangeData implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 端口序号
	 * \endif
	 */
	public int					nDataLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 端口序号
	 * \endif
	 */
	public String				pRevData;
}
