package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rights info
 * \else
 * 权限信息
 * \endif
 */
public class OPR_RIGHT_NEW implements Serializable {
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
	public int			dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 权限名字
	 * \endif
	 */
	public char		name[] = new char[FinalVar.SDK_RIGHT_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Memo
	 * \else
	 * 备注
	 * \endif
	 */
	public char		memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
