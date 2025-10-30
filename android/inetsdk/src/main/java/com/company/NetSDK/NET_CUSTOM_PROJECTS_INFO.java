package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Project customization information
 * \else
 * @brief 项目信息
 * \endif
 */
public class NET_CUSTOM_PROJECTS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  GPS info
     * \else
     *   GPS位置信息
     * \endif
     */
    public NET_GPS_INFO					stuGPSInfo = new NET_GPS_INFO();

    /**
     * \if ENGLISH_LANG
     *  Target matching events corresponding to ball machine information
     * \else
     *  目标比对事件触发对应球机信息
     * \endif
     */
    public NET_FACECOMPARISON_PTZ_INFO					stuFaceComparisonPTZInfo = new NET_FACECOMPARISON_PTZ_INFO();

    /**
     * \if ENGLISH_LANG
     *  License plate information in Target comparison
     * \else
     *  目标比对时车牌信息
     * \endif
     */
    public byte					szPlateNumber[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Whether to alarm
     * \else
     *  是否报警
     * \endif
     */
    public boolean					bIsAlarm;

    /**
     * \if ENGLISH_LANG
     *  Stay event type 0-unknown 1-Normal 2-Abnormal
     * \else
     *  滞留类型 0-未知 1-基础滞留 2-异常滞留
     * \endif
     */
    public int					nStayEvent;

    /**
     * \if ENGLISH_LANG
     *  Wander event type 0-unknown 1-Normal 2-Abnormal
     * \else
     *  徘徊类型 0-未知 1-基础徘徊 2-异常徘徊
     * \endif
     */
    public int					nWanderEvent;

}