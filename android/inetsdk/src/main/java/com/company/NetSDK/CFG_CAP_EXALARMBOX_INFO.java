package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension module alarm box capability sets, the corresponding interface {@link INetSDK#QueryNewSystemInfo},the corresponding command {@link FinalVar#CFG_CAP_CMD_EXALARMBOX}
 * \else
 * 获取扩展报警盒能力集, 对应接口{@link INetSDK#QueryNewSystemInfo},对应命令 {@link FinalVar#CFG_CAP_CMD_EXALARMBOX}
 * \endif
 */
public class CFG_CAP_EXALARMBOX_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Input the number of extension alarm module
     * \else
     * 扩展报警模块输入个数
     * \endif
     */
    public int                  nAlarmInCount;

    /**
     * \if ENGLISH_LANG
     * Output the number of extension alarm module
     * \else
     * 扩展报警模块输出个数
     * \endif
     */
    public int                  nAlarmOutCount;
}
