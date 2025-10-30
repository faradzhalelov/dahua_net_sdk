package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief target lib info
 * \else
 * @brief 设备其它人员组ID的目标库信息
 * \endif
 */
public class NET_FACE_LIB_INFO_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

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
     *  target Lib Version
     * \else
     *  目标库版本号，平台如果没有从没下发过目标或者设备异常目标未下载完全，目标库版本号为"0"
     * \endif
     */
    public byte					szFaceLibVersion[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Total Download Count
     * \else
     *  需要下载文件个数
     * \endif
     */
    public int					nTotalDownloadCount;

    /**
     * \if ENGLISH_LANG
     *  Success Download Count
     * \else
     *  已下载文件个数
     * \endif
     */
    public int					nSuccessDownloadCount;
}