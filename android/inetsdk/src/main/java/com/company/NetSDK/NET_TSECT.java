package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Time section
 * \else
 * @brief 时间段结构
 * \endif
 */
public class NET_TSECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  When it indicates the recording time period, the bit means four enable, from low to high respectively it means motion detection recording, alarm recording, ordinary recording, motion detection and alarm occur at the same time to record.
     * \else
     *  当表示录像时间段时,按位表示四个使能,从低位到高位分别表示动检录象、报警录象、普通录象、动检和报警同时发生才录像
     * \endif
     */
    public int					bEnable;

    /**
     * \if ENGLISH_LANG
     * Begin hours
     * \else
     * 开始时间-时
     * \endif
     */
    public int					iBeginHour;

    /**
     * \if ENGLISH_LANG
     * Begin minutes
     * \else
     * 开始时间-分
     * \endif
     */
    public int					iBeginMin;

    /**
     * \if ENGLISH_LANG
     * Begin seconds
     * \else
     * 开始时间-秒
     * \endif
     */
    public int					iBeginSec;

    /**
     * \if ENGLISH_LANG
     * End hours
     * \else
     * 结束时间-时
     * \endif
     */
    public int					iEndHour;

    /**
     * \if ENGLISH_LANG
     * End minutes
     * \else
     * 结束时间-分
     * \endif
     */
    public int					iEndMin;

    /**
     * \if ENGLISH_LANG
     * End seconds
     * \else
     * 结束时间-秒
     * \endif
     */
    public int					iEndSec;

}