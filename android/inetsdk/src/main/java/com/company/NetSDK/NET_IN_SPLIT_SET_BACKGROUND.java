package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* Set video output background input parameter
* \else
* 设置视频输出背景图输入参数
* \endif
*/
public class NET_IN_SPLIT_SET_BACKGROUND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * Video output channel no.
	 * \else
	 * 视频输出通道号
	 * \endif
	 */
	public int              	nChannel;                   
	
	 /**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean              bEnable;                    
	
	 /**
	 * \if ENGLISH_LANG
	 * background name
	 * \else
	 * 背景图名称
	 * \endif
	 */
    public String     			pszFileName;                
	
}
