package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Right information Corresponding to the {@link INetSDK#QueryUserInfoEx} and {@link INetSDK#OperateUserInfoEx}
 * \else
 * 权限信息, 支持用户名最大长度为8位或16位的设备，对应扩展接口 {@link INetSDK#QueryUserInfoEx} 和 {@link INetSDK#OperateUserInfoEx}
 * \endif
 */
public class OPR_RIGHT_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID
	 * \else
	 * 权限ID
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 权限名 
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_RIGHT_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Memo
	 * \else
	 * 备注 
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
