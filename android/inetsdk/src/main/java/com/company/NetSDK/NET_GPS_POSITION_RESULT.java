package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  result of positioning
 * \else
 * 定位结果
 * \endif
 */
public class NET_GPS_POSITION_RESULT  implements Serializable {
    private static final long serialVersionUID = -3165594574792105219L;

    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     *  未知
     * \endif
     */
    public static final int    NET_GPS_POSITION_RESULT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * has GPS data,but orientation failed,data is inefficacy
     * \else
     *  有GPS数据,但定位失败,此时定位数据无意义
     * \endif
     */
    public static final int    NET_GPS_POSITION_RESULT_FAILED = 1;

    /**
     * \if ENGLISH_LANG
     * has GPS data,and orientation succeed,data is efficacious
     * \else
     *   有GPS数据,且定位成功,此时定位数据有意义
     * \endif
     */
    public static final int    NET_GPS_POSITION_RESULT_SUCCEED = 2;

}
