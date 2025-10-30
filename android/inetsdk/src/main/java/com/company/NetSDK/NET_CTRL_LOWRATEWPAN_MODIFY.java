package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * modify device info
 * \else
 * 修改无线设备信息
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_MODIFY implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Can only Modify the szName or bEnable of {@link NET_CODEID_INFO}.
	 * \else
	 * 仅能修改 {@link NET_CODEID_INFO} 中的 szName 和  bEnable 字段
	 * \endif
	 */
	public NET_CODEID_INFO stuCodeIDInfo = new NET_CODEID_INFO();    
}
