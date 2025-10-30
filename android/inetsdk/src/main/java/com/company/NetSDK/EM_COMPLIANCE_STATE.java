package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Compliance detection status
 * \else
 * @brief 合规检测状态
 * \endif
 */
public class EM_COMPLIANCE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Compliant
     * \else
     *  合规
     * \endif
     */
    public static final int					EM_COMPLIANCE_STATE_COMPLIANT = 0;

    /**
     * \if ENGLISH_LANG
     *  not compliant
     * \else
     *  不合规
     * \endif
     */
    public static final int					EM_COMPLIANCE_STATE_NONCOMPLIANT = 1;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_COMPLIANCE_STATE_UNKNOWN = 2;

}