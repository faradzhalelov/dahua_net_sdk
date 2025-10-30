package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Human attributes info
 * \else
 * @brief 人体属性信息
 * \endif
 */
public class HUMAN_ATTRIBUTES_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Coat color
     * \else
     *  上衣颜色
     * \endif
     */
    public int					emCoatColor;

    /**
     * \if ENGLISH_LANG
     *  Coat type
     * \else
     *  上衣类型
     * \endif
     */
    public int					emCoatType;

    /**
     * \if ENGLISH_LANG
     *  Trousers color
     * \else
     *  裤子颜色
     * \endif
     */
    public int					emTrousersColor;

    /**
     * \if ENGLISH_LANG
     *  Trousers type
     * \else
     *  裤子类型
     * \endif
     */
    public int					emTrousersType;

    /**
     * \if ENGLISH_LANG
     *  whether has hat
     * \else
     *  是否戴帽子
     * \endif
     */
    public int					emHasHat;

    /**
     * \if ENGLISH_LANG
     *  whether has bag
     * \else
     *  是否带包
     * \endif
     */
    public int					emHasBag;

    /**
     * \if ENGLISH_LANG
     *  BoundingBox(8192 coordinates)
     * \else
     *  包围盒(8192坐标系)
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Age
     * \else
     *  年龄
     * \endif
     */
    public int					nAge;

    /**
     * \if ENGLISH_LANG
     *  Six
     * \else
     *  性别
     * \endif
     */
    public int					emSex;

    /**
     * \if ENGLISH_LANG
     *  Angle
     * \else
     *  角度
     * \endif
     */
    public int					emAngle;

    /**
     * \if ENGLISH_LANG
     *  Umbrella state
     * \else
     *  是否打伞
     * \endif
     */
    public int					emHasUmbrella;

    /**
     * \if ENGLISH_LANG
     *  Bag type
     * \else
     *  包类型
     * \endif
     */
    public int					emBag;

    /**
     * \if ENGLISH_LANG
     *  Upper Pattern
     * \else
     *  上半身衣服图案
     * \endif
     */
    public int					emUpperPattern;

    /**
     * \if ENGLISH_LANG
     *  Hair style
     * \else
     *  头发样式
     * \endif
     */
    public int					emHairStyle;

    /**
     * \if ENGLISH_LANG
     *  Cap type
     * \else
     *  帽类型
     * \endif
     */
    public int					emCap;

    /**
     * \if ENGLISH_LANG
     *  Center of human(not center of bounding box), 0-8191 relative coordinates, relative to large graph
     * \else
     *  人体型心(不是包围盒中心), 0-8191相对坐标, 相对于大图
     * \endif
     */
    public NET_POINT					stuHumanCenter = new NET_POINT();

    /**
     * \if ENGLISH_LANG
     *  Is there a reflective vest
     * \else
     *  是否有反光背心;
     * \endif
     */
    public int					emHasVest;

    /**
     * \if ENGLISH_LANG
     *  // Whether to wear a badge
     * \else
     *  是否佩戴工牌
     * \endif
     */
    public int					emHasBadge;

    /**
     * \if ENGLISH_LANG
     *  Whether to push a baby carriage
     * \else
     *  是否推婴儿车
     * \endif
     */
    public int					emHasBabyCarriage;

    /**
     * \if ENGLISH_LANG
     *  Whether is error detect or not 
     * \else
     *  是否虚检（背景误检，仅头，仅下半身都会判定为虚检）
     * \endif
     */
    public int					emIsErrorDetect;

    /**
     * \if ENGLISH_LANG
     *  Whether has head
     * \else
     *  人体部位是否有头
     * \endif
     */
    public int					emHasHead;

    /**
     * \if ENGLISH_LANG
     *  Whether has down body
     * \else
     *  人体部位是否有下半身
     * \endif
     */
    public int					emHasDownBody;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about Angle, range is [0,100]
     * \else
     *  姿态置信度，质量评估总分0到100
     * \endif
     */
    public int					nAngleConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about UpColor, range is [0,100]
     * \else
     *  上衣颜色置信度，质量评估总分0到100
     * \endif
     */
    public int					nUpColorConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about DownColor, range is [0,100]
     * \else
     *  下衣颜色置信度，质量评估总分0到100
     * \endif
     */
    public int					nDownColorConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about Gender, range is [0,100]
     * \else
     *  性别置信度，质量评估总分0到100
     * \endif
     */
    public int					nGenderConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about Age, range is [0,100]
     * \else
     *  年龄段置信度，质量评估总分0到100
     * \endif
     */
    public int					nAgeConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about HatType, range is [0,100]
     * \else
     *  帽子类型置信度，质量评估总分0到100
     * \endif
     */
    public int					nHatTypeConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about UpType, range is [0,100]
     * \else
     *  上衣种类置信度，质量评估总分0到100
     * \endif
     */
    public int					nUpTypeConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about DownType, range is [0,100]
     * \else
     *  下衣种类置信度，质量评估总分0到100
     * \endif
     */
    public int					nDownTypeConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about Hair, range is [0,100]
     * \else
     *  发型种类置信度，质量评估总分0到100
     * \endif
     */
    public int					nHairTypeConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about HasHead, range is [0,100]
     * \else
     *  人体部位是否有头的置信度，质量评估总分0到100
     * \endif
     */
    public int					nHasHeadConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about HasDownBody, range is [0,100]
     * \else
     *  人体部位是否有下半身置信度，质量评估总分0到100
     * \endif
     */
    public int					nHasDownBodyConf;

    /**
     * \if ENGLISH_LANG
     *  degree of confidence about UniformStyle, range is [0,100]
     * \else
     *  制服类型置信度，质量评估总分0到100
     * \endif
     */
    public int					nUniformStyleConf;

    /**
     * \if ENGLISH_LANG
     *  Coat type, emCoatType implementation is inconsistent with the protocol
     * \else
     *  上衣类型，emCoatType实现和协议不一致，兼容处理，
     * \endif
     */
    public byte					nCoatType;

}