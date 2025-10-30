package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief EVENT_IVS_TRAPPED_IN_LIFT_DETECTION(电梯困人检测事件)对应的规则配置
 * \else
 * @brief EVENT_IVS_TRAPPED_IN_LIFT_DETECTION(电梯困人检测事件)对应的规则配置
 * \endif
 */
public class NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Rule name, different rules cannot have duplicate names
     * \else
     *  规则名称,不同规则不能重名
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     *  Rule Enabling
     * \else
     *  规则使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     *  Number of corresponding object types
     * \else
     *  相应物体类型个数
     * \endif
     */
    public int					nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     *  List of corresponding object types
     * \else
     *  相应物体类型列表
     * \endif
     */
    public byte					szObjectTypes[][] = new byte[16][128];

    /**
     * \if ENGLISH_LANG
     *  Alarm linkage
     * \else
     *  报警联动
     * \endif
     */
    public NET_ALARM_MSG_HANDLE					stuEventHandler = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  Pan tilt preset point numbers 0~65535
     * \else
     *  云台预置点编号  0~65535
     * \endif
     */
    public int					nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     *  Number of linked businesses
     * \else
     *  联动业务个数
     * \endif
     */
    public int					nLink;

    /**
     * \if ENGLISH_LANG
     *  Linkage business category options
     * \else
     *  联动业务大类选项
     * \endif
     */
    public NET_LINK_CLASS_TYPE					stuLinkClassType[] = new NET_LINK_CLASS_TYPE[16];

    /**
     * \if ENGLISH_LANG
     *  Enable tracking condition rules
     * \else
     *  跟踪条件规则使能
     * \endif
     */
    public boolean					bTrackEnable;

    /**
     * \if ENGLISH_LANG
     *  Number of top points in the detection area
     * \else
     *  检测区顶点数
     * \endif
     */
    public int					nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     *  detection zone
     * \else
     *  检测区
     * \endif
     */
    public NET_POINT_EX					stuDetectRegion[] = new NET_POINT_EX[20];

    /**
     * \if ENGLISH_LANG
     *  Auxiliary line (two points)
     * \else
     *  辅助线（两点)
     * \endif
     */
    public NET_POINT_EX					stuDetectLine[] = new NET_POINT_EX[2];

    /**
     * \if ENGLISH_LANG
     *  Is the auxiliary line enabled. Corresponding to DetectLine.
     * \else
     *  是否开启辅助线。对应DetectLine。
     * \endif
     */
    public boolean					bDetectLineEnable;

    /**
     * \if ENGLISH_LANG
     *  mnimum duration, in seconds (5s-60s)
     * \else
     *  最短持续时间, 单位:秒(5s-60s)
     * \endif
     */
    public int					nMinDuration;

    /**
     * \if ENGLISH_LANG
     *  Repeated alarm time, unit: seconds, range 0-3600
     * \else
     *  重复报警间隔,单位：秒
     * \endif
     */
    public int					nReportInterval;

    /**
     * \if ENGLISH_LANG
     *  Sensitivity, the smaller the value, the lower the sensitivity, ranging from 1 to 10
     * \else
     *  灵敏度, 值越小灵敏度越低, 取值1-10
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     *  Rule specific size filters
     * \else
     *  规则特定的尺寸过滤器
     * \endif
     */
    public NET_CFG_SIZEFILTER_INFO					stuSizeFilter = new NET_CFG_SIZEFILTER_INFO();

    public NET_CFG_TRAPPED_IN_LIFT_DETECTION_INFO() {
        for(int i = 0; i < 20; i ++){
            this.stuDetectRegion[i] = new NET_POINT_EX();
        }
        for(int i = 0; i < 2; i ++){
            this.stuDetectLine[i] = new NET_POINT_EX();
        }
        for(int i = 0; i < 16; i ++){
            this.stuLinkClassType[i] = new NET_LINK_CLASS_TYPE();
        }
    }
}