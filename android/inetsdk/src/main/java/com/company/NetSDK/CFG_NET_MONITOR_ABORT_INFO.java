package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  Net Monitor Abort Config
 * \else
 * 网络预览中断事件配置
 * \endif
 */
public class CFG_NET_MONITOR_ABORT_INFO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable,true means on;false means off,default
     * \else
     * 使能开关
     * \endif
     */
    public boolean	                bEnable;

    /**
     * \if ENGLISH_LANG
     * Alarm activation
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE		stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    @Override
    public String toString() {
        return "CFG_NET_MONITOR_ABORT_INFO{" +
                "bEnable=" + bEnable +
                ", stuEventHandler=" + stuEventHandler +
                '}';
    }
}
