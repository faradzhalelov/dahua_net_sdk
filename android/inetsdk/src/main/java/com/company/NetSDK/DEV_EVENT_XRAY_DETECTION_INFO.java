package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief EVENT_IVS_XRAY_DETECTION (X ray detection event) corresponding data block description info
 * \else
 * @brief 事件类型 EVENT_IVS_XRAY_DETECTION (X光检测事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_XRAY_DETECTION_INFO implements Serializable {
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
    public int nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event name
     * \else
     * 事件名称
     * \endif
     */
    public byte szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Time stamp(ms)
     * \else
     * 时间戳(单位是毫秒)
     * \endif
     */
    public double PTS;

    /**
     * \if ENGLISH_LANG
     * Event occurred time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * Event ID
     * \else
     * 事件ID
     * \endif
     */
    public int nEventID;

    /**
     * \if ENGLISH_LANG
     * class type,{@link EM_CLASS_TYPE}
     * \else
     * 所属大类,{@link EM_CLASS_TYPE}
     * \endif
     */
    public int emClassType;

    /**
     * \if ENGLISH_LANG
     * package info
     * \else
     * 包裹信息
     * \endif
     */
    public NET_PACKAGE_INFO stuPacketInfo = new NET_PACKAGE_INFO();

    /**
     * \if ENGLISH_LANG
     * the count of inside object in master view
     * \else
     * 主视角包裹内物品个数
     * \endif
     */
    public int nObjectNum;

    /**
     * \if ENGLISH_LANG
     * inside objects info in main view
     * \else
     * 主视角包裹内物品信息
     * \endif
     */
    public NET_INSIDE_OBJECT stuInsideObj[] = new NET_INSIDE_OBJECT[FinalVar.MAX_INSIDEOBJECT_NUM];

    /**
     * \if ENGLISH_LANG
     * the count of inside object in sub view
     * \else
     * 从视角包裹内物品个数
     * \endif
     */
    public int nSlaveViewObjectNum;

    /**
     * \if ENGLISH_LANG
     * inside objects info in sub view
     * \else
     * 从视角包裹内物品信息
     * \endif
     */
    public NET_INSIDE_OBJECT stuSlaveViewInsideObj[] = new NET_INSIDE_OBJECT[FinalVar.MAX_INSIDEOBJECT_NUM];

    /**
     * \if ENGLISH_LANG
     * image count
     * \else
     * 图片数量
     * \endif
     */
    public int nImageCount;

    /**
     * \if ENGLISH_LANG
     * image info
     * \else
     * 图片信息
     * \endif
     */
    public NET_XRAY_IMAGE_INFO stuImageInfo[] = new NET_XRAY_IMAGE_INFO[8];

    /**
     * \if ENGLISH_LANG
     * Count of Customer-defined information
     * \else
     * 客户自定义信息个数
     * \endif
     */
    public int nViewCustomInfoNum;

    /**
     * \if ENGLISH_LANG
     * Customer-defined information. It is used for X-ray.
     * \else
     * 客户自定义信息, X光机
     * \endif
     */
    public NET_XRAY_CUSTOM_INFO stuViewCustomInfo[] = new NET_XRAY_CUSTOM_INFO[4];

    /**
     * \if ENGLISH_LANG
     * Package identification, used to uniquely identify a package
     * \else
     * 包裹标识, 用来唯一标识一个包裹
     * \endif
     */
    public byte szPackageTag[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Package generation method,{@link EM_XRAY_PACKAGE_MODE}
     * \else
     * 包裹产生方式,{@link EM_XRAY_PACKAGE_MODE}
     * \endif
     */
    public int emPackageMode;

    /**
     * \if ENGLISH_LANG
     * Related Image number
     * \else
     * 关联图片数量
     * \endif
     */
    public int nRelatedImageNum;

    /**
     * \if ENGLISH_LANG
     * Related Image
     * \else
     * 关联图片
     * \endif
     */
    public NET_XRAY_RELATED_IMAGE_INFO stuRelatedImageInfo[] = new NET_XRAY_RELATED_IMAGE_INFO[8];

    /**
     * \if ENGLISH_LANG
     * Bar Code Count
     * \else
     * 与包裹关联的单号的个数
     * \endif
     */
    public int nBarCodeCount;

    /**
     * \if ENGLISH_LANG
     * Bar Code Info
     * \else
     * 与包裹关联的单号的内容
     * \endif
     */
    public NET_BAR_CODE_INFO stuBarCodeInfo[] = new NET_BAR_CODE_INFO[32];

    /**
     * \if ENGLISH_LANG
     * Event public extension field structure
     * \else
     * 事件公共扩展字段结构体
     * \endif
     */
    public NET_EVENT_INFO_EXTEND stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

    /**
     * \if ENGLISH_LANG
     * Whether to use remote mapping,{@link EM_XRAY_DETECTION_JUDGE_REMOTELY}
     * \else
     * 是否使用远程判图,{@link EM_XRAY_DETECTION_JUDGE_REMOTELY}
     * \endif
     */
    public int emJudgeRemotely;

    /**
     * \if ENGLISH_LANG
     * Picture number
     * \else
     * 图片信息个数
     * \endif
     */
    public int nImageInfoNum;

    /**
     * \if ENGLISH_LANG
     * Picture information
     * \else
     * 图片信息数组
     * \endif
     */
    public NET_IMAGE_INFO_EX3[] pstuImageInfo;

    /**
     * \if ENGLISH_LANG
     * Packet cutting information
     * \else
     * 切包信息
     * \endif
     */
    public NET_XRAY_CUT_INFO stuCutInfo = new NET_XRAY_CUT_INFO();

    public DEV_EVENT_XRAY_DETECTION_INFO() {
        for(int i = 0; i < FinalVar.MAX_INSIDEOBJECT_NUM; i ++) {
            this.stuInsideObj[i] = new NET_INSIDE_OBJECT();
            this.stuSlaveViewInsideObj[i] = new NET_INSIDE_OBJECT();
        }
        for(int i = 0; i < 32; i ++){
            this.stuBarCodeInfo[i] = new NET_BAR_CODE_INFO();
        }
        for(int i = 0; i < 8; i ++){
            this.stuImageInfo[i] = new NET_XRAY_IMAGE_INFO();
            this.stuRelatedImageInfo[i] = new NET_XRAY_RELATED_IMAGE_INFO();
        }
        for(int i = 0; i < 4; i ++){
            this.stuViewCustomInfo[i] = new NET_XRAY_CUSTOM_INFO();
        }
    }

    public DEV_EVENT_XRAY_DETECTION_INFO(int nImageInfoNum) {
        for(int i = 0; i < FinalVar.MAX_INSIDEOBJECT_NUM; i ++) {
            this.stuInsideObj[i] = new NET_INSIDE_OBJECT();
            this.stuSlaveViewInsideObj[i] = new NET_INSIDE_OBJECT();
        }
        for(int i = 0; i < 32; i ++){
            this.stuBarCodeInfo[i] = new NET_BAR_CODE_INFO();
        }
        for(int i = 0; i < 8; i ++){
            this.stuImageInfo[i] = new NET_XRAY_IMAGE_INFO();
            this.stuRelatedImageInfo[i] = new NET_XRAY_RELATED_IMAGE_INFO();
        }
        for(int i = 0; i < 4; i ++){
            this.stuViewCustomInfo[i] = new NET_XRAY_CUSTOM_INFO();
        }
        this.nImageInfoNum = nImageInfoNum;
        this.pstuImageInfo = new NET_IMAGE_INFO_EX3[nImageInfoNum];
        for(int i = 0; i < nImageInfoNum; i ++){
            this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX3();
        }
    }
}