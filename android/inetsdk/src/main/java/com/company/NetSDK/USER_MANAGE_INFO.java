package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info list
 * \else
 * 用户信息表
 * \endif
 */
public class USER_MANAGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

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
	public OPR_RIGHT		rightList[] = new OPR_RIGHT[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User group amount 
	 * \else
	 * 用户组列表长度
	 * \endif
	 */
	public int				dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * 用户组列表
	 * \endif
	 */
	public USER_GROUP_INFO	groupList[] = new USER_GROUP_INFO[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User amount 
	 * \else
	 * 用户列表长度
	 * \endif
	 */
	public int				dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * 用户列表
	 * \endif
	 */
	public USER_INFO		userList[] = new USER_INFO[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User reusable capability. 1：Support，0：Does not support. 
	 * \else
	 * 用户复用能力；1：支持用户复用，0：不支持用户复用
	 * \endif
	 */
	public int				dwSpecial;
	
	public USER_MANAGE_INFO() {
		for(int i=0 ; i<FinalVar.SDK_MAX_RIGHT_NUM ; i++) {
			rightList[i] = new OPR_RIGHT();
		}
		
		for(int i=0 ; i<FinalVar.SDK_MAX_GROUP_NUM ; i++) {
			groupList[i] = new USER_GROUP_INFO();
		}
		
		for(int i=0 ; i<FinalVar.SDK_MAX_USER_NUM ; i++) {
			userList[i] = new USER_INFO();
		}
	}
}
