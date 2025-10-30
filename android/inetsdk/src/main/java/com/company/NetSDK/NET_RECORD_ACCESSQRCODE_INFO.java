package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AccessQRCode information
 * \else
 * 开门二维码记录集信息
 * \endif
 */
public class NET_RECORD_ACCESSQRCODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Record Number,Read-Only
     * \else
     * 记录集编号,只读
     * \endif
     */
    public int                   nRecNo;

    /**
     * \if ENGLISH_LANG
     * QRCode
     * \else
     * 二维码
     * \endif
     */
    public byte[]				  szQRCode = new byte[FinalVar.SDK_MAX_QRCODE_LEN];

    /**
     * \if ENGLISH_LANG
     * left times
     * \else
     * 剩余的有效次数
     * \endif
     */
    public int					  nLeftTimes;

    /**
     * \if ENGLISH_LANG
     * start time of available
     * \else
     * 有效期开始时间
     * \endif
     */
    public NET_TIME        		  stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * end time of available
     * \else
     * 有效期截止时间
     * \endif
     */
    public NET_TIME        		  stuEndTime = new NET_TIME();
}
