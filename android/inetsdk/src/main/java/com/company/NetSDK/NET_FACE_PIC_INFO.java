package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Target picture information
 * \else
 * 目标图片信息
 * \endif
 */
public class NET_FACE_PIC_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Offset position of file in binary data block, unit: byte
     * \else
     *  文件在二进制数据块中的偏移位置, 单位:字节
     * \endif
     */
    public int					dwOffSet;

    /**
     * \if ENGLISH_LANG
     *  File size in bytes
     * \else
     *  文件大小, 单位:字节
     * \endif
     */
    public int					dwFileLenth;

    /**
     * \if ENGLISH_LANG
     *  Picture width in pixels
     * \else
     *  图片宽度, 单位:像素
     * \endif
     */
    public int					dwWidth;

    /**
     * \if ENGLISH_LANG
     *  Picture height in pixels
     * \else
     *  图片高度, 单位:像素
     * \endif
     */
    public int					dwHeight;

    /**
     * \if ENGLISH_LANG
     *  Whether the image is detected by algorithm. When a detected server is submitted 
     * \else
     *  图片是否算法检测出来的检测过的提交识别服务器时,
     * \endif
     */
    public boolean					bIsDetected;

    /**
     * \if ENGLISH_LANG
     *  File path length, it is the size of both pszfilepath
     * \else
     *  文件路径长度 既pszFilePath 的大小
     * \endif
     */
    public int					nFilePathLen;

    /**
     * \if ENGLISH_LANG
     *  File path,Space requested by user. It is not required as input condition.
     * \else
     *  文件路径,  由用户申请空间, 作为输入条件时不需要
     * \endif
     */
    public byte[]					pszFilePath;

    /**
     * \if ENGLISH_LANG
     *  Picture ID is used to distinguish different faces in the case of one person with multiple faces
     * \else
     *  图片ID, 针对一人多目标的情况, 用于区分不同目标
     * \endif
     */
    public byte					szPictureID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Picture modeling status
     * \else
     *  图片建模状态
     * \endif
     */
    public int					emFeatureState;

    /**
     * \if ENGLISH_LANG
     *  Modeling failure reason
     * \else
     *  建模失败原因
     * \endif
     */
    public int					emFeatureErrCode;

    /**
     * \if ENGLISH_LANG
     *  Picture operation type
     * \else
     *  图片操作类型
     * \endif
     */
    public int					emPicOperate;


    public NET_FACE_PIC_INFO() {

    }
}
