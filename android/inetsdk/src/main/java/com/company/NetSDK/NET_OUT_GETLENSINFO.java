package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter of {@link INetSDK#GetLensInfo}
 * \else
 * {@link INetSDK#GetLensInfo} 接口输出参数
 * \endif
 */
public class NET_OUT_GETLENSINFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * lens type
	 * \else
	 * 镜头类型
	 * \endif
	 */
	public int                    emLensType;
}
