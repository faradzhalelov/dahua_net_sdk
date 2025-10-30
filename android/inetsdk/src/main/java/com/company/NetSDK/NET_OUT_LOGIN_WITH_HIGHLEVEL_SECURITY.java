package com.company.NetSDK;

import java.io.Serializable;

/**
 * Created by 29875 on 2019/8/28.
 */
public class NET_OUT_LOGIN_WITH_HIGHLEVEL_SECURITY  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * device info
     * \else
     * 设备信息
     * \endif
     */
    public NET_DEVICEINFO_Ex			stuDeviceInfo = new NET_DEVICEINFO_Ex();

    /**
     * \if ENGLISH_LANG
     * error code , see error in CLIENT_Login
     * \else
     * 错误码，见 CLIENT_Login 接口错误码
     * \endif
     */
    public int							nError;

}
