package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  wifi  place info
 * \else
 * 搜索到的地点信息
 * \endif
 */
public class NET_WIFI_GPS_INFO  implements Serializable{
    private static final long serialVersionUID = 8865273333935079222L;

    /**
     * \if ENGLISH_LANG
     *  result of positioning corresponding to  {@link  NET_GPS_POSITION_RESULT}
     * \else
     * 定位结果  取值参考  {@link  NET_GPS_POSITION_RESULT}
     * \endif
     */
    public     int			emPositioningResult;

    /**
     * \if ENGLISH_LANG
     *   Longitude(unit:1/1000000 degree)
     * west Longitude: 0 - 180000000				practical value = 180*1000000 - dwLongitude
     * east Longitude: 180000000 - 360000000		practical value = dwLongitude - 180*1000000
     * eg: Longitude:300168866 (300168866 - 180*1000000)/1000000  equal east Longitude 120.168866 degree
     * \else
     * 经度(单位是百万分之一度)
     * 西经：0 - 180000000;实际值应为: 180*1000000 – dwLongitude
     * 东经：180000000 - 360000000;实际值应为: dwLongitude – 180*1000000
     * 如: 300168866应为（300168866 - 180*1000000）/1000000 即东经120.168866度
     * \endif
     */
    public      double 					nLongitude;

    /**
     * \if ENGLISH_LANG
     *  Latidude(unit:1/1000000 degree)
     * north Latidude: 0 - 90000000				practical value = 90*1000000 - dwLatidude
     * south Latidude: 90000000 - 180000000	practical value = dwLatidude - 90*1000000
     * eg: Latidude:120186268 (120186268 - 90*1000000)/1000000 equal south Latidude 30. 186268 degree
     * \else
     * 纬度(单位是百万分之一度)
     * 南纬：0 - 90000000				实际值应为: 90*1000000 – dwLatidude
     * 北纬：90000000 – 180000000		实际值应为: dwLatidude – 90*1000000
     * 如: 120186268应为 (120186268 - 90*1000000)/1000000 即北纬30. 186268度
     * \endif
     */
    public     double					nLatidude;

    /**
     * \if ENGLISH_LANG
     *  speed(unit:0.001km/H)
     * \else
     * 速度, 单位千分之一km/H
     * \endif
     */
    public     double					nSpeed;


}
