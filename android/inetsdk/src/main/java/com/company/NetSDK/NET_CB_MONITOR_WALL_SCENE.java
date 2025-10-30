package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Monitor wall scene call back info
 * \else
 * 电视墙场景回调信息
 * \endif
 */
public class NET_CB_MONITOR_WALL_SCENE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Current collection name
     * \else
     * 当前预案名称
     * \endif
     */
    public byte[]					szCurrentCollectionName = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Monitor wall scene
     * \else
     * 电视墙场景
     * \endif
     */
    public SDK_MONITORWALL_SCENE				stuScene;

    // splitSceneCount:拼接屏场景数组大小; blockCount:显示区块数组大小; OutputCount:显示单元数组大小; windowCount:窗口信息数组大小
    public NET_CB_MONITOR_WALL_SCENE(int splitSceneCount, int blockCount, int OutputCount, int windowCount, int videoInputCount) {
        stuScene = new SDK_MONITORWALL_SCENE(splitSceneCount, blockCount, OutputCount, windowCount, videoInputCount);
    }
}
