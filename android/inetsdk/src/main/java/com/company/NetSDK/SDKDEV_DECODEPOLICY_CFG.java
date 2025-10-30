package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decode policy configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_DECODE_POLICY_CFG}
 * \else
 * 机器相关的配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_DECODE_POLICY_CFG}
 * \endif
 */
public class SDKDEV_DECODEPOLICY_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * (read only):minimal delay time(ms)
	 * \else
	 * 码缓冲时间范围(只读)：最小缓冲时间(单位：ms)
	 * \endif
	 */
	public int                 nMinTime;

	/**
	 * \if ENGLISH_LANG
	 * (read only):maximal delay time(ms)
	 * \else
	 * 码缓冲时间范围(只读)：最大缓冲时间(单位：ms)
	 * \endif
	 */
	public int                 nMaxTime;

	/**
	 * \if ENGLISH_LANG
	 * device decode delay time(ms)
	 * \else
	 * 目标设备解码缓冲时间(单位：ms)
	 * \endif
	 */
	public int                 nDeocdeBufTime;
}
