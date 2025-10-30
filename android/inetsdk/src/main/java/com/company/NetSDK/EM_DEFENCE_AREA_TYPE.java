package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * defence area type
 * \else
 * 防区类型
 * \endif
 */
public class EM_DEFENCE_AREA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown area
     * \else
     * 未知
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Intime area
     * \else
     * 立即防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_INTIME = 1;

    /**
     * \if ENGLISH_LANG
     * Delay area
     * \else
     * 延时防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_DELAY = 2;

    /**
     * \if ENGLISH_LANG
     * Delay2 area
     * \else
     * 延时防区2
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_DELAY2 = 3;

    /**
     * \if ENGLISH_LANG
     * Follow area
     * \else
     * 跟随防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_FOLLOW = 4;

    /**
     * \if ENGLISH_LANG
     * Exitend area
     * \else
     * 退出防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_EXITEND = 5;

    /**
     * \if ENGLISH_LANG
     * Fullday area
     * \else
     * 24小时防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_FULLDAY = 6;

    /**
     * \if ENGLISH_LANG
     * Fir area
     * \else
     * 火警防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_FIRE = 7;

    /**
     * \if ENGLISH_LANG
     * Panic area
     * \else
     * 恐慌防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_PANIC = 8;

    /**
     * \if ENGLISH_LANG
     * Robbery area
     * \else
     * 匪警防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_ROBBERY = 9;

    /**
     * \if ENGLISH_LANG
     * Medical area
     * \else
     * 医疗防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_MEDICAL = 10;

    /**
     * \if ENGLISH_LANG
     * key area
     * \else
     * key防区
     * \endif
     */
    public static final int EM_DEFENCE_AREA_TYPE_KEY = 11;
}
