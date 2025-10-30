package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief manual-snap custom data
 * \else
 * @brief 手动抓拍专用上报内容
 * \endif
 */
public class EVENT_MANUALSNAP_CUSTOM_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  custom weight info
     * \else
     *  地磅称重信息
     * \endif
     */
    public EVENT_CUSTOM_WEIGHT_INFO					stuWeighInfo = new EVENT_CUSTOM_WEIGHT_INFO();

}