package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Temperature set point alarm
 * \else
 * @brief 测温点报警设置
 * \endif
 */
public class CFG_RADIOMETRY_ALARMSETTING implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  alarm SN alarm no. unified SN
     * \else
     *  报警唯一编号	报警编号统一编码
     * \endif
     */
    public int					nId;

    /**
     * \if ENGLISH_LANG
     *  enable this point alarm
     * \else
     *  是否开启该点报警
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Temperature Monitoring alarm result type, see CFG_STATISTIC_TYPE, may take value:
     * \else
     *  测温报警结果类型，见 CFG_STATISTIC_TYPE，可取值：
     * \endif
     */
    public int					nResultType;

    /**
     * \if ENGLISH_LANG
     *  alarm condition, see CFG_COMPARE_RESULT
     * \else
     *  报警条件，见 CFG_COMPARE_RESULT
     * \endif
     */
    public int					nAlarmCondition;

    /**
     * \if ENGLISH_LANG
     *  alarm threshold temperature, floating point number
     * \else
     *  报警阈值温度	浮点数
     * \endif
     */
    public float					fThreshold;

    /**
     * \if ENGLISH_LANG
     *  temperature error, flosting point number, such as 0.1 means +/- error is within 0.1
     * \else
     *  温度误差，浮点数，比如0.1 表示正负误差在0.1范围内
     * \endif
     */
    public float					fHysteresis;

    /**
     * \if ENGLISH_LANG
     *  threshold temperature duration time, unit:s
     * \else
     *  阈值温度持续时间	单位：秒
     * \endif
     */
    public int					nDuration;

}