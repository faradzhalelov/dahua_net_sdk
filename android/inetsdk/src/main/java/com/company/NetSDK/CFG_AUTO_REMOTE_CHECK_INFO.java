package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * remote check to open door
 * \else
 * 开门远程验证
 * \endif
 */
public class CFG_AUTO_REMOTE_CHECK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * enable auto remote check to open door, TRUE: ENABLE, FALSE: unable
     * \else
     * 使能项, TRUE: 开启, FALSE: 关闭
     * \endif
     */
    public boolean             bEnable;

    /**
     * \if ENGLISH_LANG
     * corresponding to index of config "CFG_CMD_ACCESSTIMESCHEDULE"
     * \else
     * 对应CFG_CMD_ACCESSTIMESCHEDULE配置的通道号
     * \endif
     */
    public int                   nTimeSechdule;

}

