package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Input param of CLIENT_AddFaceDbDownLoadTask
 * \else
 * @brief CLIENT_AddFaceDbDownLoadTask 接口输入参数
 * \endif
 */
public class NET_IN_ADD_FACEDB_DOWNLOAD_TASK implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Is last packet(not used)
     * \else
     *  是否为最后一包(此字段废弃)
     * \endif
     */
    public boolean					bIsEnd;

    /**
     * \if ENGLISH_LANG
     *  target data base version
     * \else
     *  目标库版本号
     * \endif
     */
    public byte					szFaceDbVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  The number of download tasks of target data base, specified by users, can support up to 100 tasks
     * \else
     *  目标库下载任务个数, 由用户指定个数, 最多支持100个
     * \endif
     */
    public int					nTaskNum;

    /**
     * \if ENGLISH_LANG
     *  Task info of download target data base, IT is specified by users, and the size is nTaskNum*sizeof(NET_FACELIB_DOWNLOAD_TASK_INFO)
     * \else
     *  目标库下载任务信息, 由用户申请空间, 大小为nTaskNum*sizeof(NET_FACELIB_DOWNLOAD_TASK_INFO)
     * \endif
     */
    public NET_FACEDB_DOWNLOAD_TASK_INFO[]					pstTaskInfo;

    /**
     * \if ENGLISH_LANG
     *  Total number of packet 
     * \else
     *  表示当前任务总共有几个包
     * \endif
     */
    public int					nPacketTotal;

    /**
     * \if ENGLISH_LANG
     *  Index of packet
     * \else
     *  表示当前是第几个包，下标从1开始
     * \endif
     */
    public int					nPacketIndex;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  人员组ID, 表示下载到指定的人员组ID的目标库中
     * \endif
     */
    public byte					szGroupID[] = new byte[64];

    public NET_IN_ADD_FACEDB_DOWNLOAD_TASK(int nTaskNum) {
        this.nTaskNum = nTaskNum;
        pstTaskInfo = new NET_FACEDB_DOWNLOAD_TASK_INFO[nTaskNum];
        for(int i = 0; i < nTaskNum; i++) {
            pstTaskInfo[i] = new NET_FACEDB_DOWNLOAD_TASK_INFO();
        }
    }

}