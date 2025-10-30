package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachDebugInfo} Input Parameters
 * \else
 * {@link INetSDK#AttachDebugInfo} 输入参数
 * \endif
 */
public class NET_IN_ATTACH_DBGINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * log level,{@link EM_DBGINFO_LEVEL}
     * \else
     * 日志等级,{@link EM_DBGINFO_LEVEL}
     * \endif
     */
    public int          emLevel;

    /**
     * \if ENGLISH_LANG
     * Callback
     * \else
     * 回调
     * \endif
     */
    public CB_fDebugInfoCallBack pCallBack;
}
