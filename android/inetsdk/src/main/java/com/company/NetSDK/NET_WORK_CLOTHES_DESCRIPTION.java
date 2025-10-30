package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Description of work clothes
 * \else
 * 工装特征描述
 * \endif
 */

public class NET_WORK_CLOTHES_DESCRIPTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Work Helmet detection
     * \else
     * 安全帽检测
     * \endif
     */
    public NET_WORK_HELMET     stuWorkHelmet = new NET_WORK_HELMET();

    /**
     * \if ENGLISH_LANG
     * Work clothes detection
     * \else
     * 工作服检测
     * \endif
     */
    public NET_WORK_CLOTHES    stuWorkClothes = new NET_WORK_CLOTHES();

    /**
     * \if ENGLISH_LANG
     * Work  vest detection
     * \else
     * 马甲检测
     * \endif
     */
    public NET_WORK_VEST       stuWorkVest = new NET_WORK_VEST();

    /**
     * \if ENGLISH_LANG
     * Work pants detection
     * \else
     * 工装裤检测
     * \endif
     */
    public NET_WORK_PANTS		stuWorkPants = new NET_WORK_PANTS();

    /**
     * \if ENGLISH_LANG
     * Alarm time,unit:s
     * \else
     * 事件持续多长时间后报警，单位秒
     * \endif
     */
    public int					nAlarmTime;

    /**
     * \if ENGLISH_LANG
     * Alarm repeat time, unit:s
     * \else
     * 重复报警时间间隔，单位秒
     * \endif
     */
    public int					nAlarmRepeatTime;

}
