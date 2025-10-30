package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Thermal imaging local contrast enhancement config
 * \else
 * @brief 热成像摄像头属性的局部对比度增强配置
 * \endif
 */
public class CFG_LCE_STATE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Local Contrast Enhancement State[0,128]
     * \else
     *  局部对比度增强状态值 范围[0,128]
     * \endif
     */
    public int					unLCEValue;

    /**
     * \if ENGLISH_LANG
     *  Linearity of Y-axis histogram data,Adjust grayscale distribution. The larger the value, the more detailed the grayscale information.[0,32]
     * \else
     *  直方图Y轴数据线性度,值越大图像灰度分布越宽，值越小灰度分布越集中,范围[0,32]
     * \endif
     */
    public int					unHistGramValue;

}