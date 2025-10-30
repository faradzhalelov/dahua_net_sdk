package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_SMD_RECORD_FILE} corresponding ivs event info query parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_SMD_RECORD_FILE} 对应的智能事件信息查询参数
 * \endif
 */
public class MEDIAFILE_SMD_RECORD_FILE_PARAM implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * The channel number starts from 0, and - 1 means to query all channels
     * \else
     * 通道号从0开始,-1表示查询所有通道
     * \endif
     */
    public int														nChannelID;

    /**
     * \if ENGLISH_LANG
     * Begin time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME												stuBeginTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME												stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Number of SMD video recording types
     * \else
     * SMD 录像类型个数
     * \endif
     */
    public int                                                    nSmdRecordTypeNum;

    /**
     * \if ENGLISH_LANG
     * SMD video type to query,refer to {@link EM_SMD_RECORD_TYPE}
     * \else
     * 需要查询的SMD录像类型,参考{@link EM_SMD_RECORD_TYPE}
     * \endif
     */
    public int						                emSmdRecordType[] = new int[8];

    /**
     * \if ENGLISH_LANG
     *  Video code stream. If this parameter is not available, it means to query all,{@link EM_SMD_VIDEO_STREAM}
     * \else
     *  视频码流，无此参数表示查询所有,{@link EM_SMD_VIDEO_STREAM}
     * \endif
     */
    public int					emVideoStream;

}
