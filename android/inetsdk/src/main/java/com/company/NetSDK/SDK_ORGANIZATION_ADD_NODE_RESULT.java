package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * result of added node
 * \else
 * 增加节点的结果
 * \endif
 */
public class SDK_ORGANIZATION_ADD_NODE_RESULT implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * result
	 * \else
	 * 结果
	 * \endif
	 */
	public boolean                bResult;

	/**
	 * \if ENGLISH_LANG
	 * path, return node path when succeed,return add node path when failed
	 * \else
	 * 路径, 成功返回node路径,失败返回添加node时的路径
	 * \endif
	 */
	public byte                szPath[] = new byte[FinalVar.MAX_PATH];
}
