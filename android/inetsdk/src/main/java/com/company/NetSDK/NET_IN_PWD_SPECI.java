package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetPwdSpecification} Interface Input Parameters
* \else
* {@link INetSDK#GetPwdSpecification} 接口输入参数
* \endif
*/

public class NET_IN_PWD_SPECI implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * mac address
	 * \else
	 * 设备mac地址
	 * \endif
	 */
	public byte[]		szMac = new byte[FinalVar.SDK_MACADDR_LEN];	
}
