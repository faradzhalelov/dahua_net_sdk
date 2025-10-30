package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/26.
 */
public class NET_OUT_EXALARMBOX_CAPS implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * alarm in count supported
     * \else
     * 支持的报警输入路数
     * \endif
     */
    public int								nAlarmIn;
    /**
     * \if ENGLISH_LANG
     * alarm out count supported
     * \else
     * 支持的报警输出路数
     * \endif
     */
    public int									nAlarmOut;

    /**
     * \if ENGLISH_LANG
     * remote control count supported
     * \else
     * 支持的遥控器路数
     * \endif
     */
    public int								nRemoteControl;
}
