package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote collect device information caps input param, NET_REMOTE_COLLECT_DEVINFO_CAPS
 * \else
 * 远程设备信息采集能力入参,对应 NET_REMOTE_COLLECT_DEVINFO_CAPS
 * \endif
 */
public class NET_IN_REMOTE_COLLECT_DEVINFO_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 远程设备通道号,若为IPC,请填0
     * \endif
     */
    public int					nChannel;

}
