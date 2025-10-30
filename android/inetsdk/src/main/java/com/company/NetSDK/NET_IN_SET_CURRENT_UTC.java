package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_SetCurrentUTC interface input parameters
 * \else
 * @brief CLIENT_SetCurrentUTC 接口输入参数
 * \endif
 */
public class NET_IN_SET_CURRENT_UTC implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device port number
     * \else
     *  设备端口号
     * \endif
     */
    public int					nPort;

    /**
     * \if ENGLISH_LANG
     *  Device IP
     * \else
     *  设备IP
     * \endif
     */
    public byte					szDevIP[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Standard UTC time (without time zone daylight saving bias)
     * \else
     *  标准的UTC时间（不带时区夏令时偏差）;
     * \endif
     */
    public long					nUTC;

}