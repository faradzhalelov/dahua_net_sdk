package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network disconnection alarm configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_NETBROKENALARM_CFG}
 * \else
 * 网络中断报警配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_NETBROKENALARM_CFG}
 * \endif
 */
public class SDK_NETBROKEN_ALARM_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                byEnable;
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX();
}
