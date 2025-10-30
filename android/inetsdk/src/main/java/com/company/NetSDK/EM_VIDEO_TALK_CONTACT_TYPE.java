package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * user type
 * \else
 * 用户类型
 * \endif
 */
public class EM_VIDEO_TALK_CONTACT_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_VIDEO_TALK_CONTACT_TYPE_UNKNOWN = 0;             
	
	/**
	 * \if ENGLISH_LANG
	 * "VTH" VTH
	 * \else
	 * "VTH" 室内机
	 * \endif
	 */
	public static final int EM_VIDEO_TALK_CONTACT_TYPE_VTH = 1;                 
	
	/**
	 * \if ENGLISH_LANG
	 * VTO" VTO
	 * \else
	 * "VTO" 门口机
	 * \endif
	 */
	public static final int EM_VIDEO_TALK_CONTACT_TYPE_VTO = 2;                 
}
