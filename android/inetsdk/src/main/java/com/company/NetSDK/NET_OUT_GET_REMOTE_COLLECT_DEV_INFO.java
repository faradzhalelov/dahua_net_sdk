package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetRemoteCollectDevInfo} output parameter
 * \else
 * 获取设备远程采集信息输出参数
 * \endif
 */
public class NET_OUT_GET_REMOTE_COLLECT_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The number of collect information
     * \else
     * 返回的信息个数
     * \endifa
     */
    public int                  nInfoNum;

    /**
     * \if ENGLISH_LANG
     * The list of collect information
     * \else
     * 采集信息列表
     * \endif
     */
    public NET_REMOTE_COLLECT_DEV_INFO    stuInfos[] = new NET_REMOTE_COLLECT_DEV_INFO[8];

    public NET_OUT_GET_REMOTE_COLLECT_DEV_INFO() {
        for (int i = 0; i < 8; i++) {
            stuInfos[i] = new NET_REMOTE_COLLECT_DEV_INFO();
        }
    }
}
