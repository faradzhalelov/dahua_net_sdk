package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* window info 
* \else
* 窗口信息
* \endif
*/
public class NET_SPLIT_WINDOW_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 *  window no.
	 * \else
	 * 窗口号
	 * \endif
	 */
	public int                 nWindowID;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * Z order
	 * \else
	 * Z次序
	 * \endif
	 */
	public int                 nZOrder;                        
	
	 /**
	 * \if ENGLISH_LANG
	 * control no.
	 * \else
	 * 控制编号
	 * \endif
	 */
	public byte[]              szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     

}
