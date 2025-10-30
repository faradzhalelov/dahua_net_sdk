package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Status Info Output Parameter
 * \else
 * 防区状态信息的输出参数
 * \endif
 */
public class NET_OUT_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone valid number
	 * \else
	 * 防区有效个数
	 * \endif
	 */
	public int             nDefenceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Zone status info, refer to EM_DEFENCE_STATE_TYPE
	 * \else
	 * 防区状态信息, 取值参考 {@link EM_DEFENCE_STATE_TYPE}
	 * \endif
	 */
	public int anDefenceState[] = new int[FinalVar.SDK_MAX_ALARMIN];  
}

