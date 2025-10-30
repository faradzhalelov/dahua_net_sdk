package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_AttachGyro Interface oinput parameter
 * \else
 * @brief CLIENT_AttachGyro接口入参
 * \endif
 */
public class NET_IN_ATTACH_GYRO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Callback function
     * \else
     *  回调函数
     * \endif
     */
    public CB_fNotifyGyroDataCallBack cbNotifyGyroData;

    /**
     * \if ENGLISH_LANG
     *  User Data
     * \else
     *  用户自定义参数
     * \endif
     */
    public int					dwUser;

}
