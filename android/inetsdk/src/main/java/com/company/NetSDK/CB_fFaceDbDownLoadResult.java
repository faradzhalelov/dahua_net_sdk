package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Callback function of downloading remote target data base, lAttachHandle is returned by CLIENT_AttachFaceDbDownLoadResult
 * \else
 * 订阅目标库下载进度回调函数原型
 * \endif
 */
public interface CB_fFaceDbDownLoadResult {

    /**
     * \if ENGLISH_LANG
     * Callback function of downloading remote target data base, lAttachHandle is returned by CLIENT_AttachFaceDbDownLoadResult
     * @param lAttachHandle return from{@link INetSDK#AttachFaceDbDownLoadResult}
     * @param pstResult {@link NET_CB_FACEDB_DOWNLOAD_RESULT} Callback info of downloading remote target data base
     * @param dwUser user information
     * \else
     * 订阅目标库下载进度回调函数原型
     * @param lAttachHandle {@link INetSDK#AttachFaceDbDownLoadResult}返回值
     * @param pstResult {@link NET_CB_FACEDB_DOWNLOAD_RESULT} 目标库下载进度回调信息
     * @param dwUser 用户信息
     * \endif
     */
    public void invoke(long lAttachHandle, NET_CB_FACEDB_DOWNLOAD_RESULT pstResult, long dwUser);

}
