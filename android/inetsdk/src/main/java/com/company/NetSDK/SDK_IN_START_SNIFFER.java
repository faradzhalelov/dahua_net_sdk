package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartSniffer}StartSniffer's interface input param
 * \else
 * {@link INetSDK#StartSniffer}StartSniffer 接口输入参数
 * \endif
 */
public class SDK_IN_START_SNIFFER implements Serializable {

    /**
     * \if ENGLISH_LANG
     * name of network card
     * \else
     * 网卡名称
     * \endif
     */
   public byte[]            pszNetInterface;

    /**
     * \if ENGLISH_LANG
     * path of caught file, it is means the default path when pszPath = NULL
     * \else
     * 抓包存储文件名, 空表示保存到默认路径
     * \endif
     */
   public byte[]               pszPath;

    /**
     * \if ENGLISH_LANG
     * type of file, 0-Wireshark/Tcpdump, 1-Remotecap, use CLIENT_AttachSniffer
     * \else
     *  文件类型, 0-Wireshark/Tcpdump 1-Remotecap 流式远程抓包，即通过 CLIENT_AttachSniffer
     * \endif
     */
   public int                  nSaveType;

    /**
     * \if ENGLISH_LANG
     * Filter Conditions ,Such as "host 172.9.88.200 and port 8080 and tcp"
     * \else
     * 过滤条件, 如"host 172.9.88.200 and port 8080 and tcp"
     * \endif
     */
   public byte[]             pszFilter;

    /**
     * \if ENGLISH_LANG
     * capture time unit:s, 0-no timeout.
     * \else
     * 抓包超时时间，单位：秒, 0 则默认不超时.
     * \endif
     */
   public int                nCaptureTime;

    /**
     * \if ENGLISH_LANG
     * current capture file size, unit:kb
     * \else
     * 指定此次抓包的最大大小, 单位kb
     * \endif
     */
    public int                nCurrentFileSize;

    /**
     * \if ENGLISH_LANG
     * enable high level filter, if true the pszFilter useless.
     * \else
     * 高优先级规则使能，若为真，则不采用pszFilter里的过滤规则
     * \endif
     */
    public boolean            bFilterEx;

    /**
     * \if ENGLISH_LANG
     * high level filter
     * \else
     * 高优先级的过滤规则
     * \endif
     */
    public NET_SNIFFER_FILTER stuFilterEx = new NET_SNIFFER_FILTER();
}
