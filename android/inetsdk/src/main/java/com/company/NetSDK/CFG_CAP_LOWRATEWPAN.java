package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get LowRateWPAN caps, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_LOWRATEWPAN}
 * \else
 * 获取 LowRateWPAN 能力, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_LOWRATEWPAN}
 * \endif
 */
public class CFG_CAP_LOWRATEWPAN implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Max page search code items
	 * \else
	 * 最大分页查询的对码条数
	 * \endif
	 */
	public int 					nMaxPageSize;

	/**
	 * \if ENGLISH_LANG
	 * 434 Gateway connt, 0 means not support wireless device
	 * \else
	 * 获取支持的433网关数目, 0表示不支持无线设备
	 * \endif
	 */
	public int						n433GatewayCount;
}
