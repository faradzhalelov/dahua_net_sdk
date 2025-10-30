package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * The error code of modeling failed
 * \else
 * 特征建模失败错误码
 * \endif
 */
public class EM_FEATURE_ERROR_CODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Success
     * \else
     *  成功
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_SUCCESS = 0;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_UNKNOWN = 1;

    /**
     * \if ENGLISH_LANG
     *  Image format error
     * \else
     *  图片格式问题
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_IMAGE_FORMAT_ERROR = 2;

    /**
     * \if ENGLISH_LANG
     *  No target or image is not clear enough
     * \else
     *  无目标或不够清晰 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_NOFACE_OR_NOTCLEAR = 3;

    /**
     * \if ENGLISH_LANG
     *  Multiple faces
     * \else
     *  多个目标 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_MULT_FACES = 4;

    /**
     * \if ENGLISH_LANG
     *  Image decode failed
     * \else
     *  图片解码失败 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_IMAGH_DECODE_FAILED = 5;

    /**
     * \if ENGLISH_LANG
     *  Not suggest for storage
     * \else
     *  不推荐入库 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_NOT_SUGGEST_STORAGE = 6;

    /**
     * \if ENGLISH_LANG
     *  Database operate failed
     * \else
     *  数据库操作失败 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_DATABASE_OPERATE_FAILED = 7;

    /**
     * \if ENGLISH_LANG
     *  Failed to get image
     * \else
     *  获取图片失败 
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_GET_IMAGE_FAILED = 8;

    /**
     * \if ENGLISH_LANG
     *  System exception
     * \else
     *  系统异常（如Licence失效、建模分析器未启动导致的失败）
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_SYSTEM_EXCEPTION = 9;

    /**
     * \if ENGLISH_LANG
     *  undersized width
     * \else
     *  目标宽度过小
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_UNDERSIZED_WIDTH = 10;

    /**
     * \if ENGLISH_LANG
     *  undersized interpupillary distance
     * \else
     *  人眼瞳间距过小
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_UNDERSIZED_INTERPUPILLARY_DISTANCE = 11;

    /**
     * \if ENGLISH_LANG
     *  target alignment score low
     * \else
     *  目标对齐分数过低
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_ALIGNMENT_SCORE_LOW = 12;

    /**
     * \if ENGLISH_LANG
     *  oversized target pitch angle
     * \else
     *  目标俯仰角过大
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_OVERSIZED_FACE_PITCH_ANGLE = 13;

    /**
     * \if ENGLISH_LANG
     *  oversized target yaw angle
     * \else
     *  目标偏航角过大
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_OVERSIZED_FACE_YAW_ANGLE = 14;

    /**
     * \if ENGLISH_LANG
     *  oversized target roll angle
     * \else
     *  目标滚转角过大
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_OVERSIZED_FACE_ROLL_ANGLE = 15;

    /**
     * \if ENGLISH_LANG
     *  target quality low
     * \else
     *  目标质量分过低
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_QUALITY_LOW = 16;

    /**
     * \if ENGLISH_LANG
     *  target definition low
     * \else
     *  目标清晰度过低
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_DEFINITION_LOW = 17;

    /**
     * \if ENGLISH_LANG
     *  eye occlusion
     * \else
     *  人眼遮挡
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_EYE_OCCLUSION = 18;

    /**
     * \if ENGLISH_LANG
     *  forehead occlusion
     * \else
     *  目标额头遮挡
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FOREHEAD_OCCLUSION = 19;

    /**
     * \if ENGLISH_LANG
     *  mouth occlusion
     * \else
     *  目标嘴巴遮挡
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_MOUTH_OCCLUSION = 20;

    /**
     * \if ENGLISH_LANG
     *  incomplete face
     * \else
     *  目标不完整
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_INCOMPLETE_FACE = 21;

    /**
     * \if ENGLISH_LANG
     *  abnormal target exposure
     * \else
     *  目标光照过曝或者欠曝
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_ABNORMAL_FACE_EXPOSURE = 22;

    /**
     * \if ENGLISH_LANG
     *  target saturation low
     * \else
     *  目标饱和度过低
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_SATURATION_LOW = 23;

    /**
     * \if ENGLISH_LANG
     *  target area over proportion
     * \else
     *  目标区域在图像中占比过大
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_AREA_OVER_PROPORTION = 24;

    /**
     * \if ENGLISH_LANG
     *  target detection failed
     * \else
     *  图像中未检出目标
     * \endif
     */
    public static final int					EM_FEATURE_ERROR_FACE_DETECTION_FAILED = 25;

}
