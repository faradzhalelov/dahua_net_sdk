package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analyse rule configuration, Rule type:{@link FinalVar#EVENT_IVS_CROSSREGIONDETECTION} configuration
 * \else
 * 视频分析事件规则配置, 事件类型 {@link FinalVar#EVENT_IVS_CROSSREGIONDETECTION} (警戒区事件)对应的规则配置
 * \endif
 */
public class CFG_CROSSREGION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Rule name,different rule mast have different name
     * \else
     * 规则名称,不同规则不能重名
     * \endif
     */
    public byte[]				szRuleName = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Rule enable
     * \else
     * 规则使能
     * \endif
     */
    public boolean				bRuleEnable;

    /**
     * \if ENGLISH_LANG
     * Trigger tracking enabled, only the tripwire, intrusion rule is valid
     * \else
     * 触发跟踪使能,仅对绊线，入侵规则有效
     * \endif
     */
    public byte                bTrackEnable;

    /**
     * \if ENGLISH_LANG
     * Current object's number
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int					nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Current object list
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte[][]			szObjectTypes = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Detect direction:0:Enter;1:Leave;2:Both
     * \else
     * 检测方向:0:Enter;1:Leave;2:Both
     * \endif
     */
    public int					nDirection;

    /**
     * \if ENGLISH_LANG
     * Detect line point number
     * \else
     * 警戒区顶点数
     * \endif
     */
    public int					nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * Detect line
     * \else
     * 警戒区
     * \endif
     */
    public CFG_POLYGON[]			stuDetectRegion = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * Alarm event handler
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Event respond time section
     * \else
     * 事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION[][]	stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * stuTimeSection ,default FALSE:not unable,TRUE:unable,user control
     * \else
     * stuTimeSection字段是否禁用，默认FALSE：不禁用，TRUE：禁用，用户控制
     * \endif
     */
    public boolean                bDisableTimeSection;

    /**
     * \if ENGLISH_LANG
     * PTZ preset Id  0~65535
     * \else
     * 云台预置点编号	0~65535
     * \endif
     */
    public int                    nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * Size filter enable
     * \else
     * 规则特定的尺寸过滤器是否有效
     * \endif
     */
    public boolean                bSizeFileter;

    /**
     * \if ENGLISH_LANG
     * Size filter info
     * \else
     * 规则特定的尺寸过滤器
     * \endif
     */
    public CFG_SIZEFILTER_INFO stuSizeFileter = new CFG_SIZEFILTER_INFO();

    /**
     * \if ENGLISH_LANG
     * Action type number
     * \else
     * 检测动作数
     * \endif
     */
    public int                 nActionType;

    /**
     * \if ENGLISH_LANG
     * Action type list,0-apaer 1-disapaer 2-in area 3-cross area
     * \else
     * 检测动作列表,0-出现 1-消失 2-在区域内 3-穿越区域
     * \endif
     */
    public byte[]                bActionType = new byte[4];

    /**
     * \if ENGLISH_LANG
     * The min object number(it will work when bActionType = 2 )
     * \else
     * 最小目标个数(当bActionType中包含"2-在区域内"时有效)
     * \endif
     */
    public int                 nMinTargets;

    /**
     * \if ENGLISH_LANG
     * The max object number(it will work when bActionType = 2 )
     * \else
     * 最大目标个数(当bActionType中包含"2-在区域内"时有效)
     * \endif
     */
    public int                 nMaxTargets;

    /**
     * \if ENGLISH_LANG
     * Min duration, s(it will work when bActionType = 2 )
     * \else
     * 最短持续时间， 单位秒(当bActionType中包含"2-在区域内"时有效)
     * \endif
     */
    public int                 nMinDuration;

    /**
     * \if ENGLISH_LANG
     * Report interval time, s(it will work when bActionType = 2 )
     * \else
     * 报告时间间隔， 单位秒(当bActionType中包含"2-在区域内"时有效)
     * \endif
     */
    public int                 nReportInterval;

    /**
     * \if ENGLISH_LANG
     * the duration of track
     * \else
     * 跟踪持续时间,0秒:一直跟踪,1~300秒:跟踪持续时间
     * \endif
     */
    public int					nTrackDuration;

    public CFG_CROSSREGION_INFO() {
        for(int i = 0; i < FinalVar.MAX_POLYGON_NUM; i++) {
            stuDetectRegion[i] = new CFG_POLYGON();
        }
        for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
    }
}
