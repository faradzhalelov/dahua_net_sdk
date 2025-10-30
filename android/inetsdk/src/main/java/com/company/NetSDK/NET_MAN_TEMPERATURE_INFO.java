package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Human temperature info
 * \else
 * 人员温度信息
 * \endif
 */
public class NET_MAN_TEMPERATURE_INFO  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Human temperature
     * \else
     * 人员体温
     * \endif
     */
    public float fCurrentTemperature;
    /**
     * \if ENGLISH_LANG
     * Temperature unit,{@link EM_HUMAN_TEMPERATURE_UNIT}
     * \else
     * 温度单位,参考{@link EM_HUMAN_TEMPERATURE_UNIT}
     * \endif
     */
    public int emTemperatureUnit;
    /**
     * \if ENGLISH_LANG
     * Is abnormal temperature or not
     * \else
     * 是否超温
     * \endif
     */
    public boolean bIsOverTemperature;
    /**
     * \if ENGLISH_LANG
     *  Human body ARGtemp_meas status,{@link EM_HUMAN_TEMPERATURE_STATUS}
     * \else
     *  人体测温状态,{@link EM_HUMAN_TEMPERATURE_STATUS}
     * \endif
     */
    public int					emTemperatureStatus;
}
