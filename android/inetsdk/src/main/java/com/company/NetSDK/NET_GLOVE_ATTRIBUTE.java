package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Glove related attribute status information
 * \else
 * @brief 手套相关属性状态信息
 * \endif
 */
public class NET_GLOVE_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether you are wearing gloves,{@link EM_WEARING_STATE}
     * \else
     *  是否有戴手套,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasGlove;

    /**
     * \if ENGLISH_LANG
     *  Glove test result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  手套检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalGlove;

}