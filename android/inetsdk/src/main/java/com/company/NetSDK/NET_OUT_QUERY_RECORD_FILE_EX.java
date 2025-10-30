package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_QueryRecordFileEx output param
 * \else
 * @brief CLIENT_QueryRecordFileEx 接口输出参数
 * \endif
 */
public class NET_OUT_QUERY_RECORD_FILE_EX implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  File Info
     * \else
     *  录像文件信息，单个文件, 内存由上层申请
     * \endif
     */
    public NET_RECORDFILE_INFOEX[]					pstuFileinfo;

    /**
     * \if ENGLISH_LANG
     *  The size of the requested memory, which is an integer multiple of the size of the NET_RECORDFILE_INFOEX structure
     * \else
     *  申请的内存大小，为NET_RECORDFILE_INFOEX 结构体大小的整数倍
     * \endif
     */
    public int					nMaxlen;

    /**
     * \if ENGLISH_LANG
     *  The total number of files queried
     * \else
     *  查询到的文件总数
     * \endif
     */
    public int					nFileCount;

    public NET_OUT_QUERY_RECORD_FILE_EX(int nMaxlen) {
        this.nMaxlen = nMaxlen;
        this.pstuFileinfo = new NET_RECORDFILE_INFOEX[nMaxlen];
        for(int i = 0; i < nMaxlen; i ++){
            this.pstuFileinfo[i] = new NET_RECORDFILE_INFOEX();
        }
    }
}
