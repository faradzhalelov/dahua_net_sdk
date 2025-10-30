package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief heat map metadata info
 * \else
 * @brief 热图元数据信息
 * \endif
 */
public class NET_RADIOMETRY_METADATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  height 
     * \else
     *  高
     * \endif
     */
    public int					nHeight;

    /**
     * \if ENGLISH_LANG
     *  width 
     * \else
     *  宽
     * \endif
     */
    public int					nWidth;

    /**
     * \if ENGLISH_LANG
     *  channel 
     * \else
     *  通道
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  acquire data time
     * \else
     *  获取数据时间
     * \endif
     */
    public NET_TIME					stTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  data size
     * \else
     *  数据大小
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  module type
     * \else
     *  机芯类型
     * \endif
     */
    public byte					szSensorType[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  uncompressing parameter R 
     * \else
     *  解压缩参数R
     * \endif
     */
    public int					nUnzipParamR;

    /**
     * \if ENGLISH_LANG
     *  uncompressing parameter B
     * \else
     *  解压缩参数B
     * \endif
     */
    public int					nUnzipParamB;

    /**
     * \if ENGLISH_LANG
     *  uncompressing parameter F
     * \else
     *  解压缩参数F
     * \endif
     */
    public int					nUnzipParamF;

    /**
     * \if ENGLISH_LANG
     *  uncompressing parameter O
     * \else
     *  解压缩参数O
     * \endif
     */
    public int					nUnzipParamO;

}