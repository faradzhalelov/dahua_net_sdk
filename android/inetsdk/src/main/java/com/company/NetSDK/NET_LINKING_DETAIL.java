package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * light type of linking
 * \else
 * 云台联动灯光类型
 * \endif
 */
public class NET_LINKING_DETAIL implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Information of filcker light
     * \else
     * 闪烁灯光信息
     * \endif
     */
    public NET_FILCKER_LIGHTING								stuFilckerLighting = new NET_FILCKER_LIGHTING();

    /**
     * \if ENGLISH_LANG
     * Information of keeping light
     * \else
     * 常亮灯光信息
     * \endif
     */
    public NET_KEEP_LIGHTING								stuKeepLighting = new NET_KEEP_LIGHTING();

}
