package com.company.NetSDK;

import com.company.NetSDK.NET_ALARM_MSG_HANDLE;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * coaxial local alaram config
 * \else
 *  CVI 外部报警信息
 * \endif
 */
public class NET_CFG_COAXIAL_ALARMLOCAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Enable
     * \else
     *  使能
     * \endif
     */
    public boolean							bEnable;

    /**
     * \if ENGLISH_LANG
     * channel name
     * \else
     * 报警通道名
     * \endif
     */
    public char			szName[] = new char[FinalVar.MAX_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * The sense method, refer to {@link EM_CODEID_SENSE_METHOD_TYPE}
     * \else
     * 传感器方式, 取值参考 {@link EM_CODEID_SENSE_METHOD_TYPE}
     * \endif
     */
    public int	emSenseMethod;


    public NET_ALARM_MSG_HANDLE stuEventHandler = new NET_ALARM_MSG_HANDLE();		// 事件联动信息

    /**
     * \if ENGLISH_LANG
     * Reserved byte
     * \else
     * 保留字节
     * \endif
     */
    public byte[]					byReserved = new byte[1024];
}
