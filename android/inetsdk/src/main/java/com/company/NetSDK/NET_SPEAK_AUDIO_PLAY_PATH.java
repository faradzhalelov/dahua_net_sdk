package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * speak audio play path
 * \else
 * 音频文件路径
 * \endif
 */
public class NET_SPEAK_AUDIO_PLAY_PATH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * file path
     * \else
     * 文件路径
     * \endif
     */
    public byte                szPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Whether to support upload
     * \else
     * 是否支持上传
     * \endif
     */
    public boolean                bSupportUpload;

    /**
     * \if ENGLISH_LANG
     * Maximum number of file to upload
     * \else
     * 支持最大上传个数
     * \endif
     */
    public int                nMaxFileUploadNum;

    /**
     * \if ENGLISH_LANG
     * Maximum size of file,Unit:byte
     * \else
     * 最大上传文件大小，单位：字节
     * \endif
     */
    public int                nMaxUploadFileSize;
}
