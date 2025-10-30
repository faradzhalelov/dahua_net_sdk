package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of IOT snap handle, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_IOT_SNAP_HANDLE}
 * \else
 * 物联网抓图联动配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_IOT_SNAP_HANDLE}
 * \endif
 */
public class CFG_IOT_SNAP_HANDLE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable, it indicates whether to open the snap linkage dunction
	 * \else
	 * 使能，表示是否开启抓图联动
	 * \endif
	 */
	public boolean					bEnable;								
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of snap
	 * \else
	 *  联动抓图张数
	 * \endif
	 */
	public int						nSnapNum;							
}
