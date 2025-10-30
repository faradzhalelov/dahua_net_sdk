package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target region
 * \else
 * 目标对比模式
 * \endif
 */
public class EM_FACE_AREA_TYPE implements Serializable {
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
    public static final int NET_FACE_AREA_TYPE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * eyebrow
     * \else
     * 眉毛
     * \endif
     */
    public static final int NET_FACE_AREA_TYPE_EYEBROW = 1;

    /**
     * \if ENGLISH_LANG
     * eye
     * \else
     * 眼睛
     * \endif
     */
    public static final int NET_FACE_AREA_TYPE_EYE = 2;

    /**
     * \if ENGLISH_LANG
     * nose
     * \else
     * 鼻子
     * \endif
     */
    public static final int NET_FACE_AREA_TYPE_NOSE = 3;

    /**
     * \if ENGLISH_LANG
     * mouth
     * \else
     * 嘴巴
     * \endif
     */
    public static final int NET_FACE_AREA_TYPE_MOUTH = 4;

    /**
     * \if ENGLISH_LANG
     * face
     * \else
     * 脸颊
     * \endif
     */
    public static final int NET_FACE_AREA_TYPE_CHEEK = 5;
}
