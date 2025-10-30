package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_POINT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Read-only parameter, shall return to sdk when set, it means supported pre-set number
	 * \else
	 * 只读参数，设置的时候需要返回给sdk，表示支持的预制点数
	 * \endif
	 */
	public int              nSupportNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2D config means point info.
	 * \else
	 * 二维下标表示通道号。要设置的点数值放在前nSupportNum个下标里面。
	 * \endif
	 */
	public POINTCFG         stuPointCfg[] = new POINTCFG[16]; 
	
	public SDKDEV_POINT_CFG() {
		for (int i = 0; i < 16; i++) {
			stuPointCfg[i] = new POINTCFG();
		}
	}
}
