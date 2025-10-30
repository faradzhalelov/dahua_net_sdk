package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * input parameter of {@link INetSDK#SetSmartLockUsername}
 * \else
 * {@link INetSDK#SetSmartLockUsername} 的入参。
 * \endif
 */
public class NET_IN_SET_SMART_LOCK_USERNAME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * open smart lock type {@link .NET_ACCESS_METHOD}
	 * \else
	 * 开锁方式类型  {@link NET_ACCESS_METHOD}
	 * \endif
	 */
	public int emType;
	
	/**
	 * \if ENGLISH_LANG
	 * smart lock serial number
	 * \else
	 * 智能锁序列号
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[FinalVar.MAX_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 * user ID
	 * \else
	 * 用户ID
	 * \endif
	 */
	public byte[] szUserID = new byte[FinalVar.MAX_COMMON_STRING_16];
	
	/**
	 * \if ENGLISH_LANG
	 * modified name
	 * \else
	 * 需要修改成的名字
	 * \endif
	 */
	public byte[] szName = new byte[FinalVar.MAX_COMMON_STRING_32];
	

}
