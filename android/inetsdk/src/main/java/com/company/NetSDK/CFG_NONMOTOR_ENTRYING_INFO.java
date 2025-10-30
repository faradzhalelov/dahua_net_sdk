package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 *
 * @brief Rule type EVENT_ IVS_ NONMOTOR_ Rules configuration of entering elevator for non motor vehicles
 * \else
 * @brief 事件类型 EVENT_IVS_NONMOTOR_ENTRYING 非机动车进入电梯对应的规则配置
 * \endif
 */
public class CFG_NONMOTOR_ENTRYING_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * ule name, different rules cannot have a same name
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
     * Alarm activation
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Event response time section
     * \else
     * 事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ pre set Id 0~65535, -1 means inefficacy
     * \else
     * 云台预置点编号  0~65535
     * \endif
     */
    public int nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * Top points of detection area
     * \else
     * 检测区域顶点数
     * \endif
     */
    public int nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * Detection area
     * \else
     * 检测区域
     * \endif
     */
    public CFG_POLYGON stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * Number of detection types
     * \else
     * 检测类型个数
     * \endif
     */
    public int nDetectType;

    /**
     * \if ENGLISH_LANG
     * Detection type: the array element is a subtype of Firelane jams object, and the array can be empty, indicating no filtering,{@link EM_NON_MOTOR_ENTRYING_DETECT_TYPE}
     * \else
     * 检测类型,数组元素为NonMotor物体的子类型,数组可以为空,表示不进行过滤,{@link EM_NON_MOTOR_ENTRYING_DETECT_TYPE}
     * \endif
     */
    public int emDetectType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * Minimum duration, unit: seconds, range: 0 ~ 65535
     * \else
     * 最短持续时间, 单位:秒, 范围:0~65535
     * \endif
     */
    public int nMinDuration;

    /**
     * \if ENGLISH_LANG
     * Report time interval, unit: seconds, 0 ~ 600; equal to 0 means no repeated alarm, the default value is 30
     * \else
     * 报告时间间隔, 单位:秒, 0~600; 等于0表示不重复报警,默认值30
     * \endif
     */
    public int nReportInterval;

    /**
     * \if ENGLISH_LANG
     * Sensitivity, value 1-10, default value 5, the smaller the value, the lower the sensitivity
     * \else
     * 灵敏度，取值1-10，默认值5，值越小灵敏度越低
     * \endif
     */
    public int nSensitivity;

    /**
     * \if ENGLISH_LANG
     * Is the rule specific size filter valid
     * \else
     * 规则特定的尺寸过滤器是否有效
     * \endif
     */
    public boolean bSizeFileter;

    /**
     * \if ENGLISH_LANG
     * Rule specific size filter
     * \else
     * 规则特定的尺寸过滤器
     * \endif
     */
    public CFG_SIZEFILTER_INFO stuSizeFileter = new CFG_SIZEFILTER_INFO();

    public CFG_NONMOTOR_ENTRYING_INFO() {
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