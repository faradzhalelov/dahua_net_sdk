package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * radiometry temper data state callback function
 * \else
 * 订阅人群分布图实时统计信息回调函数原型
 * \endif
 */
public interface CB_fCrowdDistriStream {

    /**
     * \if ENGLISH_LANG
     * callback function of attach crowd distri map
     * @param lAttachHandle return from{@link INetSDK#AttachCrowdDistriMap}
     * @param pstResult {@link NET_CB_CROWD_DISTRI_STREAM_INFO} call back info of attach crowd distri map
     * \else
     * 订阅人群分布图实时统计信息回调函数原型
     * @param lAttachHandle {@link INetSDK#AttachCrowdDistriMap}返回值
     * @param pstResult {@link NET_CB_CROWD_DISTRI_STREAM_INFO} 订阅人群分布图实时统回调信息
     * \endif
     */
    public void invoke(long lAttachHandle, NET_CB_CROWD_DISTRI_STREAM_INFO pstResult);
}
