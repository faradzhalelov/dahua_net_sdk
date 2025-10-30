package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RFID electronics tag info
 * \else
 * RFID 电子车牌标签信息
 * \endif
 */
public class NET_RFIDELETAG_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * card ID
     * \else
     * 卡号
     * \endif
     */
    public byte[]					szCardID = new byte[FinalVar.MAX_RFIDELETAG_CARDID_LEN];

    /**
     * \if ENGLISH_LANG
     * card type, 0:issued by transport administration offices, 1:new factory preloaded card
     * \else
     * 卡号类型, 0:交通管理机关发行卡, 1:新车出厂预装卡
     * \endif
     */
    public int						nCardType;

    /**
     * \if ENGLISH_LANG
     * card privince, refer to {@link EM_CARD_PROVINCE}
     * \else
     * 卡号省份, 参考 {@link EM_CARD_PROVINCE}
     * \endif
     */
    public int		                emCardPrivince;

    /**
     * \if ENGLISH_LANG
     * plate number
     * \else
     * 车牌号码
     * \endif
     */
    public byte[]					szPlateNumber = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

    /**
     * \if ENGLISH_LANG
     * production data
     * \else
     * 出厂日期
     * \endif
     */
    public byte[]					szProductionDate = new byte[FinalVar.MAX_RFIDELETAG_DATE_LEN];

    /**
     * \if ENGLISH_LANG
     * car type,refer to {@link EM_CAR_TYPE}
     * \else
     * 车辆类型, 参考 {@link EM_CAR_TYPE}
     * \endif
     */
    public int				        emCarType;

    /**
     * \if ENGLISH_LANG
     * power, unit:kilowatt-hour, range:0~254, 255 means larger than maximum power value can be stored
     * \else
     * 功率,单位：千瓦时，功率值范围0~254；255表示该车功率大于可存储的最大功率值
     * \endif
     */
    public int						nPower;

    /**
     * \if ENGLISH_LANG
     * displacement, unit:100ml, range:0~254, 255 means larger than maximum displacement value can be stored
     * \else
     * 排量,单位：百毫升，排量值范围0~254；255表示该车排量大于可存储的最大排量值
     * \endif
     */
    public int						nDisplacement;

    /**
     * \if ENGLISH_LANG
     * antenna ID, range:1~4
     * \else
     * 天线ID，取值范围:1~4
     * \endif
     */
    public int						nAntennaID;

    /**
     * \if ENGLISH_LANG
     * plate type，refer to {@link EM_PLATE_TYPE}
     * \else
     * 号牌种类, 参考 {@link EM_PLATE_TYPE}
     * \endif
     */
    public int			            emPlateType;

    /**
     * \if ENGLISH_LANG
     * validity of inspection, year-month
     * \else
     * 检验有效期，年-月
     * \endif
     */
    public byte[]					szInspectionValidity = new byte[FinalVar.MAX_RFIDELETAG_DATE_LEN];

    /**
     * \if ENGLISH_LANG
     * the flag of inspetion, 0:already inspection, 1:not inspection
     * \else
     * 逾期未年检标志, 0:已年检, 1:逾期未年检
     * \endif
     */
    public int						nInspectionFlag;

    /**
     * \if ENGLISH_LANG
     * the years form effective inspection preiod to compulsory discarding preiod
     * \else
     * 强制报废期，从检验有效期开始，距离强制报废期的年数
     * \endif
     */
    public int						nMandatoryRetirement;

    /**
     * \if ENGLISH_LANG
     * car color, refer to {@link EM_CAR_COLOR_TYPE}
     * \else
     * 车身颜色, 参考 {@link EM_CAR_COLOR_TYPE}
     * \endif
     */
    public int		                emCarColor;

    /**
     * \if ENGLISH_LANG
     * authorized capacity, unit:people, <0:incalid
     * \else
     * 核定载客量，该值<0时：无效；此值表示核定载客，单位为人
     * \endif
     */
    public int						nApprovedCapacity;

    /**
     * \if ENGLISH_LANG
     * total weight, unit:100kg, range:0~0x3FF,  0x3FF1023:larger than maximum value can be stored, <0:invalid
     * \else
     * 此值表示总质量，单位为百千克；该值<0时：无效；该值的有效范围为0~0x3FF，0x3FF（1023）表示数据值超过了可存储的最大值
     * \endif
     */
    public int						nApprovedTotalQuality;

    /**
     * \if ENGLISH_LANG
     * the time when the car is pass
     * \else
     * 过车时间
     * \endif
     */
    public NET_TIME_EX				stuThroughTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * use property, refer to {@link EM_USE_PROPERTY_TYPE}
     * \else
     * 使用性质, 参考 {@link EM_USE_PROPERTY_TYPE}
     * \endif
     */
    public int	                    emUseProperty;

    /**
     * \if ENGLISH_LANG
     * Licensing code, UTF-8 encoding
     * \else
     * 发牌代号，UTF-8编码
     * \endif
     */
    public byte[]					szPlateCode = new byte[FinalVar.MAX_COMMON_STRING_8];

    /**
     * \if ENGLISH_LANG
     * Plate number, serial number, UTF-8 code
     * \else
     * 号牌号码序号，UTF-8编码
     * \endif
     */
    public byte[]					szPlateSN = new byte[FinalVar.MAX_COMMON_STRING_16];
}
