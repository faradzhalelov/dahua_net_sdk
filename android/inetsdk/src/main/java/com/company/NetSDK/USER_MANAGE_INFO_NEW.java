package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User information list 
 * \else
 * 用户信息表
 * \endif
 */
public class USER_MANAGE_INFO_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right information 
	 * \else
	 * 权限列表长度
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
	public OPR_RIGHT_NEW		rightList[] = new OPR_RIGHT_NEW[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * 用户组列表长度
	 * \endif
	 */
	public int					dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * 用户组列表
	 * \endif
	 */
	public USER_GROUP_INFO_EX2 groupListEx[] = new USER_GROUP_INFO_EX2[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * 用户列表长度
	 * \endif
	 */
	public int					dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User list 
	 * \else
	 * 用户列表
	 * \endif
	 */
	public USER_INFO_NEW		userList[] = new USER_INFO_NEW[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask；0x00000001 - Support account reuse，0x00000002 - Need verification when change password 
	 * \else
	 * 掩码；0x00000001 - 支持用户复用，0x00000002 - 密码修改需要校验
	 * \endif
	 */
	public int					dwFouctionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Need verification when change password 
	 * \else
	 * 支持的用户名最大长度
	 * \endif
	 */
	public byte				byNameMaxLength;
	
	/**
	 * \if ENGLISH_LANG
	 * The max password length supported 
	 * \else
	 * 支持的密码最大长度
	 * \endif
	 */
	public byte				byPSWMaxLength;

	public USER_MANAGE_INFO_NEW() {
		for(int i=0 ; i<FinalVar.SDK_NEW_MAX_RIGHT_NUM ; i++) {
			rightList[i] = new OPR_RIGHT_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_USER_NUM ; i++) {
			userList[i] = new USER_INFO_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_GROUP_NUM ; i++) {
			groupListEx[i] = new USER_GROUP_INFO_EX2();
		}
	}
}
