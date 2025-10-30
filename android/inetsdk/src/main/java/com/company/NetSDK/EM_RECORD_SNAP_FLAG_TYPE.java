package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Record or snapshot file mark
 * \else
 * @brief 录像或抓图文件标志
 * \endif
 */
public class EM_RECORD_SNAP_FLAG_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknow	
     * \else
     * 未知				
     * \endif
     */
    public static final int					FLAG_TYPE_UNKNOW = -1;

    /**
     * \if ENGLISH_LANG
     * Schele
     * \else
     * 定时文件
     * \endif
     */
    public static final int					FLAG_TYPE_TIMING = 0;

    /**
     * \if ENGLISH_LANG
     * Manual
     * \else
     * 手动文件
     * \endif
     */
    public static final int					FLAG_TYPE_MANUAL = 1;

    /**
     * \if ENGLISH_LANG
     * Important
     * \else
     * 重要文件
     * \endif
     */
    public static final int					FLAG_TYPE_MARKED = 2;

    /**
     * \if ENGLISH_LANG
     * Event
     * \else
     * 事件文件
     * \endif
     */
    public static final int					FLAG_TYPE_EVENT = 3;

    /**
     * \if ENGLISH_LANG
     * Combined
     * \else
     * 合成图片
     * \endif
     */
    public static final int					FLAG_TYPE_MOSAIC = 4;

    /**
     * \if ENGLISH_LANG
     * Cut
     * \else
     * 抠图图片
     * \endif
     */
    public static final int					FLAG_TYPE_CUTOUT = 5;

    /**
     * \if ENGLISH_LANG
     * Message
     * \else
     * 留言文件
     * \endif
     */
    public static final int					FLAG_TYPE_LEAVE_WORD = 6;

    /**
     * \if ENGLISH_LANG
     * Talk Local
     * \else
     * 对讲本地方文件
     * \endif
     */
    public static final int					FLAG_TYPE_TALKBACK_LOCAL_SIDE = 7;

    /**
     * \if ENGLISH_LANG
     * Talk Remote
     * \else
     * 对讲远程方文件
     * \endif
     */
    public static final int					FLAG_TYPE_TALKBACK_REMOTE_SIDE = 8;

    /**
     * \if ENGLISH_LANG
     * Compressed Video
     * \else
     * 浓缩视频
     * \endif
     */
    public static final int					FLAG_TYPE_SYNOPSIS_VIDEO = 9;

    /**
     * \if ENGLISH_LANG
     * Original Video
     * \else
     * 原始视频
     * \endif
     */
    public static final int					FLAG_TYPE_ORIGINAL_VIDEO = 10;

    /**
     * \if ENGLISH_LANG
     * Processed
     * \else
     * 已经预处理的原始视频
     * \endif
     */
    public static final int					FLAG_TYPE_PRE_ORIGINAL_VIDEO = 11;

    /**
     * \if ENGLISH_LANG
     * Blocklist Picture
     * \else
     * 禁止名单图片
     * \endif
     */
    public static final int					FLAG_TYPE_BLACK_PLATE = 12;

    /**
     * \if ENGLISH_LANG
     * Original Picture
     * \else
     * 原始图片
     * \endif
     */
    public static final int					FLAG_TYPE_ORIGINAL_PIC = 13;

    /**
     * \if ENGLISH_LANG
     * card no. record
     * \else
     * 卡号录像
     * \endif
     */
    public static final int					FLAG_TYPE_CARD = 14;

    /**
     * \if ENGLISH_LANG
     * Rio alarm
     * \else
     * 里约报警
     * \endif
     */
    public static final int					FLAG_TYPE_VECHILE_RIGGER_MODE = 15;

    /**
     * \if ENGLISH_LANG
     *    FLAG_TYPE_MAX = 128, 
     * \else
     *    FLAG_TYPE_MAX = 128, 
     * \endif
     */
    public static final int					FLAG_TYPE_MAX = 128;

}