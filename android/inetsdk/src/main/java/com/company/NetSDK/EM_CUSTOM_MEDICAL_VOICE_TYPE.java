package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Voice type
 * \else
 * @brief 语音类型
 * \endif
 */
public class EM_CUSTOM_MEDICAL_VOICE_TYPE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Unknown
     * \else
     *  未知
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     *  The door is open for entry
     * \else
     *  门已打开，可以进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_1 = 1;

    /**
     * \if ENGLISH_LANG
     *  It's not an undergraduate room. You can't enter it
     * \else
     *  不是本科室，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_2 = 2;

    /**
     * \if ENGLISH_LANG
     *  Discharged, unable to enter
     * \else
     *  已出院，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_3 = 3;

    /**
     * \if ENGLISH_LANG
     *  Nucleic acid detection is overdue and cannot be entered
     * \else
     *  核酸检测超期，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_4 = 4;

    /**
     * \if ENGLISH_LANG
     *  Body temperature is abnormal and you can't enter
     * \else
     *  体温不正常，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_5 = 5;

    /**
     * \if ENGLISH_LANG
     *  ID card information is missing, unable to enter
     * \else
     *  证件信息缺失，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_6 = 6;

    /**
     * \if ENGLISH_LANG
     *  Other problems, no access
     * \else
     *  其他问题，不能进入
     * \endif
     */
    public static final int					EM_CUSTOM_MEDICAL_VOICE_TYPE_7 = 7;

}
