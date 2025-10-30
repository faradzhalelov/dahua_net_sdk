package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * net interface, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_NETINTERFACE}
 * \else
 *  网络接口, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_NETINTERFACE}
 * \endif
 */
public class SDKDEV_NETINTERFACE_INFO implements Serializable {


    /**
     * \if ENGLISH_LANG
     * valid or not
     * \else
     * 是否有效
     * \endif
     */
    public boolean            bValid;

    /**
     * \if ENGLISH_LANG
     * support virtual or not
     * \else
     * 是否虚拟网卡
     * \endif
     */
    public boolean            bVirtual;

    /**
     * \if ENGLISH_LANG
     * theory of speed (Mbps)
     * \else
     * 网卡理论速度(Mbps)
     * \endif
     */
    public int             nSpeed;

    /**
     * \if ENGLISH_LANG
     * 0-unable, 1-getting, 2-get succeed
     * \else
     * 0-未使能, 1-正在获取, 2-获取成功
     * \endif
     */
    public int             nDHCPState;

    /**
     * \if ENGLISH_LANG
     * net port mane
     * \else
     * 网口名称
     * \endif
     */
    public byte            szName[] = new byte[FinalVar.SDK_NETINTERFACE_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * net type
     * \else
     * 网络类型
     * \endif
     */
    public byte            szType[] = new byte[FinalVar.SDK_NETINTERFACE_TYPE_LEN];

    /**
     * \if ENGLISH_LANG
     * MAC addr
     * \else
     * MAC地址
     * \endif
     */
    public byte            szMAC[] = new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     * SSID, if only szType == "Wireless",availability
     * \else
     * SSID, 只对无线网络有效(szType == "Wireless")
     * \endif
     */
    public byte            szSSID[] = new byte[FinalVar.SDK_MAX_SSID_LEN];

    /**
     * \if ENGLISH_LANG
     * Wifi,3G connect status,"Inexistence" : not exist, "Down": close "Disconn": disconnect "Connecting" "Connected"
     * \else
     * Wifi、3G的连接状态,"Inexistence" : 网络不存在 "Down"：关闭 "Disconn"：未连接 "Connecting"：正连接 "Connected"： 已连接
     * \endif
     */
    public byte            szConnStatus[] = new byte[FinalVar.SDK_MAX_CONNECT_STATUS_LEN];

    /**
     * \if ENGLISH_LANG
     * support mode number
     * \else
     * 实际3G支持的网络模式个数
     * \endif
     */
    public int             nSupportedModeNum;

    /**
     * \if ENGLISH_LANG
     * support 3G net mode	"TD-SCDMA", "WCDMA", "CDMA1x", "EDGE", "EVDO"
     * \else
     * 3G支持的网络模式    "TD-SCDMA", "WCDMA", "CDMA1x", "EDGE", "EVDO"
     * \endif
     */
    public byte[][]		szSupportedModes = new byte[FinalVar.SDK_MAX_MODE_NUM][FinalVar.SDK_MAX_MODE_LEN];

    /**
     * \if ENGLISH_LANG
     * IsSupport Long PoE
     * \else
     * 是否支持长距离POE速度协商，需要网卡和交换机协商后才能确定
     * \endif
     */
    public boolean            bSupportLongPoE;

}
