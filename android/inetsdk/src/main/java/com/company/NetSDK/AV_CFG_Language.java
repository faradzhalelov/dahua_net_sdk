package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Language Configuration Struction, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LANGUAGE}
 * \else
 * 语言配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LANGUAGE}
 * \endif
 */
public class AV_CFG_Language implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Current Language, refer to {@link AV_CFG_LanguageType}
	 * \else
	 * 当前语言, 取值参考 {@link AV_CFG_LanguageType}
	 * \endif
	 */
	public int		emLanguage;
}
