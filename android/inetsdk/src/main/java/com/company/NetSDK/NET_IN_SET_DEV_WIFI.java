package com.company.NetSDK;

/**
 * Created by 29875 on 2019/8/5.
 */
public class NET_IN_SET_DEV_WIFI {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 设备端口号
    public int                nPort;

    // 设备IP
    public byte                szDevIP[] = new byte[64];

    // 无线使能, 0: 使能, 1: 关闭
    public int                 nEnable;

    /**
     * \if ENGLISH_LANG
     * SSID
     * \else
     * SSID
     * \endif
     */
    public byte                szSSID[] = new byte[36];

    /**
     * \if ENGLISH_LANG
     * connect mod 0：auto,1：adhoc,2：Infrastructure
     * \else
     * 连接模式；0：auto,1：adhoc,2：Infrastructure
     * \endif
     */
    public int                nLinkMode;


    /**
     * \if ENGLISH_LANG
     * Encryption；0：off,2：WEP64bit,3：WEP128bit, 4:WPA-PSK-TKIP, 5: WPA-PSK-CCMP(AES), 6:WPA2-PSK-TKIP 7:WPA2-PSK-AES 8:WPA-TKIP 9:WPA-AES
     * 10:WPA2-TKIP 11:WPA2-AES 12:AUTO 13:WEP-OPEN 14:WEP-SHARED; 15:WPA3-SAE-CCMP; 16:WPA3-SAE/PSK-CCMP
     * \else
     * 加密；0：off,2：WEP64bit,3：WEP128bit, 4:WPA-PSK-TKIP, 5: WPA-PSK-CCMP(AES), 6:WPA2-PSK-TKIP 7:WPA2-PSK-AES 8:WPA-TKIP 9:WPA-AES
     * 10:WPA2-TKIP 11:WPA2-AES 12:AUTO 13:WEP-OPEN 14:WEP-SHARED; 15:WPA3-SAE-CCMP; 16:WPA3-SAE/PSK-CCMP
     * \endif
     */
    public int                 nEncryption;

    /**
     * \if ENGLISH_LANG
     * 0：Hex,1：ASCII
     * \else
     * 0：Hex,1：ASCII
     * \endif
     */
    public int                 nKeyType;

    /**
     * \if ENGLISH_LANG
     * 0：seril number
     * \else
     * 序号
     * \endif
     */
    public int                 nKeyID;

    /**
     * \if ENGLISH_LANG
     * Keys, it is effect when nEncryption is not about WPA
     * \else
     * 四组密码, nEncryption为非WPA方式时使用
     * \endif
     */
    public byte				szKeys[][] = new byte[4][32];

    /**
     * \if ENGLISH_LANG
     * WPA key, it is effect when nEncryption is about WPA; The length is 128, and it is not need '\0'
     * \else
     * nEncryption为4、5时使用,传128长度,不用结束符。
     * \endif
     */
    public byte                szWPAKeys[] = new byte[128];

    public int                 nKeyFlag;

    /**
     * \if ENGLISH_LANG
     * Connect flag 0: no connect, 1: connect
     * \else
     * 0: 无连接, 1: 连接
     * \endif
     */
    public int                 nConnectedFlag;

    /**
     * \if ENGLISH_LANG
     * Device MAC Address
     * \else
     * 设备MAC地址
     * \endif
     */
    public byte                szMacAddr[] = new byte[18];
}
