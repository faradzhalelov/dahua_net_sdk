package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * audio intensity message info
 * \else
 * 异常音检测信息
 * \endif
 */
public class AUDIO_INTENSITY_MESSAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * message type,for example:"Audio Detection"
     * \else
     * 消息类型，如"Audio Detection"
     * \endif
     */
    public byte[]                 szType = new byte[128];

    /**
     * \if ENGLISH_LANG
     * message info
     * \else
     * 消息内容
     * \endif
     */
    public byte[]                 szContent = new byte[128];

}
