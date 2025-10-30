package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Position info of human feature data in binary data
 * \else
 * @brief 人体特征值数据在二进制数据中的位置信息
 * \endif
 */
public class NET_HUMAN_FEATURE_VECTOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The offset of human feature data in binary data, unit:bytes
     * \else
     *  人体特征值在二进制数据中的偏移, 单位:字节
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  The length of human feature data, unit:bytes
     * \else
     *  人体特征值数据长度, 单位:字节
     * \endif
     */
    public int					nLength;

    /**
     * \if ENGLISH_LANG
     *  Identifies whether the characteristic value data is encrypted
     * \else
     *  用于标识特征值是否加密
     * \endif
     */
    public boolean					bFeatureEnc;

}