package com.company.NetSDK;
import java.io.Serializable;

public class NET_OUT_AUDIO_DECODE_CAPS implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * audio decode info
     * \else
     * 音频解码格式信息
     * \endif
     */
    public NET_AUDIO_DECODE_FORMAT      stuDecodeFormats[] = new NET_AUDIO_DECODE_FORMAT[64];

    /**
     * \if ENGLISH_LANG
     * audio decode number returned
     * \else
     * 返回的音频解码格式信息数量
     * \endif
     */
    public int		nFormatsRet;



    public NET_OUT_AUDIO_DECODE_CAPS() {
        for (int i = 0; i < stuDecodeFormats.length; ++i) {
            stuDecodeFormats[i] = new NET_AUDIO_DECODE_FORMAT();
        }
    }
}
