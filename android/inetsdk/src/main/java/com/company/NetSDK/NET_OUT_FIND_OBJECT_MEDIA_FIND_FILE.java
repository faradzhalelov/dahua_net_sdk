package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_FindObjectMediaFindFile Interface output parameters
 * \else
 * @brief CLIENT_FindObjectMediaFindFile 接口输出参数
 * \endif
 */
public class NET_OUT_FIND_OBJECT_MEDIA_FIND_FILE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Total number of records found
     * \else
     *  查找到的录像片段总数
     * \endif
     */
    public int					nTotalCount;

    /**
     * \if ENGLISH_LANG
     *  Maximum number of video clip file lists
     * \else
     *  录像片段文件列表最大个数
     * \endif
     */
    public int					nMaxCount;

    /**
     * \if ENGLISH_LANG
     *  The actual number of returned video clip file lists
     * \else
     *  录像片段文件列表实际返回个数
     * \endif
     */
    public int					nRetCount;

    /**
     * \if ENGLISH_LANG
     *  Video clip file list, Memory is released by user request, size is sizeof(NET_OBJECT_MEDIA_FILE_INFOS)*nMaxCount
     * \else
     *  录像片段文件列表, 内存由用户申请释放, 大小为sizeof(NET_OBJECT_MEDIA_FILE_INFOS)*nMaxCount
     * \endif
     */
    public NET_OBJECT_MEDIA_FILE_INFOS[]					pstuFileInfos;

    public NET_OUT_FIND_OBJECT_MEDIA_FIND_FILE(int nMaxCount) {
        this.nMaxCount = nMaxCount;
        this.pstuFileInfos = new NET_OBJECT_MEDIA_FILE_INFOS[nMaxCount];
        for(int i = 0; i < nMaxCount; i ++){
            this.pstuFileInfos[i] = new NET_OBJECT_MEDIA_FILE_INFOS();
        }
    }
}