package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input param of init account
 * \else
 * 初始化账户入参结构体
 * \endif
 */
public class NET_IN_INIT_ACCOUNT implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * user
     * \else
     * 用户名
     * \endif
     */
    public byte[]					szUser = new byte[FinalVar.MAX_USER_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 密码
     * \endif
     */
    public byte[]					szPwd = new byte[FinalVar.MAX_PWD_LEN];

    /**
     * \if ENGLISH_LANG
     * mac address
     * \else
     * 设备的Mac地址
     * \endif
     */
    public byte[]					szMac = new byte[FinalVar.SDK_MACADDR_LEN];

    /**
     * \if ENGLISH_LANG
     * Account type, refer to {@link EM_ACCOUNT_TYPE}
     * \else
     * 账户类型, 取值参考 {@link EM_ACCOUNT_TYPE}
     * \endif
     */
    public int  emAccountType;
}

