package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter, the corresponding interface {@link INetSDK#QueryDevInfo},the corresponding command {@link FinalVar#NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO}
 * \else
 * 出参, 对应接口{@link INetSDK#QueryDevInfo},对应命令 {@link FinalVar#NET_QUERY_DEV_THERMO_GRAPHY_EXTSYSINFO}
 * \endif
 */
public class NET_OUT_THERMO_GET_EXTSYSINFO implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * external system info
     * \else
     * 外部系统信息
     * \endif
     */
    public NET_THERMO_SYSINFO          stInfo = new NET_THERMO_SYSINFO();


}
