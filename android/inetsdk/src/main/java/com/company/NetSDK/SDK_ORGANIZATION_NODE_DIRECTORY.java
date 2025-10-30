package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * organization directory
 * \else
 * 组织目录
 * \endif
 */
public class SDK_ORGANIZATION_NODE_DIRECTORY implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 名称
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_NODE_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * control ID
	 * \else
	 * 控制ID
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
}
