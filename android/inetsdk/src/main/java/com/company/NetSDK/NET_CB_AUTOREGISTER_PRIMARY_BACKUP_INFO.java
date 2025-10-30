package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Information corresponding to the fServiceCallBack function of the NET_DEV_AUTOREGISTER_PRIMARY_BACKUP callback interface in CLIENT_ListenServer.
 * \else
 * @brief CLIENT_ListenServer 接口回调fServiceCallBack函数NET_DEV_AUTOREGISTER_PRIMARY_BACKUP对应的信息
 * \endif
 */
public class NET_CB_AUTOREGISTER_PRIMARY_BACKUP_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Serial number
     * \else
     *  序列号
     * \endif
     */
    public byte					szDevSerial[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  0: Normal active registration scheme 1: Registration packet of actively registered primary service 2: Registration packet of actively registered backup service 3: Registration packet of actively registered primary service online
     * \else
     *  0:普通主动注册方案  1:主动注册主服务的注册包 2:表示主动注册备服务的注册包 3:表示主动注册主服务在线
     * \endif
     */
    public int					nType;

}