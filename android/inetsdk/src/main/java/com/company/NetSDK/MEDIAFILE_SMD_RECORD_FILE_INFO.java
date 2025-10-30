package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The media file information searched by {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_SMD_RECORD_FILE}
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_SMD_RECORD_FILE} 查询出来的media文件信息
 * \endif
 */
public class MEDIAFILE_SMD_RECORD_FILE_INFO implements Serializable{

    /**
     * \if ENGLISH_LANG
     * The channel number starts from 0, and - 1 means to query all channels
     * \else
     * 通道号从0开始,-1表示查询所有通道
     * \endif
     */
    public int                             nChannelID;

    /**
     * \if ENGLISH_LANG
     * Start time
     * \else
     * 开始时间
     * \endif
     */
    public NET_TIME                        stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * End time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME                        stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * File length expansion, support file length greater than 4G, unit byte
     * \else
     * 文件长度扩展,支持文件长度大于4G，单位字节
     * \endif
     */
    public long				            nFileSize;

    /**
     * \if ENGLISH_LANG
     * File type 1:jpg picture, 2: Dav
     * \else
     * 文件类型 1:jpg图片, 2: dav
     * \endif
     */
    public int                            nFileType;

    /**
     * \if ENGLISH_LANG
     * Video stream 0-unknown 1-main stream 2-secondary stream 1 3-secondary stream 4-secondary stream
     * \else
     * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3
     * \endif
     */
    public int                            nVideoStream;

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 文件路径
     * \endif
     */
    public byte                            szFilePath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     * For the list of associated events and event types, see intelligent analysis event types
     * \else
     * 关联的事件列表,事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int                             nEventLists[] = new int[256];

    /**
     * \if ENGLISH_LANG
     * Total number of events
     * \else
     * 事件总数
     * \endif
     */
    public int                             nEventCount;

    /**
     * \if ENGLISH_LANG
     * Partition number
     * \else
     * 分区号
     * \endif
     */
    public int                            nPartition;

    /**
     * \if ENGLISH_LANG
     * Drive number
     * \else
     * 磁盘号
     * \endif
     */
    public int                            nDriveNo;

    /**
     * \if ENGLISH_LANG
     * Cluster number
     * \else
     * 簇号
     * \endif
     */
    public int                            nCluster;

    /**
     * \if ENGLISH_LANG
     * SMD record attribute info
     * \else
     * SMD录像属性信息
     * \endif
     */
    public NET_SMD_RECORD_ATTRIBUTE_INFO   stuSmdAttribute = new NET_SMD_RECORD_ATTRIBUTE_INFO();

}
