package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * error reason type
 * \else
 * 错误原因类型
 * \endif
 */
public class EM_REASON_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unknown
     * \else
     * 未知原因
     * \endif
     */
    public static final int EM_REASON_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * File number is over
     * \else
     * 文件个数超出
     * \endif
     */
    public static final int EM_REASON_TYPE_OVERNUMBER = 1;

    /**
     * \if ENGLISH_LANG
     * The file storage is full
     * \else
     * 文件存储空间已满
     * \endif
     */
    public static final int EM_REASON_TYPE_FULLSTORAGE = 2;

    /**
     * \if ENGLISH_LANG
     * The file is too large
     * \else
     * 该文件太大
     * \endif
     */
    public static final int EM_REASON_TYPE_TOOLARGE_FILE = 3;

    /**
     * \if ENGLISH_LANG
     * Invalid file type
     * \else
     * 无效的文件类型
     * \endif
     */
    public static final int EM_REASON_TYPE_INVALID_FILETYPE = 4;

    /**
     * \if ENGLISH_LANG
     * Without upload authorized
     * \else
     * 没有上传权限
     * \endif
     */
    public static final int EM_REASON_TYPE_UNAUTH_UPLOAD = 5;

    /**
     * \if ENGLISH_LANG
     * Exception name of file
     * \else
     * 文件命名异常
     * \endif
     */
    public static final int EM_REASON_TYPE_EXCEPTION_NAME = 6;

    /**
     * \if ENGLISH_LANG
     * The file name is too long
     * \else
     * 文件名太长
     * \endif
     */
    public static final int EM_REASON_TYPE_TOOLONG_NAME = 7;

    /**
     * \if ENGLISH_LANG
     * The file name already exists
     * \else
     * 文件名已存在
     * \endif
     */
    public static final int EM_REASON_TYPE_EXIST_NAME = 8;
}

