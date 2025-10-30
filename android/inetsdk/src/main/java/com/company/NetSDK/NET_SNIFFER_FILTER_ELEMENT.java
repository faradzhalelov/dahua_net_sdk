package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * filter element
 * \else
 * 抓包过滤元素
 * \endif
 */
public class NET_SNIFFER_FILTER_ELEMENT implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * source ip
     * \else
     * 源地址
     * \endif
     */
    public byte[]            szSrcIP=new byte[64];

    /**
     * \if ENGLISH_LANG
     * destination ip
     * \else
     * 目的地址
     * \endif
     */
    public byte[]            szDstIP=new byte[64];

    /**
     * \if ENGLISH_LANG
     * source port
     * \else
     * 源端口
     * \endif
     */
    public int             nSrcPort;

    /**
     * \if ENGLISH_LANG
     * destination port
     * \else
     * 目的端口
     * \endif
     */
    public int             nDstPort;

    /**
     * \if ENGLISH_LANG
     * 0-tcp, 1-udp
     * \else
     * 协议类型,枚举值参考 EM_SNIFFER_FILTER_PROTOCOL
     * \endif
     */
    public int             emProtocol;
}
