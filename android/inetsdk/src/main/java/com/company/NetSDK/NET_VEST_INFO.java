package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Reflective vest related attribute status information
 * \else
 * @brief 反光背心相关属性状态信息
 * \endif
 */
public class NET_VEST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to wear reflective vest, 0: unknown, 1: no reflective vest, 2: reflective vest
     * \else
     *  是否穿反光背心, 0:未知，1:未穿反光背心，2:穿了反光背心
     * \endif
     */
    public int					nHasVest;

    /**
     * \if ENGLISH_LANG
     *  Reflective vest test result, 0-compliant 1-nonconforming 2-unknown
     * \else
     *  反光背心检测结果, 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nHasLegalVest;

}