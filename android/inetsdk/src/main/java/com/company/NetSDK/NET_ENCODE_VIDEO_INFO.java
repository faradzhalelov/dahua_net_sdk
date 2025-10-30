package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the video info of main(extra) stream
 * \else
 * 主(辅)码流视频格式(f6/f5/bin)
 * \endif
 */
public class NET_ENCODE_VIDEO_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * stream type, you need to set this value when get or set config,refer to {@link NET_EM_FORMAT_TYPE}
     * \else
     * 码流类型,设置和获取时都需要设置值,参考{@link NET_EM_FORMAT_TYPE}
     * \endif
     */
    public int			emFormatType;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 视频使能
     * \endif
     */
    public boolean						bVideoEnable;

    /**
     * \if ENGLISH_LANG
     * the type of video compression,refer to {@link NET_EM_VIDEO_COMPRESSION}
     * \else
     * 视频压缩格式,参考{@link NET_EM_VIDEO_COMPRESSION}
     * \endif
     */
    public int 	emCompression;

    /**
     * \if ENGLISH_LANG
     * the wigth of video
     * \else
     * 视频宽度
     * \endif
     */
    public int							nWidth;

    /**
     * \if ENGLISH_LANG
     * the height of video
     * \else
     * 视频高度
     * \endif
     */
    public int							nHeight;

    /**
     * \if ENGLISH_LANG
     * the type of BitRateControl,refer to {@link NET_EM_BITRATE_CONTROL}
     * \else
     * 码流控制模式,参考{@link NET_EM_BITRATE_CONTROL}
     * \endif
     */
    public int		emBitRateControl;

    /**
     * \if ENGLISH_LANG
     * Video bit rate (kbps)
     * \else
     * 视频码流(kbps)
     * \endif
     */
    public int							nBitRate;

    /**
     * \if ENGLISH_LANG
     * Frame Rate
     * \else
     * 视频帧率
     * \endif
     */
    public float						nFrameRate;

    /**
     * \if ENGLISH_LANG
     * I frame interval(1-100). For example, 50 means there is I frame in each 49 B frame or P frame.
     * \else
     * I帧间隔(1-100)，比如50表示每49个B帧或P帧，设置一个I帧。
     * \endif
     */
    public int							nIFrameInterval;

    /**
     * \if ENGLISH_LANG
     * image quality,refer to {@link NET_EM_IMAGE_QUALITY}
     * \else
     * 图像质量,参考{@link NET_EM_IMAGE_QUALITY}
     * \endif
     */
    public int		emImageQuality;

}
