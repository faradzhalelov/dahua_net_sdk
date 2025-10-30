package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief device type
 * \else
 * @brief 设备类型
 * \endif
 */
public class EM_REGISTER_USER_STATE_DEV_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  digital VTH
     * \else
     *  数字VTH
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_DIGIT_VTH = 1;

    /**
     * \if ENGLISH_LANG
     *  analogue VTH
     * \else
     *  模拟VTH
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_ANALOG_VTH = 2;

    /**
     * \if ENGLISH_LANG
     *  digital VTO
     * \else
     *  数字VTO
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_DIGIT_VTO = 3;

    /**
     * \if ENGLISH_LANG
     *  analogue VTO
     * \else
     *  模拟VTO
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_ANALOG_VTO = 4;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public static final int					EM_REGISTER_USER_STATE_DEV_TYPE_MAX = 5;

}