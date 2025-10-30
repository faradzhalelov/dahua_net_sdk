package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  SD卡加密功能标识
 * \endif
 */
public class EM_SD_ENCRYPT_FLAG implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_SD_ENCRYPT_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  SD card encrypt unsupported
     * \else
     *  设备不支持SD卡加密功能
     * \endif
     */
    public static final int					EM_SD_ENCRYPT_UNSUPPORT = 0;

    /**
     * \if ENGLISH_LANG
     *  SD card support encrypt and get data successfully
     * \else
     *  支持SD卡加密功能且获取数据成功
     * \endif
     */
    public static final int					EM_SD_ENCRYPT_SUPPORT_AND_GETDATA_SUCCESS = 1;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  SD card support encrypt but get data failed
     * \endif
     */
    public static final int					EM_SD_ENCRYPT_SUPPORT_AND_GETDATA_FAIL = 2;

}
