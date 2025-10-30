package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm arm disarm state info
 * \else
 * alarm of area arm mode change
 * \endif
 */
/**
 * \if ENGLISH_LANG
 * Alarm of area arm mode change, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_AREAARM_MODECHANGE}
 * \else
 * 区域防区模式改变事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_AREAARM_MODECHANGE}
 * \endif
 */
public class ALARM_AREAARM_MODECHANGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Area ID
     * \else
     * 区域编号
     * \endif
     */
    public int                       nAreaIndex;

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int					      nEventID;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX			      UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Trigger mode {@link EM_AREAARM_TRIGGERMODE}
     * \else
     * 操作方式 {@link EM_AREAARM_TRIGGERMODE}
     * \endif
     */
    public int    emTriggerMode;

    /**
     * \if ENGLISH_LANG
     * user，useful when emTriggerMode = EM_AREAARM_USER_USER {@link EM_AREAARM_USER}
     * \else
     * 操作用户，仅emTriggerMode = EM_AREAARM_USER_USER时有效 {@link EM_AREAARM_USER}
     * \endif
     */
    public int           emUser;

    /**
     * \if ENGLISH_LANG
     * ID,emTriggerMode = EM_AREAARM_TRIGGERMODE_KEYPAD keypad address;emTriggerMode =EM_AREAARM_TRIGGERMODE_REMOTECONTROL remote control ID
     * \else
     * ID号,emTriggerMode = EM_AREAARM_TRIGGERMODE_KEYPAD 表示键盘地址;emTriggerMode =EM_AREAARM_TRIGGERMODE_REMOTECONTROL时表示遥控器编号
     * \endif
     */
    public int           nID;

    /**
     * \if ENGLISH_LANG
     * arm state {@link EM_ARM_STATE}
     * \else
     * 布撤防状态 {@link EM_ARM_STATE}
     * \endif
     */
    public int              emArmState;
}
