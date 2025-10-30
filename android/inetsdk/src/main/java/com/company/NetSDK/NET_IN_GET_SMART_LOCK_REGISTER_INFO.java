package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the input parameters of {@link INetSDK#GetSmartLockRegisterInfo}
 * \else
 * 	{@link INetSDK#GetSmartLockRegisterInfo}的入参;
 * \endif
 */
public class NET_IN_GET_SMART_LOCK_REGISTER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device serial number
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[FinalVar.MAX_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 * the offset of user list
	 * \else
	 * 用户序列表的偏移量
	 * \endif
	 */
	public int   nOffset;
}
