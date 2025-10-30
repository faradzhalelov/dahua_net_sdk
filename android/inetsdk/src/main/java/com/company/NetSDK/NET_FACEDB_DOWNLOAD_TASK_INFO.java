package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Task info of downloading target data base
 * \else
 * @brief 目标库下载任务信息
 * \endif
 */
public class NET_FACEDB_DOWNLOAD_TASK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Count of image URL
     * \else
     *  图片URL个数
     * \endif
     */
    public int					nURLNum;

    /**
     * \if ENGLISH_LANG
     *  Image URL list, A target image may be stored on multiple FTP servers.
     * \else
     *  图片URL地址列表, 一张目标图片的地址可能存放在多个ftp服务器上
     * \endif
     */
    public byte					szURLList[][] = new byte[4][256];

    /**
     * \if ENGLISH_LANG
     *  ID
     * \else
     *  ID
     * \endif
     */
    public byte					szID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  target unique code, each time the platform updates the target image, it needs to update the field for device-side comparison whether to re-download the target image or not
     * \else
     *  目标唯一码，每次平台更新目标图片都需要更新该字段，用于设备端比较是否重新下载目标图片
     * \endif
     */
    public byte					szFaceUUID[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  UserName
     * \else
     *  姓名
     * \endif
     */
    public byte					szUserName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  0-Unknown, 1-Driver, 2-Student, 3-Teacher
     * \else
     *  0-未知, 1-司机, 2-学生, 3-老师
     * \endif
     */
    public int					nRole;

    /**
     * \if ENGLISH_LANG
     *  Card number
     * \else
     *  卡号
     * \endif
     */
    public byte					szCardNo[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  0- Unknown, 1- Add personnel, 2- Update personnel, 3- Delete personnel
     * \else
     *  0-未知, 1-新增人员, 2-更新人员, 3-删除人员
     * \endif
     */
    public int					nOptType;

}