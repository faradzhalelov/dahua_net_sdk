package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetMobileSIMInfo} emType is EM_SIMINFO_TYPE_GET_IMSI output param
 * \else
 * 获取SIM卡信息输出参数。此时{@link INetSDK#GetMobileSIMInfo}的emType参数为EM_SIMINFO_TYPE_GET_IMSI
 * \endif
 */
public class NET_OUT_SIMINFO_GET_IMSI implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * IMSI
     * \else
     * IMSI值
     * \endif
     */
    public byte[]        szIMSI = new byte[FinalVar.MAX_IMSI_LEN];

    /**
     * \if ENGLISH_LANG
     * IMSI
     * \else
     * ICCID号
     * \endif
     */
    public byte[]        szICCID = new byte[FinalVar.MAX_ICCID_LEN];
}
