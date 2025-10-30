package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Safety belt related attribute status information
 * \else
 * @brief 安全带相关属性状态信息
 * \endif
 */
public class NET_SAFE_BELT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to wear safety belt, 0: unknown, 1: not wearing safety belt, 2: wearing safety belt
     * \else
     *  是否穿安全带 , 0:未知，1:未穿安全带，2:穿了安全带
     * \endif
     */
    public int					nHasSafeBelt;

    /**
     * \if ENGLISH_LANG
     *  Safety belt test result, 0-compliant 1-noncompliant 2-unknown
     * \else
     *  安全带检测结果, 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nHasLegalSafeBelt;

}