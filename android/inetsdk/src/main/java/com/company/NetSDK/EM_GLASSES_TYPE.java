package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * glasses type
 * \else
 * 眼镜类型
 * \endif
 */
public class EM_GLASSES_TYPE implements Serializable {
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
    public static final int EM_GLASSES_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * sun glasses
     * \else
     * 太阳眼镜
     * \endif
     */
    public static final int EM_GLASSES_SUNGLASS = 1;

    /**
     * \if ENGLISH_LANG
     * normal galsses
     * \else
     * 普通眼镜
     * \endif
     */
    public static final int EM_GLASSES_GLASS = 2;
}
