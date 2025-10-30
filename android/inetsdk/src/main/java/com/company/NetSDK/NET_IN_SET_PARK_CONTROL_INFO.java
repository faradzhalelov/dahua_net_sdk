package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Set parking control information(Control of dot matrix screen and voice broadcast) CLIENT_ControlDeviceEx in parameters (corresponding to SDK_CTRL_SET_PARK_CONTROL_INFO )
 * \else
 * 设置停车控制信息(点阵屏和语音播报的控制) CLIENT_ControlDeviceEx入参(对应 SDK_CTRL_SET_PARK_CONTROL_INFO )
 * \endif
 */
public class NET_IN_SET_PARK_CONTROL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of screen control information
     * \else
     *  屏幕信息个数
     * \endif
     */
    public int					nScreenShowInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Screen control information
     * \else
     *  屏幕信息
     * \endif
     */
    public NET_SCREEN_SHOW_INFO					stuScreenShowInfo[] = new NET_SCREEN_SHOW_INFO[16];

    /**
     * \if ENGLISH_LANG
     *  Number of broadcast control information
     * \else
     *  播报信息个数
     * \endif
     */
    public int					nBroadcastInfoNum;

    /**
     * \if ENGLISH_LANG
     *  Broadcast control information
     * \else
     *  播报信息
     * \endif
     */
    public NET_BROADCAST_INFO					stuBroadcastInfo[] = new NET_BROADCAST_INFO[16];

    public NET_IN_SET_PARK_CONTROL_INFO() {
        for(int i = 0; i < 16; i ++){
            stuScreenShowInfo[i] = new NET_SCREEN_SHOW_INFO();
            stuBroadcastInfo[i] = new NET_BROADCAST_INFO();
        }
    }
}
