package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * product definition info, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_PRODUCTDEFINITION}
 * \else
 * 产品定义信息, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_PRODUCTDEFINITION}
 * \endif
 */
public class CFG_PRODUCT_DEFINITION_INFO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Coaxial ALarm Count
     * \else
     * 设备支持的报警数量
     * \endif
     */
    public int						nCoaxialAlarmCount;

    /**
     * \if ENGLISH_LANG
     * Coaxial Alarm, refer to {@link EM_COAXIAL_ALARM_TYPE}
     * \else
     * 设备支持的报警, 参考 {@link EM_COAXIAL_ALARM_TYPE}
     * \endif
     */
    public int[]                emCoaxialAlarm = new int[FinalVar.MAX_COAXIAL_ALARM_COUNT];
}
