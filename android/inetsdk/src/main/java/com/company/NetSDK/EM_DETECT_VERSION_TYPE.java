package com.company.NetSDK;

import java.io.Serializable;


public class EM_DETECT_VERSION_TYPE  implements Serializable {

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
    public static final int EM_DETECT_VERSION_UNKNOW = 0;

    /**
     * \if ENGLISH_LANG
     * Ver1 motion detection
     * \else
     * 第一版动检方案
     * \endif
     */
    public static final int EM_DETECT_VERSION_V1_0 = 1;

    /**
     * \if ENGLISH_LANG
     * Ver3 motion detection
     * \else
     * 第三版动检方案
     * \endif
     */
    public static final int EM_DETECT_VERSION_V3_0 = 2;
}
