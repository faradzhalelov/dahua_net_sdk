package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of IOT record handle, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_IOT_RECORD_HANDLE}
 * \else
 * 物联网录像联动配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_IOT_RECORD_HANDLE}
 * \endif
 */
public class CFG_IOT_RECORD_HANDLE_INFO implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable, it indicates whether to open the record linkage function
	 * \else
	 * 使能，表示是否开启录像联动
	 * \endif
	 */
	public boolean					bEnable;							
	
	/**
	 * \if ENGLISH_LANG
	 * the time of record linkage, unit:second
	 * \else
	 * 联动录像时间，单位秒
	 * \endif
	 */
	public int						nRecordTime;						
}
