package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR_EX Corresponding query
 * \else
 * @brief SDK_MEDIA_QUERY_TRAFFICCAR_EX对应的查询条件
 * \endif
 */
public class MEDIA_QUERY_TRAFFICCAR_PARAM_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The basic query parameters
     * \else
     *  基本查询参数
     * \endif
     */
    public MEDIA_QUERY_TRAFFICCAR_PARAM					stuParam = new MEDIA_QUERY_TRAFFICCAR_PARAM();

    public MEDIA_QUERY_TRAFFICCAR_PARAM_EX() {
    }

    public MEDIA_QUERY_TRAFFICCAR_PARAM_EX(int eventNum) {
        this.stuParam.nEventTypeNum = eventNum;
        this.stuParam.pEventTypes = new int[eventNum];
    }
}