package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Match information extension
 * \else
 * @brief 匹配信息扩展字段
 * \endif
 */
public class NET_OPENDOOR_MATCHINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  remote user ID
     * \else
     *  远程用户ID
     * \endif
     */
    public byte					szUserID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  user name
     * \else
     *  用户名
     * \endif
     */
    public byte					szUserName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  user type
     * \else
     *  用户类型
     * \endif
     */
    public int					emUserType;

    /**
     * \if ENGLISH_LANG
     *  entrance guard name
     * \else
     *  门禁名称
     * \endif
     */
    public byte					szName[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  match rate,range is 0-100
     * \else
     *  匹配度，范围为0-100
     * \endif
     */
    public int					nMatchRate;

    /**
     * \if ENGLISH_LANG
     *  open door type
     * \else
     *  开门方式
     * \endif
     */
    public int					emOpenDoorType;

    /**
     * \if ENGLISH_LANG
     *  (card|image)activation time
     * \else
     *  (卡、头像)生效日期 
     * \endif
     */
    public NET_TIME					stuActivationTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  (card|image)expiry time
     * \else
     *  (卡、头像)截止日期
     * \endif
     */
    public NET_TIME					stuExpiryTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  credit score
     * \else
     *  信用积分
     * \endif
     */
    public int					nScore;

    /**
     * \if ENGLISH_LANG
     *  company name
     * \else
     *  单位名称
     * \endif
     */
    public byte					szCompanyName[] = new byte[FinalVar.MAX_COMPANY_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  companion name
     * \else
     *  陪同人员姓名
     * \endif
     */
    public byte					szCompanionName[] = new byte[120];

    /**
     * \if ENGLISH_LANG
     *  company name of companion person
     * \else
     *  陪同人员单位名称
     * \endif
     */
    public byte					szCompanionCompany[] = new byte[FinalVar.MAX_COMPANY_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  permissible area
     * \else
     *  准许通行区域
     * \endif
     */
    public byte					szPermissibleArea[] = new byte[FinalVar.MAX_COMMON_STRING_128];

    /**
     * \if ENGLISH_LANG
     *  Section
     * \else
     *  部门名称
     * \endif
     */
    public byte					szSection[] = new byte[200];

    /**
     * \if ENGLISH_LANG
     *  education info
     * \else
     *  教育信息
     * \endif
     */
    public NET_CUSTOM_EDUCATION_INFO					pstuCustomEducationInfo = new NET_CUSTOM_EDUCATION_INFO();

    /**
     * \if ENGLISH_LANG
     *  health code info
     * \else
     *  健康码信息
     * \endif
     */
    public NET_HEALTH_CODE_INFO					pstuHealthCodeInfo = new NET_HEALTH_CODE_INFO();

    /**
     * \if ENGLISH_LANG
     *  room num
     * \else
     *  房间号
     * \endif
     */
    public byte					szRoomNo[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  IDCard info
     * \else
     *  证件信息
     * \endif
     */
    public NET_IDCARD_INFO					pstuIDCardInfo = new NET_IDCARD_INFO();

    /**
     * \if ENGLISH_LANG
     *  Bus station info
     * \else
     *  公交站信息
     * \endif
     */
    public NET_BUS_STATION_INFO					pstuBusStationInfo = new NET_BUS_STATION_INFO();

    /**
     * \if ENGLISH_LANG
     *  worker information
     * \else
     * 	工地工人信息
     * \endif
     */
    public NET_CUSTOM_WORKER_INFO					pstuCustomWorkerInfo = new NET_CUSTOM_WORKER_INFO();

    /**
     * \if ENGLISH_LANG
     * 	Whether to use the match information extension	filed
     * \else
     * 	是否使用匹配信息扩展字段
     * \endif
     */
    public boolean					bUseMatchInfoEx;

    /**
     * \if ENGLISH_LANG
     *  Match information extension
     * \else
     *  匹配信息扩展字段
     * \endif
     */
    public NET_OPENDOOR_MATCHINFO_EX					pstuMatchInfoEx = new NET_OPENDOOR_MATCHINFO_EX();

    /**
     * \if ENGLISH_LANG
     *  Nucleic acid detection information
     * \else
     *  核酸检测信息
     * \endif
     */
    public NET_HSJC_INFO					pstuHSJCInfo = new NET_HSJC_INFO();

    /**
     * \if ENGLISH_LANG
     *  Vaccine information
     * \else
     *  新冠疫苗接种信息
     * \endif
     */
    public NET_VACCINE_INFO					pstuVaccineInfo = new NET_VACCINE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Travel information
     * \else
     *  行程码信息
     * \endif
     */
    public NET_TRAVEL_INFO					pstuTravelInfo = new NET_TRAVEL_INFO();

    /**
     * \if ENGLISH_LANG
     *  Visitor information
     * \else
     *  访客信息
     * \endif
     */
    public NET_CUSTOM_VISITOR_INFO					pstuCustomVisitorInfo = new NET_CUSTOM_VISITOR_INFO();
}
