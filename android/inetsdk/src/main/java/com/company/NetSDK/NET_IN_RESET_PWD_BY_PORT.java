package com.company.NetSDK;

import java.io.Serializable;


/**
 * 搜索OEM设备类型枚举
 */
public class NET_IN_RESET_PWD_BY_PORT implements Serializable {
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
     *  密码
     */
    public byte					szPwd[] = new byte[FinalVar.MAX_PWD_LEN];

    /**
     *  平台发送到预留手机或邮箱中的安全码
     */
    public byte					szSecurity[] = new byte[FinalVar.MAX_SECURITY_CODE_LEN];

    /**
     *  设备初始化状态：搜索设备接口(CLIENT_SearchDevices、CLIENT_StartSearchDevices的回调函数、CLIENT_SearchDevicesByIPs)返回字段byInitStatus的值
     */
    public byte					byInitStaus;

    /**
     *  设备支持的密码重置方式：搜索设备接口(CLIENT_SearchDevices、CLIENT_StartSearchDevices的回调函数、CLIENT_SearchDevicesByIPs)返回字段byPwdResetWay的值
     */
    public byte					byPwdResetWay;

    /**
     *  用户输入安全码需输入接收安全码的联系方式，如果bSetContact为TRUE，则该联系方式将作为预留联系方式
     */
    public byte					szContact[] = new byte[FinalVar.MAX_CONTACT_LEN];

    /**
     *  是否同意设置为预留手机号, TRUE:同意; FALSE:不同意
     */
    public boolean					bSetContact;

    /**
     *  端口号 : LC设备的组播端口号
     */
    public int					nPort;

}
