package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * event image info
 * \else
 * 事件抠图信息
 * \endif
 */
public class NET_EVENT_IMAGE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * image length
     * \else
     * 图片长度
     * \endif
     */
    public  int			 nImageLength;

    /**
     * \if ENGLISH_LANG
     * image path
     * \else
     * 图片路径
     * \endif
     */
    public byte[]		     szImagePath = new byte[FinalVar.SDK_COMMON_STRING_128];
}
