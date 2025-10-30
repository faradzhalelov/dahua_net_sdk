package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Length filter
 * \else
 * @brief 物体类型长度过滤器
 * \endif
 */
public class CFG_LENGTH_FILETER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Measure mode
     * \else
     *  计量方式
     * \endif
     */
    public int					emMeasureMode;

    /**
     * \if ENGLISH_LANG
     *  Filter type
     * \else
     *  过滤类型
     * \endif
     */
    public int					emFilterType;

    /**
     * \if ENGLISH_LANG
     *  0:greater than and less than 1:greater than or equal to or lessthan or equal to 2:greater than and less than or equal to 3:greater than or equal to or less than
     * \else
     *  0:大于且小于 1:大于或等于且小于或等于 2:大于且小于或等于 3:大于或等于且小于
     * \endif
     */
    public int					nDetectType;

    /**
     * \if ENGLISH_LANG
     *  Min length, company:cm
     * \else
     *  最小检测长度，单位：cm
     * \endif
     */
    public int					nMinLen;

    /**
     * \if ENGLISH_LANG
     *  Max length, company:cm
     * \else
     *  最大检测长度，单位：cm
     * \endif
     */
    public int					nMaxLen;

}