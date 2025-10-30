package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief input of CLIENT_GetBootParameter
 * \else
 * @brief CLIENT_GetBootParameter 入参
 * \endif
 */
public class NET_IN_GET_BOOT_PARAMETER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  paramerter number
     * \else
     *  参数个数
     * \endif
     */
    public int					nNameNum;

    /**
     * \if ENGLISH_LANG
     *  paramerter name list               
     * \else
     *  具体参数名称列表               
     * \endif
     */
    public byte					szNames[][] = new byte[32][32];

}