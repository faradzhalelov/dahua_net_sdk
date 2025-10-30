package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryAttach input parameter
 * \else
 * @brief CLIENT_RadiometryAttach 入参
 * \endif
 */
public class NET_IN_RADIOMETRY_ATTACH implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  video channel number -1, it means all
     * \else
     *  视频通道号	-1 表示全部
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  state callback function pointer
     * \else
     *  状态回调函数指针
     * \endif
     */
    public CB_fRadiometryAttachCB					cbNotify;

}