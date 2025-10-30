package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_SCENE_CHANGE}'s data
 * \else
 * 场景变更事件，ReloadPicture(对应事件 {@link FinalVar#EVENT_IVS_SCENE_CHANGE})
 * \endif
 */
public class DEV_ALRAM_SCENECHANGE_INFO implements Serializable {

    /**
     *
     */
    private static final long               serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道号
     * \endif
     */
    public int					            nChannelID;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 持续型事件动作, 1表示开始, 2表示停止
     * \endif
     */
    public int                              nEventAction;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double						    dbPTS;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX					    stuUTC;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 事件ID
     * \endif
     */
    public int							    nEventID;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 事件对应文件信息
     * \endif
     */
    public SDK_EVENT_FILE_INFO			    stuFileInfo;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
     * \endif
     */
    public byte                             byImageIndex;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 抓图标志(按位),具体见 NET_RESERVED_COMMON
     * \endif
     */
    public int					            dwSnapFlagMask;
}
