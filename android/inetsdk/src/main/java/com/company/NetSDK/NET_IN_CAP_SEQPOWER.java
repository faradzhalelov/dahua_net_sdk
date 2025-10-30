package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get power sequence input parameter, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_DEV_CAP_SEQPOWER}
 * \else
 * 获取电源时序器能力输入参数, 对应接口{@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_DEV_CAP_SEQPOWER}
 * \endif
 */
public class NET_IN_CAP_SEQPOWER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * device id
	 * \else
	 * 设备ID
	 * \endif
	 */
	public String                          pszDeviceID;   
}
