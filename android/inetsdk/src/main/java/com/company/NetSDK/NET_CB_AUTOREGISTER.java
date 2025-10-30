package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_ListenServer backcall interface, fServiceCallBack support command mode
 * \else
 * @brief CLIENT_ListenServer 接口回调fServiceCallBack函数NET_DEV_AUTOREGISTER_PRIMARY_BACKUP对应的信息
 * \endif
 */
public class NET_CB_AUTOREGISTER implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  device serial
     * \else
     *  序列号
     * \endif
     */
    public byte					szDevSerial[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];

    /**
     * \if ENGLISH_LANG
     *  token
     * \else
     *  令牌
     * \endif
     */
    public byte					szToken[] = new byte[FinalVar.MAX_PATH];

}