package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * NET_OUT_NETAPP_GET_MOBILE_RSSI
 * \else
 * EM_RPC_NETAPP_TYPE_GET_MOBILE_RSSI 出参
 * \endif
 */
public class NET_OUT_NETAPP_GET_MOBILE_RSSI implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Working mode of cellular mobile module,{@link EM_WIRELESS_WORK_MODE}
     * \else
     *  蜂窝移动模块的工作模式,{@link EM_WIRELESS_WORK_MODE}
     * \endif
     */
    public int					emWorkMode;

    /**
     * \if ENGLISH_LANG
     *  TD-SCDMA 0-100
     * \else
     *  TD-SCDMA网络信号强度 范围0-100
     * \endif
     */
    public int					nTDSCDMA;

    /**
     * \if ENGLISH_LANG
     *  WCDMA Network signal strength  0-100
     * \else
     *  WCDMA网络信号强度 范围0-100
     * \endif
     */
    public int					nWCDMA;

    /**
     * \if ENGLISH_LANG
     *  CDMA1.x Network signal strength  0-100
     * \else
     *  CDMA1.x网络信号强度 范围0-100
     * \endif
     */
    public int					nCDMA1x;

    /**
     * \if ENGLISH_LANG
     *  EDGE Network signal strength 0-100
     * \else
     *  EDGE网络信号强度 范围0-100
     * \endif
     */
    public int					nEDGE;

    /**
     * \if ENGLISH_LANG
     *  EVDO Network signal strength  0-100
     * \else
     *  EVDO网络信号强度 范围0-100
     * \endif
     */
    public int					nEVDO;

    /**
     * \if ENGLISH_LANG
     *  TD-LTE Network signal strength  0-100
     * \else
     *  TD-LTE网络信号强度 范围0-100
     * \endif
     */
    public int					nTDLTE;

    /**
     * \if ENGLISH_LANG
     *  FDD-LTE Network signal strength  0-100
     * \else
     *  FDD-LTE网络信号强度 范围0-100
     * \endif
     */
    public int					nFDDLTE;

    /**
     * \if ENGLISH_LANG
     *  NR Network signal strength  0-100
     * \else
     *  NR网络信号强度 范围0-100
     * \endif
     */
    public int					nNR;

}