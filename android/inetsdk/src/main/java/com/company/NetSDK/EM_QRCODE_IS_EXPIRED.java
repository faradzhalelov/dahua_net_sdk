package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Is the QR code expired
 * \else
 * @brief 二维码是否过期
 * \endif
 */
public class EM_QRCODE_IS_EXPIRED implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_QRCODE_EXPIRED_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Not expired
     * \else
     *  未过期
     * \endif
     */
    public static final int					EM_QRCODE_NO_EXPIRED = 1;

    /**
     * \if ENGLISH_LANG
     *  Expired
     * \else
     *  过期
     * \endif
     */
    public static final int					EM_QRCODE_EXPIRED = 2;

}
