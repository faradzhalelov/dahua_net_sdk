package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Bar Code Info
 * \else
 * @brief 与包裹关联的单号的内容
 * \endif
 */
public class NET_BAR_CODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Code Count
     * \else
     * 条码个数
     * \endif
     */
    public int					nCodeCount;

    /**
     * \if ENGLISH_LANG
     *  Code
     * \else
     * 条码信息
     * \endif
     */
    public byte					szCode[][] = new byte[32][128];

    /**
     * \if ENGLISH_LANG
     *  Bar Code Image
     * \else
     * 条码可见光图
     * \endif
     */
    public NET_BAR_CODE_IMAGE					stuImage = new NET_BAR_CODE_IMAGE();

}