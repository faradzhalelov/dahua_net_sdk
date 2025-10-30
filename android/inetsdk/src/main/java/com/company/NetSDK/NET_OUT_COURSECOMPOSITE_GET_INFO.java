package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output of get composite channel info
 * \else
 * 获取组合通道信息出参
 * \endif
 */

public class NET_OUT_COURSECOMPOSITE_GET_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * composite channel info
	 * \else
	 * 组合通道信息
	 * \endif
	 */
	public NET_COMPOSITECHANNEL_INFO   stuChannelInfo = new NET_COMPOSITECHANNEL_INFO();                          
}
