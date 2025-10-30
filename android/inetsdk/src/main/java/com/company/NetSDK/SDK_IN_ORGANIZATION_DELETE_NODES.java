package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationDeleteNodes}'s interface input param(delete node)
 * \else
 * {@link INetSDK#OrganizationDeleteNodes}接口的输入参数(删除节点)
 * \endif
 */
public class SDK_IN_ORGANIZATION_DELETE_NODES implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * count
	 * \else
	 * 节点数量
	 * \endif
	 */
	public int                 nPathCount;

	/**
	 * \if ENGLISH_LANG
	 * array of node path
	 * \else
	 * 节点路径数组
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE_PATH[]	pstuPath;

    public SDK_IN_ORGANIZATION_DELETE_NODES(int nPathCount) {
        this.nPathCount = nPathCount;
        pstuPath = new SDK_ORGANIZATION_NODE_PATH[nPathCount];
        for (int i = 0; i < nPathCount; ++i) {
            pstuPath[i] = new SDK_ORGANIZATION_NODE_PATH();
        }
    }
}
