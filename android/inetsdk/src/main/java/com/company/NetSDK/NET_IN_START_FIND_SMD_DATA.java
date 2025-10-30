package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindSMDData input param
 * \else
 * @brief 接口 CLIENT_StartFindSMDData 的输入参数
 * \endif
 */
public class NET_IN_START_FIND_SMD_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Query condition
     * \else
     *  查询条件
     * \endif
     */
    public NET_SMD_DATA_CONDITION					stuCondition = new NET_SMD_DATA_CONDITION();

}
