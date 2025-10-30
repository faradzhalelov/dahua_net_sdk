package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * add code info
 * \else
 * 增加对码信息
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_ADD implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * code info
	 * \else
	 * 对码数据
	 * \endif
	 */
	public NET_CODEID_INFO stuCodeIDInfo = new NET_CODEID_INFO();    
}
