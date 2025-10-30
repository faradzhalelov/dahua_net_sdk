package com.company.NetSDK;
import java.io.Serializable;

public class NET_OUT_SUPPORT_GET_AUDIO_DECODE_CAPS implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether support get audio decode caps：TRUE support
     * \else
     * 是否支持获取音频解码能力：TRUE表示支持，否则不支持
     * \endif
     */
    public boolean      bSupport;
}
