package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *　SMD video type
 * \else
 * SMD 录像类型
 * \endif
 */
public class EM_SMD_RECORD_TYPE implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_SMD_RECORD_UNKNWON = 0;

    /**
     * \if ENGLISH_LANG
     * Human
     * \else
     * 人
     * \endif
     */
    public final static int EM_SMD_RECORD_HUMAN = 1;

    /**
     * \if ENGLISH_LANG
     * Vehicle
     * \else
     * 车
     * \endif
     */
    public final static int EM_SMD_RECORD_VEHICLE = 2;

    /**
     * \if ENGLISH_LANG
     * Human and Vehicle
     * \else
     * 人和车
     * \endif
     */
    public final static int EM_SMD_RECORD_HUMAN_AND_VEHICLE = 3;
}
