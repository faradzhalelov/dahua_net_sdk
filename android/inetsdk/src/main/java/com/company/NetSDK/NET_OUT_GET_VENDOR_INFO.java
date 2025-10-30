package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief output param of CLIENT_GetVendor
 * \else
 * @brief CLIENT_GetVendor 输出参数
 * \endif
 */
public class NET_OUT_GET_VENDOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  vendor(Discard, please use szVendorEx)
     * \else
     *  厂商(废弃,请使用szVendorEx)
     * \endif
     */
    public byte					szVendor[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  vendor
     * \else
     *  厂商
     * \endif
     */
    public byte					szVendorEx[] = new byte[32];

}