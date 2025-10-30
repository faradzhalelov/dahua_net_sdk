package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Set park info, corresponding SDK_CTRL_SET_PARK_INFO command parameter
 * \else
 * 设置停车信息,对应SDK_CTRL_SET_PARK_INFO命令参数
 * \endif
 */
public class NET_CTRL_SET_PARK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Plate number
     * \else
     *  车牌号码
     * \endif
     */
    public byte					szPlateNumber[] = new byte[FinalVar.MAX_PLATE_NUMBER_LEN];

    /**
     * \if ENGLISH_LANG
     *  park time,Unit:minute
     * \else
     *  停车时长,单位:分钟
     * \endif
     */
    public int					nParkTime;

    /**
     * \if ENGLISH_LANG
     *  Car Owner's Name
     * \else
     *  车主姓名
     * \endif
     */
    public byte					szMasterofCar[] = new byte[FinalVar.MAX_MASTER_OF_CAR_LEN];

    /**
     * \if ENGLISH_LANG
     *  User type,not general,Used in entrance capture machine
     * \else
     *  用户类型,非通用,用于出入口抓拍一体机
     * \endif
     */
    public byte					szUserType[] = new byte[FinalVar.MAX_USER_TYPE_LEN];

    /**
     * \if ENGLISH_LANG
     *  Remain day
     * \else
     *  到期天数
     * \endif
     */
    public int					nRemainDay;

    /**
     * \if ENGLISH_LANG
     *  Park charge
     * \else
     *  停车费
     * \endif
     */
    public byte					szParkCharge[] = new byte[FinalVar.MAX_PARK_CHARGE_LEN];

    /**
     * \if ENGLISH_LANG
     *  Remain space
     * \else
     *  停车库余位数
     * \endif
     */
    public int					nRemainSpace;

    /**
     * \if ENGLISH_LANG
     *  0:car is not allowed to pass,1:car is allowed to pass
     * \else
     *  0:不允许车辆通过 1:允许车辆通过
     * \endif
     */
    public int					nPassEnable;

    /**
     * \if ENGLISH_LANG
     *  car in time
     * \else
     *  车辆入场时间
     * \endif
     */
    public NET_TIME					stuInTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  car out time
     * \else
     *  车辆出场时间
     * \endif
     */
    public NET_TIME					stuOutTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  car pass status
     * \else
     *  过车状态
     * \endif
     */
    public int					emCarStatus;

    /**
     * \if ENGLISH_LANG
     *  field,default:null
     * \else
     *  自定义显示字段，默认空 
     * \endif
     */
    public byte					szCustom[] = new byte[FinalVar.MAX_CUSTOM_LEN];

    /**
     * \if ENGLISH_LANG
     *  Sub user type of szUserType
     * \else
     *  用户类型（szUserType字段）的子类型 
     * \endif
     */
    public byte					szSubUserType[] = new byte[FinalVar.MAX_SUB_USER_TYPE_LEN];

    /**
     * \if ENGLISH_LANG
     *  Remarks info
     * \else
     *  备注信息
     * \endif
     */
    public byte					szRemarks[] = new byte[FinalVar.MAX_REMARKS_LEN];

    /**
     * \if ENGLISH_LANG
     *  Resource file(video or picture) video support:mp4; picture support:BMP/jpg/JPG/jpeg/JPEG/png/PNG
     * \else
     *  资源文件（视频或图片）视频支持:mp4格式; 图片支持:BMP/jpg/JPG/jpeg/JPEG/png/PNG格式
     * \endif
     */
    public byte					szResource[] = new byte[FinalVar.MAX_RESOURCE_LEN];

    /**
     * \if ENGLISH_LANG
     *  Parking timeout, in minutes. A value of 0 means no timeout, and a value of not 0 means timeout.
     * \else
     *  停车超时时间，单位分钟。为0表示未超时，不为0表示超时时间。
     * \endif
     */
    public int					nParkTimeout;

}
