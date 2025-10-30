package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Tool warehouse information for linkage alarm
 * \else
 * @brief 联动报警的工装库信息
 * \endif
 */
public class NET_LINK_GROUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  联动报警的工装库ID
     * \endif
     */
    public byte					szGroupID[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Feature Name
     * \else
     *  联动报警特征名称
     * \endif
     */
    public byte					szFeatureName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Similarity
     * \else
     *  联动报警库相似度
     * \endif
     */
    public int					nSimilarity;

    /**
     * \if ENGLISH_LANG
     *  Sampl Attributes, 0: Unknown, 1: Positive sample 2: Negative sample
     * \else
     *  样本属性, 0: 未知, 1: 正样本 2: 负样本
     * \endif
     */
    public int					nSampleAttributes;

    /**
     * \if ENGLISH_LANG
     *  Group Name
     * \else
     *  联动报警的工装库名称
     * \endif
     */
    public byte					szGroupName[] = new byte[128];

}