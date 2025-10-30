package com.company.NetSDK;

import java.io.Serializable;

// 告警状态
public class NET_EM_ALARM_STATE implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final int NET_EM_ALARM_STATE_UNKNOWN   = -1;
    public static final int NET_EM_ALARM_STATE_NORMAL   = 0;
    public static final int NET_EM_ALARM_STATE_ALARM   = 1;

}
