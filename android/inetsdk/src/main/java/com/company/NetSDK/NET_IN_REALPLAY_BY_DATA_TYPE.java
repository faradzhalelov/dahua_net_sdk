package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#RealPlayByDataType} 's input param
 * \else
 * 开始实时预览并指定回调数据格式 {@link INetSDK#RealPlayByDataType} 输入参数
 * \endif
 */
public class NET_IN_REALPLAY_BY_DATA_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel id
     * \else
     * 通道编号
     * \endif
     */
    public int                         nChannelID;

    /**
     * \if ENGLISH_LANG
     * stream type {@link SDK_RealPlayType}
     * \else
     * 码流类型 {@link SDK_RealPlayType}
     * \endif
     */
    public int           rType;

    /**
     * \if ENGLISH_LANG
     * data callback function prototype
     * \else
     * 数据回调函数
     * \endif
     */
    public CB_fRealDataCallBackEx               cbRealData;

    /**
     * \if ENGLISH_LANG
     * stream data type {@link EM_REAL_DATA_TYPE}
     * \else
     * 回调的数据类型 {@link EM_REAL_DATA_TYPE}
     * \endif
     */
    public int           emDataType;

    /**
     * \if ENGLISH_LANG
     * saved file path
     * \else
     * 转换后的文件名
     * \endif
     */
    public String szSavedFileName;
}
