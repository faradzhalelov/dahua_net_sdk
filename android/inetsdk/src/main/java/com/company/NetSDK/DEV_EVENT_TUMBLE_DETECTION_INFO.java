package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief tumble detection event (command:EVENT_IVS_TUMBLE_DETECTION)
 * \else
 * @brief 事件类型 EVENT_IVS_TUMBLE_DETECTION(倒地报警事件)对应数据块描述信息
 * \endif
 */
public class DEV_EVENT_TUMBLE_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * channel ID
     * \else
     * 通道号
     * \endif
     */
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Event operation. 1: Start, 2: Stop
     * \else
     * 事件动作,1表示持续性事件开始,2表示持续性事件结束;
     * \endif
     */
    public int nAction;

    /**
     * \if ENGLISH_LANG
     * PTS(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * time of occurrence
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * millseconds
     * \else
     * UTC时间对应的毫秒数
     * \endif
     */
    public int UTCMS;

    /**
     * \if ENGLISH_LANG
     * class type
     * \else
     * 智能事件所属大类
     * \endif
     */
    public int emClassType;

    /**
     * \if ENGLISH_LANG
     * Object ID
     * \else
     * 目标ID
     * \endif
     */
    public int nObjectID;

    /**
     * \if ENGLISH_LANG
     * Object Type, support for the following:
     * \else
     * 物体类型,支持以下:
     * \endif
     */
    public byte szObjectType[] = new byte[FinalVar.SDK_COMMON_STRING_16];

    /**
     * \if ENGLISH_LANG
     * Bounding Box
     * \else
     * 物体包围盒
     * \endif
     */
    public NET_RECT stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     * Intelligent object global unique object identification
     * \else
     * 智能物体全局唯一物体标识
     * \endif
     */
    public byte szSerialUUID[] = new byte[22];

    /**
     * \if ENGLISH_LANG
     * Panoramic wide-angle map
     * \else
     * 全景广角图
     * \endif
     */
    public SCENE_IMAGE_INFO stuSceneImage = new SCENE_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * Image information array
     * \else
     * 图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX2[] pstuImageInfo;

    /**
     * \if ENGLISH_LANG
     * Number of picture information
     * \else
     * 图片信息个数
     * \endif
     */
    public int nImageInfoNum;
    public DEV_EVENT_TUMBLE_DETECTION_INFO() {
        this.nImageInfoNum = 0;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[0];
    }
    public DEV_EVENT_TUMBLE_DETECTION_INFO(int nImageInfoNum) {
        this.nImageInfoNum = nImageInfoNum;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX2[nImageInfoNum];
        for (int i = 0; i < nImageInfoNum; i++) {
            this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX2();
        }
    }
}
