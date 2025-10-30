package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Annex burn, corresponding to interface {@link INetSDK#ControlDevice}, corresponding to command {@link CtrlType#SDK_BURNING_ATTACH}
 * \else
 *  附件刻录, 对应接口 {@link INetSDK#ControlDevice}, 对应命令 {@link CtrlType#SDK_BURNING_ATTACH}
 * \endif
 */
public class BURNING_PARM_ATTACH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Whether,0:Not; 1:Yes
	 * \else
	 * 是否为附件刻录，0:不是; 1:是
	 * \endif
	 */
	public int				bAttachBurn;
}
