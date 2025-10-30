package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User group info
 * \else
 * 用户组信息
 * \endif
 */
public class USER_GROUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID 
	 * \else
	 * ID号
	 * \endif
	 */
	public int					dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group name 
	 * \else
	 * 组名
	 * \endif
	 */
	public char				name[] = new char[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Right list length 
	 * \else
	 * 权限长度
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right list 
	 * \else
	 * 权限列表
	 * \endif
	 */
	public int					rights[] = new int[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note 
	 * \else
	 * 备注
	 * \endif
	 */
	public char				memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
