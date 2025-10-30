package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OrganizationGetNodes}'s interface input param(get node info)
 * \else
 * {@link INetSDK#OrganizationGetNodes}接口的输入参数(获取节点信息)
 * \endif
 */
public class SDK_IN_ORGANIZATION_GET_NODES implements Serializable {

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
	 * level, 0-the level, 1-next level
	 * \else
	 * 级别, 0-本级, 1-下一级
	 * \endif
	 */
	public int                 nLevel;
}
