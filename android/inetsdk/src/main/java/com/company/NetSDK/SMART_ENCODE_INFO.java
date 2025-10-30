package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;


/**
 * \if ENGLISH_LANG
 * Smart encode information
 * \else
 * Smart编码信息
 * \endif
 */
public class SMART_ENCODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  video encode format,as "H.264", "H.265"
     * \else
     *  视频编码压缩格式，如"H.264", "H.265"
     * \endif
     */
    public byte					szCompression[] = new byte[FinalVar.MAX_COMMON_STRING_8];

    /**
     * \if ENGLISH_LANG
     *  Smart encode strategy
     * \else
     *  Smart编码策略
     * \endif
     */
    public int					nPolicy;

    /**
     * \if ENGLISH_LANG
     *  stream enable or not
     * \else
     *  码流是否使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  video width, optional
     * \else
     *  视频宽度，选填
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  video height, optional
     * \else
     *  视频高度，选填
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  video frame rate, optional
     * \else
     *  视频帧率，选填
     * \endif
     */
    public float					fFPS;

    @Override
    public String toString() {
        return "SMART_ENCODE_INFO{" +
                "szCompression=" + Arrays.toString(szCompression) +
                ", nPolicy=" + nPolicy +
                ", bEnable=" + bEnable +
                ", nWidth=" + nWidth +
                ", nHeight=" + nHeight +
                ", fFPS=" + fFPS +
                '}';
    }
}
