package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User group info
 * \else
 * 用户组信息扩展，用户组名加长
 * \endif
 */
public class USER_GROUP_INFO_EX2 implements Serializable {
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
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * 组名
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Right amount 
	 * \else
	 * 权限列表长度
	 * \endif
	 */
	public int				dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * 权限列表 
	 * \endif
	 */
	public int				rights[] = new int[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note
	 * \else
	 * 备注 
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}
