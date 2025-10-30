package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Window Working Mode
* \else
* 窗口工作模式
* \endif
*/
public class NET_WM_WORK_MODE implements Serializable {

	/**
	 * 
	 */
	private  static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * 未知
	 * \endif
	 */
	public  static final int NET_WM_WORK_MODE_UNKNOWN = 0;                            // 
	
	 /**
	 * \if ENGLISH_LANG
	 * Preview mode
	 * \else
	 * 预览模式
	 * \endif
	 */
	public  static final int NET_WM_WORK_MODE_DISPLAY =1;                             
	
	 /**
	 * \if ENGLISH_LANG
	 * Playback mode
	 * \else
	 * 回放模式  
	 * \endif
	 */
	public  static final int NET_WM_WORK_MODE_REPLAY = 2;                             
}
