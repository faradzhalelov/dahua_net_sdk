package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* get video output background output parameter
* \else
* 获取视频输出背景图输出参数
* \endif
*/
public class NET_OUT_SPLIT_GET_BACKGROUND implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean             bEnable;                            
	
	 /**
	 * \if ENGLISH_LANG
	 * background name
	 * \else
	 * 背景图名称
	 * \endif
	 */
    public byte[]             szFileName = new byte[FinalVar.SDK_COMMON_STRING_256];   

}
