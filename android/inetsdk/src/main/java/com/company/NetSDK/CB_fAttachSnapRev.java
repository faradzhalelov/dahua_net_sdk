package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Callback function of attach snap
 * \else
 * 订阅抓图回调函数原形
 * \endif
 */
public interface CB_fAttachSnapRev {

    /**
     * \if ENGLISH_LANG
     * @param lAttchHandle Attach snap handle,return from{@link INetSDK#AttachSnap}
     * @param pstAttachCbInfo, CallbackInfo
     * \else
     * @param lAttchHandle, 订阅抓包句柄,传参{@link INetSDK#AttachSnap}
     * @param pstAttachCbInfo, 回调数据
     * \endif
     */
     void invoke(long lAttchHandle, NET_CB_ATTACH_SNAP_INFO pstAttachCbInfo);
}
