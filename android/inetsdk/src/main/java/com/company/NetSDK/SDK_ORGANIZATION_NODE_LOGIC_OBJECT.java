package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * organization directory logical objects
 * \else
 * 组织目录逻辑对象
 * \endif
 */
public class SDK_ORGANIZATION_NODE_LOGIC_OBJECT implements Serializable {

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
	 * type
	 * \else
	 * 类型
	 * \endif
	 */
	public byte                szType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * deviceID
	 * \else
	 * 设备ID
	 * \endif
	 */
	public byte                szDevID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * control ID, read only
	 * \else
	 * 控制ID, 只读
	 * \endif
	 */
	public byte                szControlID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];

	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannel;
}
