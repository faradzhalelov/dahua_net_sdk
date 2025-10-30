package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Downward subscription changes
 * \else
 * 下行订阅变化
 * \endif
 */
public interface fNotifyEventVideoTalk {
    /**
     * \if ENGLISH_LANG
     * callback function
     * @param lAttchHandle lAttachRecalHandle Subscription handle, return from {@link INetSDK#AttachVideoTalk2Cloud}
     * @param pstuNotifyInfo information
     * @param dwUser user information
     * \else
     * 回调函数
     * @param lAttchHandle 订阅句柄
     * @param pstuNotifyInfo 信息
     * @param dwUser 用户信息
     * \endif
     */
   public  void invoke(long lAttchHandle, NET_NOTIFY_EVENT_VIDEO_TALK pstuNotifyInfo, long dwUser);
}
