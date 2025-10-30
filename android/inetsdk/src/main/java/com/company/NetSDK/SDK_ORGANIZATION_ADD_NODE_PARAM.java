package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * add node param
 * \else
 * 增加节点参数
 * \endif
 */
public class SDK_ORGANIZATION_ADD_NODE_PARAM implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * position, -1-start, -2-end, 0~n
	 * \else
	 * 插入位置, -1-开始, -2-末尾, 0~n
	 * \endif
	 */
	public int                  nPosition;

	/**
	 * \if ENGLISH_LANG
	 * info of node
	 * \else
	 * 节点信息
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE stuNode = new SDK_ORGANIZATION_NODE();
}
