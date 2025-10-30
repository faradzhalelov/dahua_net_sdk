package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Attribute status information about the anti-cutting wrist guard
 * \else
 * @brief 防割护腕相关属性状态信息
 * \endif
 */
public class NET_WRIST_GUARD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  0: unknown, 1: not worn, and 2: Yes
     * \else
     *  是否穿防割护腕, 0:未知，1:未穿防割护腕，2:穿了防割护腕
     * \endif
     */
    public int					nHasWristGuard;

    /**
     * \if ENGLISH_LANG
     *  Test result of anti-cutting wrist guard: 0- compliant 1- non-compliant 2- unknown
     * \else
     *  防割护腕检测结果 , 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nHasLegalWristGuard;

}