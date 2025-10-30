package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The searched wireless device expended configuration list, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_WLAN_DEVICE_CFG_EX}
 * \else
 * 搜索到的无线设备扩展配置列表, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_WLAN_DEVICE_CFG_EX}
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_LIST_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The wireless device number searched
	 * \else
	 * 搜索到的无线设备个数
	 * \endif
	 */
	public byte                bWlanDevCount;
	
	public SDKDEV_WLAN_DEVICE_EX  lstWlanDev[] = new SDKDEV_WLAN_DEVICE_EX[FinalVar.SDK_MAX_WLANDEVICE_NUM_EX];
	
	public SDKDEV_WLAN_DEVICE_LIST_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_WLANDEVICE_NUM_EX; i++) {
			lstWlanDev[i] = new SDKDEV_WLAN_DEVICE_EX();
		}
	}
}
