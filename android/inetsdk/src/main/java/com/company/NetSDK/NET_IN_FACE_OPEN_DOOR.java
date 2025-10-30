package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief target open door input parameters
 * \else
 * @brief 目标开门输入参数
 * \endif
 */
public class NET_IN_FACE_OPEN_DOOR implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * door channel id
     * \else
     *  门通道号
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     * compare result,{@link EM_COMPARE_RESULT}
     * \else
     *  比对结果,{@link EM_COMPARE_RESULT}
     * \endif
     */
    public int					emCompareResult;

    /**
     * \if ENGLISH_LANG
     * match information
     * \else
     *  匹配信息
     * \endif
     */
    public NET_OPENDOOR_MATCHINFO					stuMatchInfo = new NET_OPENDOOR_MATCHINFO();

    /**
     * \if ENGLISH_LANG
     * image information
     * \else
     *  图片信息
     * \endif
     */
    public NET_OPENDOOR_IMAGEINFO					stuImageInfo = new NET_OPENDOOR_IMAGEINFO();

}
