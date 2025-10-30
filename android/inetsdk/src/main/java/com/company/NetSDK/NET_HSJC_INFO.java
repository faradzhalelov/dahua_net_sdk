package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Nucleic acid detection information
 * \else
 * @brief 核酸检测信息
 * \endif
 */
public class NET_HSJC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Date of nucleic acid test report (yyyy-MM-dd)
     * \else
     *  核酸检测报告日期 (yyyy-MM-dd)
     * \endif
     */
    public byte					szHSJCReportDate[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Validity period of nucleic acid test report (days)
     * \else
     *  核酸检测报告有效期(天)
     * \endif
     */
    public int					nHSJCExpiresIn;

    /**
     * \if ENGLISH_LANG
     *  Nucleic acid test report result, 0: positive, 1: negative, 2: not tested, 3: expired
     * \else
     *  核酸检测报告结果, 0: 异常, 1: 正常, 2: 未检测, 3: 过期
     * \endif
     */
    public int					nHSJCResult;

    /**
     * \if ENGLISH_LANG
     *  Nucleic acid detection organization
     * \else
     *  核酸检测机构
     * \endif
     */
    public byte					szHSJCInstitution[] = new byte[256];

}
