package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access blue tooth record
 * \else
 * 蓝牙开门记录集信息
 * \endif
 */
public class NET_RECORD_ACCESS_BLUETOOTH_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Record Number,Read-Only
     * \else
     * 记录集编号,只读
     * \endif
     */
    public int                         nRecNo;

    /**
     * \if ENGLISH_LANG
     * user name
     * \else
     * 用户名
     * \endif
     */
    public byte[]						szUserName = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * password
     * \else
     * 密码
     * \endif
     */
    public byte[]						szPassword = new byte[FinalVar.SDK_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     * mac addr
     * \else
     * mac地址
     * \endif
     */
    public byte[]        			    szMac = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * user note info
     * \else
     * 用户备注信息
     * \endif
     */
    public byte[]        			    szNote = new byte[FinalVar.SDK_COMMON_STRING_128];
}
