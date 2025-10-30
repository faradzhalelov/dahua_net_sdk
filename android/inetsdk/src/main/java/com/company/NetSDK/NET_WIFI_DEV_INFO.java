package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  wifi  device info
 * \else
 *  搜索到的wifi设备信息
 * \endif
 */
public class NET_WIFI_DEV_INFO implements Serializable{
    private static final long serialVersionUID = -6577021168406318020L;

    /**
     * \if ENGLISH_LANG
     *  mac address of wifi device
     * \else
     *  wifi设备的Mac地址
     * \endif
     */
    public      byte[]          szMac       =       new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     *  link quality 0  ~  100
     * \else
     *  连接质量百分比，0 ~ 100
     * \endif
     */
    public      int             nLinkQuality;

    /**
     * \if ENGLISH_LANG
     *  first searched time
     * \else
     *  第一被搜索到的时间
     * \endif
     */
    public      NET_TIME_EX     stuEnterTime        =   new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  leave time
     * \else
     *  消失的时间
     * \endif
     */
    public      NET_TIME_EX     stuLeaveTime        =   new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  search count
     * \else
     *  被搜索到的次数
     * \endif
     */
    public      int             nSearchedCount;

    /**
     * \if ENGLISH_LANG
     *  SSID
     * \else
     *  网络名称
     * \endif
     */
    public      byte[]          szSSID              =    new byte[24];

    /**
     * \if ENGLISH_LANG
     *  event time
     * \else
     *  事件发生时间
     * \endif
     */
    public      NET_TIME_EX     UTC                  =    new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     *  WIFI dev type  corresponding to  {@link EM_WIRELESS_DEV_TYPE}
     * \else
     *  wifi设备类型  取值参考 {@link EM_WIRELESS_DEV_TYPE}
     * \endif
     */
    public      int             emDevType;

    /**
     * \if ENGLISH_LANG
     *  Wifi channel
     * \else
     *  WIFI设备当前所在的通道
     * \endif
     */
    public      int             nChannel;

    /**
     * \if ENGLISH_LANG
     *  authentication  corresponding to {@link EM_WIRELESS_AUTHENTICATION}
     * \else
     *  认证方式  取值参考  {@link EM_WIRELESS_AUTHENTICATION}
     * \endif
     */
    public      int             emAuth;

    /**
     * \if ENGLISH_LANG
     *  data encrypt   corresponding to {@link  EM_WIRELESS_DATA_ENCRYPT}
     * \else
     *  数据加密方式，  取值参考  {@link  EM_WIRELESS_DATA_ENCRYPT}
     * \endif
     */
    public      int             emEncrypt;

    /**
     * \if ENGLISH_LANG
     *  AP   Mac
     * \else
     *  接入热点Mac
     * \endif
     */
    public      byte[]          szAPMac             =       new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     *  AP channel
     * \else
     * 接入热点频道
     * \endif
     */
    public      int             nAPChannel;

    /**
     * \if ENGLISH_LANG
     *  AP  SSID
     * \else
     *  接入热点SSID
     * \endif
     */
    public      byte[]          szAPSSID            =       new byte[24];

    /**
     * \if ENGLISH_LANG
     *  AP  data encrypt  corresponding to {@link  EM_WIRELESS_DATA_ENCRYPT}
     * \else
     *  接入热点加密方式，取值参考   {@link  EM_WIRELESS_DATA_ENCRYPT}
     * \endif
     */
    public      int             emAPEncrypt;

    /**
     * \if ENGLISH_LANG
     *  Singnal strength
     * \else
     *  信号强度
     * \endif
     */
    public      int             nRssiQuality;
}
