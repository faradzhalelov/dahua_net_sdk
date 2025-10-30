package com.company.NetSDK;

import java.io.Serializable;
public class NET_MEMBERS_INFO implements Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * contact member name
     * \else
     * 联系人姓名
     * \endif
     */
    public byte[]				szName = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * device description
     * \else
     * 设备描述
     * \endif
     */
    public byte[]				szMobile = new byte[FinalVar.MAX_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * E-mail
     * \else
     * 电子邮箱
     * \endif
     */
    public byte[]				szEmail = new byte[FinalVar.MAX_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * organization
     * \else
     * 组织
     * \endif
     */
    public byte[]				szOrganization = new byte[FinalVar.MAX_COMMON_STRING_64];
}
