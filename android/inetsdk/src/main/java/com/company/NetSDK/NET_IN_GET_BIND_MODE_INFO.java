package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_GetBindMode Indicates interface entry
 * \else
 * @brief CLIENT_GetBindMode 接口入参
 * \endif
 */
public class NET_IN_GET_BIND_MODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Classroom id. The default is 0
     * \else
     * 教室id号,默认0
     * \endif
     */
    public int					nClassRoomId;

}