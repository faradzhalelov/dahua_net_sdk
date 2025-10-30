package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Open strobe type
 * \else
 * 开闸类型
 * \endif
 */
public class EM_OPEN_STROBE_TYPE implements Serializable {
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
    public static final int					EM_OPEN_STROBE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Normal
     * \else
     *  正常开闸(默认)
     * \endif
     */
    public static final int					EM_OPEN_STROBE_TYPE_NORMAL = 1;

    /**
     * \if ENGLISH_LANG
     *  Test
     * \else
     *  测试手动开闸（用于施工前期）
     * \endif
     */
    public static final int					EM_OPEN_STROBE_TYPE_TEST = 2;

    /**
     * \if ENGLISH_LANG
     *  Manual
     * \else
     *  手动开闸
     * \endif
     */
    public static final int					EM_OPEN_STROBE_TYPE_MANUAL = 3;

}
