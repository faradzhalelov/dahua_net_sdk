package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target attribute
 * \else
 * 目标属性
 * \endif
 */
public class NET_FACE_ATTRIBUTE_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Sex,{@link EM_SEX_TYPE}
     * \else
     * 性别,{@link EM_SEX_TYPE}
     * \endif
     */
    public int 							emSex;

    /**
     * \if ENGLISH_LANG
     * age,-1 means invalid
     * \else
     * 年龄,-1表示该字段数据无效
     * \endif
     */
    public int        								nAge;

    /**
     * \if ENGLISH_LANG
     * Eye state,{@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态,{@link EM_EYE_STATE_TYPE}
     * \endif
     */
    public int						emEye;

    /**
     * \if ENGLISH_LANG
     * Mouth state,{@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态,{@link EM_MOUTH_STATE_TYPE}
     * \endif
     */
    public int						emMouth;

    /**
     * \if ENGLISH_LANG
     * Mask state,{@link EM_MASK_STATE_TYPE}
     * \else
     * 口罩状态,{@link EM_MASK_STATE_TYPE}
     * \endif
     */
    public int 						emMask;

    /**
     * \if ENGLISH_LANG
     * Beard state,{@link EM_BEARD_STATE_TYPE}
     * \else
     * 胡子状态,{@link EM_BEARD_STATE_TYPE}
     * \endif
     */
    public int						emBeard;

    /**
     * \if ENGLISH_LANG
     * Attractive, 0 Not distinguish,Range[1,100], the higher value the more attractive
     * \else
     * 魅力值, 0未识别，识别时范围1-100,得分高魅力高
     * \endif
     */
    public int										nAttractive;

    /**
     * \if ENGLISH_LANG
     * Glasses,{@link EM_HAS_GLASS}
     * \else
     * 眼镜,{@link EM_HAS_GLASS}
     * \endif
     */
    public int							emGlass;

    /**
     * \if ENGLISH_LANG
     * Emotion,{@link EM_EMOTION_TYPE}
     * \else
     * 表情,{@link EM_EMOTION_TYPE}
     * \endif
     */
    public int							emEmotion;

    /**
     * \if ENGLISH_LANG
     * BoundingBox(8192 Coordinate)
     * \else
     * 包围盒(8192坐标系)
     * \endif
     */
    public SDK_RECT									stuBoundingBox = new SDK_RECT();

    /**
     * \if ENGLISH_LANG
     * Strabismus,{@link EM_STRABISMUS_TYPE}
     * \else
     * 斜视状态,{@link EM_STRABISMUS_TYPE}
     * \endif
     */
    public int						emStrabismus;

    /**
     * \if ENGLISH_LANG
     * Target capture angle, three angles are respectively
     * \else
     * 目标抓拍角度, 三个角度依次分别是
     * \endif
     */
    public int                                     nAngle[] = new int[3];

    /**
     * \if ENGLISH_LANG
     * Center of object(not center of bounding box), 0-8191 relative coordinates, relative to large graph
     * \else
     * 物体型心(不是包围盒中心), 0-8191相对坐标, 相对于大图
     * \endif
     */
    public SDK_POINT                               stuObjCenter = new SDK_POINT();

}
