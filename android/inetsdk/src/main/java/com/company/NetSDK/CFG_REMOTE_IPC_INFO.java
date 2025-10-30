package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * remote IPC information
 * \else
 * 远端IPC信息
 * \endif
 */
public class CFG_REMOTE_IPC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device ip
     * \else
     * 设备IP
     * \endif
     */
    public byte		                        szIP[] = new byte[FinalVar.MAX_REMOTEIPCINFO_IPADDR_LEN];

    /**
     * \if ENGLISH_LANG
     * MAC address
     * \else
     * MAC地址
     * \endif
     */
    public byte                                szMac[] = new byte[FinalVar.MAX_REMOTEIPCINFO_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     * username
     * \else
     * 用户名
     * \endif
     */
    public byte		                        szUser[] = new byte[FinalVar.MAX_REMOTEIPCINFO_USERNAME_LEN];

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 密码
     * \endif
     */
    public byte		                        szPassword[] = new byte[FinalVar.MAX_REMOTEIPCINFO_USERPSW_LENGTH];

    /**
     * \if ENGLISH_LANG
     * port
     * \else
     * 端口
     * \endif
     */
    public int	                                nPort;

    /**
     * \if ENGLISH_LANG
     * protocol type, refer to {@link EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL}
     * \else
     * 协议类型, 参考 {@link EM_CFG_REMOTE_IPC_DEVICE_PROTOCOL}
     * \endif
     */
    public int                                emProtocol;

    /**
     * \if ENGLISH_LANG
     * media stream type, refer to {@link EM_CFG_REMOTE_IPC_DEVICE_STREAMTYPE}
     * \else
     * 媒体流类型, 参考 {@link EM_CFG_REMOTE_IPC_DEVICE_STREAMTYPE}
     * \endif
     */
    public int                              emStreamType;

    /**
     * \if ENGLISH_LANG
     * channel number
     * \else
     * 通道号
     * \endif
     */
    public int                                 nChannel;

    /**
     * \if ENGLISH_LANG
     * rely device type, refer to {@link EM_CFG_REMOTE_IPC_RELY_TYPE}
     * \else
     * 依赖设备类型, 参考 {@link EM_CFG_REMOTE_IPC_RELY_TYPE}
     * \endif
     */
    public int         emIPCRely;

    @Override
    public String toString() {
        return "szIP=" + new String(szIP).trim() +
                ", szMac=" + new String(szMac).trim() +
                ", szUser=" + new String(szUser).trim() +
                ", szPassword=" + new String(szPassword).trim() +
                ", nPort=" + nPort +
                ", emProtocol=" + emProtocol +
                ", emStreamType=" + emStreamType +
                ", nChannel=" + nChannel +
                ", emIPCRely=" + emIPCRely;
    }
}
