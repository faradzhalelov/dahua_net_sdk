package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Extension module alarm output configuration , the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_EXALARMOUTPUT}
 * \else
 * 扩展模块报警输出配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_EXALARMOUTPUT}
 * \endif
 */
public class CFG_EXALARMOUTPUT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Alarm channel name
     * \else
     * 报警通道名称
     * \endif
     */
    public byte[]		szChnName = new byte[FinalVar.MAX_CHANNELNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Output mode, 0 - automatic alarm 1 - Forced Alarm 2 - Turn off the alarm
     * \else
     * 输出模式, 0-自动报警, 1-强制报警, 2-关闭报警
     * \endif
     */
    public int			nOutputMode;
}
