package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_IVS_EVENT} corresponding ivs event info query parameter
 * \else
 * {@link EM_FILE_QUERY_TYPE#SDK_FILE_QUERY_IVS_EVENT} 对应的智能事件信息查询参数
 * \endif
 */
public class MEDIAFILE_IVS_EVENT_PARAM implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel no
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
     *  end time
     * \else
     * 结束时间
     * \endif
     */
    public NET_TIME            stuEndTime = new NET_TIME();

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
     * video stream  0-unknown 1-main 2-sub1 3-sub2 4-sub3
     * \else
     * 视频码流 0-未知 1-主码流 2-辅码流1 3-辅码流2 4-辅码流3
     * \endif
     */
    public int                 nVideoStream;

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
     * link event list,see event intelligent analysis event type
     * \else
     * 事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int                 nEventLists[] = new int[FinalVar.MAX_IVS_EVENT_NUM];

    /**
     * \if ENGLISH_LANG
     * flag total
     * \else
     * 标志总数
     * \endif
     */
    public int                 nFlagCount;

    /**
     * \if ENGLISH_LANG
     * video or snap picture flags, 详见{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \else
     * 录像或抓图文件标志, 不设置标志表示查询所有文件, 详见{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \endif
     */
    public int emFlagLists[] = new int[EM_RECORD_SNAP_FLAG_TYPE.FLAG_TYPE_MAX];

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
     * 事件动作, 详见 {@link NET_CROSSREGION_ACTION_INFO}
     * \endif
     */
    public  int                 emAction;

    /**
     * \if ENGLISH_LANG
     * the count of  IVS object
     * \else
     * 对象类型个数
     * \endif
     */
    public int					nIvsObjectNum;

    /**
     * \if ENGLISH_LANG
     * the list of IVS object type, see{@link EM_MEDIAFILE_IVS_OBJECT}
     * \else
     * 规则触发的对象类型, 详见{@link EM_MEDIAFILE_IVS_OBJECT}
     * \endif
     */
    public int		emIvsObject[] = new int[FinalVar.SDK_MAX_OBJECT_LIST];

}
