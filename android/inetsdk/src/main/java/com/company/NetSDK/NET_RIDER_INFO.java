package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rider information
 * \else
 * 骑车人信息
 * \endif
 */

public class NET_RIDER_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Enable
     * \else
     * 是否识别到特征信息, TRUE时下面数据才有效
     * \endif
     */
    public boolean						bFeatureValid;

    /**
     * \if ENGLISH_LANG
     * its sex,{@link EM_SEX_TYPE}
     * \else
     * 性别,{@link EM_SEX_TYPE}
     * \endif
     */
    public int		            emSex;

    /**
     * \if ENGLISH_LANG
     * its age
     * \else
     * 年龄
     * \endif
     */
    public int					        nAge;

    /**
     * \if ENGLISH_LANG
     * Whether or not wearing a helmet,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 头盔状态,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emHelmet;

    /**
     * \if ENGLISH_LANG
     * Whether on the phone ,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 是否在打电话,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emCall;

    /**
     * \if ENGLISH_LANG
     * Whether or not have bag,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 是否有背包,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emBag;

    /**
     * \if ENGLISH_LANG
     * Whether or not have carrierbag,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 有没有手提包,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emCarrierBag;

    /**
     * \if ENGLISH_LANG
     * Whether an umbrella,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 是否打伞,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emUmbrella;

    /**
     * \if ENGLISH_LANG
     * Whether or not wear glasses,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 是否有带眼镜,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emGlasses;

    /**
     * \if ENGLISH_LANG
     * Whether to wear a target mask,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \else
     * 是否带口罩,{@link EM_NONMOTOR_OBJECT_STATUS}
     * \endif
     */
    public int   emMask;

    /**
     * \if ENGLISH_LANG
     * Emotion,{@link EM_EMOTION_TYPE}
     * \else
     * 表情,{@link EM_EMOTION_TYPE}
     * \endif
     */
    public int             emEmotion;

    /**
     * \if ENGLISH_LANG
     * UpClothes type,{@link EM_CLOTHES_TYPE}
     * \else
     * 上衣类型,{@link EM_CLOTHES_TYPE}
     * \endif
     */
    public int             emUpClothes;

    /**
     * \if ENGLISH_LANG
     * DownClothes type,{@link EM_CLOTHES_TYPE}
     * \else
     * 下衣类型,{@link EM_CLOTHES_TYPE}
     * \endif
     */
    public int             emDownClothes;

    /**
     * \if ENGLISH_LANG
     * Upper body color,{@link EM_OBJECT_COLOR_TYPE}
     * \else
     * 上衣颜色,{@link EM_OBJECT_COLOR_TYPE}
     * \endif
     */
    public int        emUpperBodyColor;

    /**
     * \if ENGLISH_LANG
     * Lower body color,{@link EM_OBJECT_COLOR_TYPE}
     * \else
     * 下衣颜色,{@link EM_OBJECT_COLOR_TYPE}
     * \endif
     */
    public int        emLowerBodyColor;

    /**
     * \if ENGLISH_LANG
     * Whether rider's target image information is contained
     * \else
     * 是否有骑车人目标抠图信息
     * \endif
     */
    public boolean						bHasFaceImage;

    /**
     * \if ENGLISH_LANG
     * Rider target image
     * \else
     * 骑车人目标特写描述
     * \endif
     */
    public RIDER_FACE_IMAGE_INFO		stuFaceImage = new RIDER_FACE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Whether rider's target Attributes is contained
     * \else
     * 是否有目标属性
     * \endif
     */
    public boolean						bHasFaceAttributes;

    /**
     * \if ENGLISH_LANG
     * target Attributes
     * \else
     * 目标属性
     * \endif
     */
    public NET_FACE_ATTRIBUTE_EX		stuFaceAttributes = new NET_FACE_ATTRIBUTE_EX();

    /**
     * \if ENGLISH_LANG
     * whether has hat,{@link EM_HAS_HAT}
     * \else
     * 是否戴帽子,{@link EM_HAS_HAT}
     * \endif
     */
    public int                  emHasHat;

    /**
     * \if ENGLISH_LANG,{@link EM_CAP_TYPE}
     * Cap type
     * \else
     * 帽类型,{@link EM_CAP_TYPE}
     * \endif
     */
    public int                 emCap;

    /**
     * \if ENGLISH_LANG
     * Hair style,{@link EM_HAIR_STYLE}
     * \else
     * 头发样式,{@link EM_HAIR_STYLE}
     * \endif
     */
    public int               emHairStyle;

}
