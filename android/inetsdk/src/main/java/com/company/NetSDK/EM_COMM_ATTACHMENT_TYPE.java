package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * attachment type
 * \else
 * 车辆物件类型
 * \endif
 */
public class EM_COMM_ATTACHMENT_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown type
     * \else
     * 未知类型
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_UNKNOWN    = 0;

    /**
     * \if ENGLISH_LANG
     * Furniture
     * \else
     * 摆件
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_FURNITURE  = 1;

    /**
     * \if ENGLISH_LANG
     * Pendant
     * \else
     * 挂件
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_PENDANT    = 2;

    /**
     * \if ENGLISH_LANG
     * TissueBox
     * \else
     * 纸巾盒
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_TISSUEBOX  = 3;

    /**
     * \if ENGLISH_LANG
     * Danger
     * \else
     * 危险品
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_DANGER     = 4;

    /**
     * \if ENGLISH_LANG
     * perfumebox
     * \else
     * 香水
     * \endif
     */
    public static final int COMM_ATTACHMENT_TYPE_PERFUMEBOX = 5;
}
