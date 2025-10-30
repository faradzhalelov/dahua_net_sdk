package com.company.NetSDK;
import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_AUDIO_OUTPUT_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_AUDIO_OUTPUT_CAPS}
 * \endif
 */
public class NET_OUT_AUDIO_OUTPUT_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Audio output type
     * \else
     * 音频输出类型
     * \endif
     */
    public NET_AUDIO_OUTPUT_TYPE_INFO stuType = new NET_AUDIO_OUTPUT_TYPE_INFO();

}
