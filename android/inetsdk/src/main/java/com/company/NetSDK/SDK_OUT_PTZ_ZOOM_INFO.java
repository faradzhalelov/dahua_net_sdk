package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Query PTZ optical zoom value( corresponding to SDK_DEVSTATE_PTZ_ZOOM_INFO )
 * \else
 * @brief 获取云台光学变倍信息,对应命令 SDK_DEVSTATE_PTZ_ZOOM_INFO
 * \endif
 */
public class SDK_OUT_PTZ_ZOOM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  zoom value
     * \else
     *  光学变倍值
     * \endif
     */
    public int					nZoomValue;

}