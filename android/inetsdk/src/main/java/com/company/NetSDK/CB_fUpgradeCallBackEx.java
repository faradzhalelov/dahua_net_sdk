package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Upgrade device callback function original shape-ex
 * \else
 * 升级设备程序回调-拓展
 * \endif
 */
public interface CB_fUpgradeCallBackEx {
    /**
     * \if ENGLISH_LANG
     * Upgrade device callback function original shape
     * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
     * @param lUpgradeChannel handle, return from{@link INetSDK#StartUpgrade}
     * @param nTotalSize update file total length(unit:byte)
     * @param nSendSize Sent file length(unit:byte)，when it is-1，meand update file sending ends
     * nTotalSize = 0, nSendSize = -1 Indicates Upgrade Finish
     * nTotalSize = 0, nSendSize = -2 Indicates Upgrade Failed
     * nTotalSize = 0, nSendSize = -3 User do not have permission to upgrade
     * nTotalSize = 0, nSendSize = -4 Upgrade version  too low
     * nTotalSize = -1, nSendSize = XX Indicates Upgrade Progress
     * nTotalSize = XX, nSendSize = XX Upgrade file transmission progress
     * \else
     * 升级设备程序回调函数
     * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
     * @param lUpgradeChannel {@link INetSDK#StartUpgrade}返回的升级句柄ID
     * @param nTotalSize 升级文件的总长度(单位:字节)
     * @param nSendSize 已发送的文件长度(单位:字节)，为-1时，表示发送升级文件结束
     * nTotalSize = 0, nSendSize = -1 表示升级完成
     * nTotalSize = 0, nSendSize = -2 表示升级出错
     * nTotalSize = 0, nSendSize = -3 用户没有权限升级
     * nTotalSize = 0, nSendSize = -4 升级程序版本过低
     * nTotalSize = -1, nSendSize = XX 表示升级进度
     * nTotalSize = XX, nSendSize = XX 表示升级文件发送进度
     * \endif
     */
    public void invoke(long lLoginID , long lUpgradeChannel , long nTotalSize , long nSendSize);
}
