package com.company.NetSDK;

/**
 * Created by 29875 on 2019/8/5.
 */
public class NET_IN_GET_DEV_WIFI_LIST {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Device port number
     * \else
     * 设备端口号
     * \endif
     */
    public int                     nPort;

    /**
     * \if ENGLISH_LANG
     * Device ip address
     * \else
     * 设备IP
     * \endif
     */
    public byte				szDevIP[] = new byte[64];

}
