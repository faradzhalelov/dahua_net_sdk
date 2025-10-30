package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Feature data Information
 * \else
 * 特征值信息
 * \endif
 */
public class NET_FEATURE_VECTOR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Target feature data offset in data block(Unit:BYTE)
     * \else
     * 目标小图特征值在二进制数据块中的偏移
     * \endif
     */
    public int				dwOffset;

    /**
     * \if ENGLISH_LANG
     * Target feature data length(Unit:BYTE)
     * \else
     * 目标小图特征值长度，单位:字节
     * \endif
     */
    public int				dwLength;
}
