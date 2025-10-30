package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief The type of data packet that was successfully delivered at the end
 * \else
 * @brief 最后传递成功的数据包类型
 * \endif
 */
public class ENUM_RECORDBACKUP_FILE_PROGRESS_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					ENUM_RECORDBACKUP_FILE_PROGRESS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  file header package
     * \else
     *  文件头包
     * \endif
     */
    public static final int					ENUM_RECORDBACKUP_FILE_PROGRESS_HEADER_PACKAGE = 1;

    /**
     * \if ENGLISH_LANG
     *  index package
     * \else
     *  索引包
     * \endif
     */
    public static final int					ENUM_RECORDBACKUP_FILE_PROGRESS_INDEX_PACKAGE = 2;

    /**
     * \if ENGLISH_LANG
     *  stream package
     * \else
     *  码流包
     * \endif
     */
    public static final int					ENUM_RECORDBACKUP_FILE_PROGRESS_STREAM_PACKET = 3;

    /**
     * \if ENGLISH_LANG
     *  empty package at the end of the file
     * \else
     *  文件尾空包
     * \endif
     */
    public static final int					ENUM_RECORDBACKUP_FILE_PROGRESS_EMPTY_PACKET = 4;

}
