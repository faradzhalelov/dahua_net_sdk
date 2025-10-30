package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Capture process end type
 * \else
 * @brief 抓拍过程结束类型
 * \endif
 */
public class EM_CAPTURE_PROCESS_END_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_CAPTURE_PROCESS_END_TYPE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Abnormal
     * \else
     *  异常
     * \endif
     */
    public static final int					EM_CAPTURE_PROCESS_END_TYPE_ABNORMAL = 0;

    /**
     * \if ENGLISH_LANG
     *  Normal
     * \else
     *  正常
     * \endif
     */
    public static final int					EM_CAPTURE_PROCESS_END_TYPE_NORMAL = 1;

}
