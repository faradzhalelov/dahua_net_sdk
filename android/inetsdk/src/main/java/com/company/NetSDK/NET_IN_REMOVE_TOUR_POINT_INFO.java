package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Specifies the input parameters of the interface CLIENT_RemoveSoftTourPoint
 * \else
 * @brief 接口 CLIENT_RemoveTourPoint 的输入参数
 * \endif
 */
public class NET_IN_REMOVE_TOUR_POINT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel id
     * \else
     *  云台通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Cruise line number
     * \else
     *  巡航线路编号,从1开始
     * \endif
     */
    public int					nIndex;

    /**
     * \if ENGLISH_LANG
     *  Serial number of a point on the line, starting from 0. If it is -1, it is appended to the last position on the line. Otherwise, it is the specified serial number
     * \else
     *  线路上点的序号，从0开始,如果为 -1, 根据预置点编号确定
     * \endif
     */
    public int					nPoint;

    /**
     * \if ENGLISH_LANG
     *  Preset point number, starting from 1
     * \else
     *  预置点编号,nPoint 为 -1 时有效
     * \endif
     */
    public int					nPresetIndex;

}