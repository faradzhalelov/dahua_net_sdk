package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief event type EVENT_IVS_MAN_NUM_DETECTION(Event of regional population statistics)corresponding to rule config
 * \else
 * @brief 事件类型EVENT_IVS_MAN_NUM_DETECTION(立体视觉区域内人数统计事件)对应的规则配置
 * \endif
 */
public class CFG_IVS_MAN_NUM_DETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Rule name, different rules cannot have same name
     * \else
     * 规则名称,不同规则不能重名
     * \endif
     */
    public byte szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Rule enable
     * \else
     * 规则使能
     * \endif
     */
    public boolean bRuleEnable;

    /**
     * \if ENGLISH_LANG
     * Trigger tracking enabled, only the tripwire, intrusion rule is valid
     * \else
     * 触发跟踪使能,仅对绊线，入侵规则有效
     * \endif
     */
    public byte bTrackEnable;

    /**
     * \if ENGLISH_LANG
     * Current object's number
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Current object list
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

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
    public CFG_TIME_SECTION stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ preset Id 0~65535
     * \else
     * 云台预置点编号	0~65535
     * \endif
     */
    public int nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * The count of detection region top points
     * \else
     * 检测区域顶点数
     * \endif
     */
    public int nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * Detection region
     * \else
     * 检测区域坐标
     * \endif
     */
    public CFG_POLYGON stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * Anomaly threshold
     * \else
     * 异常人数阈值
     * \endif
     */
    public int nThreshold;

    /**
     * \if ENGLISH_LANG
     * Anomaly detection method
     * \else
     * 人数异常检测方式
     * \endif
     */
    public int nDetectType;

    /**
     * \if ENGLISH_LANG
     * Sensitivity,[1-10]
     * \else
     * 灵敏度,[1-10]
     * \endif
     */
    public int nSensitivity;

    /**
     * \if ENGLISH_LANG
     * Maximum detection height, unit cm
     * \else
     * 最大检测高度,单位cm
     * \endif
     */
    public int nMaxHeight;

    /**
     * \if ENGLISH_LANG
     * Minimum detection height, unit cm
     * \else
     * 最小检测高度,单位cm
     * \endif
     */
    public int nMinHeight;

    /**
     * \if ENGLISH_LANG
     * Whether to open the alarm function of retention, corrseponding to the alarm StayDetection
     * \else
     * 是否开启滞留检测报警功能, 对应报警为StayDetection。
     * \endif
     */
    public boolean bStayDetectEnable;

    /**
     * \if ENGLISH_LANG
     * Minimum stat time,unit:second, [2, 65535], it is valid if the bStayDetectEnable is true
     * \else
     * 最短滞留持续时间，单位秒[2, 65535], 开启滞留检测报警时需设置
     * \endif
     */
    public int nStayMinDuration;

    /**
     * \if ENGLISH_LANG
     * Whether to opem the alarm function of man number detection, default value is TRUE, corrseponding to the alarm ManNumDetection
     * \else
     * 是否开启人数异常报警功能, 默认为TRUE。对应报警为ManNumDetection
     * \endif
     */
    public boolean bManNumAlarmEnable;

    /**
     * \if ENGLISH_LANG
     * Area ID, a preset point can correspond to multiple area IDs
     * \else
     * 区域ID（一个预置点对应多个区域ID）
     * \endif
     */
    public int nAreaID;

    /**
     * \if ENGLISH_LANG
     * Plan ID, range 1~MaxNumberStatPlan
     * \else
     * 计划ID，范围 1~MaxNumberStatPlan
     * \endif
     */
    public int nPlanId;

    public CFG_IVS_MAN_NUM_DETECTION_INFO() {
        for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for (int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
        for (int i = 0; i < FinalVar.MAX_POLYGON_NUM; i++) {
            this.stuDetectRegion[i] = new CFG_POLYGON();
        }
    }
}