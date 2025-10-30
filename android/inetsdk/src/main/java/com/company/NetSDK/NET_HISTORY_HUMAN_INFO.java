package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Human info in history data base
 * \else
 * @brief 历史库人体信息
 * \endif
 */
public class NET_HISTORY_HUMAN_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Coat color,{@link EM_CLOTHES_COLOR}
     * \else
     *  上衣颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emCoatColor;

    /**
     * \if ENGLISH_LANG
     *  Coat type,{@link EM_COAT_TYPE}
     * \else
     *  上衣类型,{@link EM_COAT_TYPE}
     * \endif
     */
    public int					emCoatType;

    /**
     * \if ENGLISH_LANG
     *  Trousers color,{@link EM_CLOTHES_COLOR}
     * \else
     *  裤子颜色,{@link EM_CLOTHES_COLOR}
     * \endif
     */
    public int					emTrousersColor;

    /**
     * \if ENGLISH_LANG
     *  Trousers type,{@link EM_TROUSERS_TYPE}
     * \else
     *  裤子类型,{@link EM_TROUSERS_TYPE}
     * \endif
     */
    public int					emTrousersType;

    /**
     * \if ENGLISH_LANG
     *  Has hat or not,{@link EM_HAS_HAT}
     * \else
     *  是否戴帽子,{@link EM_HAS_HAT}
     * \endif
     */
    public int					emHasHat;

    /**
     * \if ENGLISH_LANG
     *  Has bag or not,{@link EM_HAS_BAG}
     * \else
     *  是否带包,{@link EM_HAS_BAG}
     * \endif
     */
    public int					emHasBag;

    /**
     * \if ENGLISH_LANG
     *  Bounding box
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
     *  Sex,{@link EM_SEX_TYPE}
     * \else
     *  性别,{@link EM_SEX_TYPE}
     * \endif
     */
    public int					emSex;

    /**
     * \if ENGLISH_LANG
     *  Angle,{@link EM_ANGLE_TYPE}
     * \else
     *  角度,{@link EM_ANGLE_TYPE}
     * \endif
     */
    public int					emAngle;

    /**
     * \if ENGLISH_LANG
     *  Has umbrella or not,{@link EM_HAS_UMBRELLA}
     * \else
     *  是否打伞,{@link EM_HAS_UMBRELLA}
     * \endif
     */
    public int					emHasUmbrella;

    /**
     * \if ENGLISH_LANG
     *  Bag type,{@link EM_BAG_TYPE}
     * \else
     *  包类型,{@link EM_BAG_TYPE}
     * \endif
     */
    public int					emBag;

    /**
     * \if ENGLISH_LANG
     *  Upper pattern,{@link EM_CLOTHES_PATTERN}
     * \else
     *  上半身衣服图案,{@link EM_CLOTHES_PATTERN}
     * \endif
     */
    public int					emUpperPattern;

    /**
     * \if ENGLISH_LANG
     *  Hair style,{@link EM_HAIR_STYLE}
     * \else
     *  头发样式,{@link EM_HAIR_STYLE}
     * \endif
     */
    public int					emHairStyle;

    /**
     * \if ENGLISH_LANG
     *  Cap type,{@link EM_CAP_TYPE}
     * \else
     *  帽类型,{@link EM_CAP_TYPE}
     * \endif
     */
    public int					emCap;

    /**
     * \if ENGLISH_LANG
     *  Has back bag or not,{@link EM_HAS_BACK_BAG}
     * \else
     *  是否有背包,{@link EM_HAS_BACK_BAG}
     * \endif
     */
    public int					emHasBackBag;

    /**
     * \if ENGLISH_LANG
     *  Has carrier bag or not,{@link EM_HAS_CARRIER_BAG}
     * \else
     *  是否带手提包,{@link EM_HAS_CARRIER_BAG}
     * \endif
     */
    public int					emHasCarrierBag;

    /**
     * \if ENGLISH_LANG
     *  Has shoulder bag or not,{@link EM_HAS_SHOULDER_BAG}
     * \else
     *  是否有肩包,{@link EM_HAS_SHOULDER_BAG}
     * \endif
     */
    public int					emHasShoulderBag;

    /**
     * \if ENGLISH_LANG
     *  Has messenger bag or not,{@link EM_HAS_MESSENGER_BAG}
     * \else
     *  是否有斜跨包,{@link EM_HAS_MESSENGER_BAG}
     * \endif
     */
    public int					emMessengerBag;

    /**
     * \if ENGLISH_LANG
     *  Human image info
     * \else
     *  人体图片信息
     * \endif
     */
    public NET_HISTORY_HUMAN_IMAGE_INFO					stuImageInfo = new NET_HISTORY_HUMAN_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  target image info
     * \else
     *  图片信息
     * \endif
     */
    public NET_HISTORY_HUMAN_IMAGE_INFO					stuFaceImageInfo = new NET_HISTORY_HUMAN_IMAGE_INFO();

}