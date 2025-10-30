package com.company.NetSDK;
import java.io.Serializable;

// 对讲方向
public class EM_TALK_DIRECTION implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // 未知
    public static final int EM_TALK_DIRECTION_UNKNOWN = 0;

    // 单向对讲，包括喊话：客户端到设备
    public static final int EM_TALK_DIRECTION_UNI = 1;

    // 双向对讲
    public static final int EM_TALK_DIRECTION_BILATERAL = 2;

    // 单向监听：设备到客户端
    public static final int EM_TALK_DIRECTION_LISTEN = 3;

}
