package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Relevant attribute status information of protective mask
 * \else
 * @brief 防护面罩相关属性状态信息
 * \endif
 */
public class NET_PROHELMET_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Are you wearing a protective mask,{@link EM_WEARING_STATE}
     * \else
     *  是否有戴防护面罩,{@link EM_WEARING_STATE}
     * \endif
     */
    public int					emHasHat;

    /**
     * \if ENGLISH_LANG
     *  Hat color,{@link EM_COMPLIANCE_STATE}
     * \else
     *  帽子颜色,{@link EM_COMPLIANCE_STATE}
     * \endif
     */
    public int					emHatColor;

}