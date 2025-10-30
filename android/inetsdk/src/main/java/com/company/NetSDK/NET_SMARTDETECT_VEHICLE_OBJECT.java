package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * object info of smart motion detection about vehicle
 * \else
 * 智能动检(车)对象信息
 * \endif
 */
public class NET_SMARTDETECT_VEHICLE_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  object ID about vehicle
     * \else
     *  车动检ID
     * \endif
     */
    public int					nVehicleID;

    /**
     * \if ENGLISH_LANG
     *  rect of vehicle
     * \else
     *  车的位置
     * \endif
     */
    public NET_RECT					stuRect = new NET_RECT();

}
