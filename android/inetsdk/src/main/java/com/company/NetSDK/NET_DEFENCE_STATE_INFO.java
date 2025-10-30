package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zpne status info, {@link INetSDK#QueryDevState} corresponding to command {@link FinalVar#SDK_DEVSTATE_DEFENCE_STATE}
 * \else
 * 防区状态信息, {@link INetSDK#QueryDevState}对应命令 {@link FinalVar#SDK_DEVSTATE_DEFENCE_STATE}
 * \endif
 */
public class NET_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Input parameter
	 * \else
	 * 输入参数
	 * \endif
	 */
	public NET_IN_DEFENCE_STATE_INFO stuIn = new NET_IN_DEFENCE_STATE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Output parameter
	 * \else
	 * 输出参数
	 * \endif
	 */
	public NET_OUT_DEFENCE_STATE_INFO stuOut = new NET_OUT_DEFENCE_STATE_INFO();
}

