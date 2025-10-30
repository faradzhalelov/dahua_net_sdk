package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief 二维码上报事件信息( SDK_ALARM_QR_CODE_CHECK )
 * \endif
 */
public class ALARM_QR_CODE_CHECK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件ID
     * \endif
     */
    public int					nEventID;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  事件发生的时间
     * \endif
     */
    public NET_TIME_EX					UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  时间戳(单位是毫秒)
     * \endif
     */
    public double					dbPTS;

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  二维码字符串
     * \endif
     */
    public byte					szQRCode[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * 
     * \else
     *  本地报警输入通道号
     * \endif
     */
    public int					nChannelID;

}
