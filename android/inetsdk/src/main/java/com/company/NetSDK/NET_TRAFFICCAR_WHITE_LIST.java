package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief allow list information
 * \else
 * @brief 允许名单信息
 * \endif
 */
public class NET_TRAFFICCAR_WHITE_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  true: the car is trust car,false:the car is not trust car
     * \else
     *  车牌是否属于允许名单
     * \endif
     */
    public boolean					bTrustCar;

    /**
     * \if ENGLISH_LANG
     *  begin time of allow list
     * \else
     *  允许名单起始时间
     * \endif
     */
    public NET_TIME					stuBeginTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  cancel time of allow list
     * \else
     *  允许名单过期时间
     * \endif
     */
    public NET_TIME					stuCancelTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  authority list of allow list
     * \else
     *  允许名单权限列表
     * \endif
     */
    public NET_WHITE_LIST_AUTHORITY_LIST					stuAuthorityList = new NET_WHITE_LIST_AUTHORITY_LIST();

}
