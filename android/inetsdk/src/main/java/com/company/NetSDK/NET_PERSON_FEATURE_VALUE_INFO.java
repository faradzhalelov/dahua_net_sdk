package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Personnel characteristics information
 * \else
 * 人员特征信息
 * \endif
 */
public class NET_PERSON_FEATURE_VALUE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Offset value in binary data block
     * \else
     *  二进制数据块中的偏移值
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Eigenvalue size
     * \else
     *  特征值大小
     * \endif
     */
    public int					nLength;

}
