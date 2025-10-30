package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Wireless  data encryption
 * \else
 * 无线数据加密方式
 * \endif
 */
public class EM_WIRELESS_DATA_ENCRYPT implements Serializable {
    private static final long serialVersionUID = -125904484280909354L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     * 未知
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *   NONE
     * \else
     *  NONE
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_NONE = 1;

    /**
     * \if ENGLISH_LANG
     *  WEP
     * \else
     * WEP
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_WEP = 2;

    /**
     * \if ENGLISH_LANG
     *  TKIP
     * \else
     * TKIP
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_TKIP = 3;

    /**
     * \if ENGLISH_LANG
     *  AES(CCMP)
     * \else
     * AES(CCMP)
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_AES = 4;

    /**
     * \if ENGLISH_LANG
     *  TKIP+AES
     * \else
     * TKIP+AES
     * \endif
     */
    public  static  final   int EM_WIRELESS_DATA_ENCRYPT_TKIP_AES = 5;
}
