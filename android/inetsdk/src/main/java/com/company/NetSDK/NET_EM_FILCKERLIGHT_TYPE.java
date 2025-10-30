package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Flashing light type
 * \else
 * @brief 闪烁灯光类型
 * \endif
 */
public class NET_EM_FILCKERLIGHT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * white light
     * \else
     * 闪烁白光灯
     * \endif
     */
    public static final int					NET_EM_WHITELIGHT = 0;

    /**
     * \if ENGLISH_LANG
     * red blue light
     * \else
     * 红蓝闪烁警示灯
     * \endif
     */
    public static final int					NET_EM_REDBLUELIGHT = 1;

}