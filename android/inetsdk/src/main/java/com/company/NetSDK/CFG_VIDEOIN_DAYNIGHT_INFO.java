package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief day/night color change config
 * \else
 * @brief 球机机芯日夜配置
 * \endif
 */
public class CFG_VIDEOIN_DAYNIGHT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  config for time sections, in the order: normal, day, night
     * \else
     *  不同时间段配置，按顺序分别对应：普通、白天、黑夜
     * \endif
     */
    public DAYNIGHT_INFO					stuSection[] = new DAYNIGHT_INFO[FinalVar.VIDEOIN_TSEC_NUM];

    public CFG_VIDEOIN_DAYNIGHT_INFO() {
        for(int i = 0; i < FinalVar.VIDEOIN_TSEC_NUM; i ++){
            this.stuSection[i] = new DAYNIGHT_INFO();
        }
    }
}
