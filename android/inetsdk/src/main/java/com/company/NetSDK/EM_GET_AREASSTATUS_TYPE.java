package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get area status
 * \else
 * 获取异常防区类型
 * \endif
 */
public class EM_GET_AREASSTATUS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public final static int EM_GET_AREASSTATUS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * active
     * \else
     * 激活
     * \endif
     */
    public final static int EM_GET_AREASSTATUS_TYPE_ACTIVE = 1;

    /**
     * \if ENGLISH_LANG
     * open
     * \else
     * 打开
     * \endif
     */
    public final static int EM_GET_AREASSTATUS_TYPE_OPEN = 2;
}
