package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Boot related property status information
 * \else
 * @brief 靴子相关属性状态信息
 * \endif
 */
public class NET_BOOT_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether there are boots,{@link EM_WEARING_STATE}
     * \else
     *  是否有穿靴子,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasBoot;

    /**
     * \if ENGLISH_LANG
     *  Boot detection result,{@link EM_COMPLIANCE_STATE}
     * \else
     *  靴子检测结果,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHasLegalBoot;

}