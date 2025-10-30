package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Period information
 * \else
 * @brief 时间段信息
 * \endif
 */
public class NET_CFG_TIME_SECTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record subnet mask. Bit0-motion detection recording, Bit1-alarm recording, Bit2-timing recording, Bit3-motion detection and alarm triggered simultaneously, Bit4-card number recording, Bit5-smart recording, Bit6-POS recording, Bit7~Bit15 reserved
     * \else
     *  录像掩码，按位分别为Bit0-动态检测录像、Bit1-报警录像、Bit2-定时录像、Bit3-动检和报警同时触发时才录像、Bit4-卡号录像、Bit5-智能录像、Bit6-POS录像、Bit7~Bit15保留
     * \endif
     */
    public int					dwRecordMask;

    /**
     * \if ENGLISH_LANG
     * int					nBeginHour;
     * \else
     * int					nBeginHour;
     * \endif
     */
    public int					nBeginHour;

    /**
     * \if ENGLISH_LANG
     * int					nBeginMin;
     * \else
     * int					nBeginMin;
     * \endif
     */
    public int					nBeginMin;

    /**
     * \if ENGLISH_LANG
     * int					nBeginSec;
     * \else
     * int					nBeginSec;
     * \endif
     */
    public int					nBeginSec;

    /**
     * \if ENGLISH_LANG
     * int					nEndHour;
     * \else
     * int					nEndHour;
     * \endif
     */
    public int					nEndHour;

    /**
     * \if ENGLISH_LANG
     * int					nEndMin;
     * \else
     * int					nEndMin;
     * \endif
     */
    public int					nEndMin;

    /**
     * \if ENGLISH_LANG
     * int					nEndSec;
     * \else
     * int					nEndSec;
     * \endif
     */
    public int					nEndSec;

}