package com.company.NetSDK;

import java.io.Serializable;
public class NET_STATUS_INFO implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  配件序列号
     * \endif
     */
    public byte                     szSN[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  电池电量百分比,0~100
     * \endif
     */
    public int                      nPercent;

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  电池电量百分比,0~100
     * \endif
     */
    public float                    fVolt;

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  无线信号强度等级，0~5
     * \endif
     */
    public int                      nIntensity;

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  无线信号强度，单位dbm，0~120
     * \endif
     */
    public int                      nSignal;

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  配件防拆状态
     * \endif
     */
    public int                      emAccessoryTamperState;//NET_EM_ACCESSORY_TAMPER_STATE

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  门磁开门状态
     * \endif
     */
    public int                      emDoorState;//NET_EM_DOOR_STATE

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  配件名称
     * \endif
     */
    public byte                     szName[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  在线状态
     * \endif
     */
    public int                      emOnlineState;//NET_EM_ONLINE_STATE

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  告警状态,仅对门磁、水浸等状态量报警有效；对红外灯脉冲报警无效
     * \endif
     */
    public int                      emAlarmState;//NET_EM_ALARM_STATE

    /**
     * \if ENGLISH_LANG
     * num of status info arr
     * \else
     *  配件版本
     * \endif
     */
    public byte                     szVersion[] = new byte[FinalVar.SDK_COMMON_STRING_16];
}
