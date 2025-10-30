package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachCAN} Input Parameters
 * \else
 * {@link INetSDK#AttachCAN} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_CAN implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor CAN channel number
	 * \else
	 * 监听的CAN通道号
	 * \endif
	 */
	public int					nChannel;					   
}
