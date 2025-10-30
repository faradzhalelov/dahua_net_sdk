package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flow statistics status info of the channel 
 * \else
 * 通道的流量状态信息
 * \endif
 */
public class SDKDEV_USE_CHANNEL_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * 通道号
	 * \endif
	 */
	public int				nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel use purpose 
	 * \else
	 * 通道用途
	 * \endif
	 */
	public byte				szUseType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Flow value(Unit：kb/s)
	 * \else
	 * 流量大小(单位：kb/s)
	 * \endif
	 */
	public int				dwStreamSize;			
}
