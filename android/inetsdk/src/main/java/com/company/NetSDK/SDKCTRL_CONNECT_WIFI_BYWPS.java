package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_CTRL_WIFI_BY_WPS}(WPS rapid configuration WIFI)
 * \else
 * 接口{@link INetSDK#ControlDevice}的{@link CtrlType#SDK_CTRL_WIFI_BY_WPS}命令参数(WPS快速配置WIFI)
 * \endif
 */
public class SDKCTRL_CONNECT_WIFI_BYWPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * connect parameter(user to fill in)
	 * \else
	 * 连接参数(由用户填写)
	 * \endif
	 */
	public SDKCTRL_CONNECT_WIFI_BYWPS_IN     	stuWpsInfo = new SDKCTRL_CONNECT_WIFI_BYWPS_IN(); 
	
	/**
	 * \if ENGLISH_LANG
	 * return data(device to return to)
	 * \else
	 * 返回数据(由设备返回)
	 * \endif
	 */
	public SDKCTRL_CONNECT_WIFI_BYWPS_OUT    	stuWpsResult = new SDKCTRL_CONNECT_WIFI_BYWPS_OUT();
}
