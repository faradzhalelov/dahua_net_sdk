package com.company.NetSDK;

import java.io.Serializable;


/**
 * 搜索OEM设备类型枚举
 */
public class NET_IN_INIT_DEVICE_ACCOUNT_BY_PORT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     *  设备mac地址
     */
    public byte					szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     *  用户名
     */
    public byte					szUserName[] = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     *  设备密码
     */
    public byte					szPwd[] = new byte[FinalVar.MAX_PWD_LEN];

    /**
     *  预留手机号
     */
    public byte					szCellPhone[] = new byte[FinalVar.MAX_CELL_PHONE_NUMBER_LEN];

    /**
     *  预留邮箱
     */
    public byte					szMail[] = new byte[FinalVar.MAX_MAIL_LEN];

    /**
     *  此字段已经废弃
     */
    public byte					byInitStatus;

    /**
     *  设备支持的密码重置方式：搜索设备接口(CLIENT_SearchDevices、CLIENT_StartSearchDevices的回调函数、CLIENT_SearchDevicesByIPs)返回字段byPwdResetWay的值
     *  该值的具体含义见 DEVICE_NET_INFO_EX 结构体，需要与设备搜索接口返回的 byPwdResetWay 值保持一致
     *  bit0 : 1-支持预留手机号，此时需要在szCellPhone数组中填入预留手机号(如果需要设置预留手机)
     *  bit1 : 1-支持预留邮箱，此时需要在szMail数组中填入预留邮箱(如果需要设置预留邮箱)
     */
    public byte					byPwdResetWay;

    /**
     *  端口号 : LC设备的组播端口号
     */
    public int					nPort;

}
