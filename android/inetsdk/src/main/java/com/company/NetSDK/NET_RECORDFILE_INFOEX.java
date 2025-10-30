package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Record file information(extend)
 * \else
 * @brief 录像文件信息(扩展)
 * \endif
 */
public class NET_RECORDFILE_INFOEX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Record file information
     * \else
     *  录像文件信息
     * \endif
     */
    public NET_RECORDFILE_INFO					stuRecordFileInfo = new NET_RECORDFILE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Associated event list,  Reference intelligent analysis event type
     * \else
     *  关联的事件列表,事件类型列表,参见智能分析事件类型
     * \endif
     */
    public int					nEventLists[] = new int[256];

    /**
     * \if ENGLISH_LANG
     *  Count of events
     * \else
     *  事件总数
     * \endif
     */
    public int					nEventCount;

    /**
     * \if ENGLISH_LANG
     *  Flag list,{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \else
     *  文件标志，{@link EM_RECORD_SNAP_FLAG_TYPE}
     * \endif
     */
    public int					emFlagsList[] = new int[128];

    /**
     * \if ENGLISH_LANG
     *  Flag Count
     * \else
     *  文件标志总个数；
     * \endif
     */
    public int					nFlagCount;

}
