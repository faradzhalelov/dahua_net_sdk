package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time period structure 
 * \else
 * 时间段结构	
 * \endif
 */
public class SDK_TSECT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Current record period . Bit means the four Enable functions. From the low bit to the high bit:Motion detection record, alarm record and general record, when Motion detection and alarm happened at the same time can record.
	 * used in NET_POS_EVENT_LINK, it means enable;
	 * used in NET_IN_ADD_MOBILE_PUSHER_NOTIFICATION, it means enable：1 means enable, 0 means unable
	 * \else
	 * 当表示录像时间段时，按位表示四个使能，从低位到高位分别表示动检录象、报警录象、普通录象、动检和报警同时发生才录像
	 * 当表示布撤防时间段时, 表示使能
	 * 当表示推送时间段时, 表示使能：1表示使能，0表示非使能
	 * \endif
	 */
	public int     		    bEnable;
	public int					iBeginHour;
	public int					iBeginMin;
	public int					iBeginSec;
	public int					iEndHour;
	public int					iEndMin;
	public int					iEndSec;

	public String toStartString() {
		return iBeginHour + ":" + iBeginMin + ":" + iBeginSec;
	}

	public String toEndString() {
		return iEndHour + ":" + iEndMin + ":" + iEndSec;
	}

	@Override
	public String toString() {
		return "SDK_TSECT{StartTime:" + toStartString() + ",EndTime:" + toEndString() + '}';
	}
}
