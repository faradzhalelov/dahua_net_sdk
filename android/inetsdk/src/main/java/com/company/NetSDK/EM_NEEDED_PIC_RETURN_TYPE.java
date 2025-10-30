package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the format of the image returned in the query results
 * \else
 * 指定查询结果返回图片的格式
 * \endif
 */
public class EM_NEEDED_PIC_RETURN_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * unknow
     * \else
     * 未知类型
     * \endif
     */
    public static final int EM_NEEDED_PIC_TYPE_UNKOWN = 0;

    /**
     * \if ENGLISH_LANG
     * http url
     * \else
     * 返回图片HTTP链接
     * \endif
     */
    public static final int EM_NEEDED_PIC_TYPE_HTTP_URL = 1;

    /**
     * \if ENGLISH_LANG
     * binary data
     * \else
     * 返回图片二进制数据
     * \endif
     */
    public static final int EM_NEEDED_PIC_TYPE_BINARY_DATA = 2;

    /**
     * \if ENGLISH_LANG
     * http url and binary data
     * \else
     * 返回二进制和HTTP链接
     * \endif
     */
    public static final int EM_NEEDED_PIC_TYPE_HTTP_AND_BINARY = 3;
}
