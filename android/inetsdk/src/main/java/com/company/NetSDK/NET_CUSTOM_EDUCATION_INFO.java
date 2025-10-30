package com.company.NetSDK;

import com.company.NetSDK.EM_CUSTOM_EDUCATION_VOICE_TYPE;
import com.company.NetSDK.EM_EDUCATION_INFO_TYPE;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief education info
 * \else
 * @brief 教育信息
 * \endif
 */
public class NET_CUSTOM_EDUCATION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  info type,{@link EM_EDUCATION_INFO_TYPE}
     * \else
     *  信息类型,{@link EM_EDUCATION_INFO_TYPE}
     * \endif
     */
    public int					emInfoType;

    /**
     * \if ENGLISH_LANG
     *  student seat number, min:1
     * \else
     *  座位号,最小值为1
     * \endif
     */
    public int					nStudentSeatNumber;

    /**
     * \if ENGLISH_LANG
     *  info content
     * \else
     *  消息内容
     * \endif
     */
    public byte					szInfoContent[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  voice type,{@link EM_CUSTOM_EDUCATION_VOICE_TYPE}
     * \else
     *  语音类型,{@link EM_CUSTOM_EDUCATION_VOICE_TYPE}
     * \endif
     */
    public int					emVoiceType;

}
