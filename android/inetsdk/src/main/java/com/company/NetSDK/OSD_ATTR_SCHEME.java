package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OSD Property Config Scheme Content
 * \else
 * OSD属性配置方案内容
 * \endif
 */
public class OSD_ATTR_SCHEME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All OSD Item Public Property
	 * \else
	 * 全体OSD项共用属性
	 * \endif
	 */
	public OSD_WHOLE_ATTR stWholeAttr = new OSD_WHOLE_ATTR();
}
