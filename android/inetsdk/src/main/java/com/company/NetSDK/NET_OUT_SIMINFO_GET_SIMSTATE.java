package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobileSIMInfo} emType is EM_SIMINFO_TYPE_GET_SIMState output param
 * \else
 * 获取SIM卡信息输出参数。此时{@link INetSDK#GetMobileSIMInfo}的emType参数为EM_SIMINFO_TYPE_GET_SIMState
 * \endif
 */
public class NET_OUT_SIMINFO_GET_SIMSTATE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * SIM State mode {@link EM_SIMSTATE_MODE}
     * \else
     * SIM卡状态类型 {@link EM_SIMSTATE_MODE}
     * \endif
     */
    public int        emMode;
}
