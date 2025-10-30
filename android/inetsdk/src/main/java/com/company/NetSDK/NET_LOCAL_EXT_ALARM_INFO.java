package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Local ext alarm info
 * \else
 * 报警盒子配置
 * \endif
 */
public class NET_LOCAL_EXT_ALARM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable
     * \else
     * 使能开关
     * \endif
     */
    public boolean				  bEnable;

    /**
     * \if ENGLISH_LANG
     * Name
     * \else
     * 报警通道名称
     * \endif
     */
    public byte[]				     szName = new byte[FinalVar.MAX_LOCAL_EXT_ALARM_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Sensor type, refer to {@link EM_SENSOR_TYPE}
     * \else
     * 传感器类型 , 参考{@link EM_SENSOR_TYPE}
     * \endif
     */
    public int		                 emSensorType;

    /**
     * \if ENGLISH_LANG
     * Event handler
     * \else
     * 报警联动
     * \endif
     */
    public NET_CFG_ALARM_MSG_HANDLE  stuEventHandler = new NET_CFG_ALARM_MSG_HANDLE();
}
