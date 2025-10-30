package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * AttachStatusRTMPManager CallBack function,refer to {@link INetSDK.AttachStatusRTMPManager}
 * \else
 * AttachStatusRTMPManager 入参的回调函数,参考{@link INetSDK.AttachStatusRTMPManager}
 * \endif
 */
public interface CB_fRTMPAttachStatusCallBack {

    /**
     * \if ENGLISH_LANG
     * CLIENT_AttachStatusRTMPManager CallBack function
     * @param lLoginID  Login handle
     * @param pstState,refer to {@link NET_CB_RTMP_STATUS_INFO}
     * \else
     * CLIENT_AttachStatusRTMPManager 入参的回调函数
     * @param lLoginID , 登录句柄
     * @param pstState,参考 {@link NET_CB_RTMP_STATUS_INFO}
     * \endif
     */
    public int invoke(long lLoginID, NET_CB_RTMP_STATUS_INFO pstState);
}
