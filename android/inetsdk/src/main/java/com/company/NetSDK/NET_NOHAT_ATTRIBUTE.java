package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief No hat related property status information
 * \else
 * @brief 无帽子相关属性状态信息
 * \endif
 */
public class NET_NOHAT_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether there is a hat,{@link EM_WEARING_STATE}
     * \else
     *  是否有戴帽子,{@link EM_WEARING_STATE}
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