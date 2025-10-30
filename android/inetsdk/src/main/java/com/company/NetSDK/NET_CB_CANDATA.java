package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number, {@link CB_fAttachCANCB} Parameter
 * \else
 * 监听CAN总线数据, {@link CB_fAttachCANCB} 参数
 * \endif
 */
public class NET_CB_CANDATA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Common Data Length
	 * \else
	 * 普通数据长度
	 * \endif
	 */
	public int					nDataLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Common Data Content
	 * \else
	 * 普通数据内容
	 * \endif
	 */
	public char[]				pDataContent;
}
