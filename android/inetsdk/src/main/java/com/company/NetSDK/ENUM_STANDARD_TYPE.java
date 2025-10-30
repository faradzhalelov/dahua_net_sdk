package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * standard type
 * \else
 * 视频制式
 * \endif
 */
public class ENUM_STANDARD_TYPE implements Serializable {
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
    public static final int ENUM_STANDARD_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * P-PAL
     * \else
     * P-PAL
     * \endif
     */
    public static final int ENUM_STANDARD_TYPE_PAL = 1;

    /**
     * \if ENGLISH_LANG
     * N-NTSC
     * \else
     * N-NTSC
     * \endif
     */
    public static final int ENUM_STANDARD_TYPE_NTSC = 2;

    /**
     * \if ENGLISH_LANG
     * PN-PAL/NTSC(default:PAL)
     * \else
     * PN-PAL/NTSC默认P制
     * \endif
     */
    public static final int ENUM_STANDARD_TYPE_PAL_NTSC = 3;

    /**
     * \if ENGLISH_LANG
     * NP-NTSC/PAL(default:NTSC)
     * \else
     * NP-NTSC/PAL默认N制
     * \endif
     */
    public static final int ENUM_STANDARD_TYPE_NTSC_PAL = 4;

    /**
     * \if ENGLISH_LANG
     * S-SECAM
     * \else
     * S-SECAM
     * \endif
     */
    public static final int ENUM_STANDARD_TYPE_SECAM = 5;
}
