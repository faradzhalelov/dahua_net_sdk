package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * card picture compare event,command: {@link FinalVar#EVENT_IVS_CITIZEN_PICTURE_COMPARE}
 * \else
 * 人证比对事件，用实时拍摄的目标照片，和该人持有的证件照片进行比对，并上报检测结果,事件类型 {@link FinalVar#EVENT_IVS_CITIZEN_PICTURE_COMPARE}
 * \endif
 */
public class DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * channel number,start with 0
     * \else
     * 通道号,从0开始
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * event action, 0-pulse, -1-unknown
     * \else
     * 事件动作, 0表示脉冲, -1表示未知
     * \endif
     */
    public int                 nEventAction;

    /**
     * \if ENGLISH_LANG
     * time stamp(unit:ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double              dbPTS;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte[]                szName = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * evnet time(UTC)
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         stuUTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * evnet id
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;

    /**
     * \if ENGLISH_LANG
     * compare result,true:success,false:failed
     * \else
     * 人证比对结果,相似度大于等于阈值认为比对成功,true表示成功,false表示失败
     * \endif
     */
    public boolean                bCompareResult;

    /**
     * \if ENGLISH_LANG
     * Similarity,unit:%,rang:[1,100]
     * \else
     * 两张图片的相似度,单位百分比,范围[1,100]
     * \endif
     */
    public byte                nSimilarity;

    /**
     * \if ENGLISH_LANG
     * Threshold,rang:[1,100]
     * \else
     * 检测阈值,范围[1,100]
     * \endif
     */
    public byte                nThreshold;

    /**
     * \if ENGLISH_LANG
     * sex， refer to {@link EM_CITIZENIDCARD_SEX_TYPE}
     * \else
     * 性别,参考 {@link EM_CITIZENIDCARD_SEX_TYPE}
     * \endif
     */
    public int                   emSex;

    /**
     * \if ENGLISH_LANG
     * ARGMZ
     * 0-invalid data
     * \else
     * MZ
     * 0-无效数据
     * \endif
     */
    public int                 nECType;

    /**
     * \if ENGLISH_LANG
     * card name
     * \else
     * 居民姓名
     * \endif
     */
    public byte[]                szCitizen = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * address
     * \else
     * 住址
     * \endif
     */
    public byte[]                szAddress = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * card number
     * \else
     * 证件号
     * \endif
     */
    public byte[]                szNumber = new byte[FinalVar.SDK_COMMON_STRING_64];

    /**
     * \if ENGLISH_LANG
     * Authority
     * \else
     * 签发机关
     * \endif
     */
    public byte[]                szAuthority = new byte[FinalVar.SDK_COMMON_STRING_256];

    /**
     * \if ENGLISH_LANG
     * Birth(y-m-d)
     * \else
     * 出生日期(年月日)
     * \endif
     */
    public NET_TIME            stuBirth = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Validity start time(y-m-d)
     * \else
     * 有效期限起始日期(年月日)
     * \endif
     */
    public NET_TIME            stuValidityStart = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * When the value is TRUE, the stop date menas always valid, at this time, the stuValidityEnd is null.
     * \else
     * 该值为 TRUE, 截止日期 表示长期有效,此时 stuValidityEnd 值无意义
     * \endif
     */
    public boolean                bLongTimeValidFlag;

    /**
     * \if ENGLISH_LANG
     * Validity end time(y-m-d)
     * \else
     * 有效期限结束日期(年月日)
     * \endif
     */
    public NET_TIME            stuValidityEnd = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * image info，elememnt 0 indicate snap pic，elememnt 1 indicate card pic
     * \else
     * 图片信息，第一张为拍摄照片，第二张为证件照片
     * \endif
     */
    public CITIZEN_PICTURE_COMPARE_IMAGE_INFO[] stuImageInfo = new CITIZEN_PICTURE_COMPARE_IMAGE_INFO[2];

    public DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO() {
        for(int i = 0; i < 2; i++) {
            stuImageInfo[i] = new CITIZEN_PICTURE_COMPARE_IMAGE_INFO();
        }
    }

    @Override
    public String toString() {
        return "DEV_EVENT_CITIZEN_PICTURE_COMPARE_INFO{" +
                "nChannelID=" + nChannelID +
                ", nEventAction=" + nEventAction +
                ", dbPTS=" + dbPTS +
                ", szName=" + Arrays.toString(szName) +
                ", stuUTC=" + stuUTC +
                ", nEventID=" + nEventID +
                ", bCompareResult=" + bCompareResult +
                ", nSimilarity=" + nSimilarity +
                ", nThreshold=" + nThreshold +
                ", emSex=" + emSex +
                ", nECType=" + nECType +
                ", szCitizen=" + Arrays.toString(szCitizen) +
                ", szAddress=" + Arrays.toString(szAddress) +
                ", szNumber=" + Arrays.toString(szNumber) +
                ", szAuthority=" + Arrays.toString(szAuthority) +
                ", stuBirth=" + stuBirth +
                ", stuValidityStart=" + stuValidityStart +
                ", bLongTimeValidFlag=" + bLongTimeValidFlag +
                ", stuValidityEnd=" + stuValidityEnd +
                ", stuImageInfo=" + Arrays.toString(stuImageInfo) +
                '}';
    }
}
