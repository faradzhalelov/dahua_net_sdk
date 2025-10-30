package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief configuration of video encode staff(corresponding to CFG_VIDEO_WIDGET2_INFO)
 * \else
 * @brief 视频编码物件配置(对应结构体 CFG_VIDEO_WIDGET2_INFO)
 * \endif
 */
public class CFG_VIDEO_WIDGET2_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * multiple of line space,multiple is 1/10 of current font height,value range from 0 to 5, default value is 0
     * \else
     * 行间距倍数，倍数的基准默认是当前字体高度的十分之一，取值范围为0~5，默认值为0
     * \endif
     */
    public int					nOSDLineSpacing;

}