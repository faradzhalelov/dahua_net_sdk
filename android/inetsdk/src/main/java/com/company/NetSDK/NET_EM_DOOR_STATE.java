package com.company.NetSDK;

import java.io.Serializable;

// 门磁开门状态
public class NET_EM_DOOR_STATE implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final int NET_EM_DOOR_STATE_UNKNOWN   = 0;
    public static final int NET_EM_DOOR_STATE_ON   = 1;
    public static final int NET_EM_DOOR_STATE_OFF   = 2;
}
