package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Start to upload remote file to remote device process callback,lRemoteUploadFileID is return by StartRemoteUploadFile
 * \else
 * 开始异步文件上传至前端的回调函数原形,lRemoteUploadFileID 为StartRemoteUploadFile接口返回值
 * \endif
 */
public interface CB_fRemoteUpgradeCallBack {
    /**
     * \if ENGLISH_LANG
     * Start to upload remote file to remote device process callback
     * @param lLoginID  Login handle,, {@link INetSDK#LoginWithHighLevelSecurity}return value
     * @param lUpgradeID  Remote grade handle, {@link INetSDK#StartRemoteUpgrade}return value
     * @param emState remote upgrade callback type,refer to {@link EM_REMOTE_UPGRADE_CB_TYPE}
     * @param nParam1,when emState is EM_REMOTE_UPGRADE_CB_TYPE_APPENDING，it means file total size;when emState is EM_REMOTE_UPGRADE_CB_TYPE_EXECUTE,it means error code;when emState is EM_REMOTE_UPGRADE_CB_TYPE_FAILED, it means error code
     * @param nParam2 when emState is EM_REMOTE_UPGRADE_CB_TYPE_APPENDING,it means send size
     * \else
     * 开始异步文件上传至前端的回调函数
     * @param lLoginID  登录句柄，, {@link INetSDK#LoginWithHighLevelSecurity}return value
     * @param lUpgradeID , 远程升级句柄，{@link INetSDK#StartRemoteUpgrade}返回值
     * @param emState 远程升级回调类型,参考{@link EM_REMOTE_UPGRADE_CB_TYPE}
     * @param nParam1 当emState为EM_REMOTE_UPGRADE_CB_TYPE_APPENDING表示文件总大小；当当emState为EM_REMOTE_UPGRADE_CB_TYPE_EXECUTE或者EM_REMOTE_UPGRADE_CB_TYPE_FAILED时，就是错误码
     * @param nParam2 当emState为EM_REMOTE_UPGRADE_CB_TYPE_APPENDING，表示已发送大小
     * \endif
     */
    public void invoke(long lLoginID, long lUpgradeID, int emState, long nParam1, long nParam2);
}
