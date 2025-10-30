package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Burn warning configuration information
 * \else
 * @brief 灼伤预警配置信息
 * \endif
 */
public class BURNING_CHECK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Burn warning function switch
     * \else
     *  灼伤预警功能开关
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Detection sensitivity, range [1, 100]
     * \else
     *  检测灵敏度，范围[1,100]
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     *  Range threshold, range [1, 100]
     * \else
     *  范围阈值，范围[1,100]
     * \endif
     */
    public int					nGrayThreshold;

    /**
     * \if ENGLISH_LANG
     *  Alarm linkage configuration
     * \else
     *  报警联动配置
     * \endif
     */
    public NET_CFG_ALARM_MSG_HANDLE					stuEventHandler = new NET_CFG_ALARM_MSG_HANDLE();

}