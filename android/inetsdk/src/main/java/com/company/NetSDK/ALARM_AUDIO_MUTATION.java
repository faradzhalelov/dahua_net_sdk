package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Alarm Event Type,SDK_ALARM_AUDIO_MUTATION's Data Describe Information
 * \else
 * 报警事件类型SDK_ALARM_AUDIO_MUTATION(声强突变事件)对应的数据描述信息
 * \endif
 */
public class ALARM_AUDIO_MUTATION implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Event Action,0=Pause,1=Start,2=Stop
     * \else
     *  事件动作, 0:Start, 1:Stop
     * \endif
     */
    public int					dwAction;

    /**
     * \if ENGLISH_LANG
     *  Audio Channel ID
     * \else
     *  音频通道号
     * \endif
     */
    public int					dwChannelID;

}
