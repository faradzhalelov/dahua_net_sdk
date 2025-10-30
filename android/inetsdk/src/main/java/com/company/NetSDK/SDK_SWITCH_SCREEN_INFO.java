package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  switch screen event, the corresponding command {@link FinalVar#SDK_SWITCH_SCREEN}
 * \else
 * 切换屏幕上报事件，对应命令 {@link FinalVar#SDK_SWITCH_SCREEN}
 * \endif
 */
public class SDK_SWITCH_SCREEN_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel ID  
	 * \else
	 * 通道号
	 * \endif
	 */
	public   int            nChannelID ;

}
