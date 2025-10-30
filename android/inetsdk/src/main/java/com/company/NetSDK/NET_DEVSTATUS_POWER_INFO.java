package com.company.NetSDK;
import java.io.Serializable;

public class NET_DEVSTATUS_POWER_INFO implements
        Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Battery Percent (0~100)
     * \else
     * 电池电量百分比,0~100
     * \endif
     */
    public int          nBatteryPercent;

    /**
     * \if ENGLISH_LANG
     * Battery Percent (0~100)
     * \else
     * POWER TYPE
     * \endif
     */
    public int	         emPowerType;
}
