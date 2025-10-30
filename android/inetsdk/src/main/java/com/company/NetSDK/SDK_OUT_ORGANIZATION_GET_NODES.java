package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationGetNodes}'s interface output param(get node info)
 * \else
 * {@link INetSDK#OrganizationGetNodes}接口的输出参数(获取节点信息)
 * \endif
 */
public class SDK_OUT_ORGANIZATION_GET_NODES implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * size of array
	 * \else
	 * 节点数组大小
	 * \endif
	 */
	public int                     nMaxNodeCount;

	/**
	 * \if ENGLISH_LANG
	 * count of node count
	 * \else
	 * 返回的节点数量
	 * \endif
	 */
	public int                     nRetNodeCount;

	/**
	 * \if ENGLISH_LANG
	 * array of node
	 * \else
	 * 节点数组
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE[]	pstuNodes;

    public SDK_OUT_ORGANIZATION_GET_NODES(int nNodeCount) {
        nMaxNodeCount = nNodeCount;
        pstuNodes = new SDK_ORGANIZATION_NODE[nNodeCount];
        for (int i = 0; i < nNodeCount; ++i) {
            pstuNodes[i] = new SDK_ORGANIZATION_NODE();
        }
    }
}
