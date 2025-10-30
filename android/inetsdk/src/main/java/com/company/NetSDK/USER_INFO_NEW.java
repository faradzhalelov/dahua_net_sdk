package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info structure body 
 * \else
 * 用户信息
 * \endif
 */
public class USER_INFO_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID
	 * \else
	 * Id号
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group ID 
	 * \else
	 * 组ID号
	 * \endif
	 */
	public int				dwGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name 
	 * \else
	 * 名字名
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * 密码
	 * \endif
	 */
	public char			passWord[] = new char[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
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
	 * Right,１:Auth user manager,2:Monitor,3:Replay,4:System config,5:System info,6:Manual contorl ,7:Backup,8:Store config,9:Event config,10:Network config,11:Peripheral,12:Audio and video param,13:Security,14:Maintence
	 * \else
	 * 权限列表，１:用户管理,2:预览,3:回放,4:系统管理,5:系统信息,6:手动控制,7:文件备份,8:存储管理,9:事件管理,10:网络管理,11:外设管理,12:音视频参数,13:安全管理,14:设备维护
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
	
	/**
	 * \if ENGLISH_LANG
	 * Submask，0x00000001 - support account reusable
	 * \else
	 * 掩码，0x00000001 - 支持用户复用
	 * \endif
	 */
	public int				dwFouctionMask;

	/**
	 * \if ENGLISH_LANG
	 * Last Revise TimeK
	 * \else
	 * 最后修改时间
	 * \endif
	 */
	public NET_TIME		stuTime = new NET_TIME();


	/**
	 * \if ENGLISH_LANG
	 * 是否可以匿名登录, 0:不可匿名登录, 1: 可以匿名登录
	 * \else
	 * Whether Can Be Anonymous Login,0=Can't Be Anonymous Login,1=Can be Anonymous Login
	 * \endif
	 */
	public byte				byIsAnonymous;

}
