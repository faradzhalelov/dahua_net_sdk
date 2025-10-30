package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the type of target feature
 * \else
 * @brief 目标属性类型
 * \endif
 */
public class EM_FACEFEATURE_TYPE implements Serializable {
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
    public static final int					EM_FACEFEATURE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  sex
     * \else
     *  性别
     * \endif
     */
    public static final int					EM_FACEFEATURE_SEX = 1;

    /**
     * \if ENGLISH_LANG
     *  age
     * \else
     *  年龄
     * \endif
     */
    public static final int					EM_FACEFEATURE_AGE = 2;

    /**
     * \if ENGLISH_LANG
     *  emottion
     * \else
     *  表情
     * \endif
     */
    public static final int					EM_FACEFEATURE_EMOTION = 3;

    /**
     * \if ENGLISH_LANG
     *  glasses
     * \else
     *  眼镜状态		
     * \endif
     */
    public static final int					EM_FACEFEATURE_GLASSES = 4;

    /**
     * \if ENGLISH_LANG
     *  eye
     * \else
     *  眼睛状态
     * \endif
     */
    public static final int					EM_FACEFEATURE_EYE = 5;

    /**
     * \if ENGLISH_LANG
     *  mouth
     * \else
     *  嘴巴状态
     * \endif
     */
    public static final int					EM_FACEFEATURE_MOUTH = 6;

    /**
     * \if ENGLISH_LANG
     *  mask
     * \else
     *  口罩状态
     * \endif
     */
    public static final int					EM_FACEFEATURE_MASK = 7;

    /**
     * \if ENGLISH_LANG
     *  bread
     * \else
     *  胡子状态
     * \endif
     */
    public static final int					EM_FACEFEATURE_BEARD = 8;

    /**
     * \if ENGLISH_LANG
     *  attractive
     * \else
     *  魅力值
     * \endif
     */
    public static final int					EM_FACEFEATURE_ATTRACTIVE = 9;

}
