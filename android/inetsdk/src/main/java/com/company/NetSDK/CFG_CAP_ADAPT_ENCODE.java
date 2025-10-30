package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * adapt caps
 * \else
 * 自适应能力
 * \endif
 */
public class CFG_CAP_ADAPT_ENCODE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * encode adapt caps,do not support main stream 
	 * \else
	 * 自适应编码调整能力 ，主码流暂不支持
	 * \endif
	 */
    public boolean        bSupportedNAAEncode; 
    
	/**
	 * \if ENGLISH_LANG
	 * encode smooth caps
	 * \else
	 * 设备编码平滑配置能力
	 * \endif
	 */
    public boolean        bSupportedIPSmoothness; 
}
