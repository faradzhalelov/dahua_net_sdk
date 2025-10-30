package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationAddNodes}'s interface input param(add node)
 * \else
 * {@link INetSDK#OrganizationAddNodes}接口的输入参数(增加节点)
 * \endif
 */
public class SDK_IN_ORGANIZATION_ADD_NODES implements Serializable {

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
	public String                  pszPath;

	/**
	 * \if ENGLISH_LANG
	 * array of node
	 * \else
	 * 节点信息数组
	 * \endif
	 */
	public SDK_ORGANIZATION_ADD_NODE_PARAM[]	pstuNodes;

	/**
	 * \if ENGLISH_LANG
	 * count of node
	 * \else
	 * 节点数量
	 * \endif
	 */
	public int                  nNodeCount;


    public SDK_IN_ORGANIZATION_ADD_NODES(int nNodeCount) {
        this.nNodeCount = nNodeCount;
        pstuNodes = new SDK_ORGANIZATION_ADD_NODE_PARAM[nNodeCount];
        for (int i = 0; i < nNodeCount; ++i) {
            pstuNodes[i] = new SDK_ORGANIZATION_ADD_NODE_PARAM();
        }
    }
}
