package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote upgrade state
 * \else
 * 远程设备升级状态
 * \endif
 */
public class NET_REMOTE_UPGRADER_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * State,refer to {@Link EM_REMOTE_UPGRADE_STATE}
     * \else
     * 状态,参考{@Link EM_REMOTE_UPGRADE_STATE}
     * \endif
     */
    public int                       emState;

    /**
     * \if ENGLISH_LANG
     * State
     * \else
     * 进度
     * \endif
     */
    public int                       nProgress;

    /**
     * \if ENGLISH_LANG
     * device remote ID，last number means channel
     * \else
     * 设备远程ID,ID最后的数字表示通道号
     * \endif
     */
    public byte                 szDeviceID[] = new byte[128];
}
