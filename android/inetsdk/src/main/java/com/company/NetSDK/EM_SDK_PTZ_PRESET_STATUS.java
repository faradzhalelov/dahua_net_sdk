package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * PTZ preset status type
 * \else
 * 预置点状态枚举
 * \endif
 */
public class EM_SDK_PTZ_PRESET_STATUS implements Serializable {
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
    public static final int					EM_SDK_PTZ_PRESET_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  preset reach the point
     * \else
     *  预置点到达
     * \endif
     */
    public static final int					EM_SDK_PTZ_PRESET_STATUS_REACH = 1;

    /**
     * \if ENGLISH_LANG
     *  preset do not reach the point yet
     * \else
     *  预置点未到达
     * \endif
     */
    public static final int					EM_SDK_PTZ_PRESET_STATUS_UNREACH = 2;

}
