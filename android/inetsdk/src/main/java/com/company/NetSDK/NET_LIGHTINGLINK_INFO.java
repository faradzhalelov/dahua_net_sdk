package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * lighting link info
 * \else
 * 联动白光灯威慑
 * \endif
 */
public class NET_LIGHTINGLINK_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * enable
     * \else
     * 是否联动
     * \endif
     */
    public boolean				 bEnable;

    /**
     * \if ENGLISH_LANG
     * light link type {@link EM_PIR_LIGHT_LINK_TYPE}
     * \else
     * 灯光联动方式  {@link EM_PIR_LIGHT_LINK_TYPE}
     * \endif
     */
    public int	                     emLightLinkType;

    /**
     * \if ENGLISH_LANG
     * filcker interval time
     * \else
     * 闪烁间隔时间, 单位为0.1s
     * \endif
     */
    public int						nFilckerIntevalTime;

    /**
     * \if ENGLISH_LANG
     * light duration
     * \else
     * 灯光闪烁或常亮持续时间, 单位秒
     * \endif
     */
    public int						nLightDuration;

    /**
     * \if ENGLISH_LANG
     * white light time section
     * \else
     * 联动白光灯威慑时间段
     * \endif
     */
    public SDK_TSECT[][]			stuWhiteLightTimeSection = new SDK_TSECT[FinalVar.SDK_TSCHE_DAY_NUM][FinalVar.SDK_TSCHE_SEC_NUM];

    public NET_LIGHTINGLINK_INFO() {
        for(int i = 0; i < FinalVar.SDK_TSCHE_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.SDK_TSCHE_SEC_NUM; j++) {
                stuWhiteLightTimeSection[i][j] = new SDK_TSECT();
            }
        }
    }
}
