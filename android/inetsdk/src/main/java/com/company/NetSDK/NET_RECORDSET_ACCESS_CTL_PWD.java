package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record  Information
 * \else
 * 门禁密码记录集信息
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_PWD implements Serializable {
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
	public int					nRecNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Creat Time
	 * \else
	 * 创建时间
	 * \endif
	 */
	public NET_TIME		   stuCreateTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * 用户ID
	 * \endif
	 */
	public byte        	   szUserID[] 		= new byte[FinalVar.SDK_MAX_USERID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Open Password
	 * \else
	 * 开门密码
	 * \endif
	 */
	public byte			   szDoorOpenPwd[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Password
	 * \else
	 * 报警密码
	 * \endif
	 */
	public byte			   szAlarmPwd[] 	= new byte[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * 有效的的门数目
	 * \endif
	 */
	public int			      nDoorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is {@link FinalVar#CFG_CMD_ACCESS_EVENT} Configure Array {@link CFG_ACCESS_EVENT_INFO} Subscript
	 * \else
	 * 有权限的门序号，即 {@link FinalVar#CFG_CMD_ACCESS_EVENT} 配置 {@link CFG_ACCESS_EVENT_INFO} 的数组下标
	 * \endif
	 */
	public int		         sznDoors[] 		= new int[FinalVar.SDK_MAX_DOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * VTO link position
	 * \else
	 * 门口机关联位置
	 * \endif
	 */
	public byte[]           szVTOPosition = new byte[FinalVar.SDK_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * the Number of Effective Open Time
	 * \else
	 * 开门时间段个数
	 * \endif
	 */
	public int              nTimeSectionNum;

	/**
	 * \if ENGLISH_LANG
	 * Open Timesection Index array,each element corresponds to each element of sznDoors
	 * \else
	 * 开门时间段索引,是个数组，每个元素与sznDoors中的门对应
	 * \endif
	 */
	public int[]            nTimeSectionIndex = new int[FinalVar.SDK_MAX_TIMESECTION_NUM];

	/**
	 * \if ENGLISH_LANG
	 * enable to new field,TRUE: user nNewDoorNum,nNewDoors
	 * \else
	 * 是否启动新开门授权字段，TRUE表示使用nNewDoorNum和nNewDoors字段下发开门权限
	 * \endif
	 */
	public boolean         bNewDoor;

	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number;
	 * \else
	 * 有效的门数目
	 * \endif
	 */
	public int              nNewDoorNum;

	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * 有权限的门序号,即 {@link CFG_CMD_ACCESS_EVENT}配置的数组下标
	 * \endif
	 */
	public int[]            nNewDoors = new int[FinalVar.MAX_ACCESSDOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * the Number of Effective Open Time
	 * \else
	 * 有效的的开门时间段数目
	 * \endif
	 */
	public int              nNewTimeSectionNum;

	/**
	 * \if ENGLISH_LANG
	 * Open Time Segment Index,That is CFG_ACCESS_TIMESCHEDULE_INFO Array subscript
	 * \else
	 * 开门时间段索引,即 {@link CFG_ACCESS_TIMESCHEDULE_INFO}的数组下标
	 * \endif
	 */
	public int[]            nNewTimeSectionNo = new int[FinalVar.MAX_ACCESSDOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Valid Start Time
	 * \else
	 * 开始有效期
	 * \endif
	 */
	public NET_TIME         stuValidStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Valid End Time
	 * \else
	 * 结束有效期
	 * \endif
	 */
	public NET_TIME         stuValidEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Valid Counts
	 * \else
	 * 有效次数
	 * \endif
	 */
	public int        		 nValidCounts;
}
