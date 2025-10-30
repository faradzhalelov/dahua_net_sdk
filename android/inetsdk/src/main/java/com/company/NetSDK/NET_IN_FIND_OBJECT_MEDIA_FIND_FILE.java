package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_FindObjectMediaFindFile Interface input parameters
 * \else
 * @brief CLIENT_FindObjectMediaFindFile 接口输入参数
 * \endif
 */
public class NET_IN_FIND_OBJECT_MEDIA_FIND_FILE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of offset entries in the query
     * \else
     *  查询的偏移条数
     * \endif
     */
    public int					nOffset;

    /**
     * \if ENGLISH_LANG
     *  The number of entries required for this query
     * \else
     *  本次查询需要获取的条数
     * \endif
     */
    public int					nCount;

}