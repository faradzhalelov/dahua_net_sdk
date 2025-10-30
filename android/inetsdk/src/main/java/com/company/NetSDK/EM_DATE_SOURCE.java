package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  source of date
 * \else
 * 数据来源
 * \endif
 */
public class EM_DATE_SOURCE implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  GPS
     * \else
     * GPS
     * \endif
     */
    public   static final  int        EM_DATE_SOURCE_GPS = 0;

    /**
     * \if ENGLISH_LANG
     *  inertial navigation date
     * \else
     * 惯性导航数据
     * \endif
     */
    public   static final  int        EM_DATE_SOURCE_INERTIALNAVIGATION = 1;
}
