package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#ControlDevice} port {@link CtrlType#SDK_CTRL_ACCESS_CLOSE}command parameter
 * \else
 * {@link INetSDK#ControlDevice}接口的 {@link CtrlType#SDK_CTRL_ACCESS_CLOSE}命令参数
 * \endif
 */
public class NET_CTRL_ACCESS_CLOSE implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID (start from 0)
     * \else
     * 通道号(0开始)
     * \endif
     */
    public int          nChannelID;
}
