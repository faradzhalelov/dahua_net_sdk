package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Video Analyse Animal info
 * \else
 * @brief 视频分析物体(动物)
 * \endif
 */
public class VA_OBJECT_ANIMAL implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Object ID
     * \else
     *  物体ID, 每个ID表示一个唯一的物体
     * \endif
     */
    public int					nObjectID;

    /**
     * \if ENGLISH_LANG
     *  Animal Category
     * \else
     *  目标动物类型
     * \endif
     */
    public int					emCategory;

    /**
     * \if ENGLISH_LANG
     *  BoundingBox, The frame coordinates of the animal object in the panorama
     * \else
     *  包围盒 动物对象在全景图中的框坐标,为0~8191相对坐标
     * \endif
     */
    public NET_RECT					stuBoundingBox = new NET_RECT();

    /**
     * \if ENGLISH_LANG
     *  Object weight, unit:g
     * \else
     *  动物对象重量，单位:g
     * \endif
     */
    public int					nObjectWeight;

    /**
     * \if ENGLISH_LANG
     *  Object screenshot
     * \else
     *  物体截图
     * \endif
     */
    public NET_OBJECT_IMAGE_INFO					stuImage = new NET_OBJECT_IMAGE_INFO();

    /**
     * \if ENGLISH_LANG
     *  Move Status
     * \else
     *  运动状态
     * \endif
     */
    public int					emMoveStatus;

    /**
     * \if ENGLISH_LANG
     *  In-region status
     * \else
     *  区域内状态
     * \endif
     */
    public int					emInRegionStatus;

    /**
     * \if ENGLISH_LANG
     *  Result Type. 0-realtime 1- no reel-time
     * \else
     *  结果类型 0-实时 1-非实时
     * \endif
     */
    public int					nResultType;

    @java.lang.Override
    public java.lang.String toString() {
        return "VA_OBJECT_ANIMAL{" +
                "nObjectID=" + nObjectID +
                ", emCategory=" + emCategory +
                ", stuBoundingBox=" + stuBoundingBox.toString() +
                ", nObjectWeight=" + nObjectWeight +
                ", stuImage=" + stuImage.nLength + "," + stuImage.nOffSet +
                ", emMoveStatus=" + emMoveStatus +
                ", emInRegionStatus=" + emInRegionStatus +
                ", nResultType=" + nResultType +
                '}';
    }
}