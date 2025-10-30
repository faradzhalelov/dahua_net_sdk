package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Target append state
 * \else
 * @brief 目标导入的状态
 * \endif
 */
public class EM_FACE_APPEND_STATE implements Serializable {
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
    public static final int					EM_FACE_APPEND_STATE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Start import
     * \else
     * 开始导入
     * \endif
     */
    public static final int					EM_FACE_APPEND_STATE_START = 1;

    /**
     * \if ENGLISH_LANG
     * Importing
     * \else
     * 正在导入
     * \endif
     */
    public static final int					EM_FACE_APPEND_STATE_RUN = 2;

    /**
     * \if ENGLISH_LANG
     * Stop import
     * \else
     * 导入结束
     * \endif
     */
    public static final int					EM_FACE_APPEND_STATE_STOP = 3;

    /**
     * \if ENGLISH_LANG
     * Cancle import
     * \else
     * 导入取消
     * \endif
     */
    public static final int					EM_FACE_APPEND_STATE_CANCLE = 4;

}
