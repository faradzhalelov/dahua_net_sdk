package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * App Event Language, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_APP_EVENT_LANGUAGE}
 * \else
 * 手机推送消息的翻译目标语言配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_APP_EVENT_LANGUAGE}
 * \endif
 */
public class CFG_APP_EVENT_LANGUAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Current Language, refer to {@link EM_LANGUAGE_TYPE}
     * \else
     * 推送消息需要翻译成的目标语言, 取值参考 {@link EM_LANGUAGE_TYPE}
     * \endif
     */
    public int		emCurrLanguage;

    /**
     * \if ENGLISH_LANG
     * count of supported language
     * \else
     * 设备支持的语言个数
     * \endif
     */
    public int		nSupportLanguageCount;

    /**
     * \if ENGLISH_LANG
     * supported language list, refer to {@link EM_LANGUAGE_TYPE}
     * \else
     * 设备支持翻译的语言列表, 取值参考 {@link EM_LANGUAGE_TYPE}
     * \endif
     */
    public int[]	emLanguage = new int[FinalVar.MAX_SUPPORTED_LANGUAGE];
}
