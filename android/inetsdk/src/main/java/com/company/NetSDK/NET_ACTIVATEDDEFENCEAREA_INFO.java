package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * activate zone info
 * \else
 * 激活的防区信息
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * zone channel no.
	 * \else
	 * 防区通道号
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * zone activation time 
	 * \else
	 * 防区激活时间
	 * \endif
	 */
	public NET_TIME stuActivationTime = new NET_TIME();

}
