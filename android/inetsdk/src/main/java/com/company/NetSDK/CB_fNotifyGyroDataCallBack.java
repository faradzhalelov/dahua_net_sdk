package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * video statistical summary callback function type, lAttachHandle is {@link INetSDK#AttachVideoStatSummary} return value
 * \else
 * 视频统计摘要信息回调函数原形，lAttachHandle 是 {@link INetSDK#AttachVideoStatSummary} 返回值
 * \endif
 */
public interface CB_fNotifyGyroDataCallBack {

    /**
     * \if ENGLISH_LANG
     * tv wall scheme tour status call function
     * @param lAttachGyroHandle return from{@link INetSDK#AttachVideoStatSummary}
     * @param pstuGyroDataInfo, video statistical summary
     * \else
     * 电视墙预案轮训状态回调函数
     * @param lAttachGyroHandle {@link INetSDK#AttachVideoStatSummary}返回值
     * @param pstuGyroDataInfo 视频统计摘要信息
     * \endif
     */
    public void invoke(long lAttachGyroHandle, NET_NOTIFY_GYRO_DATA_INFO pstuGyroDataInfo);
}
