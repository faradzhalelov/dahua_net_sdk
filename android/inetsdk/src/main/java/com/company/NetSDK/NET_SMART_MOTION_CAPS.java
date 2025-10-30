package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Smart motion detection caps
 * \else
 * 智能动检能力信息
 * \endif
 */
public class NET_SMART_MOTION_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * support smart motion detection or not
     * \else
     * 是否支持智能动检
     * \endif
     */
    public boolean						bSupport;

    /**
     * \if ENGLISH_LANG
     * count of smart motion detection type
     * \else
     * 智能动检支持的检测类型个数
     * \endif
     */
    public int						nSmartTypeNum;

    /**
     * \if ENGLISH_LANG
     * smart motion detection types
     * \else
     * 智能动检支持的检测类型,参考{@link EM_SMART_MOTION_TYPE}
     * \endif
     */
    public int		emSmartMotionType[] = new int[8];

}
