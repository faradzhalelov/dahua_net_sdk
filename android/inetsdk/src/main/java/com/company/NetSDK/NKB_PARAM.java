package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New network keyboard
 * \else
 * 新网络键盘控制
 * \endif
 */
public class NKB_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The address of DVR or others, 0xFF is broadcast address
	 * \else
	 * 为DVR等设备的物理地址号,0xFF为广播地址
	 * \endif
	 */
	public byte                bAddressCode;
	
	/**
	 * \if ENGLISH_LANG
	 * code of status 0/1, 0 is down, 1 is up
	 * \else
	 * 状态码 0/1 0表示按键按下 1表示按键放开
	 * \endif
	 */
	public byte                bKeyStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 1
	 * \else
	 * 扩展字节1
	 * \endif
	 */
	public byte                bExtern1;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 2
	 * \else
	 * 扩展字节2
	 * \endif
	 */
	public byte                bExtern2;
}
