package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindSMDData output param
 * \else
 * @brief 接口 CLIENT_StartFindSMDData 的输出参数
 * \endif
 */
public class NET_OUT_START_FIND_SMD_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Token
     * \else
     *  返回查询id
     * \endif
     */
    public int					nToken;

    /**
     * \if ENGLISH_LANG
     *  Total number of queries
     * \else
     *  查询到的总条数
     * \endif
     */
    public int					nCount;

}
