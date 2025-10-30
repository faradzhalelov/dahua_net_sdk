package com.company.NetSDK;

import java.io.Serializable;
// 在线状态
public class NET_EM_ONLINE_STATE implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final int NET_EM_ONLINE_STATE_UNKNOWN   = 0;
    public static final int NET_EM_ONLINE_STATE_OFFLINE   = 1;
    public static final int NET_EM_ONLINE_STATE_ONLINE   = 2;
}
