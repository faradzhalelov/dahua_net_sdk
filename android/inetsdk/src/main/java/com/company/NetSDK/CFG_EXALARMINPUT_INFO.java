package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension module alarm input configuration
 * \else
 * 扩展模块报警输入配置
 * \endif
 */
public class CFG_EXALARMINPUT_INFO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Alarm input parameters
     * \else
     * 报警输入参数
     * \endif
     */
    public CFG_ALARMIN_INFO		stuAlarmIn = new CFG_ALARMIN_INFO();

    @Override
    public String toString() {
        return "CFG_EXALARMINPUT_INFO{" +
                "stuAlarmIn=" + stuAlarmIn +
                '}';
    }
}
