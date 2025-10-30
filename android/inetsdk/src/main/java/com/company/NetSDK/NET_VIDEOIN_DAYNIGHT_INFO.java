package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * day or night config of video input
 * \else
 * 日夜模式配置
 * \endif
 */
public class NET_VIDEOIN_DAYNIGHT_INFO implements Serializable {

    /**
     *
     */
    private static final long               serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * config type, you need set the value wether set or get config, refer to {@link NET_EM_CONFIG_TYPE}
     * \else
     * 配置类型，获取和设置时都要指定,取值参考{@link NET_EM_CONFIG_TYPE}
     * \endif
     */
    public int			                    emCfgType;

    /**
     * \if ENGLISH_LANG
     * day or night type, refer to {@link NET_EM_DAYNIGHT_TYPE}
     * \else
     * 日夜切换模式,取值参考{@link NET_EM_DAYNIGHT_TYPE}
     * \endif
     */
    public int                      		emDayNightType;

    /**
     * \if ENGLISH_LANG
     * Sensitivity of day or night(1-3)
     * \else
     * 日夜模式切换灵敏度,范围1-3
     * \endif
     */
    public int			    				nDayNightSensitivity;

    /**
     * \if ENGLISH_LANG
     * delay time of day or night switch(2s - 10s)
     * \else
     * 日夜模式切换延迟时间,单位秒，范围2-10
     * \endif
     */
    public int				    			nDayNightSwitchDelay;
}
