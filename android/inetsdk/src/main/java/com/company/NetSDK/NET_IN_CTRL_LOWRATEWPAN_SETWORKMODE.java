package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * set the detector work mode
 * \else
 * 设置探测器工作模式
 * \endif
 */
public class NET_IN_CTRL_LOWRATEWPAN_SETWORKMODE implements Serializable {

	/**
	 * 
	 **/
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * work mode 0:alway working mode 1:power saving mode
	 * \else
	 * 工作模式 0：常工作模式  1：省电模式
	 * \endif
	 */
	public int nMode;

}
