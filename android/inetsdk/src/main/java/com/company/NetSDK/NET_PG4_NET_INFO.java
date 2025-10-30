package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 
 * \endif
 */
public class NET_PG4_NET_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szIpaddr[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szMask[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szGateway[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  1 static; 2 dhcp
     * \else
     *  1 static; 2 dhcp
     * \endif
     */
    public int					nLanType;

}