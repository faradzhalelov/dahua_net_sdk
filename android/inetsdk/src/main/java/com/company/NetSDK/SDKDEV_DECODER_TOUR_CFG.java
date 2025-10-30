package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_DECODER_TOUR_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the number of Configure structures. The biggest support 32. Specific number of support inquiries through capacity.
	 * \else
	 * 配置结构体数目. 现在最大支持32个.具体支持数目可以通过能力查询.
	 * \endif
	 */
	public int                             nCfgNum;

	/**
	 * \if ENGLISH_LANG
	 * Polling configuration array, the effective number of structures by the members of the "nCfgNum" designation. Keep left to expand 32.
	 * \else
	 * 轮询配置数组,有效结构体个数由成员"nCfgNum"指定. 保留32个留待扩展.
	 * \endif
	 */
	public SDKDEV_DECODER_TOUR_SINGLE_CFG   tourCfg[] = new SDKDEV_DECODER_TOUR_SINGLE_CFG[64];
	
	public SDKDEV_DECODER_TOUR_CFG() {
		for (int i = 0; i < 64; i++) {
			tourCfg[i] = new SDKDEV_DECODER_TOUR_SINGLE_CFG();
		}
	}
}
