package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  GPS status info
 * \else
 * GPS状态信息
 * \endif
 */
public class NET_SET_GPS_STATUS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * date source, refer to {@link EM_DATE_SOURCE}
     * \else
     * 数据来源, 取值参考 {@link EM_DATE_SOURCE}
     * \endif
     */
    public int                      emDateSource;

    /**
     * \if ENGLISH_LANG
     * current time
     * \else
     * 当前时间
     * \endif
     */
    public NET_TIME                 stuLocalTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * longtitude(unit: degree, range:0-360 degree)
     * \else
     * 经度(单位是度,范围0-360度)
     * \endif
     */
    public double                  dbLongitude;

    /**
     * \if ENGLISH_LANG
     * latitude(unit:degree, range:0-180 degree)
     * \else
     * 纬度(单位是度,范围0-180度)
     * \endif
     */
    public double                  dbLatitude;

    /**
     * \if ENGLISH_LANG
     * altitude(unit:metre)
     * \else
     * 高度(单位:米)
     * \endif
     */
    public double                  dbAltitude;

    /**
     * \if ENGLISH_LANG
     * speed(unit:km/H)
     * \else
     * 速度(单位:km/H)
     * \endif
     */
    public double                  dbSpeed;

    /**
     * \if ENGLISH_LANG
     * bearing angle(unit:degree)
     * \else
     * 方向角(单位:度)
     * \endif
     */
    public double                  dbBearing;

    /**
     * \if ENGLISH_LANG
     * antennas status(0:bad 1:good), refer to {@link NET_THREE_STATUS_BOOL}
     * \else
     * 天线状态(0:坏 1:好),取值参考 {@link NET_THREE_STATUS_BOOL}
     * \endif
     */
    public int                      emAntennasStatus;

    /**
     * \if ENGLISH_LANG
     * fix a position or not(0:no 1:yes), refer to {@link NET_THREE_STATUS_BOOL}
     * \else
     * 定位状态(0:不定位 1:定位), 取值参考 {@link NET_THREE_STATUS_BOOL}
     * \endif
     */
    public int                     emPositioningResult;

    /**
     * \if ENGLISH_LANG
     * count of satellites
     * \else
     * 卫星个数
     * \endif
     */
    public int                     nSatelliteCount;

    /**
     * \if ENGLISH_LANG
     * work state, refer to {@link NET_GPS_WORK_STATUS}
     * \else
     * 工作状态, 取值参考 {@link NET_GPS_WORK_STATUS}
     * \endif
     */
    public int                     emWorkStatus;

    /**
     * \if ENGLISH_LANG
     * count of alarm
     * \else
     * 报警个数
     * \endif
     */
    public int                     nAlarmCount;

    /**
     * \if ENGLISH_LANG
     * places that alarm occur,maybe multiple values
     * \else
     * 发生的报警位置,值可能多个
     * \endif
     */
    public int[]                   nAlarmState = new int[128];

    /**
     * \if ENGLISH_LANG
     * horizontal precision factor
     * \else
     * 水平精度因子
     * \endif
     */
    public double                  dbHDOP;

    /**
     * \if ENGLISH_LANG
     * Reserved byte
     * \else
     * 保留字节
     * \endif
     */
    public byte[]					byReserved = new byte[1024];
}
