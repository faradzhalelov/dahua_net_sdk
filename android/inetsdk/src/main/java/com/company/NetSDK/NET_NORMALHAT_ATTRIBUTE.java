package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Normal hat related attribute status information
 * \else
 * @brief 普通帽子相关属性状态信息
 * \endif
 */
public class NET_NORMALHAT_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether a normal hat is worn,{@link EM_WEARING_STATE}
     * \else
     *  是否有戴普通帽,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasHat;

    /**
     * \if ENGLISH_LANG
     *  hat detection result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  帽子检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalHat;

}