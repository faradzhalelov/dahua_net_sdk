package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief When swiping the card to open the door, the access control background checks whether the target is the same person
 * \else
 * @brief 刷卡开门时，门禁后台校验目标是否是同一个人
 * \endif
 */
public class EM_FACE_CHECK implements Serializable {
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
    public static final int					EM_FACE_CHECK_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  The person has no target data
     * \else
     *  该人员无目标数据
     * \endif
     */
    public static final int					EM_FACE_CHECK_NODATA = 0;

    /**
     * \if ENGLISH_LANG
     *  Swiping card is consistent with target personnel
     * \else
     *  刷卡和目标人员一致
     * \endif
     */
    public static final int					EM_FACE_CHECK_CONSISTENT = 1;

    /**
     * \if ENGLISH_LANG
     *  Card swiping and target personnel are inconsistent
     * \else
     *  刷卡和目标人员不一致
     * \endif
     */
    public static final int					EM_FACE_CHECK_NOT_CONSISTENT = 2;

}
