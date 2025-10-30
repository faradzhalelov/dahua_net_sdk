package com.company.NetSDK;

import java.io.Serializable;



/**
 * \if ENGLISH_LANG
 * interface {@link INetSDK#DownloadPieceFile } 's input param
 * \else
 *  {@link INetSDK#DownloadPieceFile } 输入参数
 * \endif
 */
public class NET_IN_DOWNLOAD_PIECE_FILE implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * File name,support full path
     * \else
     * 需要下载的文件名,支持全路径
     * \endif
     */
    public byte                         szFileName[] = new byte[260];

    /**
     * \if ENGLISH_LANG
     * Offset,unit:BYTE
     * \else
     * 下载偏移,单位字节
     * 如果文件总长度为50KB,每次请求下载数据量为32KB,那么第一次请求时,nOffSet为0,第二次请求nOffSet为32KB
     * \endif
     */
    public int        nOffSet;

    /**
     * \if ENGLISH_LANG
     * need length,unit:BYTE, suggest value is 32KB, not over 4MB
     * \else
     * 请求下载数据量,单位字节，建议为32KB,最大不超过4MB
     * \endif
     */
    public int        nNeedLength;
}
