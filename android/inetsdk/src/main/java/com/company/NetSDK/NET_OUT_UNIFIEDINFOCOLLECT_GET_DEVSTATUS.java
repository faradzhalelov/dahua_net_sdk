package com.company.NetSDK;
import java.io.Serializable;
/**
 * Created by 29875 on 2019/4/9.
 */

public class NET_OUT_UNIFIEDINFOCOLLECT_GET_DEVSTATUS implements
        Serializable{

    private static final long serialVersionUID = 1L;

    public NET_DEVSTATUS_POWER_INFO		 stuPowerInfo = new NET_DEVSTATUS_POWER_INFO();

    public NET_DEVSTATUS_NET_INFO           stuNetInfo = new NET_DEVSTATUS_NET_INFO();

    public byte[]              szVersion = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Tamper State, refer to {@link NET_EM_TAMPER_STATE}
     * \else
     * 主机防拆状态,取值参考 {@link NET_EM_TAMPER_STATE}
     * \endif
     */
    public int                     emTamperState;
}
