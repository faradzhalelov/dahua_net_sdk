package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * type of videoin caps
 * \else
 * 设备视频输出能力类型
 * \endif
 */
public class NET_ENUM_VIDEOIN_CAP_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * conflict caps of videoin，Corresponding to Structure {@link NET_OUT_VIDEOIN_CAPS}
	 * \else
	 * 设备视频输出能力冲突能力项，对应出参 {@link NET_OUT_VIDEOIN_CAPS}
	 * \endif
	 */
	public static final int NET_VIDEOIN_CAP_TYPE_CONFLICT = 0;                         
}
