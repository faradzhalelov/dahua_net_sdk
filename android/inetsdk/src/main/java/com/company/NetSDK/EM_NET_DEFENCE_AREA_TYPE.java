package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Defence area type
 * \else
 * 防区类型
 * \endif
 */
public class EM_NET_DEFENCE_AREA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * realtime protection area
     * \else
     * 即时防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_INTIME = 1;

    /**
     * \if ENGLISH_LANG
     * delay protection area
     * \else
     * 延时防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_DELAY = 2;

    /**
     * \if ENGLISH_LANG
     *  24h protection area
     * \else
     * 24小时防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_FULLDAY = 3;

    /**
     * \if ENGLISH_LANG
     * follow Protection area
     * \else
     * 跟随防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_Follow = 4;

    /**
     * \if ENGLISH_LANG
     * medical protection area
     * \else
     * 医疗防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_MEDICAL = 5;

    /**
     * \if ENGLISH_LANG
     * panic Protection area
     * \else
     * 恐慌防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_PANIC = 6;

    /**
     * \if ENGLISH_LANG
     * fire Protection area
     * \else
     * 火警防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_FIRE = 7;

    /**
     * \if ENGLISH_LANG
     * 24h sound Protection area
     * \else
     * 24小时有声防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_FULLDAYSOUND = 8;

    /**
     * \if ENGLISH_LANG
     * 24h slient Protection area
     * \else
     * 24小时无声防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_FULLDATSLIENT = 9;

    /**
     * \if ENGLISH_LANG
     * entrance Protection area 1
     * \else
     * 出入防区1
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_ENTRANCE1 = 10;

    /**
     * \if ENGLISH_LANG
     * entrance Protection area 2
     * \else
     * 出入防区2
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_ENTRANCE2 = 11;

    /**
     * \if ENGLISH_LANG
     * inside Protection area
     * \else
     * 内部防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_INSIDE = 12;

    /**
     * \if ENGLISH_LANG
     * outside Protection area
     * \else
     * 外部防区
     * \endif
     */
    public static final int 	EM_NET_DEFENCE_AREA_TYPE_OUTSIDE = 13;

    /**
     * \if ENGLISH_LANG
     * people detect Protection area
     * \else
     * 人员检测防区
     * \endif
     */
    public static final int 	EN_NET_DEFENCE_AREA_TYPE_PEOPLEDETECT = 14;

}
