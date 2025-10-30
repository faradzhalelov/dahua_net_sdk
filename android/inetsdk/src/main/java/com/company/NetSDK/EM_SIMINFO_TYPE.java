package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Type of SIM info
 * \else
 * SIM卡信息类型
 * \endif
 */
public class EM_SIMINFO_TYPE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Get IMSI	{@link INetSDK#GetMobileSIMInfo}:(pstuInParam: {@link NET_IN_SIMINFO_GET_IMSI}    pstuOutParam: {@link NET_OUT_SIMINFO_GET_IMSI} )
     * \else
     * 获取IMSI，此时{@link INetSDK#GetMobileSIMInfo}接口中的pstuInParam类型为 {@link NET_IN_SIMINFO_GET_IMSI}， pstuOutParam类型为 {@link NET_OUT_SIMINFO_GET_IMSI}
     * \endif
     */
    public static final int EM_SIMINFO_TYPE_GET_IMSI = 0;

    /**
     * \if ENGLISH_LANG
     *  Get SIM State {@link INetSDK#GetMobileSIMInfo}:(pstuInParam: {@link NET_IN_SIMINFO_GET_SIMSTATE}  pstuOutParam: {@link NET_OUT_SIMINFO_GET_SIMSTATE} )
     * \else
     * 获取SIM卡状态，此时{@link INetSDK#GetMobileSIMInfo}接口中的pstuInParam类型为{@link NET_IN_SIMINFO_GET_SIMSTATE}， pstuOutParam类型为{@link NET_OUT_SIMINFO_GET_SIMSTATE}
     * \endif
     */
    public static final int EM_SIMINFO_TYPE_GET_SIMState = 1;
}
