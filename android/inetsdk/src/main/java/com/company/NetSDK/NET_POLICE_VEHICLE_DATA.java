package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Basic data of police vehicles
 * \else
 * @brief 警车基础数据
 * \endif
 */
public class NET_POLICE_VEHICLE_DATA implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  car ID
     * \else
     *  车辆ID
     * \endif
     */
    public byte					szTerminalSn[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  user ID
     * \else
     *  用户ID
     * \endif
     */
    public byte					szUid[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  username
     * \else
     *  用户姓名
     * \endif
     */
    public byte					szUserName[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Base identification
     * \else
     *  基地标识
     * \endif
     */
    public byte					szGroupId[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  VTR order number
     * \else
     *  VTR订单号
     * \endif
     */
    public byte					szVtrNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  BOPM number
     * \else
     *  BOPM编号
     * \endif
     */
    public byte					szBopmNumber[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  event code
     * \else
     *  事件代码
     * \endif
     */
    public byte					szCaseCode[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Event classification
     * \else
     *  事件分类
     * \endif
     */
    public byte					szCaseType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  video overlay
     * \else
     *  视频叠加
     * \endif
     */
    public byte					szAdditionalInfo[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  MD5
     * \else
     *  MD5值
     * \endif
     */
    public byte					szMd5[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  other1
     * \else
     *  其他内容1
     * \endif
     */
    public byte					szReserveA[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  other2
     * \else
     *  其他内容2
     * \endif
     */
    public byte					szReserveB[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  other3
     * \else
     *  其他内容3
     * \endif
     */
    public byte					szReserveC[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Recording start time (with local time zone)
     * \else
     *  录像开始时间（带本地时区）
     * \endif
     */
    public int					nRecordStartTime;

    /**
     * \if ENGLISH_LANG
     *  Event time, recording end time (with local time zone)
     * \else
     *  事件时间，录像结束时间（带本地时区）
     * \endif
     */
    public int					nEventTime;

    /**
     * \if ENGLISH_LANG
     *  Recording start time (recording start time time time time zone)
     * \else
     *  录制开始时间（录像开始时间-时区）
     * \endif
     */
    public int					nRecordStartUTC;

    /**
     * \if ENGLISH_LANG
     *  Recording End Time (Recording End Time Time Time Zone)
     * \else
     *  录制结束时间（录像结束时间-时区）
     * \endif
     */
    public int					nRecordEndUTC;

    /**
     * \if ENGLISH_LANG
     *  Attachment upload start timestamp
     * \else
     *  附件上传开始时间戳
     * \endif
     */
    public int					nUploadStartUTC;

    /**
     * \if ENGLISH_LANG
     *  Attachment upload end timestamp
     * \else
     *  附件上传结束时间戳
     * \endif
     */
    public int					nUploadEndUTC;

    /**
     * \if ENGLISH_LANG
     *  File size, in bytes
     * \else
     *  文件大小，单位：字节
     * \endif
     */
    public int					nFileLength;

    /**
     * \if ENGLISH_LANG
     *  Local data storage identification
     * \else
     *  本地数据存储标识
     * \endif
     */
    public int					nRecNo;

    /**
     * \if ENGLISH_LANG
     *  File types, "txt", "mp4"
     * \else
     *  文件类型，"txt","mp4"
     * \endif
     */
    public byte					szFileType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Resolution, 720P, 480P
     * \else
     *  分辨率，"720P","480P"
     * \endif
     */
    public byte					szVideoResolution[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Annotation type, "Alarm", "Normal"
     * \else
     *  标注类型，"Alarm","Normal"
     * \endif
     */
    public byte					szRecordType[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Local storage location
     * \else
     *  本地存储位置
     * \endif
     */
    public byte					szLocalPath[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  FTP evidence file download address
     * \else
     *  ftp证据文件下载地址
     * \endif
     */
    public byte					szFtpUrl[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     *  Upload identification, "YES", "NO"
     * \else
     *  是否上传标识，"YES","NO"
     * \endif
     */
    public byte					szUploadState[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Longitude at the time of event occurrence
     * \else
     *  事件发生时的经度
     * \endif
     */
    public byte					szLongitude[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  The latitude at which the event occurred
     * \else
     *  事件发生时的纬度
     * \endif
     */
    public byte					szLatitude[] = new byte[32];
}