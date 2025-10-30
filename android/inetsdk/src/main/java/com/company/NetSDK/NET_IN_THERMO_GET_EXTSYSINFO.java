package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO}
 * \else
 * 入参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO}
 * \endif
 */
public class NET_IN_THERMO_GET_EXTSYSINFO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int      nChannel;
}
