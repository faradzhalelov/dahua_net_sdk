package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Hangup reason
 * \else
 * 挂断原因
 * \endif
 */
public class EM_HANGUP_REASON implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_HANGUP_REASON_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Answer by VTH
     * \else
     * VTH 已应答
     * \endif
     */
    public static final int EM_HANGUP_REASON_ANSWER_BY_VTH = 1;

    /**
     * \if ENGLISH_LANG
     * Refuse by VTH
     * \else
     * VTH 已拒绝
     * \endif
     */
    public static final int EM_HANGUP_REASON_REFUSE_BY_VTH = 2;

    /**
     * \if ENGLISH_LANG
     * Hangup by VTO
     * \else
     * VTO 挂断
     * \endif
     */
    public static final int EM_HANGUP_REASON_HANGUP_BY_VTO = 3;
}
