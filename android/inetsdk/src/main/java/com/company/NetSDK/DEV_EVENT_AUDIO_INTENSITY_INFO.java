package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm info of audio intensity,{@link FinalVar#EVENT_IVS_AUDIO_INTENSITY}
 * \else
 * 异常音报警事件信息，对应{@link FinalVar#EVENT_IVS_AUDIO_INTENSITY}
 * \endif
 */
public class DEV_EVENT_AUDIO_INTENSITY_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                  nChannelID;

    /**
     * \if ENGLISH_LANG
     * 0:pulse,1:start,2:stop
     * \else
     *  0:脉冲 1:开始 2:停止
     * \endif
     */

    public int                  nAction;

    /**
     * \if ENGLISH_LANG
     * Time stamp (Unit:ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */

    public double                  PTS;

    /**
     * \if ENGLISH_LANG
     * Event occur time
     * \else
     * 事件发生的时间
     * \endif
     */

    public NET_TIME_EX                  UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * audio intensity info
     * \else
     * 音频检测信息
     * \endif
     */

    public AUDIO_INTENSITY_MESSAGE_INFO                  stuAudioIntensityInfo = new AUDIO_INTENSITY_MESSAGE_INFO();

}
