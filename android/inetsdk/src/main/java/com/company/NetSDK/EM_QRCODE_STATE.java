package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief QR code status
 * \else
 * @brief 二维码状态
 * \endif
 */
public class EM_QRCODE_STATE implements Serializable {
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
    public static final int					EM_QRCODE_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Approved
     * \else
     *  已批准
     * \endif
     */
    public static final int					EM_QRCODE_STATE_CLEARED = 1;

    /**
     * \if ENGLISH_LANG
     *  Not Approved
     * \else
     *  未批准
     * \endif
     */
    public static final int					EM_QRCODE_STATE_NOCLEARED = 2;

}
