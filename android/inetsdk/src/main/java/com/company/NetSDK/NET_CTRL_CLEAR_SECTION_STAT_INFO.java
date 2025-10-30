package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief corresponding SDK_CTRL_CLEAR_SECTION_STAT command parameter
 * \else
 * @brief CLIENT_ControlDevice接口的 SDK_CTRL_CLEAR_SECTION_STAT命令参数
 * \endif
 */
public class NET_CTRL_CLEAR_SECTION_STAT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel ID
     * \else
     * 视频通道号
     * \endif
     */
    public int					nChannel;

}