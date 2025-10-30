package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Speak caps
 * \else
 * 音频文件路径和能力集
 * \endif
 */
public class NET_SPEAK_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Speak audio Formats
     * \else
     * 音频格式
     * \endif
     */
    public NET_SPEAK_AUDIO_FORMAT             stuAudioFormats[] = new NET_SPEAK_AUDIO_FORMAT[32];

    /**
     * \if ENGLISH_LANG
     * The number of speak audio format
     * \else
     * 音频格式个数
     * \endif
     */
    public int             nAudioFormatNum;

    /**
     * \if ENGLISH_LANG
     * The number of speak audio play path
     * \else
     * 音频文件路径个数
     * \endif
     */
    public int 			   nAudioPlayPathNum;

    /**
     * \if ENGLISH_LANG
     * speak audio play paths
     * \else
     * 音频文件路径
     * \endif
     */
    public NET_SPEAK_AUDIO_PLAY_PATH 			   stuAudioPlayPaths[] = new NET_SPEAK_AUDIO_PLAY_PATH[8];

    public NET_SPEAK_CAPS() {
        for (int i = 0; i < 32; i++) {
            stuAudioFormats[i] = new NET_SPEAK_AUDIO_FORMAT();
        }
        for (int i = 0; i < 8; i++) {
            stuAudioPlayPaths[i] = new NET_SPEAK_AUDIO_PLAY_PATH();
        }
    }
}
