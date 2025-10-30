package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachBurnCheckState} Input parameter interface (monitor burn parity status)
 * \else
 * {@link INetSDK#AttachBurnCheckState} 接口的输入参数(监听刻录校验状态)
 * \endif
 */
public class NET_IN_ATTACH_BURN_CHECK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 刻录校验回调
	 * \endif
	 */
	public CB_fBurnCheckCallBack  cbBurnCheck;					 
}
