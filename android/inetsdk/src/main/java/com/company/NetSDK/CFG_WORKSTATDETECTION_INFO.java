package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rule type EVENT_IVS_WORKSTATDETECTION configuration
 * \else
 * EVENT_IVS_WORKSTATDETECTION(作业统计事件)对应的规则配置
 * \endif
 */
public class CFG_WORKSTATDETECTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;



    /**
     * \if ENGLISH_LANG
     * Rule name, different rules cannot have a same name
     * \else
     * 规则名称,不同规则不能重名
     * \endif
     */
    public byte                    szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Rule enable
     * \else
     * 规则使能
     * \endif
     */
    public boolean                    bRuleEnable;

    /**
     * \if ENGLISH_LANG
     * Current object's number
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int                     nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Current object list
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte                    szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Alarm activation
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE    stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Event response time section
     * \else
     * 事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION        stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     *  PTZ pre set Id   0~65535, -1 means inefficacy
     * \else
     * 云台预置点编号  0~65535
     * \endif
     */
    public int                    nPtzPresetId;


    /**
     * \if ENGLISH_LANG
     * detect region number
     * \else
     * 检测区域号
     * \endif
     */
    public int                    nDectRegionNumber;

    /**
     * \if ENGLISH_LANG
     * Detect region
     * \else
     * 检测区域
     * \endif
     */
    public CFG_POLYGON             stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * The points number of region
     * \else
     * 检测区域顶点数
     * \endif
     */
    public int                     nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * current work rule number
     * \else
     * 当前作业规则个数
     * \endif
     */
    public int                     nRuleNum;

    /**
     * \if ENGLISH_LANG
     * current work rule type，refer to{@link EM_WORK_RULE_TYPE}
     * \else
     * 当前作业规则类型,参考{@link EM_WORK_RULE_TYPE}
     * \endif
     */
    public int       emWorkRuleType[] = new int[32];

    /**
     * \if ENGLISH_LANG
     * work statistics description infomation
     * \else
     * 作业统计描述信息
     * \endif
     */
    public CFG_WORKSTATDESCRIPTION_INFO       stuWorkStatDescription[] = new CFG_WORKSTATDESCRIPTION_INFO[64];

    /**
     * \if ENGLISH_LANG
     * work statistics description number
     * \else
     * 作业统计描述信息个数
     * \endif
     */
    public int                     nWorkStatDescriptionNum;

    public CFG_WORKSTATDETECTION_INFO() {
        for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
        for(int k = 0; k < 64; k++)
        {
            stuWorkStatDescription[k] = new CFG_WORKSTATDESCRIPTION_INFO();
        }
        for(int m = 0; m < FinalVar.MAX_POLYGON_NUM; m++)
        {
            stuDetectRegion[m] = new CFG_POLYGON();
        }

    }

}
