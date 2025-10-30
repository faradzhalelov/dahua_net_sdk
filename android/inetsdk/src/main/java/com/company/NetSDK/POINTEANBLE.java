package com.company.NetSDK;

import java.io.Serializable;

public class POINTEANBLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Preset range[1,80], invalid setting is 0.
	 * \else
	 * 预制点的有效范围闭区间[1,80]，无效设置为0。
	 * \endif
	 */
	public byte             bPoint;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid or not,0 invalid,1 valid
	 * \else
	 * 是否有效,0无效，1有效
	 * \endif
	 */
	public byte             bEnable;
}
