package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief componion info
 * \else
 * @brief 陪同人员信息
 * \endif
 */
public class NET_COMPANION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  card
     * \else
     *  陪同者卡号
     * \endif
     */
    public byte					szCompanionCard[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  user id
     * \else
     *  陪同者ID	
     * \endif
     */
    public byte					szCompanionUserID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  name 
     * \else
     *  陪同者姓名
     * \endif
     */
    public byte					szCompanionName[] = new byte[120];

    /**
     * \if ENGLISH_LANG
     *  Company
     * \else
     *  陪同者单位
     * \endif
     */
    public byte					szCompanionCompany[] = new byte[200];

}
