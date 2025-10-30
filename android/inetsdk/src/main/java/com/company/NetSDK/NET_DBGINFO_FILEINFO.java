package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * File info
 * \else
 * 文件信息
 * \endif
 */
public class NET_DBGINFO_FILEINFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * File path
     * \else
     * 生成的文件路径
     * \endif
     */
    public byte      szFilePath[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * File size,Unit:byte
     * \else
     * 生成的文件大小,单位字节
     * \endif
     */
    public int      nFileSize;
}
