package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobileSIMInfo} emType is EM_SIMINFO_TYPE_GET_IMSI input param
 * \else
 * 获取SIM卡信息输入参数。此时{@link INetSDK#GetMobileSIMInfo}的emType参数为EM_SIMINFO_TYPE_GET_IMSI
 * \endif
 */
public class NET_IN_SIMINFO_GET_IMSI implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * wireless mode {@link EM_WIRELESS_MODE}
     * \else
     * 无线模块类型 {@link EM_WIRELESS_MODE}
     * \endif
     */
    public int        emMode;
}
