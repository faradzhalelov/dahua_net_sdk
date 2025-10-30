package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief day/night color change config - for a single time section
 * \else
 * @brief 球机机芯日夜单时间段配置
 * \endif
 */
public class DAYNIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  type of switch, 1 - electronic, 2 - mechanical, usually ICR
     * \else
     *  切换类型，1 - 电子，2 - 机械，通常采用滤光片（ICR）
     * \endif
     */
    public int					nType;

    /**
     * \if ENGLISH_LANG
     *  colorful/monochrome mode, 1- always colorful, 2- automatically changed by illumination, 3- always monochrome, 4- by Photo resistor, 5-  by gain, 6- by external alarm input, 7- by external IO
     * \else
     *  彩转黑模式，1-总是彩色，2-自动，根据亮度切换，3-总是黑白，4-光敏电阻，5-根据增益切换，6-外部报警输入，7–外部IO输入
     * \endif
     */
    public int					nMode;

    /**
     * \if ENGLISH_LANG
     *  colorful/monochrome switch's sensitivity, 0~7
     * \else
     *  彩转黑灵敏度，可取值 0~7
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     *  day/night mode switch delay, 3 ~ 30 (seconds)
     * \else
     *  日夜模式切换延时时间，可取值3~30，单位秒
     * \endif
     */
    public int					nDelay;

}
