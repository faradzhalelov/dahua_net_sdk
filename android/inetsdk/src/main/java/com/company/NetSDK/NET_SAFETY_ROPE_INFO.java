package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Status information of relevant properties of safety ropes
 * \else
 * @brief 安全绳相关属性状态信息
 * \endif
 */
public class NET_SAFETY_ROPE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether the safety rope is in compliance, 0 - non-compliance 1 - compliance 2 - unknown
     * \else
     *  佩戴带安全绳是否合规, 0-不合规 1-合规 2-未知
     * \endif
     */
    public int					nCompliantType;

    /**
     * \if ENGLISH_LANG
     *  safeRope status 0:unknown 1:no  2:yes,{@link EM_HAS_SAFE_ROPE}
     * \else
     *  是否有安全绳 0:未知 1：无 2：有,{@link EM_HAS_SAFE_ROPE}
     * \endif
     */
    public int					emHasSafeRope;

}