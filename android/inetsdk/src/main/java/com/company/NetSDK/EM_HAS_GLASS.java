package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Glasses state
 * \else
 * 是否带眼镜
 * \endif
 */
public class EM_HAS_GLASS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知
     * \endif
     */
    public static final int EM_HAS_GLASS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * unwear
     * \else
     * 未戴
     * \endif
     */
    public static final int EM_HAS_GLASS_NO = 1;

    /**
     * \if ENGLISH_LANG
     * wear normal glasses
     * \else
     * 戴普通眼镜
     * \endif
     */
    public static final int EM_HAS_GLASS_NORMAL = 2;

    /**
     * \if ENGLISH_LANG
     * wear sun glasses
     * \else
     * 戴太阳眼镜
     * \endif
     */
    public static final int EM_HAS_GLASS_SUN = 3;

    /**
     * \if ENGLISH_LANG
     * wear black glasses
     * \else
     * 戴黑框眼镜
     * \endif
     */
    public static final int EM_HAS_GLASS_BLACK = 4;

}
