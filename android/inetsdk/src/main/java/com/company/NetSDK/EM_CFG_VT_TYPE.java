package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * remote device type
 * \else
 * 远程设备类型
 * \endif
 */
public class EM_CFG_VT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * VTH
     * \else
     * VTH
     * \endif
     */
    public static final int EM_CFG_VT_TYPE_VTH = 0;

    /**
     * \if ENGLISH_LANG
     * VTO
     * \else
     * VTO
     * \endif
     */
    public static final int EM_CFG_VT_TYPE_VTO = 1;

    /**
     * \if ENGLISH_LANG
     * VTS
     * \else
     * VTS
     * \endif
     */
    public static final int EM_CFG_VT_TYPE_VTS = 2;

    public static final int EM_CFG_VT_TYPE_MAX = 3;
}
