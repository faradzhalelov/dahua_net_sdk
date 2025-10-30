package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Package mode
 * \else
 * @brief 包裹产生方式
 * \endif
 */
public class EM_XRAY_PACKAGE_MODE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown
     * \else
     * 未知方式
     * \endif
     */
    public static final int					EM_XRAY_PACKAGE_MODE_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Local judgment result
     * \else
     * 本地判图结果
     * \endif
     */
    public static final int					EM_XRAY_PACKAGE_MODE_LOCAL = 0;

    /**
     * \if ENGLISH_LANG
     *  Local prediction results in the centralized judgment mode
     * \else
     * 集中判图模式中的本地预判结果
     * \endif
     */
    public static final int					EM_XRAY_PACKAGE_MODE_CENTRAL = 1;

}