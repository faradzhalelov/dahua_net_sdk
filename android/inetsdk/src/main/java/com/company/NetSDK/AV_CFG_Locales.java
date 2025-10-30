package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone Configuration Struction, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_LOCALS}
 * \else
 * 区域配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_LOCALS}
 * \endif
 */
public class AV_CFG_Locales implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Time format
     * \else
     * 时间格式
     * \endif
     */
    public byte[]				szTimeFormat = new byte[FinalVar.AV_CFG_Time_Format_Len];

    /**
     * \if ENGLISH_LANG
     * DST enable
     * \else
     * 夏令时时能
     * \endif
     */
    public boolean			bDSTEnable;

    /**
     * \if ENGLISH_LANG
     * DST start time
     * \else
     * 夏令时起始时间
     * \endif
     */
    public AV_CFG_DSTTime		stuDstStart = new AV_CFG_DSTTime();

    /**
     * \if ENGLISH_LANG
     * DST end time
     * \else
     * 夏令时结束时间
     * \endif
     */
    public AV_CFG_DSTTime		stuDstEnd = new AV_CFG_DSTTime();
}
