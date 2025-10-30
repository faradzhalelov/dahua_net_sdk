package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#AttachMonitorWallScene} input parameter
 * \else
 *  接口 {@link INetSDK#AttachMonitorWallScene} 接口输入参数
 * \endif
 */
public class NET_IN_ATTACH_MONITOR_WALL_SCENE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Monitor wall ID
     * \else
     * 电视墙ID
     * \endif
     */
    public int              nMonitorWallID;
    /**
     * \if ENGLISH_LANG
     * Monitoy wall scene call back
     * \else
     * 电视墙场景订阅回调函数
     * \endif
     */
    public CB_fMonitorWallScene   cbMonitorWallScene;
}
