package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief New crown vaccination information
 * \else
 * @brief 新冠疫苗接种信息
 * \endif
 */
public class NET_VACCINE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Have you been vaccinated against the new crown vaccine, 0: No, 1: Yes
     * \else
     *  是否已接种新冠疫苗, 0: 否, 1: 是
     * \endif
     */
    public int					nVaccinateFlag;

    /**
     * \if ENGLISH_LANG
     *  New crown vaccine name
     * \else
     *  新冠疫苗名称
     * \endif
     */
    public byte					szVaccineName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Valid number of historical vaccination dates
     * \else
     *  历史接种日期有效个数
     * \endif
     */
    public int					nDateCount;

    /**
     * \if ENGLISH_LANG
     *  Historical vaccination date(yyyy-MM-dd). If you cannot provide the time, fill in "0000-00-00", which means that you have been vaccinated
     * \else
     *  历史接种日期 (yyyy-MM-dd). 如提供不了时间, 则填"0000-00-00", 表示已接种
     * \endif
     */
    public byte					szVaccinateDate[][] = new byte[8][32];

}
