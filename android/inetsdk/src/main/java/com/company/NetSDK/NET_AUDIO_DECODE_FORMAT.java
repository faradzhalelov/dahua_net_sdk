package com.company.NetSDK;
import java.io.Serializable;

public class NET_AUDIO_DECODE_FORMAT implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * audio decode type
     * \else
     * 音频编码格式
     * \endif
     */
    public int      emCompression;

    /**
     * \if ENGLISH_LANG
     * 音频采样频率：8K ~ 192K
     * \else
     * 通道号
     * \endif
     */
    public int		nFrequency;

    /**
     * \if ENGLISH_LANG
     * sample depth:8,16,24
     * \else
     * 音频采样深度：8,16,24
     * \endif
     */
    public int		nDepth;

    /**
     * \if ENGLISH_LANG
     * packet period, [10, 250],ms
     * \else
     * 音频打包周期, [10, 250],ms
     * \endif
     */
    public int		nPacketPeriod;
}
