package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetAlarmOutState}'s output param
 * \else
 * 接口{@link INetSDK#GetAlarmOutState}，出参
 * \endif
 */
public class NET_OUT_GET_ALARM_OUT_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * output port state, 0: no, 1: yes
     * \else
     * 输出端口状态, 0表示没有, 1表示有
     * \endif
     */
    public int[]						nState = new int[FinalVar.MAX_OUT_STATE_COUNT];
}
