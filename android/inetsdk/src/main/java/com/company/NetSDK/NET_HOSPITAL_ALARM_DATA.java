package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Medical intercom alarm, nursing task information
 * \else
 * @brief 医护对讲报警、护理任务信息
 * \endif
 */
public class NET_HOSPITAL_ALARM_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * RoomNumber
     * \else
     * 病房信息
     * \endif
     */
    public byte szRoomNumber[] = new byte[16];

    /**
     * \if ENGLISH_LANG
     * BedNumber
     * \else
     * 病床信息
     * \endif
     */
    public byte szBedNumber[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     * Device Code
     * \else
     * 发生事件的设备编号
     * \endif
     */
    public byte szDeviceCode[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Event time
     * \else
     * 事件时间
     * \endif
     */
    public int nUTC;

    /**
     * \if ENGLISH_LANG
     * The call number of the device
     * \else
     * 触发事件设备的呼叫号码
     * \endif
     */
    public byte szCallNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Door light color and mode control, 0: off, 1: red (superior care), 2: yellow (primary care), 3: blue (secondary care), 4: green (tertiary care), 5: Red flashing (one-key alarm)
     * \else
     * 门灯颜色及模式控制, 0:不亮, 1:红色(特级护理), 2:黄色(一级护理), 3:蓝色(二级护理), 4:绿色(三级护理), 5:红色闪烁(一键报警)
     * \endif
     */
    public int nLightMode;

    /**
     * \if ENGLISH_LANG
     * Whether to use szRoomNumberEx(Ward Information Extension field)
     * \else
     * 是否使用szRoomNumberEx(病房信息拓展字段)
     * \endif
     */
    public boolean bIsUsingRoomNumberEx;

    /**
     * \if ENGLISH_LANG
     * Ward Information (Expansion)
     * \else
     * 病房信息(拓展)
     * \endif
     */
    public byte szRoomNumberEx[] = new byte[64];

}