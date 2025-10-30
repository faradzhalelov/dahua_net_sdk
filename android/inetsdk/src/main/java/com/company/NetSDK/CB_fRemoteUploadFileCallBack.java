package com.company.NetSDK;


/**
 * \if ENGLISH_LANG
 * Start to upload remote file to remote device process callback,lRemoteUploadFileID is return by StartRemoteUploadFile
 * \else
 * 开始异步文件上传至前端的回调函数原形,lRemoteUploadFileID 为StartRemoteUploadFile接口返回值
 * \endif
 */
public interface CB_fRemoteUploadFileCallBack {
    /**
     * \if ENGLISH_LANG
     * Start to upload remote file to remote device process callback
     * @param lRemoteUploadFileID  Remote upload file handle, {@link INetSDK#StartRemoteUploadFile}return value
     * @param nTotalSize Total size
     * @param nSendSize Send size
     * @param emStatus,refer to {@link NET_UPLOAD_PROCESS_STATUS}
     * \else
     * 开始异步文件上传至前端的回调函数
     * @param lRemoteUploadFileID , 上传文件到前端设备句柄，{@link INetSDK#StartRemoteUploadFile}返回值
     * @param nTotalSize 文件总大小
     * @param nSendSize 发送大小
     * @param emStatus,参考 {@link NET_UPLOAD_PROCESS_STATUS}
     * \endif
     */
    public void invoke(long lRemoteUploadFileID, int nTotalSize,int nSendSize, int emStatus);

}
