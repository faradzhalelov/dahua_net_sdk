package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * file compress status
 * \else
 * 文件压缩解压任务状态
 * \endif
 */
public class EM_FILE_COMPRESS_STATUS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * unknwon
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * failed
     * \else
     * 失败
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_FAILED = 1;

    /**
     * \if ENGLISH_LANG
     * succeed
     * \else
     * 成功
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_SUCCEED = 2;

    /**
     * \if ENGLISH_LANG
     * need password
     * \else
     * 需要密码
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_NEED_PASSWORD = 3;

    /**
     * \if ENGLISH_LANG
     * wrong password
     * \else
     * 密码错误
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_WRONG_PASSWORD = 4;

    /**
     * \if ENGLISH_LANG
     * no file
     * \else
     * 无法找到文件
     * \endif
     */
    public static final int EM_FILE_COMPRESS_STATUS_NO_FILE = 5;
}
