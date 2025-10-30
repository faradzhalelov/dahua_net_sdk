package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CMD_SECURITY_ALARMS_PRIVACY}
 * \else
 * 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CMD_SECURITY_ALARMS_PRIVACY}
 * \endif
 */
public class CFG_SECURITY_ALARMS_PRIVACY implements Serializable{

    private static final long serialVersionUID = -1080096967868079750L;

    /**
     * \if ENGLISH_LANG
     *  private code
     * \else
     * 隐私保护密码
     * \endif
     */
    public      byte[]      szCode      =       new byte[FinalVar.CFG_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     *  enable to protect
     * \else
     * 是否开启隐私保护
     * \endif
     */
    public      boolean     bEnable;



}
