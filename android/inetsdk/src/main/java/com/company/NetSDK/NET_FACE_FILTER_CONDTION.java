package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query filters
 * \else
 * 查询过滤条件
 * \endif
 */
public class NET_FACE_FILTER_CONDTION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME            stStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End Time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME            stEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Place to support fuzzy matching
     * \else
     * 地点,支持模糊匹配
     * \endif
     */
    public byte                szMachineAddress[] = new byte[FinalVar.MAX_PATH];

    /**
     * \if ENGLISH_LANG
     * The actual number of database
     * \else
     * 实际数据库个数
     * \endif
     */
    public int                 nRangeNum;

    /**
     * \if ENGLISH_LANG
     * To query the database type, see EM_FACE_DB_TYPE
     * \else
     * 待查询数据库类型,详见 EM_FACE_DB_TYPE
     * \endif
     */
    public byte                szRange[] = new byte[FinalVar.MAX_FACE_DB_NUM];

    /**
     * \if ENGLISH_LANG
     * Target to query types, see {@link EM_FACERECOGNITION_FACE_TYPE}
     * \else
     * 待查询目标类型,详见 {@link EM_FACERECOGNITION_FACE_TYPE}
     * \endif
     */
    public int                 emFaceType;

    /**
     * \if ENGLISH_LANG
     * staff group
     * \else
     * 人员组数
     * \endif
     */
    public int                 nGroupIdNum;

    /**
     * \if ENGLISH_LANG
     * staff group ID
     * \else
     * 人员组ID
     * \endif
     */
    public byte                szGroupId[][] = new byte[FinalVar.MAX_GOURP_NUM][FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * start birthday time
     * \else
     * 生日起始时间
     * \endif
     */
    public NET_TIME            stBirthdayRangeStart = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * end birthday time
     * \else
     * 生日结束时间
     * \endif
     */
    public NET_TIME            stBirthdayRangeEnd = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Age range, When byAge[0] is 0 and byAge[1] is 0, it means query all age
     * \else
     * 年龄区间，当byAge[0]=0与byAge[1]=0时，表示查询全年龄
     * \endif
     */
    public byte				byAge[] = new byte[FinalVar.MAX_AGE_NUM];

    /**
     * \if ENGLISH_LANG
     * Emotion, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 表情条件, 参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \endif
     */
    public int	               emEmotion[] = new int[FinalVar.MAX_EMOTION_NUM];

    /**
     * \if ENGLISH_LANG
     * Emotion num
     * \else
     * 表情条件的个数
     * \endif
     */
    public int					nEmotionNum;

}
