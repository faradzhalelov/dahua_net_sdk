package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * trouble information
 * \else
 * 防区故障信息
 * \endif
 */
public class NET_ZONE_TROUBLE_INFO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * zone id
	 * \else
	 * 防区号
	 * \endif
	 */
	public int                    nIndex;

	/**
	 * \if ENGLISH_LANG
	 * trouble type {@link EM_ZONE_TROUBLE_TYPE}
	 * \else
	 * 故障类型 {@link EM_ZONE_TROUBLE_TYPE}
	 * \endif
	 */
	public int   emTroubleType;
}
