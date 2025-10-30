package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Location information of face characteristic value data in binary data
 * \else
 * 目标特征值数据在二进制数据中的位置信息
 * \endif
 */
public class NET_FACE_FEATURE_VECTOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Offset of face characteristic value data in binary data, unit: byte
     * \else
     * 目标特征值在二进制数据中的偏移, 单位:字节
     * \endif
     */
    public int                nOffset;

    /**
     * \if ENGLISH_LANG
     * Length of face characteristic value data, unit: byte
     * \else
     * 目标特征值数据长度, 单位:字节
     * \endif
     */
    public int                nLength;

    /**
     * \if ENGLISH_LANG
     * Identifies whether the characteristic value data is encrypted
     * \else
     * 用于标识特征值是否加密
     * \endif
     */
    public boolean                bFeatureEnc;

}
