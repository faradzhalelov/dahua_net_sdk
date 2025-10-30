package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief parameter info
 * \else
 * @brief 具体参数信息
 * \endif
 */
public class NET_BOOT_PARAMETER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  paramerter name
     * \else
     *  具体参数名称
     * \endif
     */
    public byte					szName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  value name
     * \else
     *  具体参数信息
     * \endif
     */
    public byte					szParameterValue[] = new byte[256];

}