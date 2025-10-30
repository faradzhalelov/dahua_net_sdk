package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 *  card info
 * \else
 *  卡片信息
 * \endif
 */
public class NET_ACCESS_CARD_INFO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  card number
     * \else
     * 卡号
     * \endif
     */
    public byte     szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];

    /**
     * \if ENGLISH_LANG
     *  user id
     * \else
     * 用户ID
     * \endif
     */
    public byte     szUserID[] = new byte[FinalVar.SDK_MAX_USERID_LEN];

    /**
     * \if ENGLISH_LANG
     *  card type,only support General、Corce、Mother card
     * \else
     * 卡类型,只支持一般卡、胁迫卡和母卡
     * \endif
     */
    public int     emType;

    /**
     * \if ENGLISH_LANG
     *  dynamic check code
     * \else
     * 动态校验码
     * \endif
     */
    public byte     szDynamicCheckCode[] = new byte[FinalVar.MAX_COMMON_STRING_16];


    @Override
    public String toString() {
        return "NET_ACCESS_CARD_INFO{" +
                "szCardNo=" + Arrays.toString(szCardNo) +
                ", szUserID=" + Arrays.toString(szUserID) +
                ", emType=" + emType +
                ", szDynamicCheckCode=" + Arrays.toString(szDynamicCheckCode) +
                '}';
    }
}
