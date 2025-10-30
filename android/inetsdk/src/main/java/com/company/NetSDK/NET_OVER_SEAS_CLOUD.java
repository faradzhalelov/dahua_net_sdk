package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Overseas cloud call information
 * \else
 * @brief 海外云呼叫信息
 * \endif
 */
public class NET_OVER_SEAS_CLOUD implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device Class
     * \else
     *  可视对讲所属设备系列
     * \endif
     */
    public byte					szDeviceClass[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  Error code
     * \else
     *  错误码
     * \endif
     */
    public int					nErrorCode;

    /**
     * \if ENGLISH_LANG
     *  Long Number
     * \else
     *  呼叫长号
     * \endif
     */
    public byte					szLongNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Maximum call duration
     * \else
     *  最大通话时长
     * \endif
     */
    public int					nMaxConnectingTime;

    /**
     * \if ENGLISH_LANG
     *  Maximum message duration, not supported as 0
     * \else
     *  最大留言时长，不支持为0
     * \endif
     */
    public int					nMaxLeaveWordTime;

    /**
     * \if ENGLISH_LANG
     *  Maximum ringing duration
     * \else
     *  最大振铃时长
     * \endif
     */
    public int					nMaxRingTime;

    /**
     * \if ENGLISH_LANG
     *  Equipment serial number
     * \else
     *  设备序列号
     * \endif
     */
    public byte					szSN[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Short Number
     * \else
     *  呼叫短号
     * \endif
     */
    public byte					szShortNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Message type
     * \else
     *  留言类型，和SIP保持一致
     * \endif
     */
    public byte					szLeaveType[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     *  Video mode，SendOnly, RecvOnly, SendRecv, None
     * \else
     *  视频模式，SendOnly: 只发送, RecvOnly: 只接收, SendRecv: 同时收发, None: 既不发也不收，比如不带摄像头的门口机
     * \endif
     */
    public byte					szVideoMode[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Audio mode, SendOnly, RecvOnly, SendRecv,
     * \else
     *  音频模式, SendOnly: 只发送, RecvOnly: 只接收, SendRecv: 同时收发, 
     * \endif
     */
    public byte					szAudioMode[] = new byte[32];

}