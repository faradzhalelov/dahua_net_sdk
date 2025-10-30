package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * RTMP Streaming operation type
 * \else
 * RTMP推流操作类型
 * \endif
 */
public class NET_EM_RTMP_MANAGER_OPER_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Obtain RTMP streaming capability of the device, Corresponding structure pstInParam = NET_IN_RTMP_MANAGER_GETCAPS, pstOutParam = NET_OUT_RTMP_MANAGER_GETCAPS
     * \else
     *  获取设备RTMP推流能力, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_GETCAPS, pstOutParam = NET_OUT_RTMP_MANAGER_GETCAPS
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_GETCAPS = 0;

    /**
     * \if ENGLISH_LANG
     *  Add streaming address, Corresponding structure pstInParam = NET_IN_RTMP_MANAGER_ADD, pstOutParam = NET_OUT_RTMP_MANAGER_ADD
     * \else
     *  添加推流地址, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_ADD, pstOutParam = NET_OUT_RTMP_MANAGER_ADD
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_ADD = 1;

    /**
     * \if ENGLISH_LANG
     *  Remove streaming address, Corresponding structure pstInParam = NET_IN_RTMP_MANAGER_REMOVE, pstOutParam = NET_OUT_RTMP_MANAGER_REMOVE
     * \else
     *  删除推流地址, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_REMOVE, pstOutParam = NET_OUT_RTMP_MANAGER_REMOVE
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_REMOVE = 2;

    /**
     * \if ENGLISH_LANG
     *  Start streaming, Corresponding structure pstInParam = NET_IN_RTMP_MANAGER_START, pstOutParam = NET_OUT_RTMP_MANAGER_START
     * \else
     *  启动推流, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_START, pstOutParam = NET_OUT_RTMP_MANAGER_START
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_START = 3;

    /**
     * \if ENGLISH_LANG
     *  Stop streaming, Corresponding structure pstInParam = NET_IN_RTMP_MANAGER_STOP, pstOutParam = NET_OUT_RTMP_MANAGER_STOP
     * \else
     *  停止推流, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_STOP, pstOutParam = NET_OUT_RTMP_MANAGER_STOP
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_STOP = 4;

    /**
     * \if ENGLISH_LANG
     *  Pause streaming, which is only valid for playback streams, Corresponding structure pstInparam = NET_IN_RTMP_MANAGER_PAUSE, pstOutParam = NET_OUT_RTMP_MANAGER_PAUSE
     * \else
     *  暂停推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_PAUSE, pstOutParam = NET_OUT_RTMP_MANAGER_PAUSE
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_PAUSE = 5;

    /**
     * \if ENGLISH_LANG
     *  Resume streaming, which is only valid for playback streams, Corresponding structure pstInparam = NET_IN_RTMP_MANAGER_RESUME, pstOutParam = NET_OUT_RTMP_MANAGER_RESUME
     * \else
     *  恢复推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_RESUME, pstOutParam = NET_OUT_RTMP_MANAGER_RESUME
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_RESUME = 6;

    /**
     * \if ENGLISH_LANG
     *  Set the double speed push stream, which is only valid for playback stream, Corresponding structure pstInparam = NET_IN_RTMP_MANAGER_SET_SPEED, pstOutParam = NET_OUT_RTMP_MANAGER_SET_SPEED
     * \else
     *  设置倍速推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_SET_SPEED, pstOutParam = NET_OUT_RTMP_MANAGER_SET_SPEED
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_OPER_TYPE_SET_SPEED = 7;

}
