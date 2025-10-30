package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * realtime snapshot (manual snapshot) input parameter, corresponding to command {@link CtrlType#SDK_CTRL_SNAP_MNG_SNAP_SHOT}
 * \else
 * 即时抓图(又名手动抓图)入参, 对应命令 {@link CtrlType#SDK_CTRL_SNAP_MNG_SNAP_SHOT}
 * \endif
 */
public class NET_IN_SNAP_MNG_SHOT implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int             nChannel;

    /**
     * \if ENGLISH_LANG
     * continuous snapshot times, 0 means stopping snapshot, positive number means the number of continuous snapshot
     * \else
     * 连拍次数, 0表示停止抓拍,正数表示连续抓拍的张数
     * \endif
     */
    public int             nTime;

}
