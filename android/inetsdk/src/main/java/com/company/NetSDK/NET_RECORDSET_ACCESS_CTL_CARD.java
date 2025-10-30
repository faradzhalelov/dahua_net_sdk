package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record Information
 * \else
 * 门禁卡记录集信息
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_CARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * 记录集编号，只读
	 * \endif
	 */
	public int		nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Creat Time
	 * \else
	 * 创建时间
	 * \endif
	 */
	public NET_TIME	stuCreateTime 		= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Card number
	 * \else
	 * 卡号
	 * \endif
	 */
	public char     szCardNo[] 			= new char[FinalVar.SDK_MAX_CARDNO_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * 用户ID
	 * \endif
	 */
	public char     szUserID[]			= new char[FinalVar.SDK_MAX_USERID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Stetue
	 * \else
	 * 卡状态.0:正常.1:挂失.2:注销.4:冻结
	 * \endif
	 */
	public int		nStatus; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type
	 * \else
	 * 卡类型.1:一般卡.2:VIP卡.3:来宾卡.4:巡逻卡.5:禁止名单卡.6:胁迫卡.0xff:母卡
	 * \endif
	 */
	public int		nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Card Password
	 * \else
	 * 卡密码
	 * \endif
	 */
	public char		szPsw[]				= new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * 有效的门数目
	 * \endif
	 */
	public int		nDoorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is {@link CFG_CMD_ACCESS_EVENT} Configure Array Subscript
	 * \else
	 * 有权限的门序号，即 {@link CFG_CMD_ACCESS_EVENT}配置的数组下标
	 * \endif
	 */
	public int		sznDoors[] 			= new int[FinalVar.SDK_MAX_DOOR_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the Number of Effective Open Time
	 * \else
	 * 有效的的开门时间段数目
	 * \endif
	 */
	public int		nTimeSectionNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Open Time Segment Index,That is {@link CFG_ACCESS_TIMESCHEDULE_INFO} Array subscript
	 * \else
	 * 开门时间段索引，即 {@link CFG_ACCESS_TIMESCHEDULE_INFO}的数组下标
	 * \endif
	 */
	public int	 	sznTimeSectionNo[] 	= new int[FinalVar.SDK_MAX_TIMESECTION_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Frequency of Use
	 * \else
	 * 使用次数
	 * \endif
	 */
	public int		nUserTime; 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Start Time 
	 * \else
	 * 开始有效期
	 * \endif
	 */
	public NET_TIME	stuValidStartTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Valid End Time
	 * \else
	 * 结束有效期
	 * \endif
	 */
	public NET_TIME	stuValidEndTime 	= new NET_TIME(); 
	
	/**
	 * \if ENGLISH_LANG
	 * Wether Valid,True =Valid,False=Invalid
	 * \else
	 * 是否有效,true有效;false无效
	 * \endif
	 */
	public boolean	bIsValid;
}
