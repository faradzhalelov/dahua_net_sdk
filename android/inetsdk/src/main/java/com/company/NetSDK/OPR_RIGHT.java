package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Right information, Support the device with max 8 bits user name. Corresponding to the {@link INetSDK#QueryUserInfo} and {@link INetSDK#OperateUserInfo}
 * \else
 * 权限信息, 支持用户名最大长度为8位的设备，对应  {@link INetSDK#QueryUserInfo} 和 {@link INetSDK#OperateUserInfo} 接口
 * \endif
 */
public class OPR_RIGHT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right ID
	 * \else
	 * 权限ID
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 权限名字
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
