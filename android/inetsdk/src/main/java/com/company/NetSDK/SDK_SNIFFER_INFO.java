package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo interface  out param's grasp the package information
 * \else
 * {@link INetSDK#GetSnifferInfo}GetSnifferInfo 抓包信息
 * \endif
 */
public class SDK_SNIFFER_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * Sniffer ID
     * \else
     * 抓包ID, 无抓包ID为0
     * \endif
     */
    public int            nSnifferID;

    /**
     * \if ENGLISH_LANG
     * Capture file name
     * \else
     * 抓包存储文件名。若当前网卡无正在进行的抓包任务，则为空
     * \endif
     */
    public byte[]            szPath=new byte[256];

    /**
     * \if ENGLISH_LANG
     * Default file path. and the start path
     * \else
     * 默认路径及start路径传入下的抓包文件。按时间从新到旧排序。
     * \endif
     */
    public byte[][]            szPathEx=new byte[10][256];

    /**
     * \if ENGLISH_LANG
     * The szPathEx valid num.
     * \else
     * 实际返回的szPathEx有效个数
     * \endif
     */
    public int             nRetPathEx;

    /**
     * \if ENGLISH_LANG
     * The szPathEx element corresponds to the file size, Unit:bytes
     * \else
     * szPathEx元素对应文件大小, 单位字节
     * \endif
     */
    public int             nFileSize[] = new int[10];
}
