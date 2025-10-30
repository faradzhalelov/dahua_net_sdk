package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief gateway control method enumeration
 * \else
 * @brief 道闸控制方式枚举
 * \endif
 */
public class NET_EM_CFG_TRAFFICSTROBE_CTRTYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  undefined
     * \else
     *  未定义
     * \endif
     */
    public static final int					NET_EM_CFG_CTRTYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  via allow list control gateway, only allow list vehicle open gateway
     * \else
     *  通过允许名单控制是否开闸；只有允许名单内车辆才开闸
     * \endif
     */
    public static final int					NET_EM_CFG_CTRTYPE_TRAFFICTRUSTLIST = 1;

    /**
     * \if ENGLISH_LANG
     *  vehicle open gateway for all snapshots
     * \else
     *  针对所有抓拍车辆都开闸
     * \endif
     */
    public static final int					NET_EM_CFG_CTRTYPE_ALLSNAPCAR = 2;

    /**
     * \if ENGLISH_LANG
     *  open gateway commend sent from upper level
     * \else
     *  通过上层下发的命令开闸
     * \endif
     */
    public static final int					NET_EM_CFG_CTRTYPE_ORDER = 3;

}