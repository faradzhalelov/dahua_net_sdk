package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RainBrush config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_RAINBRUSHMODE}
 * \else
 * 雨刷模式相关配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig}, 对应命令{@link FinalVar#CFG_CMD_RAINBRUSHMODE}
 * \endif
 */
public class CFG_RAINBRUSHMODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * RainBrush working mode, refer to {@link EM_CFG_RAINBRUSHMODE_MODE}
     * \else
     * 雨刷工作模式, 参考{@link EM_CFG_RAINBRUSHMODE_MODE}
     * \endif
     */
    public int                       emMode;

    /**
     * \if ENGLISH_LANG
     * RainBrush voltage enable mode, refer to {@link EM_CFG_RAINBRUSHMODE_ENABLEMODE}
     * \else
     * 雨刷使能电平模式, 参考{@link EM_CFG_RAINBRUSHMODE_ENABLEMODE}
     * \endif
     */
    public int                      emEnableMode;

    /**
     * \if ENGLISH_LANG
     * I/O port used by RainBrush,-1:no device found,-2:Invalid(device may not offer)
     * \else
     * 雨刷使用的IO端口,-1表示未接入设备,-2表示该字段无效（设备未传送该字段）
     * \endif
     */
    public int                             nPort;

    /**
     * \if ENGLISH_LANG
     * RainBrush Sensitivity, Only when mode is auto is valid, range[0, 10]
     * \else
     * 雨刷灵敏度, 只有当mode为Auto时有效, 范围[0, 10]
     * \endif
     */
    public int								nSensitivity;
}
