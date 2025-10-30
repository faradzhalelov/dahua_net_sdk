package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Attribute status information about labor protection shoes
 * \else
 * @brief 劳保鞋相关属性状态信息
 * \endif
 */
public class NET_SAFETY_SHOES_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether to wear labor protection shoes, 0: unknown, 1: no labor protection shoes, 2: wear labor protection shoes
     * \else
     *  是否穿劳保鞋, 0:未知，1:未穿劳保鞋，2:穿了劳保鞋
     * \endif
     */
    public int					nHasSafetyShoes;

    /**
     * \if ENGLISH_LANG
     *  Test result of labor protection shoes, 0- compliance 1- non-compliance 2- unknown
     * \else
     *  劳保鞋检测结果 , 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nHasLegalSafetyShoes;

}