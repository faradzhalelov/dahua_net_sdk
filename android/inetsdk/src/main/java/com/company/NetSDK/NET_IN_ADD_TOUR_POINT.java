package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AddTourPoint input parameters
 * \else
 * @brief CLIENT_AddTourPoint 接口输入参数
 * \endif
 */
public class NET_IN_ADD_TOUR_POINT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Pan tilt channel number, creating an instance
     * \else
     *  云台通道号,创建实例
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Cruise route number, starting from 1
     * \else
     *  巡航线路编号,从1开始
     * \endif
     */
    public int					nIndex;

    /**
     * \if ENGLISH_LANG
     *  The serial number of points on the line, starting from 0. If it is -1, it is added to the last position on the line
     * \else
     *  线路上点的序号，从0开始,如果为 -1, 追加到线路上最后位置
     * \endif
     */
    public int					nPoint;

    /**
     * \if ENGLISH_LANG
     *  Pre set point number, starting from 1
     * \else
     *  预置点编号,从1开始
     * \endif
     */
    public int					nPresetIndex;

    /**
     * \if ENGLISH_LANG
     *  Stay time at this preset point, in seconds
     * \else
     *  在该预置点停留时间,时间单位为秒
     * \endif
     */
    public int					nDuration;

    /**
     * \if ENGLISH_LANG
     *  Normalize the speed of rotation to a preset point to 0-1
     * \else
     *  转动到预置点的速度,归一化到0~1
     * \endif
     */
    public float					fSpeed;

}