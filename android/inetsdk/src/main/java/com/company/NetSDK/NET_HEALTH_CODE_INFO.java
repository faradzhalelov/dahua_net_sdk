package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief health code info
 * \else
 * @brief 健康码信息
 * \endif
 */
public class NET_HEALTH_CODE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  card id
     * \else
     *  证件号
     * \endif
     */
    public byte					szCitizenID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  card name
     * \else
     *  证件姓名
     * \endif
     */
    public byte					szCitizenName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  permanent address
     * \else
     *  常驻地
     * \endif
     */
    public byte					szPermanentAddr[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  current address
     * \else
     *  当前地址
     * \endif
     */
    public byte					szCurrentAddr[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  health code status,{@link EM_HEALTH_CODE_STATUS}
     * \else
     *  健康码状态,{@link EM_HEALTH_CODE_STATUS}
     * \endif
     */
    public int					emHealthCodeStatus;

    /**
     * \if ENGLISH_LANG
     *  phone number
     * \else
     *  手机号
     * \endif
     */
    public byte					szPhoneNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  abnormal code reason
     * \else
     *  异常原因
     * \endif
     */
    public byte					szAbnormalCodeReason[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  query time
     * \else
     *  查询时间戳
     * \endif
     */
    public NET_TIME					stuQueryTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  stuEpidemicAreaExperience's count
     * \else
     *  stuEpidemicAreaExperience 个数
     * \endif
     */
    public int					nEpidemicAreaExperience;

    /**
     * \if ENGLISH_LANG
     *  epidemic area experience
     * \else
     *  疫区经历
     * \endif
     */
    public NET_EPIDEMIC_AREA_EXPERIENCE					stuEpidemicAreaExperience[] = new NET_EPIDEMIC_AREA_EXPERIENCE[10];

    public NET_HEALTH_CODE_INFO() {
        this.nEpidemicAreaExperience = nEpidemicAreaExperience;
        for(int i = 0; i < 10; i ++){
            this.stuEpidemicAreaExperience[i] = new NET_EPIDEMIC_AREA_EXPERIENCE();
        }
    }
}
