package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * EM_RPC_NETAPP_TYPE_GET_NET_RESOURCE_STAT, output param
 * \else
 * EM_RPC_NETAPP_TYPE_GET_NET_RESOURCE_STAT 出参
 * \endif
 */
public class NET_OUT_NETAPP_GET_NET_RESOURCE_STAT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  IP channel in bandwidth, unit: kbps
     * \else
     *  IP通道接入          单位：kbps
     * \endif
     */
    public int					nIPChanneIn;

    /**
     * \if ENGLISH_LANG
     *  Net remain bandwidth, unit: kbps
     * \else
     *  网络接收剩余        单位：kbps
     * \endif
     */
    public int					nNetRemain;

    /**
     * \if ENGLISH_LANG
     *  Net total bandwidth, unit: Mbps
     * \else
     *  网络接收总能力      单位：Mbps
     * \endif
     */
    public int					nNetCapability;

    /**
     * \if ENGLISH_LANG
     *  Remote preview bandwidth, unit: kbps
     * \else
     *  远程预览            单位：kbps
     * \endif
     */
    public int					nRemotePreview;

    /**
     * \if ENGLISH_LANG
     *  Remote playback and download bandwidth, unit: kbps
     * \else
     *  远程回放及下载      单位：kbps
     * \endif
     */
    public int					nRemotePlayAndDownload;

    /**
     * \if ENGLISH_LANG
     *  Remote send remain bandwidth, unit: kbps
     * \else
     *  远程发送剩余        单位：kbps
     * \endif
     */
    public int					nRemoteSendRemain;

    /**
     * \if ENGLISH_LANG
     *  Remote send total bandwidth, unit: Mbps
     * \else
     *  远程发送总能力      单位：Mbps
     * \endif
     */
    public int					nRemoteSendCapability;

}