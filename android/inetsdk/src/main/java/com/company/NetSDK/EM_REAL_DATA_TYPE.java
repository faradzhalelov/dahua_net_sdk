package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream data type
 * \else
 * 实时预览回调数据类型
 * \endif
 */
public class EM_REAL_DATA_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * private stream
     * \else
     * 私有码流
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_PRIVATE = 0;

    /**
     * \if ENGLISH_LANG
     * Chinese standard ps stream
     * \else
     * 国标PS码流
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_GBPS = 1;

    /**
     * \if ENGLISH_LANG
     * TS stream
     * \else
     * TS码流
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_TS = 2;

    /**
     * \if ENGLISH_LANG
     * MP4 file(the callback function supply the private stream data, the parama dwDataType is 0 )
     * \else
     * MP4文件(从回调函数出来的是私有码流数据,参数dwDataType值为0)
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_MP4 = 3;

    /**
     * \if ENGLISH_LANG
     * raw video stream,both h264 and h265 can convert successfully
     * \else
     * 裸视频流,h264与h265都能转码成功
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_H264 = 4;

    /**
     * \if ENGLISH_LANG
     * FLV stream
     * \else
     * 流式FLV
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_FLV_STREAM = 5;

    /**
     * \if ENGLISH_LANG
     * PS stream
     * \else
     * PS码流
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_PS = 6;

    /**
     * \if ENGLISH_LANG
     * DHTS
     * \else
     * DHTS
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_DHTS = 7;

    /**
     * \if ENGLISH_LANG
     * Custom PS(if Audio format is G711A,G711U or MP2 will not transcoding,else convert to AAC)
     * \else
     * 原始音频格式是G711A和G711U、MP2的，音频不转码，其他的，音频转码成AAC
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_CDJFPS = 8;

    /**
     * \if ENGLISH_LANG
     * RTP stream
     * \else
     * RTP码流
     * \endif
     */
    public static final int EM_REAL_DATA_TYPE_RTP = 9;
}
