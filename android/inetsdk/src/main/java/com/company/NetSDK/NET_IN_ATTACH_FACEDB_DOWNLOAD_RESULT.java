package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input param of CLIENT_AttachFaceDbDownLoadResult
 * \else
 * @brief CLIENT_AttachFaceDbDownLoadResult 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_FACEDB_DOWNLOAD_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Callback function of downloading remote target data base
     * \else
     *  目标库下载进度回调函数
     * \endif
     */
    public CB_fFaceDbDownLoadResult					cbFaceDbDownLoadResult;

    /**
     * \if ENGLISH_LANG
     *  User data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUser;

}