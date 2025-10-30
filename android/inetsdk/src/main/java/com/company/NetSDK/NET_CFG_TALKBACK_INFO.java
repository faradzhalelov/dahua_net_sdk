package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice call linkage information
 * \else
 * 语音呼叫联动信息
 * \endif
 */
public class NET_CFG_TALKBACK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Voice call enable
     * \else
     * 语音呼叫使能
     * \endif
     */
    public boolean				bCallEnable;

    /**
     * \if ENGLISH_LANG
     * Voice call Originator, refer to {@link NET_EM_CALLER_TYPE}
     * \else
     * 语音呼叫发起方, 参考 {@link NET_EM_CALLER_TYPE}
     * \endif
     */
    public int				         emCallerType;

    /**
     * \if ENGLISH_LANG
     * Voice call protocol, refer to {@link NET_EM_CALLER_PROTOCOL_TYPE}
     * \else
     * 语音呼叫协议, 参考 {@link NET_EM_CALLER_PROTOCOL_TYPE}
     * \endif
     */
    public int		                 emCallerProtocol;
}
