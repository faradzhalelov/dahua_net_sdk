package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * {@link INetSDK#RemotePreUploadFile}input param
 * \else
 * {@link INetSDK#RemotePreUploadFile}入参
 * \endif
 */
public class NET_IN_REMOTE_PREUPLOAD_FILE implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int              nChannel;

    /**
     * \if ENGLISH_LANG
     * The path of source file
     * \else
     * 源文件路径
     * \endif
     */
    public byte              szFileSrc[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * The name of destination file
     * \else
     * 目标文件保存名称
     * \endif
     */
    public byte              szFileNameDst[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * The folder path of destination file, can be ""
     * \else
     * 目标文件夹路径：可为空字符串, 空时设备使用默认路径校验
     * \endif
     */
    public byte              szFolderDst[] = new byte[256];
}
