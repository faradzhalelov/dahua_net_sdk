package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Match information extension
 * \else
 * @brief 匹配信息扩展字段
 * \endif
 */
public class NET_OPENDOOR_MATCHINFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *   Name extension
     * \else
     *   扩展用户名
     * \endif
     */
    public byte					szUserNameEx[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *   Voice type,{@link EM_CUSTOM_MEDICAL_VOICE_TYPE}
     * \else
     *   语音类型 ,{@link EM_CUSTOM_MEDICAL_VOICE_TYPE}
     * \endif
     */
    public int					emVoiceType;

}
