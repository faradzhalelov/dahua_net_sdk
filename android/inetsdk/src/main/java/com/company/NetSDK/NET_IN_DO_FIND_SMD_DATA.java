package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_DoFindSMDData input param
 * \else
 * @brief 接口 CLIENT_DoFindSMDData 的输入参数
 * \endif
 */
public class NET_IN_DO_FIND_SMD_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Token
     * \else
     *  查询id
     * \endif
     */
    public int					nToken;

    /**
     * \if ENGLISH_LANG
     *  Position offset of starting query
     * \else
     *  开始查询的位置偏移
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  Number of queries, no more than 1024 at a time
     * \else
     *  查询条数,单次不超过1024
     * \endif
     */
    public int					nCount;

}
