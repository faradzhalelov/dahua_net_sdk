package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Callback info of downloading remote target data base
 * \else
 * @brief 目标库下载进度回调信息
 * \endif
 */
public class NET_CB_FACEDB_DOWNLOAD_RESULT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
     *  Total download count
     * \else
     *  总下载文件个数
     * \endif
     */
    public int					nTotalDownloadCount;

    /**
     * \if ENGLISH_LANG
     *  Success download count
     * \else
     *  已下载文件个数
     * \endif
     */
    public int					nSuccessDownloadCount;

    /**
     * \if ENGLISH_LANG
     *  Error code of downloading remote target data base,{link EM_FACEDB_ERRCODE}
     * \else
     *  目标下载失败错误码,{link EM_FACEDB_ERRCODE}
     * \endif
     */
    public int					emFaceDbErrCode;

    /**
     * \if ENGLISH_LANG
     *  Group ID
     * \else
     *  人员组ID
     * \endif
     */
    public byte					szGroupID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     *  Number of face UUIDs
     * \else
     *  人脸UUID个数
     * \endif
     */
    public int					nFaceUUIDCount;

    /**
     * \if ENGLISH_LANG
     *  Face UUID
     * \else
     *  人脸UUID
     * \endif
     */
    public byte					szFaceUUID[][] = new byte[10][64];

}