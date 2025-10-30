package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StopFindSMDData input param
 * \else
 * @brief 接口 CLIENT_StopFindSMDData 的输入参数
 * \endif
 */
public class NET_IN_STOP_FIND_SMD_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  nToken
     * \else
     *  start接口返回的token, token仅会保存
     * \endif
     */
    public int					nToken;

}
