package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Period information
 * \else
 * 时间段信息
 * \endif
 */
public class CFG_TIME_SECTION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot and Record Type Mask 
	 * <pre>
	 * Mask 		Record Type 
	 * Bit0 		Active Detection Record 
	 * Bit1 		Alarm Record 
	 * Bit2 		Timing Record 
	 * Bit3 R		ecord when motion detection and alarming occur at the same time 
	 * Bit4~Bit15 	Reserved 
	 * Bit16 		Active Detection Snapshot 
	 * Bit17 		Alarming Snapshot 
	 * Bit18 		Timing Snapshot 
	 * Bit19~Bit31 	Reserved 
	 * </pre>
	 * \else
	 * 录像掩码，按位分别为动态检测录像、报警录像、定时录像、Bit3~Bit15保留、Bit16动态检测抓图、Bit17报警抓图、Bit18定时抓图
	 * \endif
	 */
	public int					dwRecordMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin  Hour 
	 * \else
	 * 开始的时数
	 * \endif
	 */
	public int					nBeginHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin  Mitune 
	 * \else
	 * 开始的分钟数
	 * \endif
	 */
	public int					nBeginMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin  Second
	 * \else
	 * 开始的妙数
	 * \endif
	 */
	public int					nBeginSec;
	
	/**
	 * \if ENGLISH_LANG
	 * End  Hour 
	 * \else
	 * 结束的时数
	 * \endif
	 */
	public int					nEndHour;
	
	/**
	 * \if ENGLISH_LANG
	 * End Mitunes 
	 * \else
	 * 结束的分钟数
	 * \endif
	 */
	public int					nEndMin;
	
	/**
	 * \if ENGLISH_LANG
	 * End Seconds 
	 * \else
	 * 结束的秒数 
	 * \endif
	 */
	public int					nEndSec;

	@Override
	public String toString() {
		return nBeginHour + ":" + nBeginMin + ":" + nBeginSec + " ~ " + nEndHour + ":" + nEndMin + ":" + nEndSec + " dwRecordMask = " + dwRecordMask;
	}
}
