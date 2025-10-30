package com.company.NetSDK;

import java.io.Serializable;




/**
 * \if ENGLISH_LANG
 * The file information of collected
 * \else
 * 远程采集文件信息
 * \endif
 */
public class NET_REMOTE_COLLECT_FILE_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 文件路径
     * \endifa
     */
    public byte                  szFilePath[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     * File size,unit:byte
     * \else
     * 文件大小,单位Byte
     * \endifa
     */
    public int                  nFileSize;
}
