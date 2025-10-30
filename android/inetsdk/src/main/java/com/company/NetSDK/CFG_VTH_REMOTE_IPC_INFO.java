package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VTH's remote IPC config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_VTH_REMOTE_IPC_INFO}
 * \else
 * VTH中远程IPC配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_VTH_REMOTE_IPC_INFO}
 * \endif
 */
public class CFG_VTH_REMOTE_IPC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * remote IPC number
     * \else
     * 远端IPC个数
     * \endif
     */
    public int                  nRemoteIPCNum;

    /**
     * \if ENGLISH_LANG
     * remote IPC information
     * \else
     * 远端IPC信息
     * \endif
     */
    public CFG_REMOTE_IPC_INFO[] stuCfgRemoteIpcInfo = new CFG_REMOTE_IPC_INFO[FinalVar.MAX_REMOTE_IPC_NUM];

    public CFG_VTH_REMOTE_IPC_INFO() {
        for(int i = 0; i < FinalVar.MAX_REMOTE_IPC_NUM; i++) {
            stuCfgRemoteIpcInfo[i] = new CFG_REMOTE_IPC_INFO();
        }
    }
}
