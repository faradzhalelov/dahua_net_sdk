package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief device info
 * \else
 * @brief 设备信息
 * \endif
 */
public class EM_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Device disconnection callback during the verification period
     * \else
     *  验证期间设备断线回调
     * \endif
     */
    public static final int					SDK_DVR_DISCONNECT = -1;

    /**
     * \if ENGLISH_LANG
     *  Device send out SN callback char* szDevSerial
     * \else
     *  设备注册携带序列号 对应 char* szDevSerial
     * \endif
     */
    public static final int					SDK_DVR_SERIAL_RETURN = 1;

    /**
     * \if ENGLISH_LANG
     *  when device registering,serial number and token to carry, corresponding NET_CB_AUTOREGISTER
     * \else
     *  设备注册携带序列号和令牌 对应NET_CB_AUTOREGISTER
     * \endif
     */
    public static final int					NET_DEV_AUTOREGISTER_RETURN = 2;

    /**
     * \if ENGLISH_LANG
     *  Equipment is only reported IP, not used for active registration
     * \else
     *  设备仅上报IP, 不作为主动注册用, 用户获取ip后只能按照约定的端口按照非主动注册的类型登录
     * \endif
     */
    public static final int					NET_DEV_NOTIFY_IP_RETURN = 3;

    /**
     * \if ENGLISH_LANG
     *  Active registration primary-backup scheme, corresponding to the structure NET_CB_AUTOREGISTER_PRIMARY_BACKUP_INFO
     * \else
     *  主动注册主备方案，对应结构体NET_CB_AUTOREGISTER_PRIMARY_BACKUP_INFO
     * \endif
     */
    public static final int					NET_DEV_AUTOREGISTER_PRIMARY_BACKUP = 4;

}