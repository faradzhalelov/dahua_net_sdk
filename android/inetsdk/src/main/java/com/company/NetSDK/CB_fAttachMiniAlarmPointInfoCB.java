package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * mini Radar alarm point information callback function pointer
 * \else
 * mini雷达报警点信息回调函数指针
 * \endif
 */
public interface CB_fAttachMiniAlarmPointInfoCB {
    /**
     * \if ENGLISH_LANG
     * mini Radar alarm point information callback function
     * @param lLoginID login handle, return from {@link INetSDK#LoginEx}or{@link INetSDK#Login}
     * @param lAttachHandle return from {@link INetSDK#AttachMiniRadarAlarmPointInfo}
     * @param pBuf data info {@link NET_MINI_RADAR_NOTIFY_ALARMPOINTINFO}
     * \else
     * mini雷达报警点信息回调
     * @param lLoginID 登录句柄, {@link INetSDK#LoginEx}或者{@link INetSDK#Login}的返回值
     * @param lAttachHandle {@link INetSDK#AttachMiniRadarAlarmPointInfo}返回值
     * @param pBuf 数据信息，{@link NET_MINI_RADAR_NOTIFY_ALARMPOINTINFO }
     * \endif
     */
    public void invoke(long lLoginID, long lAttachHandle, NET_MINI_RADAR_NOTIFY_ALARMPOINTINFO pBuf, long pBufSize);
}
