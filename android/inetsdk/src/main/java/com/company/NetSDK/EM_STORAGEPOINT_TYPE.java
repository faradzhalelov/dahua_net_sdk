package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage point info
 * \else
 * 存储点类型信息
 * \endif
 */
public class EM_STORAGEPOINT_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * \if ENGLISH_LANG
	 * Schedule record storage point type
	 * \else
	 * 定时录像存储点类型
	 * \endif
	 */
	public  static final int EM_STORAGE_TIMINGRECORD = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Manual record  storage point type
	 * \else
	 * 手动录像存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_MANUALRECORD = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Video detection record  storage point type
	 * \else
	 * 视频检测录像存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_VIDEODETECTRECORD = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm record storage point type
	 * \else
	 * 报警录像存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_ALARMRECORD = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Card record storage point type
	 * \else
	 * 卡号录像存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_CARDRECORD = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Other event record storage point type    
	 * \else
	 * 其他事件录像存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_EVENTRECORD = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * chedule snapshot storage point type
	 * \else
	 * 定时抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_TIMINGSNAPSHOT = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snapshot storage point type
	 * \else
	 * 手动抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_MANUALSNAPSHOT = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Video detection snapshot storage point type
	 * \else
	 * 视频检测抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_VIDEODETECTSNAPSHOT = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm snapshot storage point type
	 * \else
	 * 报警抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_ALARMSNAPSHOT = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Card snapshot storage point type
	 * \else
	 * 卡号抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_CARDSNAPSHOT = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Other vent snapshot storage point type
	 * \else
	 * 其他事件抓图存储点类型
	 * \endif
	 */
	public static final int EM_STORAGE_EVENTSNAPSHOT = 11;

}
