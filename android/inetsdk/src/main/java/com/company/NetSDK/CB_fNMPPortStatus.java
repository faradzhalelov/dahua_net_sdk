package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Callback function of attach nmp device port status
 * \else
 * NMP 设备端口状态订阅函数原型
 * \endif
 */
public interface CB_fNMPPortStatus {

    /**
     * \if ENGLISH_LANG
     * @param lAttachHandle Attach handle,return from{@link INetSDK#AttachNMPPortStatus}
     * @param pstNMPPortStatus,NMP port status
     * \else
     * @param lAttachHandle, 订阅句柄,{@link INetSDK#AttachNMPPortStatus}返回值
     * @param pstNMPPortStatus,端口状态信息
     * \endif
     */
    public void invoke(long lAttachHandle, NET_CB_NMP_PORT_STATUS_INFO pstNMPPortStatus);
}
