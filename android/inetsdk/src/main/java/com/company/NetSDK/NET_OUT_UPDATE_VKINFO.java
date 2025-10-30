package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#UpdateVK} port output parameter
 * \else
 * {@link INetSDK#UpdateVK} 接口输出参数
 * \endif
 */
public class NET_OUT_UPDATE_VKINFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * VK ID
     * \else
     * VK ID
     * \endif
     */
    public byte                        szVKID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}
