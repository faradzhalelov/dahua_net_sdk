package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * Remote collect information
 * \else
 * 设备远程采集信息
 * \endif
 */
public class NET_REMOTE_COLLECT_DEV_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * collect type,{@link NET_EM_REMOTE_COLLECT_TYPE}
     * \else
     * 采集类型,{@link NET_EM_REMOTE_COLLECT_TYPE}
     * \endifa
     */
    public int                  emType;

    /**
     * \if ENGLISH_LANG
     * collect status,{@link NET_EM_REMOTE_COLLECT_STATUS}
     * \else
     * 采集状态,{@link NET_EM_REMOTE_COLLECT_STATUS}
     * \endifa
     */
    public int                  emStatus;

    /**
     * \if ENGLISH_LANG
     * the list of file information
     * \else
     * 文件信息
     * \endifa
     */
    public NET_REMOTE_COLLECT_FILE_INFO stuFileInfos[] = new NET_REMOTE_COLLECT_FILE_INFO[128];

    /**
     * \if ENGLISH_LANG
     * file number
     * \else
     * 文件个数
     * \endifa
     */
    public int                   nFileInfoNum;

    public NET_REMOTE_COLLECT_DEV_INFO() {
        for (int i = 0; i < 128; i++) {
            stuFileInfos[i] = new NET_REMOTE_COLLECT_FILE_INFO();
        }
    }
}
