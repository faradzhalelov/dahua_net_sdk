package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record state of everyday in one month
 * \else
 * 某月的各天是否存在录像的状态信息
 * \endif
 */
public class NET_RECORD_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Has record this day 0-no, 1-yes
	 * \else
	 * 某月内的各天是否存在录像的状态掩码，0表示没有，1表示有。
	 * \endif
	 */
	public byte 	 		   flag[] = new byte[32];
}
