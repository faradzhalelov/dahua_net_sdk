package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief the input parameters of CLIENT_CheckAuthCode
 * \else
 * @brief 校验安全码输入结构体
 * \endif
 */
public class NET_IN_CHECK_AUTHCODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  mac addr
     * \else
     * 设备mac地址
     * \endif
     */
    public byte					szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     *  security code
     * \else
     * 平台发送到预留手机或邮箱中的安全码
     * \endif
     */
    public byte					szSecurity[] = new byte[FinalVar.MAX_SECURITY_CODE_LEN];

    /**
     * \if ENGLISH_LANG
     *  phone number of receiving security code
     * \else
     * 用户输入安全码需输入接收安全码的联系方式
     * \endif
     */
    public byte					szContact[] = new byte[FinalVar.MAX_CONTACT_LEN];

}