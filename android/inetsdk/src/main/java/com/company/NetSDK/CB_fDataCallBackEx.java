package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Prototype of playback data callback function (extended)
 * \else
 * 回放数据回调函数原形(拓展)
 * \endif
 */
public interface CB_fDataCallBackEx {
    /**
     * \if ENGLISH_LANG
     * Playback data callback function original shape
     * @param lPlayHandle handle, return from {@link INetSDK#PlayBackByRecordFileEx}
     * @param pDataCallBack extended playback data
     * \else
     * 回放数据回调函数
     * @param lPlayHandle 句柄, {@link INetSDK#PlayBackByRecordFileEx}的返回值
     * @param pDataCallBack 拓展回放数据
     * \endif
     */
    public int invoke(long lPlayHandle, NET_DATA_CALL_BACK_INFO pDataCallBack);
}
