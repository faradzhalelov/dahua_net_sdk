package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Apron related property status information
 * \else
 * @brief 围裙相关属性状态信息
 * \endif
 */
public class NET_APRON_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether you are wearing an apron,{@link EM_WEARING_STATE}
     * \else
     *  是否有穿围裙,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasApron;

    /**
     * \if ENGLISH_LANG
     *  apron detection result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  围裙检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalApron;

}