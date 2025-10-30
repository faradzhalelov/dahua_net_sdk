package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#AttachVK} output parameter
 * \else
 * 接口 {@link INetSDK#AttachVK} 输出参数
 * \endif
 */
public class NET_OUT_ATTACH_VK implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * VK and VKID info
     * \else
     * VK二值对信息
     * \endif
     */
    public NET_VKINFO stuCurrentVKInfo = new NET_VKINFO();

    /**
     * \if ENGLISH_LANG
     * Whether contain the previous VK info,TRUE means contain previous VK info,FALSE means not contain previous VK info
     * \else
     * 是否含有前一个VK二值对信息,true表示有前一个VK二值对，false表示没有前一个VK二值对
     * \endif
     */
    public boolean		bContainPrevVKInfo;

    /**
     * \if ENGLISH_LANG
     * Previous VK and VKID info
     * \else
     * 前一个VK二值对信息
     * \endif
     */
    public NET_VKINFO	stuPrevVKInfo = new NET_VKINFO();
}
