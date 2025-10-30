package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output channel type
 * \else
 * 输出通道类型
 * \endif
 */
public class EM_OUTPUT_TYPE implements Serializable {

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
    public final static int EM_OUTPUT_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * siren
     * \else
     * 警号
     * \endif
     */
    public final static int EM_OUTPUT_TYPE_SIREN = 1;

    /**
     * \if ENGLISH_LANG
     * out
     * \else
     * 输出通道
     * \endif
     */
    public final static int EM_OUTPUT_TYPE_ALARMOUT = 2;
}
