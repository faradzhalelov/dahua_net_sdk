package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video clip file list
 * \else
 * @brief 录像片段文件列表
 * \endif
 */
public class NET_OBJECT_MEDIA_FILE_INFOS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Channel number, starting from 0
     * \else
     *  通道号，从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Video stream, 0- Unknown 1- Main stream 2- Auxiliary stream 1 3- Auxiliary stream 2 4- Auxiliary stream 3
     * \else
     *  视频码流
     * \endif
     */
    public int					nVideoStream;

    /**
     * \if ENGLISH_LANG
     *  Number of target type lists
     * \else
     *  目标类型列表个数
     * \endif
     */
    public int					nObjectTypesCount;

    /**
     * \if ENGLISH_LANG
     *  Target type list, 0 unknown, 1 Human, 2 Vehicle, 3 NonMotor, 4 Animal
     * \else
     *  目标类型列表, 0 未知, 1 人, 2 车, 3 非机动车, 4 动物
     * \endif
     */
    public int					nObjectTypes[] = new int[32];

    /**
     * \if ENGLISH_LANG
     *  Number of query flags
     * \else
     *  查询选项个数
     * \endif
     */
    public int					nFlagsCount;

    /**
     * \if ENGLISH_LANG
     *  Query flags, 1: File, recording file, can obtain recording results through the findFile protocol, 2: Event, target event, can obtain event results through the findEvent protocol
     * \else
     *  查询选项, 1:File, 录像文件，可通过findFile协议获取录像结果, 2:Event, 目标事件，可通过findEvent协议获取事件结果
     * \endif
     */
    public int					nFlags[] = new int[8];

    /**
     * \if ENGLISH_LANG
     *  Number of associated events
     * \else
     *  和这个文件关联的事件个数
     * \endif
     */
    public int					nEventsCount;

    /**
     * \if ENGLISH_LANG
     *  Associated event array
     * \else
     *  和这个文件关联的事件数组
     * \endif
     */
    public int					nEvents[] = new int[256];

    /**
     * \if ENGLISH_LANG
     *  The UTC start time of the file 
     * \else
     *  文件的UTC开始时间
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  The UTC end time of the file
     * \else
     *  文件的UTC结束时间
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  UTC time offset, the offset of local time in a file relative to UTC time, measured in seconds
     * \else
     *  UTC时间偏移，文件中的本地时间相对于UTC时间的偏移量，单位秒
     * \endif
     */
    public int					nUTCOffset;

    /**
     * \if ENGLISH_LANG
     *  Video file path
     * \else
     *  录像文件路径
     * \endif
     */
    public byte					szFilePath[] = new byte[256];

}