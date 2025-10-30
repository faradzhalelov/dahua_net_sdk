package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#GetMediaEncryptCaps} output param
 * \else
 * 接口{@link INetSDK#GetMediaEncryptCaps}输出参数
 * \endif
 */
public class NET_OUT_GET_MEDIA_ENCRYPT_CAPS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * media encrypt caps info
     * \else
     * 码流加密能力集信息
     * \endif
     */
    public NET_MEDIA_ENCRYPT_CAPS_INFO[]           pstuCapsInfo;

    /**
     * \if ENGLISH_LANG
     * max caps info count
     * \else
     * 最大获取码流加密能力集个数
     * \endif
     */
    public int                 nMaxCapsInfoCount;

    /**
     * \if ENGLISH_LANG
     * return caps info count
     * \else
     * 返回的码流加密能力集个数
     * \endif
     */
    public int                 nRetCapsInfoCount;

    public NET_OUT_GET_MEDIA_ENCRYPT_CAPS(int nMaxCapsInfoCount){
        this.nMaxCapsInfoCount = nMaxCapsInfoCount;
        pstuCapsInfo = new NET_MEDIA_ENCRYPT_CAPS_INFO[nMaxCapsInfoCount];
        for(int i = 0; i < nMaxCapsInfoCount; i++) {
            pstuCapsInfo[i] = new NET_MEDIA_ENCRYPT_CAPS_INFO();
        }
    }
}
