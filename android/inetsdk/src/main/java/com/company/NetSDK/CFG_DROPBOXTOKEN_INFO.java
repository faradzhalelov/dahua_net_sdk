package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * configuration of dropbox token, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_DROPBOXTOKEN}
 * \else
 * dropbox token配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_DROPBOXTOKEN}
 * \endif
 */
public class CFG_DROPBOXTOKEN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * dropbox token
     * \else
     * dropbox token
     * \endif
     */
    public byte[]                    szDropBoxToken = new byte[FinalVar.CFG_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * token valid
     * \else
     * token valid
     * \endif
     */
    public boolean                    bKeyValid;
}
