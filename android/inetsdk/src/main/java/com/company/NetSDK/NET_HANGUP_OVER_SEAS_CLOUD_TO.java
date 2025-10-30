package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Called information
 * \else
 * @brief 被叫信息
 * \endif
 */
public class NET_HANGUP_OVER_SEAS_CLOUD_TO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Long Number
     * \else
     *  呼叫长号
     * \endif
     */
    public byte					szLongNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Short Number
     * \else
     *  呼叫短号
     * \endif
     */
    public byte					szShortNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Call Resources Type: "dev": Talk to dev, "app": Talk to the app
     * \else
     *  呼叫资源类型: "dev": 和dev对讲, "app": 和app对讲
     * \endif
     */
    public byte					szCallResourcesType[] = new byte[16];

}