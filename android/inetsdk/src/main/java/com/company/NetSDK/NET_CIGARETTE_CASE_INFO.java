package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Cigarette Case Information
 * \else
 * @brief 销售香烟信息
 * \endif
 */
public class NET_CIGARETTE_CASE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Cigarette type
     * \else
     *  销售烟盒种类,目前支持的类型如下
     * \endif
     */
    public byte					szCigaretteType[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Quantity of cigarette sold
     * \else
     *  销售烟盒数量，单位为盒
     * \endif
     */
    public int					CigaretteNum;

}