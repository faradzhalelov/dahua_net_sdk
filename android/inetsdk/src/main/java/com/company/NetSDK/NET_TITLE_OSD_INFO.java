package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief OSD enable status and text information
 * \else
 * @brief OSD使能状态及文本信息
 * \endif
 */
public class NET_TITLE_OSD_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Overlay content
     * \else
     *  叠加内容
     * \endif
     */
    public byte					szText[] = new byte[1024];

    /**
     * \if ENGLISH_LANG
     *  Whether to enable OSD display
     * \else
     *  是否使能osd显示
     * \endif
     */
    public boolean					nEnable;

}