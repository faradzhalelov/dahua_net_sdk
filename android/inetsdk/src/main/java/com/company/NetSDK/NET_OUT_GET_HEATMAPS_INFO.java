package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetHeatMapsDirectly output parameter
 * \else
 * @brief CLIENT_GetHeatMapsDirectly 出参
 * \endif
 */
public class NET_OUT_GET_HEATMAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Meta data
     * \else
     *  元数据
     * \endif
     */
    public NET_RADIOMETRY_METADATA					stMetaData = new NET_RADIOMETRY_METADATA();

    /**
     * \if ENGLISH_LANG
     *  The size of pbDataBuf, allocated by user
     * \else
     *  热图数据缓存区 pbDataBuf 的大小, 由用户指定
     * \endif
     */
    public int					dwMaxDataBufLen;

    /**
     * \if ENGLISH_LANG
     *  The buffer of heatmap data(The data has been compressed, each pixel represents temperature,can extract the data use meta data), allocated by user
     * \else
     *  热图数据缓冲区(压缩过的数据,里面是每个像素点的温度数据,可以使用元数据信息解压),需要用户分配空间
     * \endif
     */
    public byte[]					pbDataBuf;

    /**
     * \if ENGLISH_LANG
     *  The actual data size
     * \else
     *  缓存区中返回的实际文件数据大小
     * \endif
     */
    public int					dwRetDataBufLen;

    public NET_OUT_GET_HEATMAPS_INFO(int dwMaxDataBufLen) {
        this.dwMaxDataBufLen = dwMaxDataBufLen;
        this.pbDataBuf = new byte[dwMaxDataBufLen];
    }
}