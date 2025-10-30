package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * plan type
 * \else
 * 预案类型
 * \endif
 */
public class EM_SAVE_COLLECTION_TYPE implements Serializable {
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
    public static final int EM_SAVE_COLLECTION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * Video plan
     * \else
     * 视频预案
     * \endif
     */
    public static final int EM_SAVE_COLLECTION_VIDEO = 1;

    /**
     * \if ENGLISH_LANG
     * Addition plan
     * \else
     * 附加预案
     * \endif
     */
    public static final int EM_SAVE_COLLECTION_ADDITIONAL = 2;

}
