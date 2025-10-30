package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * operate type of accesscontroller
 * \else
 * 门禁控制器操作类型
 * \endif
 */
public class NET_EM_ACCESS_CTL_MANAGER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * set QRcode decode info, Corresponding to pstInparam = {@link NET_IN_SET_QRCODE_DECODE_INFO}, pstOutParam = {@link NET_OUT_SET_QRCODE_DECODE_INFO}
     * \else
     * 设置二维码的解码信息, 对应结构体 pstInparam = {@link NET_IN_SET_QRCODE_DECODE_INFO}, pstOutParam = {@link NET_OUT_SET_QRCODE_DECODE_INFO}
     * \endif
     */
    public static final int NET_EM_ACCESS_CTL_SET_QRCODEDECODE_INFO = 12;
}
