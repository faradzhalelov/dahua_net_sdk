package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Lower matrix information, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LOCAL_EXT_ALARM}
 * \else
 * 本地扩展报警配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LOCAL_EXT_ALARM}
 * \endif
 */
public class CFG_LOCAL_EXT_ALARME_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 使能
     * \endif
     */
    public boolean                bEnable;

    /**
     * \if ENGLISH_LANG
     * sensor type
     * \else
     * 传感器类型 0,常闭 1,常开
     * \endif
     */
    public int                     nSensorType;

    /**
     * \if ENGLISH_LANG
     * alarm name
     * \else
     * 报警名称
     * \endif
     */
    public byte                    szAlarmChannelName[] = new byte[FinalVar.CFG_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * event handler
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE    stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    @Override
    public String toString() {
        return "CFG_LOCAL_EXT_ALARME_INFO{" +
                "bEnable=" + bEnable +
                ", nSensorType=" + nSensorType +
                ", szAlarmChannelName=" + Arrays.toString(szAlarmChannelName) +
                ", stuEventHandler=" + stuEventHandler +
                '}';
    }
}
