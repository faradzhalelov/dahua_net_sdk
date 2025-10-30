package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Control Ability, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_ACCESSCONTROLMANAGER}
 * \else
 * 门禁控制能力, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_ACCESSCONTROLMANAGER}
 * \endif
 */

public class CFG_CAP_ACCESSCONTROL implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Class Number of Entrance Guard
	 * \else
	 * 门禁组数
	 * \endif
	 */
	public int		nAccessControlGroups;	
}
