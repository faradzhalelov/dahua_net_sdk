package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Shoe cover related attribute status information
 * \else
 * @brief 鞋套相关属性状态信息
 * \endif
 */
public class NET_SHOESCOVER_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether there is a shoe cover,{@link EM_WEARING_STATE}
     * \else
     *  是否有穿鞋套,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasCover;

    /**
     * \if ENGLISH_LANG
     *  shoe cover detection result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  鞋套检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalCover;

}