package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GDPR Vserion
 * \else
 * GDPR版本信息
 * \endif
 */
public class EM_GDPR_VERSION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Non GDPR
     * \else
     * 非GDPR设备
     * \endif
     */
    public final static int EM_GDPR_VERSION_NON = 0;

    /**
     * \if ENGLISH_LANG
     * GDPR V1
     * \else
     * GDPR V1设备
     * \endif
     */
    public final static int EM_GDPR_VERSION_V1 = 1;

    /**
     * \if ENGLISH_LANG
     * GDPR V2
     * \else
     * GDPR V2设备
     * \endif
     */
    public final static int EM_GDPR_VERSION_V2 = 2;
}
