package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Unable linkage configuration
 * \else
 * 一键撤防配置
 * \endif
 */
public class NET_CFG_DISABLE_LINKAGE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unable linkage switch
	 * \else
	 * 撤防联动项功能总开关
	 * \endif
	 */
	public boolean						   bEnable;
}
