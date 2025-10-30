package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief event of deivce upgrade
 * \else
 * @brief 设备升级状态事件
 * \endif
 */
public class ALARM_UPGRADE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG  refer to {@link EM_UPGRADE_STATE}
     *  uprade package and uprade state
     * \else
     *  升级包和升级状态  取值参考 {@link EM_UPGRADE_STATE}
     * \endif
     */
    public int					emState;

    /**
     * \if ENGLISH_LANG
     *  upgrade progress, 0 ~ 100
     * \else
     *  升级进度, 0 ~ 100
     * \endif
     */
    public int					nProgress;

    /**
     * \if ENGLISH_LANG
     *  upgrading file name
     * \else
     *  正在操作的文件名
     * \endif
     */
    public byte					szFileName[] = new byte[FinalVar.SDK_COMMON_STRING_64];

}