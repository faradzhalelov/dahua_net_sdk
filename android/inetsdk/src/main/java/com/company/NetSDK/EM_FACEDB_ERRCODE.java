package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Error code of downloading remote facelib
 * \else
 * @brief 目标下载失败错误码
 * \endif
 */
public class EM_FACEDB_ERRCODE implements Serializable {
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
    public static final int					EM_FACEDB_ERRCODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Success
     * \else
     *  成功
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_SUCCESS = 0;

    /**
     * \if ENGLISH_LANG
     *  Connect fail
     * \else
     *  连接失败
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_CONNECT_FAIL = 2;

    /**
     * \if ENGLISH_LANG
     *  Login fail
     * \else
     *  登陆失败
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_LOGIN_FAIL = 3;

    /**
     * \if ENGLISH_LANG
     *  Receive timeout
     * \else
     *  接收数据超时
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_RECV_TIMEOUT = 4;

    /**
     * \if ENGLISH_LANG
     *  The target string is empty
     * \else
     *  目标字符串为空
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_STRING_NULL = 5;

    /**
     * \if ENGLISH_LANG
     *  No directory or file exists
     * \else
     *  目录或文件不存在
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_FILE_DIRECTORY_NOT_EXIST = 6;

    /**
     * \if ENGLISH_LANG
     *  Storage fail
     * \else
     *  文件存储失败
     * \endif
     */
    public static final int					EM_FACEDB_ERRCODE_STORAGE_FAIL = 7;

}