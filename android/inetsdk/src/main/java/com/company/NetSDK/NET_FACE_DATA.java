package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * the data of face
 * \else
 * 目标数据
 * \endif
 */
public class NET_FACE_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * sex type, refer to  {@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
     * \else
     * 性别,参考 {@link EM_DEV_EVENT_FACEDETECT_SEX_TYPE}
     * \endif
     */
    public int 		                       emSex;

    /**
     * \if ENGLISH_LANG
     * age, invalid if it is -1
     * \else
     * 年龄,-1表示该字段数据无效
     * \endif
     */
    public int        						   nAge;

    /**
     * \if ENGLISH_LANG
     * invalid number in array emFeature
     * \else
     * 目标特征数组有效个数,与 emFeature 结合使用
     * \endif
     */
    public int        					      nFeatureValidNum;

    /**
     * \if ENGLISH_LANG
     * human face features, refer to {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \else
     * 目标特征数组,与 nFeatureValidNum 结合使用,参考 {@link EM_DEV_EVENT_FACEDETECT_FEATURE_TYPE}
     * \endif
     */
    public  int[]                           emFeature = new int[FinalVar.SDK_MAX_FACEDETECT_FEATURE_NUM];

    /**
     * \if ENGLISH_LANG
     * eyes state, refer to {@link EM_EYE_STATE_TYPE}
     * \else
     * 眼睛状态,参考 {@link EM_EYE_STATE_TYPE}
     * \endif
     */
    public int						        emEye;

    /**
     * \if ENGLISH_LANG
     * mouth state, refer to {@link EM_MOUTH_STATE_TYPE}
     * \else
     * 嘴巴状态,参考 {@link EM_MOUTH_STATE_TYPE}
     * \endif
     */
    public int						       emMouth;

    /**
     * \if ENGLISH_LANG
     * mask state, refer to {@link EM_MASK_STATE_TYPE}
     * \else
     * 口罩状态,参考 {@link EM_MASK_STATE_TYPE}
     * \endif
     */
    public int 						  emMask;

    /**
     * \if ENGLISH_LANG
     * beard state, refer to {@link EM_BEARD_STATE_TYPE}
     * \else
     * 胡子状态,参考 {@link EM_BEARD_STATE_TYPE}
     * \endif
     */
    public int						     emBeard;

    /**
     * \if ENGLISH_LANG
     * Attractive value, -1: invalid, 0:no disringuish，range: 1-100, the higher value, the higher charm
     * \else
     * 魅力值, -1表示无效, 0未识别，识别时范围1-100,得分高魅力高
     * \endif
     */
    public int							nAttractive;

    /**
     * \if ENGLISH_LANG
     * Temperature, it is valid when bAnatomyTempDetect is true
     * \else
     * 温度, bAnatomyTempDetect 为true时有效
     * \endif
     */
    public double						dbTemperature;

    /**
     * \if ENGLISH_LANG
     * Is anatomy temperature detection
     * \else
     * 
     * \endif
     */
    public boolean					bAnatomyTempDetect;

    /**
     * \if ENGLISH_LANG
     * Temperature unit, it is valid when bAnatomyTempDetect is true,refer to {@link EM_HUMAN_TEMPERATURE_UNIT}
     * \else
     * 温度单位, bAnatomyTempDetect 为TRUE时有效, 参考{@link EM_HUMAN_TEMPERATURE_UNIT}
     * \endif
     */
    public int                        emTemperatureUnit;

    /**
     * \if ENGLISH_LANG
     * Is abnormal temperature, it is valid when bAnatomyTempDetect is true
     * \else
     * 是否超温, bAnatomyTempDetect 为true时有效
     * \endif
     */
    public boolean                   bIsOverTemp;
    /**
     * \if ENGLISH_LANG
     * Is abnormal temperature, it is valid when bAnatomyTempDetect is true
     * \else
     * 是否温度异常, bAnatomyTempDetect 为true时有效
     * \endif
     */
    public boolean                   bIsUnderTemp;

    @Override
    public String toString() {
        return "NET_FACE_DATA{" +
                "emSex=" + emSex +
                ", nAge=" + nAge +
                ", nFeatureValidNum=" + nFeatureValidNum +
                ", emFeature=" + Arrays.toString(emFeature) +
                ", emEye=" + emEye +
                ", emMouth=" + emMouth +
                ", emMask=" + emMask +
                ", emBeard=" + emBeard +
                ", nAttractive=" + nAttractive +
                ", dbTemperature=" + dbTemperature +
                ", bAnatomyTempDetect" + bAnatomyTempDetect +
                ", emTemperatureUnit" + emTemperatureUnit +
                ", bIsOverTemp" + bIsOverTemp +
                ", bIsUnderTemp" + bIsUnderTemp +
                '}';
    }
}
