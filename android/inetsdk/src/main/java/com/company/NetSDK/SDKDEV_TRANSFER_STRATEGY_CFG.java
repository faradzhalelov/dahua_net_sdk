package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network transmission strategy configuration
 * \else
 * 网络传输策略配置
 * \endif
 */
public class SDKDEV_TRANSFER_STRATEGY_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * 0：Video quality priority,1：Fluency priority,2：Auto,
	 * \else
	 * 0：画质优先，1：流畅性优先，2：自动。
	 * \endif
	 */
	public int                 iStrategy;
}
