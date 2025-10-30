package com.company.NetSDK;
import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target info object
 * \else
 * 信息
 * \endif
 */
public class FACE_INFO_OBJECT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Image info
     * \else
     * 物体截图信息
     * \endif
     */
    public IMAGE_INFO           stuImageInfo = new IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Sex
     * \else
     * 性别类型
     * \endif
     */
    public int                  emSex;

    /**
     * \if ENGLISH_LANG
     * Age
     * \else
     * 年龄
     * \endif
     */
    public int                  nAge;

    /**
     * \if ENGLISH_LANG
     * Whether or not wear glasses, refer to {@link EM_FACEDETECT_GLASSES_TYPE}
     * \else
     * 是否戴眼镜
     * \endif
     */
    public int                  emGlasses;

    /**
     * \if ENGLISH_LANG
     * Emotion, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 目标表情
     * \endif
     */
    public int                  emEmotion;

    /**
     * \if ENGLISH_LANG
     * Eye state, refer to {@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态
     * \endif
     */
    public int                  emEye;

    /**
     * \if ENGLISH_LANG
     * Mouth state, refer to {@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态
     * \endif
     */
    public int                  emMouth;

    /**
     * \if ENGLISH_LANG
     * Whether or not wear mask, refer to {@link EM_MASK_STATE_TYPE}
     * \else
     * 是否带口罩
     * \endif
     */
    public int                  emMask;


    /**
     * \if ENGLISH_LANG
     * Whehter or not has beard, refer to {@link EM_BEARD_STATE_TYPE}
     * \else
     * 是否有胡子
     * \endif
     */
    public int                  emBeard;

    /**
     * \if ENGLISH_LANG
     * Attractive,0 means unidentification,valid range:1-100,The higer the value,the more attractive
     * \else
     * 魅力值,0表示未识别,识别时范围1-100,得分高魅力高
     * \endif
     */
    public int                  nAttractive;

    /**
     * \if ENGLISH_LANG
     *  euler angle of target in the capture picture, nPitch:pitch of the head, nYaw: yaw of the head, nRoll:roll of the head
     * range of the angle value is [-90,90], stuFaceCaptureAngle is invalid if the three angles are 999.
     * \else
     * 目标在抓拍图片中的角度信息, nPitch:抬头低头的俯仰角, nYaw左右转头的偏航角, nRoll头在平面内左偏右偏的翻滚角
     * 角度值取值范围[-90,90], 三个角度值都为999表示此角度信息无效
     * \endif
     */
    public NET_EULER_ANGLE      stuFaceCaptureAngle = new NET_EULER_ANGLE();

    /**
     * \if ENGLISH_LANG
     *  quality about capture picture
     * \else
     *  目标抓拍质量分数
     * \endif
     */
    public int					nFaceQuality;

    /**
     * \if ENGLISH_LANG
     *  temperate
     * \else
     *  温度信息
     * \endif
     */
    public double					dMaxTemp;

    /**
     * \if ENGLISH_LANG
     *  Is abnormal temperature
     * \else
     *  是否温度异常
     * \endif
     */
    public int					nIsOverTemp;

    /**
     * \if ENGLISH_LANG
     *  Is abnormal temperature
     * \else
     *  是否温度异常
     * \endif
     */
    public int					nIsUnderTemp;

    /**
     * \if ENGLISH_LANG
     *  temperature unit
     * \else
     *  温度单位
     * \endif
     */
    public int					emTempUnit;
}




