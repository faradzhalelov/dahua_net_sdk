package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * VK and VKID info
 * \else
 * VK二值对信息
 * \endif
 */
public class NET_VKINFO implements Serializable {
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

    /**
     * \if ENGLISH_LANG
     * VK
     * \else
     * VK
     * \endif
     */
    public byte                        szVK[] = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * 加密算法类型  {@link EM_ALGORITHM_TYPE}
     * \else
     * AlgorithmType {@link EM_ALGORITHM_TYPE}
     * \endif
     */
    public int emAlgorithmType;

    /**
     * \if ENGLISH_LANG
     * 返回的VKID实际大小
     * \else
     * Return VKID len
     * \endif
     */
    public int	 nRetVKIDLen;

    /**
     * \if ENGLISH_LANG
     * 返回的VK实际大小
     * \else
     * Return VK len
     * \endif
     */
    public int	 nRetVKLen;

}
