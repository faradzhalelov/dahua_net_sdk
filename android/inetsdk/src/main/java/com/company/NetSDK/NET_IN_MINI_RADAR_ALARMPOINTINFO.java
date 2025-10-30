package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Subscribe to the alarm point information input parameters of mini radar(Corresponding interface CLIENT_AttachMiniRadarAlarmPointInfo)
 * \else
 * @brief 订阅mini雷达的报警点信息入参(对应接口 CLIENT_AttachMiniRadarAlarmPointInfo)
 * \endif
 */
public class NET_IN_MINI_RADAR_ALARMPOINTINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Parameter callback function
     * \else
     *  入参回调函数
     * \endif
     */
    public CB_fAttachMiniAlarmPointInfoCB					cbAlarmPointInfo;

    /**
     * \if ENGLISH_LANG
     *  User defined parameters
     * \else
     *  用户自定义参数
     * \endif
     */
    public long					dwUser;
}
