package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief people group type
 * \else
 * @brief 人员组类型
 * \endif
 */
public class EM_PEOPLE_GROUP_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_PEOPLE_GROUP_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  history database
     * \else
     *  历史数据库,保存视频通道的抓拍目标图片
     * \endif
     */
    public static final int					EM_PEOPLE_GROUP_TYPE_HISTORYDB = 1;

    /**
     * \if ENGLISH_LANG
     *  blocklist database
     * \else
     *  禁止名单组,保存外部导入的图片
     * \endif
     */
    public static final int					EM_PEOPLE_GROUP_TYPE_BLACKLISTDB = 2;

    /**
     * \if ENGLISH_LANG
     *  alarm database
     * \else
     *  报警组
     * \endif
     */
    public static final int					EM_PEOPLE_GROUP_TYPE_ALARMDB = 3;

}