package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Alarm Bell Config
 * \else
 * 前端相机警号配置
 * \endif
 */
public class NET_CFG_REMOTE_ALARM_BELL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Alarm Out Mode, refer to {@link EM_ALARM_OUT_MODE}
     * \else
     * 报警输出模式, 参考 {@link EM_ALARM_OUT_MODE}
     * \endif
     */
    public int							emMode;
}
