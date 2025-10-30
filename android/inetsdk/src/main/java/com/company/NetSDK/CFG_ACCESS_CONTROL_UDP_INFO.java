package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Private access control Udp info
 * \else
 * 私有门禁udp开锁信息
 * \endif
 */
public class CFG_ACCESS_CONTROL_UDP_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * address
     * \else
     * 地址
     * \endif
     */
    public byte		    szAddress[] = new byte[FinalVar.CFG_MAX_ACCESS_CONTROL_ADDRESS_LEN];

    /**
     * \if ENGLISH_LANG
     * port
     * \else
     * 端口
     * \endif
     */
    public int				nPort;


}
