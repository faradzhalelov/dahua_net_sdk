package com.company.NetSDK;
import java.io.Serializable;

public class NET_EM_TAMPER_STATE implements Serializable{
    private static final long serialVersionUID = 1L;

    public static final int NET_EM_TAMPER_UNKNOWN = -1;
    public static final int NET_EM_TAMPER_NOALARM = 0;
    public static final int NET_EM_TAMPER_ALARMING = 1;
}
