package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 
 * \endif
 */
public class NET_PG4_DEVICE_INFO implements Serializable {
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
    public byte					szSN[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szDevClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szSubClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szType[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szVendor[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public byte					szMachineName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  0未初始化,1已初始化
     * \else
     *  0未初始化,1已初始化
     * \endif
     */
    public int					bInit;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public NET_PG4_NET_INFO					stIPv4 = new NET_PG4_NET_INFO();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     * 
     * \endif
     */
    public NET_PG4_SVC_INFO					stSvc = new NET_PG4_SVC_INFO();

}