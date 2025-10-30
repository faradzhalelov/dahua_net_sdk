package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device relative configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_MACHINE_CFG}
 * \else
 * 机器相关的配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_MACHINE_CFG}
 * \endif
 */
public class SDKDEV_MACHINE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name or SN 
	 * \else
	 * 机器名称或编号
	 * \endif
	 */
	public byte                szMachineName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Device location
	 * \else
	 * 机器部署地点
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM]; 
}
