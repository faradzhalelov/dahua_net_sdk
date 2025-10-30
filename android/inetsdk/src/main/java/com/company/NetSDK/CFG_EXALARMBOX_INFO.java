package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * cExtension module alarm box configured, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_EXALARMBOX}
 * \else
 * 扩展模块报警盒配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_EXALARMBOX}
 * \endif
 */
public class CFG_EXALARMBOX_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Enable switch
     * \else
     * 使能开关
     * \endif
     */
    public boolean			bEnable;

    /**
     * \if ENGLISH_LANG
     * Name of Agreement
     * \else
     * 协议名称
     * \endif
     */
    public byte[]			szProtocolName = new byte[FinalVar.MAX_PROTOCOL_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Use the serial port number
     * \else
     * 使用的串口端口号
     * \endif
     */
    public int				nPort;

    /**
     * \if ENGLISH_LANG
     * Device address
     * \else
     * 设备地址
     * \endif
     */
    public int				nAddress;

    /**
     * \if ENGLISH_LANG
     * Serial Property
     * \else
     * 串口属性
     * \endif
     */
    public CFG_COMM_PROP	stuCommAttr = new CFG_COMM_PROP();
}
