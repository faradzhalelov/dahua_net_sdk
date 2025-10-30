package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * info of organization directory node
 * \else
 * 组织目录节点信息
 * \endif
 */
public class SDK_ORGANIZATION_NODE implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * node type, 0-logical objects, 1-list
	 * \else
	 * 节点类型, 0-逻辑对象, 1-目录
	 * \endif
	 */
	public int                 nNodeType;

	/**
	 * \if ENGLISH_LANG
	 * logical object, effective when nNodeType==0
	 * \else
	 * 逻辑对象, nNodeType==0时有效
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE_LOGIC_OBJECT    stuLogicObject = new SDK_ORGANIZATION_NODE_LOGIC_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * list,effective when nNodeType==1
	 * \else
	 * 目录, nNodeType==1时有效
	 * \endif
	 */
	public SDK_ORGANIZATION_NODE_DIRECTORY       stuDirectory = new SDK_ORGANIZATION_NODE_DIRECTORY();
}
