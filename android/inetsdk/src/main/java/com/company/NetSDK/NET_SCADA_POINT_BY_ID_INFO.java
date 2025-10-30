package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * spot info(queried by device id, sensor id)
 * \else
 * 点位信息(通过设备、传感器点位获取)
 * \endif
 */
public class NET_SCADA_POINT_BY_ID_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * spot type, refer to {@link EM_NET_SCADA_POINT_TYPE}
     * \else
     * 点位类型, 参考 {@link EM_NET_SCADA_POINT_TYPE}
     * \endif
     */
    public int                      emType;

    /**
     * \if ENGLISH_LANG
     * ID
     * \else
     * 监测点位ID
     * \endif
     */
    public byte[]                  szID = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * measured value, valid if spot type is YX
     * \else
     * 点位类型为YX时有效
     * \endif
     */
    public int                     nMeasuredVal;

    /**
     * \if ENGLISH_LANG
     * measured value, valid if spot type is YC
     * \else
     * 点位类型为YC时有效
     * \endif
     */
    public float                   fMeasureVal;

    /**
     * \if ENGLISH_LANG
     * setup value, valid if spot type is YK
     * \else
     * 点位类型为YK时有效
     * \endif
     */
    public int                     nSetupVal;

    /**
     * \if ENGLISH_LANG
     * setup value, valid if spot type is YT
     * \else
     * 点位类型为YT时有效
     * \endif
     */
    public float                   fSetupVal;

    /**
     * \if ENGLISH_LANG
     * data status, -1:unknown, 0:normal, 1:alarm level1, 2:alarm level2, 3:alarm level3, 4:alarm level4, 5:operation event, 6:invalid data
     * \else
     * 数据状态, -1:未知, 0:正常, 1:1级告警, 2:2级告警, 3:3级告警, 4:4级告警, 5:操作事件, 6:无效数据
     * \endif
     */
    public int                     nStatus;

    /**
     * \if ENGLISH_LANG
     * collect time
     * \else
     * 记录时间
     * \endif
     */
    public NET_TIME                stuTime = new NET_TIME();

    @Override
    public String toString() {
        return "emType=" + emType + "\n" +
                ", szID=" + new String(szID).trim() + "\n" +
                ", nMeasuredVal=" + nMeasuredVal + "\n" +
                ", fMeasureVal=" + fMeasureVal + "\n" +
                ", nSetupVal=" + nSetupVal + "\n" +
                ", fSetupVal=" + fSetupVal + "\n" +
                ", nStatus=" + nStatus + "\n" +
                ", stuTime=" + stuTime.toString();
    }
}
