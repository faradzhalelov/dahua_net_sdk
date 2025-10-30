package com.company.NetSDK;

import java.io.Serializable;


/**
 * 搜索OEM设备类型枚举
 */
public class NET_IN_DESCRIPTION_FOR_RESET_PWD_BY_PORT implements Serializable {
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
     *  设备初始化状态：搜索设备接口(CLIENT_SearchDevices、CLIENT_StartSearchDevices的回调函数、CLIENT_SearchDevicesByIPs)返回字段byInitStatus的值
     */
    public byte					byInitStatus;

    /**
     *  端口号 : LC设备的组播端口号
     */
    public int					nPort;

}
