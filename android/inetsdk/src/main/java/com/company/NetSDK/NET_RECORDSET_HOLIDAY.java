package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Holiday Record Iinformation
 * \else
 * 假日记录集信息
 * \endif
 */
public class NET_RECORDSET_HOLIDAY implements Serializable {
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
	public int             nRecNo;

	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * 有效的的门数目
	 * \endif
	 */
	public int             nDoorNum;

	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is {@link CFG_CMD_ACCESS_EVENT} Configure Array {@link CFG_ACCESS_EVENT_INFO} Subscript
	 * \else
	 * 有权限的门序号，即 {@link CFG_CMD_ACCESS_EVENT} 配置 {@link CFG_ACCESS_EVENT_INFO}的数组下标
	 * \endif
	 */
	public int             sznDoors[] = new int[FinalVar.SDK_MAX_DOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Start Time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME        stuStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * End Time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME        stuEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Holiday Ennable
	 * \else
	 * 假期使能
	 * \endif
	 */
	public boolean            bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Holiday No
	 * \else
	 * 假期编号
	 * \endif
	 */
	public byte            szHolidayNo[] = new byte[FinalVar.SDK_COMMON_STRING_32];
}
