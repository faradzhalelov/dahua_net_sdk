package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Real-time frame drawing config, EVS customization
 * \else
 * @brief 实时抽帧配置
 * \endif
 */
public class CFG_BACKUP_LIVE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  whether to enable, start frame drawing
     * \else
     *  是否启动抽帧   
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  If it is 0, only I frame will be reserved. In other cases, I frame and several P frames next to it will be reserved
     * \else
     *  抽帧备份比率，如为0表示只保留I帧，其它情况下表示保留I帧以及紧邻其后的若干P帧
     * \endif
     */
    public int					nBackupRate;

    /**
     * \if ENGLISH_LANG
     *  frame drawing time section
     * \else
     *  抽帧时间段
     * \endif
     */
    public CFG_TIME_SECTION					stuTimeSection = new CFG_TIME_SECTION();

}
