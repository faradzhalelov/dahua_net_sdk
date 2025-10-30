package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SYSTEM_INFO implements Serializable {

    /**
     *
     */
    private static final long               serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * whether system has RTC(for recording system time),TRUE:Yes,FALSE:No
     * \else
     * 是否有RTC芯片(记录系统时间用)默认TRUE,表示有RTC
     * \endif
     */
    public boolean                          bHasRTC;

    /**
     * \if ENGLISH_LANG
     * MCU number of return
     * \else
     * 返回的单片机个数
     * \endif
     */
    public int                              nRetMCUNum;

    /**
     * \if ENGLISH_LANG
     * MCU software version
     * \else
     * 单片机软件版本号
     * \endif
     */
    public byte[][]                         szMCUVersion = new byte[FinalVar.MAX_MCU_NUM][FinalVar.SDK_MAX_VERSION_LEN];
}
