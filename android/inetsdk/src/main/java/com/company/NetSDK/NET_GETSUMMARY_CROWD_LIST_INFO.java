package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Crowd list
 * \else
 * @brief 拥挤人群列表
 * \endif
 */
public class NET_GETSUMMARY_CROWD_LIST_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Coordinates of center point of crowded crowd
     * \else
     *  拥挤人群中心点坐标
     * \endif
     */
    public NET_POINT					stuCenter = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     *  radius
     * \else
     *  半径
     * \endif
     */
    public int					nRadius;

}