package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Monitor wall scene callback function
 * \else
 * 电视墙场景订阅回调函数
 * \endif
 */
public interface CB_fMonitorWallScene {

    /**
     * \if ENGLISH_LANG
     * Monitor wall scene callback function
     * @param lAttachHandle return from{@link INetSDK#AttachMonitorWallScene}
     * @param pstResult,call back info
     * \else
     * 电视墙场景订阅回调函数
     * @param lAttachHandle {@link INetSDK#AttachMonitorWallScene}返回值
     * @param pstResult,回调信息
     * \endif
     */
    public void invoke(long lAttachHandle, NET_CB_MONITOR_WALL_SCENE pstResult);
}
