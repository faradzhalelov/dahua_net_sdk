package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * 
 * \else
 * @brief  分区类型
 * \endif
 */
public class EM_PARTITION_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_PARTITION_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  Read&Write
     * \else
     *  读写
     * \endif
     */
    public static final int					EM_PARTITION_READ_WIRTE = 1;

    /**
     * \if ENGLISH_LANG
     *  Read Only
     * \else
     *  只读
     * \endif
     */
    public static final int					EM_PARTITION_READ_ONLY = 2;

    /**
     * \if ENGLISH_LANG
     *  Normal
     * \else
     *  一般的
     * \endif
     */
    public static final int					EM_PARTITION_READ_GENERIC = 3;

}
