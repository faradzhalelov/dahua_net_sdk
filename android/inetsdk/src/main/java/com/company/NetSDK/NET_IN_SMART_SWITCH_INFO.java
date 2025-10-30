package com.company.NetSDK;

import java.io.Serializable;
 
/**
* \if ENGLISH_LANG
* Query smart switch information input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_SMART_SWITCH_INFO}
* \else
* 查询智能插座信息入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_SMART_SWITCH_INFO}
* \endif
*/
public class NET_IN_SMART_SWITCH_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * serial number of device
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[FinalVar.SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN];  
	
}
