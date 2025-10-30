package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachDevComm} Input Parameters
 * \else
 * {@link INetSDK#AttachDevComm} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_DEVCOMM implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor CAN channel number
	 * \else
	 * 监听的透明串口号
	 * \endif
	 */
	public int                    nChannel;                        
}
