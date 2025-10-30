package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target object information
 * \else
 * @brief 目标物体信息
 * \endif
 */
public class NET_BLIND_SPOT_DETECTION_OBJECT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Horizontal distance, unit: meters
     * \else
     *  横向距离, 单位: 米
     * \endif
     */
    public float					fLateralDistance;

    /**
     * \if ENGLISH_LANG
     *  Detected object
     * \else
     *  检测到的物体
     * \endif
     */
    public SDK_MSG_OBJECT					stuObject = new SDK_MSG_OBJECT();

}