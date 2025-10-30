package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Frame subtype
 * \else
 * @brief 帧子类型
 * \endif
 */
public class EM_DATA_CALL_BACK_FRAM_SUB_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  invalid data
     * \else
     * 数据无效
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_SUB_TYPE_INVALID = -1;

    /**
     * \if ENGLISH_LANG
     *  I Frame
     * \else
     * 视频I帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_SUB_TYPE_I_FRAME = 0;

    /**
     * \if ENGLISH_LANG
     *  P Frame
     * \else
     * 视频P帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_SUB_TYPE_P_FRAME = 1;

    /**
     * \if ENGLISH_LANG
     *  B Frame
     * \else
     * 视频B帧
     * \endif
     */
    public static final int					EM_DATA_CALL_BACK_FRAM_SUB_TYPE_B_FRAME = 2;

}