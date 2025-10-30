package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Mask related attribute status information
 * \else
 * @brief 口罩相关属性状态信息
 * \endif
 */
public class NET_MASK_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether there is a mask,{@link EM_WEARING_STATE}
     * \else
     *  是否有戴口罩,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasMask;

    /**
     * \if ENGLISH_LANG
     *  Mask detection result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  口罩检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalMask;

}