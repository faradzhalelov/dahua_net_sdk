package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * detection collection device alarm event, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_ALARM_SCADA_DEV_ALARM}
 * \else
 * 检测采集设备报警事件, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_ALARM_SCADA_DEV_ALARM},
 * \endif
 */
public class ALARM_SCADA_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel No.
     * \else
     * 通道号
     * \endif
     */
    public int                     nChannel;

    /**
     * \if ENGLISH_LANG
     * event occur time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME                stuTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * failure device name
     * \else
     * 故障设备名称
     * \endif
     */
    public byte[]                 szDevName = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * alarm description
     * \else
     * 报警描述
     * \endif
     */
    public byte[]                 szDesc = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * -1:unknown, 0:pulse, 1:start, 2:stop
     * \else
     * -1:未知 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int                    nAction;

    /**
     * \if ENGLISH_LANG
     * point ID
     * \else
     * 点位ID
     * \endif
     */
    public byte[]                 szID = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * sensor ID
     * \else
     * 探测器ID
     * \endif
     */
    public byte[]                 szSensorID = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * device ID
     * \else
     * 设备ID
     * \endif
     */
    public byte[]                 szDevID = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * point name
     * \else
     * 点位名
     * \endif
     */
    public byte[]                 szPointName = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * 0:start, 1:stop
     * \else
     * 0:开始, 1:结束
     * \endif
     */
    public int                    nAlarmFlag;

    /**
     * \if ENGLISH_LANG
     * Device type, refer to {@link EM_ALARM_SCADA_DEV_TYPE}
     * \else
     * 设备类型, 参考 {@link EM_ALARM_SCADA_DEV_TYPE}
     * \endif
     */
    public int                    emDevType;

    /**
     * \if ENGLISH_LANG
     * Device status , refer to {@link EM_ALARM_SCADA_DEV_STATUS}
     * \else
     * 设备状态, 参考 {@link EM_ALARM_SCADA_DEV_STATUS}
     * \endif
     */
    public int                   emDevStatus;

    @Override
    public String toString() {
        return "nChannel=" + nChannel + "\n" +
                ", stuTime=" + stuTime.toString() + "\n" +
                ", szDevName=" + new String(szDevName).trim() + "\n" +
                ", szDesc=" + new String(szDesc).trim() + "\n" +
                ", nAction=" + nAction + "\n" +
                ", szID=" + new String(szID).trim() + "\n" +
                ", szSensorID=" + new String(szSensorID).trim() + "\n" +
                ", szDevID=" + new String(szDevID).trim() + "\n" +
                ", szPointName=" + new String(szPointName).trim() + "\n" +
                ", nAlarmFlag=" + nAlarmFlag +
                ", emDevType=" + emDevType +
                ", emDevStatus=" + emDevStatus;
    }
}
