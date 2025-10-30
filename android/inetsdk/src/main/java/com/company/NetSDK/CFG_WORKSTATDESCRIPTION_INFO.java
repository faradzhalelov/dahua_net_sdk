package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  work statistics description infomation
 * \else
 * 作业统计描述信息
 * \endif
 */
public class CFG_WORKSTATDESCRIPTION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Work cloths description
     * \else
     * 工装特征
     * \endif
     */
    public NET_WORK_CLOTHES_DESCRIPTION    stuWorkClothesDescription = new NET_WORK_CLOTHES_DESCRIPTION();

    /**
     * \if ENGLISH_LANG
     * Number of people that can trigger the alarm
     * \else
     * 触发报警的人员数量
     * \endif
     */
    public int                    nTriggerNum;

    /**
     * \if ENGLISH_LANG
     * Conditional expression, compared with nTriggerNum,refer to {@link EM_CONDITIONEXPR}
     * \else
     * 条件表达式, 和 nTriggerNum 做比较,参考{@link EM_CONDITIONEXPR}
     * \endif
     */
    public int        emConditionExpr;

    /**
     * \if ENGLISH_LANG
     * Statistical duration, unit: second, range: [1-86400]
     * \else
     * 统计时长，单位秒，范围: [1-86400]
     * \endif
     */
    public int                    nStatInterval;

    /**
     * \if ENGLISH_LANG
     * Alarm time, Unit: seconds. If the value is 600, count the personnel who meet the tooling characteristics within 10 minutes
     * \else
     * 事件持续多长时间后报警，单位:秒, 如值为600表示，统计10分钟内符合工装特征的人员
     * \endif
     */
    public int                    nAlarmTime;

    /**
     * \if ENGLISH_LANG
     * Repeat alarm interval, uint: second
     * \else
     * 重复报警时间间隔，单位:秒
     * \endif
     */
    public int                    nAlarmRepeatTime;


}
