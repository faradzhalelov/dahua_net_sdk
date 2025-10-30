package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetRemoteUpgradeState} output param
 * \else
 * {@link INetSDK#GetRemoteUpgradeState} 出参
 * \endif
 */
public class NET_OUT_GET_REMOTEUPGRADE_STATE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * the max input num of pstuStates
     * \else
     * 输入最大的状态数
     * \endif
     */
    public int          nMaxStateNum;

    /**
     * \if ENGLISH_LANG
     * the return valid num of pstuStates
     * \else
     * 实际返回的状态数
     * \endif
     */
    public int          nRetStateNum;

    /**
     * \if ENGLISH_LANG
     * Caps list
     * \else
     * 状态列表
     * \endif
     */
    public NET_REMOTE_UPGRADER_STATE[]						pstuStates;

    public NET_OUT_GET_REMOTEUPGRADE_STATE(int nMaxStateNum) {
        this.nMaxStateNum = nMaxStateNum;
        pstuStates = new NET_REMOTE_UPGRADER_STATE[nMaxStateNum];
        for (int i = 0; i < nMaxStateNum; i++) {
            pstuStates[i] = new NET_REMOTE_UPGRADER_STATE();
        }
    }
}
