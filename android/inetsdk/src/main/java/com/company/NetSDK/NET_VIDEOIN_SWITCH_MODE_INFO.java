package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * the config of switch mode
 * \else
 * 切换模式配置
 * \endif
 */
public class NET_VIDEOIN_SWITCH_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  switch mode,{@link NET_EM_SWITCH_MODE}
     * \else
     *  切换模式,{@link NET_EM_SWITCH_MODE}
     * \endif
     */
    public int					emSwitchMode;

    /**
     * \if ENGLISH_LANG
     *  sunrise time
     * \else
     *  大致日出时间
     * \endif
     */
    public NET_SUN_TIME					stuSunRiseTime = new NET_SUN_TIME();

    /**
     * \if ENGLISH_LANG
     *  sunset time
     * \else
     *  大致日落时间
     * \endif
     */
    public NET_SUN_TIME					stuSunSetTime = new NET_SUN_TIME();

}