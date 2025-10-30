package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_FindObjectMediaFindEvent Interface output parameters
 * \else
 * @brief CLIENT_FindObjectMediaFindEvent 接口输出参数
 * \endif
 */
public class NET_OUT_FIND_OBJECT_MEDIA_FIND_EVENT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Total number of records found
     * \else
     *  查找到的记录总数
     * \endif
     */
    public int					nTotalCount;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of target event lists
     * \else
     *  目标事件列表最大个数
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  The actual number of returned target event lists
     * \else
     *  目标事件列表实际返回个数
     * \endif
     */
    public int					nRetCount;

    /**
     * \if ENGLISH_LANG
     *  Target Event List, Memory is released by user request, size is sizeof(NET_OBJECT_MEDIA_FILE_INFOS)*nMaxCount
     * \else
     *  目标事件列表, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_MEDIA_FILE_INFOS)*nMaxCount
     * \endif
     */
    public NET_OBJECT_EVENTS_INFO[]					pstuObjectEvents;

    public NET_OUT_FIND_OBJECT_MEDIA_FIND_EVENT(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pstuObjectEvents = new NET_OBJECT_EVENTS_INFO[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pstuObjectEvents[i] = new NET_OBJECT_EVENTS_INFO();
        }
    }
}