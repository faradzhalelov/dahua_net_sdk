package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * vendor type info
 * \else
 * 设备制造商
 * \endif
 */
public class ENUM_VENDOR_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * UnKnow
     * \else
     * 未知
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * General
     * \else
     * General
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_GENERAL = 1;

    /**
     * \if ENGLISH_LANG
     * DH
     * \else
     * DH
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_DH = 2;

    /**
     * \if ENGLISH_LANG
     * OEM
     * \else
     * OEM
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_OEM = 3;

    /**
     * \if ENGLISH_LANG
     * LC
     * \else
     * LC
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_LC = 4;

    /**
     * \if ENGLISH_LANG
     * EZIP
     * \else
     * EZIP
     * \endif
     */
    public static final int ENUM_VENDOR_TYPE_EZIP = 5;
}
