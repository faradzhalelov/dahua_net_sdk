package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief target detection of glasses
 * \else
 * @brief 目标检测目标戴眼镜特征类型
 * \endif
 */
public class EM_FACEDETECT_GLASSES_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown type
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FACEDETECT_GLASSES_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Wear glasses
     * \else
     * 戴眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_WITH_GLASSES = 1;

    /**
     * \if ENGLISH_LANG
     * Without glasses
     * \else
     * 不戴眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_WITHOUT_GLASSES = 2;

    /**
     * \if ENGLISH_LANG
     * Wear sun glasses
     * \else
     * 戴太阳眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_SUN_GLASSES = 3;

    /**
     * \if ENGLISH_LANG
     * Wear black frame glasses
     * \else
     * 戴黑框眼镜
     * \endif
     */
    public static final int EM_FACEDETECT_BLACKFRAME_GLASSES = 4;

}