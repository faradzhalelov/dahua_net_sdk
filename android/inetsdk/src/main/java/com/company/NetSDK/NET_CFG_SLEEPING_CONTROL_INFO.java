package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Hibernation policy configuration, Corresponding enumeration {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_SLEEPING_CONTROL}
 * \else
 * @brief 休眠策略配置, 对应枚举 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_SLEEPING_CONTROL}
 * \endif
 */
public class NET_CFG_SLEEPING_CONTROL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  enbale, TRUE:effective FALSE:inoperative
     * \else
     *  是否生效TRUE-生效，FALSE-不生效
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  low power mode,{@link EM_SLEEPING_CONTRONL_MODE}
     * \else
     *  低功耗模式,{@link EM_SLEEPING_CONTRONL_MODE}
     * \endif
     */
    public int					emMode;

    /**
     * \if ENGLISH_LANG
     *  head linkage action break return time,uint second
     * \else
     *  云台联动动作打断归位时间 单位秒
     * \endif
     */
    public int					nAutoHomingTime;

    /**
     * \if ENGLISH_LANG
     *  Automatic control information, valid when Mode is AutoCtrl. It determines whether to sleep based on vehicle voltage
     * \else
     *  自动控制信息, Mode为AutoCtrl时有效，根据设备电压判断是否休眠
     * \endif
     */
    public NET_SLEEPING_CONTROL_AUTO_CTRL					stuAutoCtrl = new NET_SLEEPING_CONTROL_AUTO_CTRL();

    /**
     * \if ENGLISH_LANG
     *  Information about timed wake-up function for low power devices
     * \else
     *  低功耗设备定时唤醒功能
     * \endif
     */
    public NET_SLEEPING_CONTROL_TIME_WAKEUP					stuTimingWakeUp = new NET_SLEEPING_CONTROL_TIME_WAKEUP();

}