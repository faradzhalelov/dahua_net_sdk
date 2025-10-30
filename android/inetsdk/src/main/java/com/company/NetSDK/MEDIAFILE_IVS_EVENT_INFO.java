package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The media file information searched by {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_IVS_EVENT}
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_IVS_EVENT} 查询出来的media文件信息
 * \endif
 */
public class MEDIAFILE_IVS_EVENT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * start time
     * \else
     * 起始时间
     * \endif
     */
    public NET_TIME            stuStartTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * end time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME            stuEndTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * file path
     * \else
     * 文件路径
     * \endif
     */
    public byte                szFilePath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * file type, 0: any, 1:jpg , 2:dav
     * \else
     * 文件类型,0:任意类型, 1:jpg图片, 2:dav文件
     * \endif
     */
    public int                 nMediaType;

    /**
     * \if ENGLISH_LANG
     * file length,This field is discarded,please use the nFileLengthEx
     * \else
     * 文件长度,该字段废弃,请使用nFileLengthEx
     * \endif
     */
    public int        nFileLength;

    /**
     * \if ENGLISH_LANG
     * cluster no.
     * \else
     * 簇号
     * \endif
     */
    public int        nCluster;

    /**
     * \if ENGLISH_LANG
     * hint
     * \else
     * 文件定位索引
     * \endif
     */
    public int        nHint;

    /**
     * \if ENGLISH_LANG
     * drive no.
     * \else
     * 磁盘号
     * \endif
     */
    public int        nDriveNo;

    /**
     * \if ENGLISH_LANG
     * video or snap picture flags
     * \else
     * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3
     * \endif
     */
    public int                 nVideoStream;

    /**
     * \if ENGLISH_LANG
     *  link event list,see event intelligent analysis event type
     * \else
     * 事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int                 nEventLists[] = new int[FinalVar.MAX_IVS_EVENT_NUM];

    /**
     * \if ENGLISH_LANG
     * event total count
     * \else
     * 事件总数
     * \endif
     */
    public int                 nEventCount;

    /**
     * \if ENGLISH_LANG
     *  video or snap picture flags, see{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \else
     * 录像或抓图文件标志, 不设置标志表示查询所有文件, 详见{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \endif
     */
    public int emFlagLists[] = new int[EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX];

    /**
     * \if ENGLISH_LANG
     *  flag total count
     * \else
     * 标志总数
     * \endif
     */
    public int                 nFlagCount;

    /**
     * \if ENGLISH_LANG
     * rule type, see event intelligent analysis event type
     * \else
     * 事件类型,详见"智能分析事件类型"
     * \endif
     */
    public int                 nRuleType;

    /**
     * \if ENGLISH_LANG
     * event action type, see{@link NET_CROSSREGION_ACTION_INFO}
     * \else
     * 事件动作, 详见{@link NET_CROSSREGION_ACTION_INFO}
     * \endif
     */
    public  int             emAction;

    /**
     * \if ENGLISH_LANG
     *  length of file extension, Support file length is greater than 4G,unit:Byte
     * \else
     * 文件长度扩展，支持文件长度大于4G，单位字节
     * \endif
     */
    public long               nFileLengthEx;

    /**
     * \if ENGLISH_LANG
     *  object type corresponding to rule, see{@link EM_MEDIAFILE_IVS_OBJECT}
     * \else
     * 规则触发的对象类型, 详见 {@link EM_MEDIAFILE_IVS_OBJECT}
     * \endif
     */
    public int	          emIvsObject;

    /**
     * \if ENGLISH_LANG
     * event image info
     * \else
     * 事件抠图信息
     * \endif
     */
    public NET_EVENT_IMAGE_INFO	stuEventImageInfo = new NET_EVENT_IMAGE_INFO();

}
