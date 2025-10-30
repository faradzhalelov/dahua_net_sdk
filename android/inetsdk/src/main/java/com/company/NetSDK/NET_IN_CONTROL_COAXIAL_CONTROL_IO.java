package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * control coaxial control IO input, {@link INetSDK#ControlDeviceEx} port {@link CtrlType#SDK_CTRL_COAXIAL_CONTROL_IO} command parameter
 * \else
 * 发送同轴IO控制命令, 入参, {@link INetSDK#ControlDeviceEx}接口的 {@link CtrlType#SDK_CTRL_COAXIAL_CONTROL_IO}命令参数
 * \endif
 */
public class NET_IN_CONTROL_COAXIAL_CONTROL_IO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel
     * \else
     * 通道号
     * \endif
     */
    public int								nChannel;

    /**
     * \if ENGLISH_LANG
     * count of coaxial IO control info
     * \else
     * 同轴IO信息个数
     * \endif
     */
    public int								nInfoCount;

    /**
     * \if ENGLISH_LANG
     * coaxial IO control info
     * \else
     * 同轴IO信息
     * \endif
     */
    public NET_COAXIAL_CONTROL_IO_INFO[]	stInfo = new NET_COAXIAL_CONTROL_IO_INFO[FinalVar.MAX_COAXIAL_CONTROL_IO_COUNT];

    public NET_IN_CONTROL_COAXIAL_CONTROL_IO() {
        for(int i = 0; i < FinalVar.MAX_COAXIAL_CONTROL_IO_COUNT; i++) {
            stInfo[i] = new NET_COAXIAL_CONTROL_IO_INFO();
        }
    }
}
