package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Switch control
 * \else
 * 开关控制
 * \endif
 */
public class EM_SWITCH_CONTROL_TYPE  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SWITCH_CONTROL_TYPE_UNKNOWN  		  = -1;

    /**
     * \if ENGLISH_LANG
     * Off
     * \else
     * 关
     * \endif
     */
    public static final int EM_SWITCH_CONTROL_TYPE_OFF  		  = 0;

    /**
     * \if ENGLISH_LANG
     * On
     * \else
     * 开
     * \endif
     */
    public static final int EM_SWITCH_CONTROL_TYPE_ON  		  = 1;
}
