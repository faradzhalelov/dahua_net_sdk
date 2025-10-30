package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Rule type
 * \else
 * @brief 规则类型
 * \endif
 */
public class EM_CFG_RULE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_CFG_RULE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  NumberStat
     * \else
     *  人数统计
     * \endif
     */
    public static final int					EM_CFG_RULE_NUMBER_STAT = 1;

    /**
     * \if ENGLISH_LANG
     *  ManNumDetection
     * \else
     *  区域内人数统计
     * \endif
     */
    public static final int					EM_CFG_RULE_MAN_NUM_DETECTION = 2;

}