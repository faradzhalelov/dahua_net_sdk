package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * node path
 * \else
 * 节点路径
 * \endif
 */
public class SDK_ORGANIZATION_NODE_PATH implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * path
	 * \else
	 * 路径
	 * \endif
	 */
	public byte                szPath[] = new byte[FinalVar.MAX_PATH];
}
