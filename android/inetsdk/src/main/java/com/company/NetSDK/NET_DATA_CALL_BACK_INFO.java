package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief playback data callback
 * \else
 * @brief 回放数据回调
 * \endif
 */
public class NET_DATA_CALL_BACK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Data type
     * \else
     *  数据类型
     * \endif
     */
    public int					dwDataType;

    /**
     * \if ENGLISH_LANG
     *  Data buffer
     * \else
     *  数据
     * \endif
     */
    public byte[]					pBuffer;

    /**
     * \if ENGLISH_LANG
     *  Data length
     * \else
     *  数据长度
     * \endif
     */
    public int					dwBufSize;

    /**
     * \if ENGLISH_LANG
     *  Timestamp
     * \else
     *  时间戳
     * \endif
     */
    public NET_DATA_CALL_BACK_TIME					stuTime = new NET_DATA_CALL_BACK_TIME();

    /**
     * \if ENGLISH_LANG
     *  Frame type,{@link EM_DATA_CALL_BACK_FRAM_TYPE}
     * \else
     *  帧类型,{@link EM_DATA_CALL_BACK_FRAM_TYPE}
     * \endif
     */
    public int					emFramType;

    /**
     * \if ENGLISH_LANG
     *  Frame subtype,{@link EM_DATA_CALL_BACK_FRAM_SUB_TYPE}
     * \else
     *  帧子类型,{@link EM_DATA_CALL_BACK_FRAM_SUB_TYPE}
     * \endif
     */
    public int					emFramSubType;

}