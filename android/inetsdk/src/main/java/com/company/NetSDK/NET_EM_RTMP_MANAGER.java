package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * \else
 * RTMP推流操作类型
 * \endif
 */
public class NET_EM_RTMP_MANAGER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  获取设备RTMP推流能力, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_GETCAPS, pstOutParam = NET_OUT_RTMP_MANAGER_GETCAPS
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_GETCAPS = 0;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  添加推流地址, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_ADD, pstOutParam = NET_OUT_RTMP_MANAGER_ADD
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_ADD = 1;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  删除推流地址, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_REMOVE, pstOutParam = NET_OUT_RTMP_MANAGER_REMOVE
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_REMOVE = 2;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  启动推流, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_START, pstOutParam = NET_OUT_RTMP_MANAGER_START
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_START = 3;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  停止推流, 对应结构体 pstInParam = NET_IN_RTMP_MANAGER_STOP, pstOutParam = NET_OUT_RTMP_MANAGER_STOP
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_STOP = 4;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  暂停推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_PAUSE, pstOutParam = NET_OUT_RTMP_MANAGER_PAUSE
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_PAUSE = 5;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  恢复推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_RESUME, pstOutParam = NET_OUT_RTMP_MANAGER_RESUME
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_RESUME = 6;

    /**
     * \if ENGLISH_LANG
     *
     * \else
     *  设置倍速推流，只对回放流有效, 对应结构体 pstInparam = NET_IN_RTMP_MANAGER_SET_SPEED, pstOutParam = NET_OUT_RTMP_MANAGER_SET_SPEED
     * \endif
     */
    public static final int					NET_EM_RTMP_MANAGER_SET_SPEED = 7;

}
