package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetCrowdDistriMapCaps output parameter
 * \else
 * @brief CLIENT_GetCrowdDistriMapCaps 接口出参
 * \endif
 */
public class NET_OUT_GET_CROWD_DISTRIMAP_CAPS_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Population Distribution Map Capability List
     * \else
     *  人群分布图能力列表
     * \endif
     */
    public NET_CROWD_DISTRIMAP_CAPS_LIST					stuCrowdCapsList[] = new NET_CROWD_DISTRIMAP_CAPS_LIST[8];

    /**
     * \if ENGLISH_LANG
     *  The number of Population Distribution Map Capability List
     * \else
     *  人群分布图能力列表个数
     * \endif
     */
    public int					nCrowdCapsListNum;

    public NET_OUT_GET_CROWD_DISTRIMAP_CAPS_INFO() {
        for(int i = 0; i < 8; i ++){
            this.stuCrowdCapsList[i] = new NET_CROWD_DISTRIMAP_CAPS_LIST();
        }
    }
}