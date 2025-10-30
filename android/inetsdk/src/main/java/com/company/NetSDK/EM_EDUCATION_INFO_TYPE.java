package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief info type
 * \else
 * @brief 信息类型
 * \endif
 */
public class EM_EDUCATION_INFO_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown             
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  check in            
     * \else
     *  签到
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_CHECK_IN = 1;

    /**
     * \if ENGLISH_LANG
     *  sign back           
     * \else
     *  签退
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_SIGN_BACK = 2;

    /**
     * \if ENGLISH_LANG
     *  roll call           
     * \else
     *  点名
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_ROLL_CALL = 3;

    /**
     * \if ENGLISH_LANG
     *  learning abnormal   
     * \else
     *  学习异常
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_LEARNING_ABNORMAL = 4;

    /**
     * \if ENGLISH_LANG
     *  examination         
     * \else
     *  考试
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_EXAMINATION = 5;

    /**
     * \if ENGLISH_LANG
     *  end of study        
     * \else
     *  结束学习
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_END_OF_STUDY = 6;

    /**
     * \if ENGLISH_LANG
     *  experience learning 
     * \else
     *  体验学习
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_EXPERIENCE_LEARNING = 7;

    /**
     * \if ENGLISH_LANG
     *  not learning        
     * \else
     *  未学习
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_NOT_LEARNING = 8;

    /**
     * \if ENGLISH_LANG
     *  midway in           
     * \else
     *  中途进入
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_MIDWAY_IN = 9;

    /**
     * \if ENGLISH_LANG
     *  midway leave        
     * \else
     *  中途离开
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_MIDWAY_LEAVE = 10;

    /**
     * \if ENGLISH_LANG
     *  campus tips 
     * \else
     *  校园提示信息 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_CAMPUS_TIPS = 11;

    /**
     * \if ENGLISH_LANG
     *  repeat photo,Please collect again 
     * \else
     *  照片重复，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_PHOTO_REPEAT = 12;

    /**
     * \if ENGLISH_LANG
     *  low target quality,Please collect again
     * \else
     *  目标质量低，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_LOW_FACE_QUALITY = 13;

    /**
     * \if ENGLISH_LANG
     *  target brightness too low,Please collect again
     * \else
     *  目标亮度过低，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_FACE_BRIGHTNESS_TOO_LOW = 14;

    /**
     * \if ENGLISH_LANG
     *  target brightness too high,Please collect again
     * \else
     *  目标亮度过高：请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_FACE_BRIGHTNESS_TOO_HIGH = 15;

    /**
     * \if ENGLISH_LANG
     *  target brightness uneven,Please collect again
     * \else
     *  目标亮度不均匀，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_FACE_BRIGHTNESS_UNEVEN = 16;

    /**
     * \if ENGLISH_LANG
     *  please provide front target photo
     * \else
     *  请提供正脸照片 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_PROVIDE_FRONT_FACE_PHOTO = 17;

    /**
     * \if ENGLISH_LANG
     *  target is not clear,Please collect again
     * \else
     *  目标不清晰，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_UNCLEAR_FACE = 18;

    /**
     * \if ENGLISH_LANG
     *  eye has been coverd,Please collect again
     * \else
     *  眼部有遮挡，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_EYE_BEEN_COVERED = 19;

    /**
     * \if ENGLISH_LANG
     *  target too small,Please collect again
     * \else
     *  目标过小，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_FACE_TOO_SMALL = 20;

    /**
     * \if ENGLISH_LANG
     *  please provide color photo 
     * \else
     *  请提供彩色照片 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_PROVIDE_COLOR_PHOTO = 21;

    /**
     * \if ENGLISH_LANG
     *  absence of face,Please collect again
     * \else
     *  脸部缺失，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_ABSENCE_OF_FACE = 22;

    /**
     * \if ENGLISH_LANG
     *  not wear mask,Please collect again 
     * \else
     *  禁止戴口罩，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_NOT_WEAR_MASK = 23;

    /**
     * \if ENGLISH_LANG
     *  photo too big,Please collect again 
     * \else
     *  上传照片过大，请重新采集 
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_PHOTO_TOO_BIG = 24;

    /**
     * \if ENGLISH_LANG
     *  photo too small,Please collect again
     * \else
     *  上传照片过小，请重新采集
     * \endif
     */
    public static final int					EM_EDUCATION_INFO_TYPE_PHOTO_TOO_SAMLL = 25;

}
