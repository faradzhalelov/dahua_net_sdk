package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationAddNodes} interface output param(add node)
 * \else
 * {@link INetSDK#OrganizationAddNodes}接口的输出参数(增加节点)
 * \endif
 */
public class SDK_OUT_ORGANIZATION_ADD_NODES implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * array of result
	 * \else
	 * 结果数组
	 * \endif
	 */
    public SDK_ORGANIZATION_ADD_NODE_RESULT[] pstuResults;

	/**
	 * \if ENGLISH_LANG
	 * size of result
	 * \else
	 * 结果数组大小
	 * \endif
	 */
	public int                 nMaxResultCount;

	/**
	 * \if ENGLISH_LANG
	 * count of result
	 * \else
	 * 返回的结果数量
	 * \endif
	 */
	public int                 nRetResultCount;

	public SDK_OUT_ORGANIZATION_ADD_NODES(int nResultCount) {
		nMaxResultCount = nResultCount;
		pstuResults = new SDK_ORGANIZATION_ADD_NODE_RESULT[nResultCount];
		for (int i = 0; i < nResultCount; ++i) {
			pstuResults[i] = new SDK_ORGANIZATION_ADD_NODE_RESULT();
		}
	}
}
