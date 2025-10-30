package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Indicates the status of glasses related properties
 * \else
 * @brief 眼镜相关属性状态信息
 * \endif
 */
public class NET_GLASSES_RELATED_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Alarm type in glasses detection rules,{@link EM_GLASSES_RULE_TYPE}
     * \else
     *  眼镜检测规则中报警类型,{@link EM_GLASSES_RULE_TYPE}
     * \endif
     */
    public int					emGlassesType;

    /**
     * \if ENGLISH_LANG
     *  Glasses test result: 0- compliant 1- non-compliant 2- unknown
     * \else
     *  眼镜检测结果, 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nGlassesLegalMask;

}