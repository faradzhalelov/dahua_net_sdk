package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote check detail
 * \else
 * 远程开门验证
 * \endif
 */
public class CFG_HANDICAP_TIMEOUT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Unlock hold time(max time to close door automatically),unit: ms, [250, 60000]
     * \else
     * 门锁保持时间(自动关门时间),单位毫秒,[250, 60000]
     * \endif
     */
    public int                 nUnlockHoldInterval;

    /**
     * \if ENGLISH_LANG
     * max time to close door, there will be alarm if door still open after max time; unit: s,[0,9999];0 means do not check the time out
     * \else
     * 关门超时时间, 超过阈值未关会触发报警，单位秒,[0,9999];0表示不检测超时
     * \endif
     */
    public int                 nCloseTimeout;

}
