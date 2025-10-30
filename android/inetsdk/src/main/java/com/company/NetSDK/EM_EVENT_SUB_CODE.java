package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event sub code type
 * \else
 * 事件子类型
 * \endif
 */
public class EM_EVENT_SUB_CODE implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Loss
	 * \else
	 * Loss
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_LOSS = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Cover
	 * \else
	 * Cover
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_COVER = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Frozen
	 * \else
	 * Frozen
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_FROZEN = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Light
	 * \else
	 * Light
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_LIGHT = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Dark
	 * \else
	 * Dark
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_DARK = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * SceneChange
	 * \else
	 * SceneChange
	 * \endif
	 */
	public static final int EM_EVENT_SUB_CODE_SCENECHANGE = 5;

}
