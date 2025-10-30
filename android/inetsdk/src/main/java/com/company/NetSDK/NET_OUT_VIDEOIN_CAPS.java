package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_VIDEOIN_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps}, 对应命令 {@link FinalVar#NET_VIDEOIN_CAPS}
 * \endif
 */

public class NET_OUT_VIDEOIN_CAPS implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * struct of conflict cap
	 * \else
	 * 资源冲突结构体
	 * \endif
	 */
    public NET_VIDEOIN_CONFLICT_CAPS   stuConflictCap = new NET_VIDEOIN_CONFLICT_CAPS();             
}
