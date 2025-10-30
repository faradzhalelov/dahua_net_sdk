package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#StartRemoteUploadFile} input parameter
 * \else
 * {@link INetSDK#StartRemoteUploadFile} 接口输入参数
 * \endif
 */

public class NET_IN_REMOTE_UPLOAD_FILE implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel id
     * \else
     * 通道号
     * \endif
     */
    public int nChannel;

    /**
     * \if ENGLISH_LANG
     * The path of source file
     * \else
     * 源文件路径
     * \endif
     */
    public byte szFileSrc[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * The name of destination file
     * \else
     * 目标文件保存名称
     * \endif
     */
    public byte szFileNameDst[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * The folder path of destination file, can be ""
     * \else
     * 目标文件夹路径：可为空字符串, 空时设备使用默认路径
     * \endif
     */
    public byte szFolderDst[] = new byte[256];

    /**
     * \if ENGLISH_LANG
     * Upload process callback
     * \else
     *  上传进度回调
     * \endif
     */
    public  CB_fRemoteUploadFileCallBack cbUploadFile;

    /**
     * \if ENGLISH_LANG
     * file upload subpackage size. 0 means NetSDK default
     * \else
     * 文件传输分包大小(字节): 0表示SDK默认分包
     * \endif
     */
    public int      nPacketLen;


}
