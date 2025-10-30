package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Remote check detail
 * \else
 * 远程开门验证
 * \endif
 */
public class CFG_REMOTE_DETAIL_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * over time, 0:unlimited wait, unit: sec
     * \else
     *  超时时间, 0表示永久等待, 其他值表示超时时间(单位为秒)
     * \endif
     */
    public int                     nTimeOut;

    /**
     * \if ENGLISH_LANG
     *  door status after over time, TRUE:open, FALSE:close
     * \else
     * 超时后的门状态, TRUE:打开, FALSE:关闭
     * \endif
     */
    public boolean                 bTimeOutDoorStatus;

}
