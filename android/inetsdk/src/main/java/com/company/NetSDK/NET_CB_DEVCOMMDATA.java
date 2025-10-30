package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * parameter of {@link CB_fAttachDevCommCB}
 * \else
 * 订阅透明串口数据回调 {@link CB_fAttachDevCommCB} 参数
 * \endif
 */
public class NET_CB_DEVCOMMDATA implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Common data length
	 * \else
	 * 普通数据长度
	 * \endif
	 */
	public int             nDataLength;                    

	/**
	 * \if ENGLISH_LANG
	 * Common data content
	 * \else
	 * 普通数据内容
	 * \endif
	 */
	public byte[]          pDataContent;                   
}
