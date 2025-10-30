package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Extension Human attributes info (Extension of the HUMAN_ATTRIBUTES_INFO)
 * \else
 * @brief 人体属性信息扩展(原先HUMAN_ATTRIBUTES_INFO预留字段不足，增加扩展结构体)
 * \endif
 */
public class HUMAN_ATTRIBUTES_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Whether has raincoat
     * \else
     *  是否戴帽子
     * \endif
     */
    public int					emHasRainCoat;

    /**
     * \if ENGLISH_LANG
     *  color of  mask
     * \else
     *  口罩颜色
     * \endif
     */
    public int					emMaskColor;

    /**
     * \if ENGLISH_LANG
     *  Score of the Qe
     * \else
     *  人体优选分数
     * \endif
     */
    public int					nQeScore;

    /**
     * \if ENGLISH_LANG
     *  Integrality of the target,0-Integrality, other - Not Integrality
     * \else
     *  目标完整性，0-完整，非0-不完整，视频流时值有效。
     * \endif
     */
    public int					nIntegrality;

    /**
     * \if ENGLISH_LANG
     *  Whether is associated with record source
     * \else
     *  是否与其他目标关联
     * \endif
     */
    public int					emExtRecordSource;

    /**
     * \if ENGLISH_LANG
     *  cap color
     * \else
     *  帽子颜色
     * \endif
     */
    public int					emCapColor;

    /**
     * \if ENGLISH_LANG
     *  Uniform type
     * \else
     *  制服类型
     * \endif
     */
    public int					emUniformStyle;

    /**
     * \if ENGLISH_LANG
     *  The value range of human clarity score is 1 ~ 100, and 0 is invalid
     * \else
     *  人体清晰度分数取值范围 1~100，0为无效值
     * \endif
     */
    public int					nHumanClarity;

    /**
     * \if ENGLISH_LANG
     *  Human integrity score
     * \else
     *  人体完整度评分
     * \endif
     */
    public int					nHumanCompleteScore;

    /**
     * \if ENGLISH_LANG
     *  the current human body ever been associated with a Target
     * \else
     *  表示当前人体是否曾经关联过目标
     * \endif
     */
    public boolean					bIsRelatedFace;

    /**
     * \if ENGLISH_LANG
     *  coat style	
     * \else
     *  上衣款式	
     * \endif
     */
    public int					emCoatStyle;

    /**
     * \if ENGLISH_LANG
     *  shoe Type
     * \else
     *  鞋子款式
     * \endif
     */
    public int					emShoesType;

    /**
     * \if ENGLISH_LANG
     *  shoe color
     * \else
     *  鞋子颜色
     * \endif
     */
    public int					emShoesColor;

    /**
     * \if ENGLISH_LANG
     *  age segmentation
     * \else
     *  年龄段
     * \endif
     */
    public int					emAgeSeg;

    /**
     * \if ENGLISH_LANG
     *  mask state, -1: Unknown, 0: unrecognized, 1: without mask, 2: with mask
     * \else
     *  口罩状态, -1:未知, 0:未做识别, 1:不带口罩, 2:带口罩
     * \endif
     */
    public int					nMask;

    /**
     * \if ENGLISH_LANG
     *  Personnel entry and exit status
     * \else
     *  人员进出状态
     * \endif
     */
    public int					nHumanState;

}