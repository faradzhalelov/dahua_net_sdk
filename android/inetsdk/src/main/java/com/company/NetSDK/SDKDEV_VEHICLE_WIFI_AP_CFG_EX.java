package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wifi ap extern config, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_VICHILE_WIFI_AP_CFG_EX}
 * \else
 * wifi ap配置扩展, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_VICHILE_WIFI_AP_CFG_EX}
 * \endif
 */
public class SDKDEV_VEHICLE_WIFI_AP_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * to enable wift, false:unable true:enable
	 * \else
	 * 是否启用wifi功能, false:不使能  true:使能
	 * \endif
	 */
	public boolean        bEnable;

	/**
	 * \if ENGLISH_LANG
	 * get number of {@link SDKDEV_VEHICLE_WIFI_AP_CFG}
	 * \else
	 * 解析得到的{@link SDKDEV_VEHICLE_WIFI_AP_CFG}结构体有效个数
	 * \endif
	 */
	public int         nRetWifiApNum;

	/**
	 * \if ENGLISH_LANG
	 * apply number of {@link SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG}
	 * \else
	 * 申请的{@link SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG}个数
	 * \endif
	 */
	public int         nMaxWifiApNum;
	
	/**
	 * \if ENGLISH_LANG
	 * a WIFI AP configuration
	 * \else
	 * 单个WIFI AP配置
	 * \endif
	 */
	public SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG pWifiAp[];
	
	public SDKDEV_VEHICLE_WIFI_AP_CFG_EX(int nMaxWifiApNum) {
		this.nMaxWifiApNum = nMaxWifiApNum;
		pWifiAp = new SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG[nMaxWifiApNum];
		for (int i = 0; i < nMaxWifiApNum; i++) {
			pWifiAp[i] = new SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG();
		}
	}
}
