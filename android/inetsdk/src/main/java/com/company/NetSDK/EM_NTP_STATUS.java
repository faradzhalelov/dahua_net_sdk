package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP status
 * \else
 * NTP校时状态
 * \endif
 */
public class EM_NTP_STATUS implements  Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static final int NET_NTP_STATUS_UNKNOWN = 0;
    public static final int NET_NTP_STATUS_DISABLE = 1;
    public static final int NET_NTP_STATUS_SUCCESSFUL =2;
    public static final int NET_NTP_STATUS_FAILED =3;
}
