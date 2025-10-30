package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * sex type of dectected human face
 * \else
 * 目标检测对应性别类型
 * \endif
 */
public class EM_DEV_EVENT_FACEDETECT_SEX_TYPE implements Serializable {
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
    public static final int					EM_DEV_EVENT_FACEDETECT_SEX_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  male
     * \else
     *  男性
     * \endif
     */
    public static final int					EM_DEV_EVENT_FACEDETECT_SEX_TYPE_MAN = 1;

    /**
     * \if ENGLISH_LANG
     *  female
     * \else
     *  女性
     * \endif
     */
    public static final int					EM_DEV_EVENT_FACEDETECT_SEX_TYPE_WOMAN = 2;

}
