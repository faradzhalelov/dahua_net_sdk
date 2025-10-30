package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#InitDevAccess} boot wizard flow input parameters
 * \else
 * {@link INetSDK#InitDevAccess} 开机向导流程入参
 * \endif
 */
public class NET_IN_INIT_DEVICE_ACCESS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * mac addr	
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]			  szMac = new byte[FinalVar.SDK_MACADDR_LEN];	    	
	
	/**
	 * \if ENGLISH_LANG
	 * user name
	 * \else
	 * 账号名
	 * \endif
	 */
	public byte[]			  szUserName = new byte[FinalVar.MAX_USER_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 账号密码
	 * \endif
	 */
	public byte[]			  szPwd = new byte[FinalVar.MAX_PWD_LEN];		    
	
	/**
	 * \if ENGLISH_LANG
	 * whether enable netaccess:	0-not involved, not handled;    1-unable;    2-enable
	 * \else
	 * 是否使能接入公网(Easy4IP/LC):	0-不涉及，不处理;      1-关闭接入公网;       2-打开接入公网
	 * \endif
	 */
	public byte               byNetAccess;                  
	
	/**
	 * \if ENGLISH_LANG
	 * whether enable upgradecheck: 0-not invloved, not handled;    1-unable;     2-enable
	 * \else
	 * 是否打开在线升级自动检测:  0-不涉及，不处理;	1-关闭在线升级自动检测;	 2-开启在线升级自动检测
	 * \endif
	 */
	public byte               byUpgradeCheck;

	/**
	 * \if ENGLISH_LANG
	 * Video standard,refer to {@link EM_VIDEO_STANDARD}
	 * \else
	 * 视频制式,参考{@link EM_VIDEO_STANDARD}
	 * \endif
	 */
	public int 				emVideoStandard;
}
