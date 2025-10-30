package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief EVENT_ IVS_ Classroom_ Rule configuration corresponding to BEHAVIOR (classroom behavior analysis event)
 * \else
 * @brief EVENT_IVS_CLASSROOM_BEHAVIOR(课堂行为分析事件)对应的规则配置
 * \endif
 */
public class NET_CFG_CLASSROOM_BEHAVIOR_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Rule name, different rules cannot have duplicate names
     * \else
     * 规则名称,不同规则不能重名
     * \endif
     */
    public byte					szName[] = new byte[128];

    /**
     * \if ENGLISH_LANG
     * Rule Enabling
     * \else
     * 规则使能
     * \endif
     */
    public boolean					bEnable;

    /**
     * \if ENGLISH_LANG
     * Number of corresponding object types
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int					nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * List of corresponding object types
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte					szObjectTypes[][] = new byte[16][128];

    /**
     * \if ENGLISH_LANG
     * Alarm linkage
     * \else
     * 报警联动
     * \endif
     */
    public NET_ALARM_MSG_HANDLE					stuEventHandler = new NET_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Pan tilt preset point numbers 0~65535
     * \else
     * 云台预置点编号  0~65535
     * \endif
     */
    public int					nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * Number of linked businesses
     * \else
     * 联动业务个数
     * \endif
     */
    public int					nLink;

    /**
     * \if ENGLISH_LANG
     * Linkage business category options
     * \else
     * 联动业务大类选项
     * \endif
     */
    public NET_LINK_CLASS_TYPE					stuLinkClassType[] = new NET_LINK_CLASS_TYPE[16];

    /**
     * \if ENGLISH_LANG
     * Enable tracking condition rules
     * \else
     * 跟踪条件规则使能
     * \endif
     */
    public boolean					bTrackEnable;

    /**
     * \if ENGLISH_LANG
     * Number of top points in the detection area
     * \else
     * 检测区顶点数
     * \endif
     */
    public int					nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * detection zone
     * \else
     * 检测区
     * \endif
     */
    public NET_POINT_EX					stuDetectRegion[] = new NET_POINT_EX[20];

    /**
     * \if ENGLISH_LANG
     * Minimum duration, in seconds (5s-60s)
     * \else
     * 最短持续时间, 单位:秒(5s-60s)
     * \endif
     */
    public int					nMinDuration;

    /**
     * \if ENGLISH_LANG
     * Continuous capture interval, in seconds (0s-108000s)
     * \else
     * 持续抓拍间隔, 单位:秒(0s-108000s)
     * \endif
     */
    public int					nSnapInterval;

    /**
     * \if ENGLISH_LANG
     * Sensitivity, the smaller the value, the lower the sensitivity, ranging from 1 to 10
     * \else
     * 灵敏度, 值越小灵敏度越低, 取值1-10
     * \endif
     */
    public int					nSensitivity;

    /**
     * \if ENGLISH_LANG
     * The number of behaviors that need to be detected
     * \else
     * 需要检测的行为个数
     * \endif
     */
    public int					nActionListNum;

    /**
     * \if ENGLISH_LANG
     * Behaviors that need to be tested
     * \else
     * 需要检测的行为
     * \endif
     */
    public byte					szActionList[][] = new byte[32][16];

    /**
     * \if ENGLISH_LANG
     * Whether to perform capture, default to true
     * \else
     * 是否进行抓图,默认true
     * \endif
     */
    public boolean					bFaceSnapEnable;

    /**
     * \if ENGLISH_LANG
     * Whether to enable  attribute , default to true
     * \else
     * 是否开属性识别,默认true
     * \endif
     */
    public boolean					bFeatureEnable;

    /**
     * \if ENGLISH_LANG
     * Configure which attributes to detect, which are effective when attributes are enabled, and all attributes are selected by default
     * \else
     * 配置要检测哪些属性，开启属性时有效,默认所有属性全选
     * \endif
     */
    public byte					szFeatureList[][] = new byte[32][16];

    /**
     * \if ENGLISH_LANG
     * Configure which number of facial attributes to detect
     * \else
     * 配置要检测哪些属性个数
     * \endif
     */
    public int					nFeatureListNum;

    public NET_CFG_CLASSROOM_BEHAVIOR_INFO() {
        for(int i = 0; i < 16; i ++){
            this.stuLinkClassType[i] = new NET_LINK_CLASS_TYPE();
        }
        for(int i = 0; i < 20; i ++){
            this.stuDetectRegion[i] = new NET_POINT_EX();
        }
    }
}