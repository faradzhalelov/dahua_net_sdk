package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief heat map data
 * \else
 * @brief 热图数据
 * \endif
 */
public class NET_RADIOMETRY_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  metadata
     * \else
     *  元数据
     * \endif
     */
    public NET_RADIOMETRY_METADATA					stMetaData = new NET_RADIOMETRY_METADATA();

    /**
     * \if ENGLISH_LANG
     *  heat map data buffer (for compressed data, it is temperature data of each pixel inside, it can use metadata info to compress)
     * \else
     *  热图数据缓冲区（压缩过的数据,里面是每个像素点的温度数据,可以使用元数据信息解压）
     * \endif
     */
    public byte[]					pbDataBuf;

    /**
     * \if ENGLISH_LANG
     *  heat map data buffer size
     * \else
     *  热图数据缓冲区大小
     * \endif
     */
    public int					dwBufSize;

    public NET_RADIOMETRY_DATA() {
        this.stMetaData = new NET_RADIOMETRY_METADATA();
    }

    public NET_RADIOMETRY_DATA(int dwBufSize) {
        this.dwBufSize = dwBufSize;
        this.pbDataBuf = new byte[dwBufSize];
    }
}