package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap control configuration, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SNAP_CONTROL_CFG}
 * \else
 * 抓图控制配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_SNAP_CONTROL_CFG}
 * \endif
 */
public class SDKDEV_SNAP_CONTROL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * every channel's snap on-off: 0 Autumn(other configuration and event will control whether snap picture ); 1: turn on snap; 2: turn off snap
	 * \else
	 * 每个通道对应抓图开关 0:自动(则表示是否抓图，由其他配置和事件控制); 1:抓图开启; 2:抓图关闭
	 * \endif
	 */
	public byte                bySnapState[] = new byte[32]; 
}
