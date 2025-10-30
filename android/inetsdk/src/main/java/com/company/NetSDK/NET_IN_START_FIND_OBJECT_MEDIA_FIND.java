package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_StartFindObjectMediaFind Interface input parameters
 * \else
 * @brief CLIENT_StartFindObjectMediaFind 接口输入参数
 * \endif
 */
public class NET_IN_START_FIND_OBJECT_MEDIA_FIND implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  The start time of the collection
     * \else
     *  收藏的开始时间点
     * \endif
     */
    public NET_TIME					stuStartTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  The end time of the collection
     * \else
     *  收藏的结束时间点
     * \endif
     */
    public NET_TIME					stuEndTimeRealUTC = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     *  Channel number, starting from 0
     * \else
     *  通道号,从0开始
     * \endif
     */
    public int					nChannel;

    /**
     * \if ENGLISH_LANG
     *  Number of channel number arrays
     * \else
     *  通道号数组个数
     * \endif
     */
    public int					nChannelsCount;

    /**
     * \if ENGLISH_LANG
     *  Channel number array
     * \else
     *  通道号数组
     * \endif
     */
    public int					nChannels[] = new int[16];

    /**
     * \if ENGLISH_LANG
     *  Video stream 0- Unknown 1- Main stream 2- Auxiliary stream 1 3- Auxiliary stream 2 4- Auxiliary stream 3
     * \else
     *  视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3 
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
    public int					nFlags[] = new int[4];

    /**
     * \if ENGLISH_LANG
     *  Is the target trajectory filtering rule enabled
     * \else
     *  目标轨迹过滤规则是否启用
     * \endif
     */
    public boolean					bObjectTrackFilter;

    /**
     * \if ENGLISH_LANG
     *  Target trajectory filtering rules
     * \else
     *  目标轨迹过滤规则
     * \endif
     */
    public NET_OBJECT_TRACK_FILTER					stuObjectTrackFilter = new NET_OBJECT_TRACK_FILTER();

}