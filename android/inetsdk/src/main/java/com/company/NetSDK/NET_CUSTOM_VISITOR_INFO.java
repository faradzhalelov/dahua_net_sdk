package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Visitor information
 * \else
 * @brief 访客信息
 * \endif
 */
public class NET_CUSTOM_VISITOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Visitor Name
     * \else
     *  访客姓名
     * \endif
     */
    public byte					szVisitorName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Visitor telephone
     * \else
     *  访客电话
     * \endif
     */
    public byte					szVisitorTel[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Access start time
     * \else
     *  访问开始时间
     * \endif
     */
    public byte					szVisitorStartTime[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Access end time
     * \else
     *  访问结束时间
     * \endif
     */
    public byte					szVisitorEndTime[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Visitor reason
     * \else
     *  访客事由
     * \endif
     */
    public byte					szVisitorAccessFor[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Visitor ID number
     * \else
     *  访客证件号
     * \endif
     */
    public byte					szVisitorCitizenID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Name of interviewee
     * \else
     *  被访者姓名
     * \endif
     */
    public byte					szRespondentName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Telephone number of respondents
     * \else
     *  被访者电话
     * \endif
     */
    public byte					szRespondentTel[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Respondent unit
     * \else
     *  被访者单位
     * \endif
     */
    public byte					szRespondentCompany[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Respondent Department
     * \else
     *  被访者部门
     * \endif
     */
    public byte					szRespondentSection[] = new byte[64];

}
