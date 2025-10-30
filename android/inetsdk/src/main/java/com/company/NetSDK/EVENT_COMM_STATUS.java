package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * illegal state type of driver
 * \else
 * 违规状态
 * \endif
 */
public class EVENT_COMM_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * smoking
     * \else
     * 是否抽烟
     * \endif
     */
    public byte          bySmoking;

    /**
     * \if ENGLISH_LANG
     * calling
     * \else
     * 是否打电话
     * \endif
     */
    public byte          byCalling;
}
