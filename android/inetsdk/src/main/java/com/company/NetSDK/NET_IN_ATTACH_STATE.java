package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachBurnState} input param
 * \else
 * {@link INetSDK#AttachBurnState} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_STATE implements Serializable {

	/**
	 * AttachBurnState input param
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * disk name, as "/dev/sda"
	 * \else
	 *  光盘名称，如"/dev/sda"
	 * \endif
	 */
	public 	String szDeviceName;
	
	/**
	 * \if ENGLISH_LANG
	 * burning session handle, StartBurnSession retuen value. This value is 0, szDeviceName is valid, by burning device subscribe burning status
	 * \else
	 * 刻录会话句柄, StartBurnSession的返回值. 该值为0时, szDeviceName有效, 此时按刻录设备订阅刻录状态
	 * \endif
	 */
	public 	long    lBurnSession;
	
	/**
	 * \if ENGLISH_LANG
	 * burning listening callback
	 * \else
	 *  刻录监听回调
	 * \endif
	 */
	public  CB_fAttachBurnStateCB cbAttachState;
             
}

