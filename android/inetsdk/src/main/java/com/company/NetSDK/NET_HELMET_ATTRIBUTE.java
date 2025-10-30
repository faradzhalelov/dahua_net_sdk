package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Attribute of helmet
 * \else
 * @brief 安全帽属性
 * \endif
 */
public class NET_HELMET_ATTRIBUTE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The state of helmet
     * \else
     *  安全帽佩戴状态
     * \endif
     */
    public int					emHelmetState;

    /**
     * \if ENGLISH_LANG
     *  Color of helmet
     * \else
     *  安全帽颜色
     * \endif
     */
    public int					emHelmetColor;

    /**
     * \if ENGLISH_LANG
     *  Helmet Flag: 0: unknown, 1: alarm reaching trigger speed, 2: alarm reaching report speed, 3: both
     * \else
     *  报警类型: 0:未知, 1:达到触发速度的报警, 2:达到上报速度的报警, 3:两者同时达到
     * \endif
     */
    public int					nHelmetFlag;

    /**
     * \if ENGLISH_LANG
     *  Report Flag: -1: Unknown, 0: no alarm, 1: alarm,
     * \else
     *  报警上传标识 -1: 未知, 0: 未报警, 1: 报警,
     * \endif
     */
    public int					nReportFlag;

    /**
     * \if ENGLISH_LANG
     *  Helmet test results, 0-compliant 1-nonconforming 2-unknown
     * \else
     *  安全帽检测结果, 0-合规 1-不合规 2-未知
     * \endif
     */
    public int					nHasLegalHat;

}