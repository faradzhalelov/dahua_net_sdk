package com.company.NetSDK;

import java.io.Serializable;

// 配件防拆状态
public class NET_EM_ACCESSORY_TAMPER_STATE implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final int NET_EM_ACCESSORY_TAMPER_UNKNOWN   = 0;
    public static final int NET_EM_ACCESSORY_TAMPER_ON   = 1;
    public static final int NET_EM_ACCESSORY_TAMPER_OFF   = 2;
}
