package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * zone status
 * \else
 * 防区异常信息
 * \endif
 */
public class NET_ZONE_STATUS implements Serializable {

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
	public int              nIndex;

	/**
	 * \if ENGLISH_LANG
	 * zone status {@link EM_ZONE_STATUS}
	 * \else
	 * 防区异常状态 {@link EM_ZONE_STATUS}
	 * \endif
	 */
	public int	 emStatus;
}
