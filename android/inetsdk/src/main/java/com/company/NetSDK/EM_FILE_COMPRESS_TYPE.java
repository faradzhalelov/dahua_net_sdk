package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * file compress type
 * \else
 * 文件压缩解压任务类型
 * \endif
 */
public class EM_FILE_COMPRESS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FILE_COMPRESS_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * compress, corresponding to pInParam = NET_IN_COMPRESS_FILE,pOutParam = NET_OUT_COMPRESS_FILE
     * \else
     * 压缩文件, 对应结构体pInParam = NET_IN_COMPRESS_FILE,pOutParam = NET_OUT_COMPRESS_FILE
     * \endif
     */
    public static final int EM_FILE_COMPRESS_TYPE_COMPRESS = 1;

    /**
     * \if ENGLISH_LANG
     * decompress, corresponding to pInParam = NET_IN_COMPRESS_FILE,pOutParam = NET_OUT_COMPRESS_FILE
     * \else
     * 解压文件, 对应结构体pInParam = NET_IN_DECOMPRESS_FILE,pOutParam = NET_OUT_DECOMPRESS_FILE
     * \endif
     */
    public static final int EM_FILE_COMPRESS_TYPE_DECOMPRESS = 2;

}
