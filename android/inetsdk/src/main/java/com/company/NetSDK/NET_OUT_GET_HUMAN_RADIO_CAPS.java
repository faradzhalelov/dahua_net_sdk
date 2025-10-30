package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * output parameter of interface {@link INetSDK#GetHumanRadioCaps}
 * \else
 * 接口 {@link INetSDK#GetHumanRadioCaps} 出参
 * \endif
 */
public class NET_OUT_GET_HUMAN_RADIO_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether support regulator alarm
     * \else
     * 是否支持黑体异常报警
     * \endif
     */
    public boolean					bSupportRegulatorAlarm;
}
