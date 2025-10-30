package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Blocklist information
 * \else
 * @brief 禁止名单信息
 * \endif
 */
public class NET_TRAFFICCAR_BLACK_LIST implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Enable block list
     * \else
     *  是否已启用禁止名单
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Is the plate on the block list
     * \else
     *  车牌是否属于禁止名单
     * \endif
     */
    public boolean					bIsBlackCar;

    /**
     * \if ENGLISH_LANG
     *  Begin time
     * \else
     *  禁止名单起始时间
     * \endif
     */
    public NET_TIME					stuBeginTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Cancel time
     * \else
     *  禁止名单过期时间
     * \endif
     */
    public NET_TIME					stuCancelTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Control type
     * \else
     *  布控类型
     * \endif
     */
    public int					emControlType;

}
