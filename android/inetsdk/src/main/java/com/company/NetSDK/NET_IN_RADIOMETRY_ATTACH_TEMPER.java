package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_RadiometryAttachTemper input parameter
 * \else
 * @brief CLIENT_RadiometryAttachTemper 入参
 * \endif
 */
public class NET_IN_RADIOMETRY_ATTACH_TEMPER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  channel number
     * \else
     *  通道号
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
    public CB_fRadiometryAttachTemperCB					cbNotify;

    /**
     * \if ENGLISH_LANG
     *  user data
     * \else
     *  用户数据
     * \endif
     */
    public long					dwUser;

}