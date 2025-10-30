package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#DownloadPieceFile} 's output param
 * \else
 * {@link INetSDK#DownloadPieceFile} 输出参数
 * \endif
 */
public class NET_OUT_DOWNLOAD_PIECE_FILE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * file length
     * \else
     * 文件总长度
     * \endif
     */
    public int                             nFileLength;

    /**
     * \if ENGLISH_LANG
     * binary data length this time, unit:BYTE,suggest value is 32KB, not over 4MB
     * \else
     * 本次返回的数据长度,单位字节,建议为32KB,最大不超过4MB
     * \endif
     */
    public int                             nPacketLength;

    /**
     * \if ENGLISH_LANG
     * file buffer,the space application by the user,size is nBufferLen
     * \else
     * 本次请求的文件数据,由用户申请内存,大小为nBufferLen
     * \endif
     */
    public byte                             szBuffer[];

    /**
     * \if ENGLISH_LANG
     * buffer len,unit:BYTE,the same to nNeedLength of NET_IN_DOWNLOAD_PIECE_FILE
     * \else
     * 本次请求的文件数据长度,单位字节,大小和NET_IN_DOWNLOAD_PIECE_FILE的nNeedLength一样
     * \endif
     */
    public int                             nBufferLen;

    public NET_OUT_DOWNLOAD_PIECE_FILE(int nBufLen) {
        nBufferLen = nBufLen;
        szBuffer = new byte[nBufferLen];
    }
}
