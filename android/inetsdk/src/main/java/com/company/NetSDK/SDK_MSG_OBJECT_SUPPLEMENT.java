package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Supplementary field of video analysis object information
 * \else
 * @brief 视频分析物体信息补充字段，与 SDK_MSG_OBJECT 的合集表示视频分析物体信息
 * \endif
 */
public class SDK_MSG_OBJECT_SUPPLEMENT implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Global unique object identification of intelligent object
     * \else
     * 智能物体全局唯一物体标识
     * \endif
     */
    public byte					szObjectUUID[] = new byte[48];

    /**
     * \if ENGLISH_LANG
     *  Whether the muck truck is covered and identified, 0: whether the muck truck is covered is unknown, 1: the muck truck is covered, 2: the muck truck is not covered and unloaded, 3: the muck truck is not covered and fully loaded
     * \else
     * 渣土车是否遮盖识别,0:渣土车是否遮盖未知,1:渣土车遮盖,2:渣土车无遮盖空载,3:渣土车无遮盖满载.
     * \endif
     */
    public int					nMuckHide;

    /**
     * \if ENGLISH_LANG
     *  Truck loading type, 0: unknown whether the truck is loaded, 1: sand, 2: mud, 3: stone, 4: stone slag
     * \else
     * 货车载货类型,0:货车是否载货未知,1:沙子,2:泥浆,3:石头,4:石渣.
     * \endif
     */
    public int					nCarryType;

    /**
     * \if ENGLISH_LANG
     *  Category type
     * \else
     * 物体类型
     * \endif
     */
    public byte					szCategory[] = new byte[32];

    /**
     * \if ENGLISH_LANG
     *  Human num
     * \else
     * 车载人数
     * \endif
     */
    public int					nHumanNum;

    /**
     * \if ENGLISH_LANG
     * The platform uniquely identifies the license plate field, which is different from UID
     * \else
     * 平台唯一标识车牌字段，区别于UID
     * \endif
     */
    public byte					szUUID[] = new byte[64];

    /**
     * \if ENGLISH_LANG
     * Modification time refers to the time when the platform last modified the registry personnel information
     * \else
     * 修改时间，指的是平台最近一次修改注册库人员信息的时间
     * \endif
     */
    public NET_TIME					stuModifyTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Register database entry time
     * \else
     * 注册库入库时间
     * \endif
     */
    public NET_TIME					stuRegisterStorageTime = new NET_TIME();

    /**
     * \if ENGLISH_LANG
     * Vehicle orientation,0: vehicle orientation unknown,1: front,2: back,3: side
     * \else
     * 车辆朝向,0：车辆朝向未知,1：正面,2：背面,3：侧面
     * \endif
     */
    public int					nDirection;

}