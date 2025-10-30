package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationSetNode}'s interface input param(get node info)
 * \else
 * {@link INetSDK#OrganizationSetNode}接口的输入参数(设置节点)
 * \endif
 */
public class SDK_IN_ORGANIZATION_SET_NODE implements Serializable {

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
	 * node info
	 * \else
	 * 节点信息
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE stuNode = new SDK_ORGANIZATION_NODE();
}
