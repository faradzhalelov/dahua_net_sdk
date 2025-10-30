package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rule type {@link FinalVar#EVENT_IVS_NUMBERSTAT} configuration
 * \else
 * 事件类型{@link FinalVar#EVENT_IVS_NUMBERSTAT}(数量统计事件)对应的规则配置
 * \endif
 */
public class CFG_NUMBERSTAT_INFO implements Serializable {
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
    public byte				szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

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
    public byte				szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Number stat upper limit, 1~65535
     * \else
     * 数量上限 单位：个，1~65535
     * \endif
     */
    public int					nUpperLimit;

    /**
     * \if ENGLISH_LANG
     * Period,1~65535(s)
     * \else
     * 上报周期	单位：秒，1~65535
     * \endif
     */
    public int					nPeriod;

    /**
     * \if ENGLISH_LANG
     * Detect region point number
     * \else
     * 检测区顶点数
     * \endif
     */
    public int					nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * Detect region
     * \else
     * 检测区
     * \endif
     */
    public CFG_POLYGON			stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

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
    public CFG_TIME_SECTION	stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ preset Id 0~65535
     * \else
     * 云台预置点编号	0~65535
     * \endif
     */
    public int                 nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * Numbers statistic type. It supports: "Region" type and "Entrance" type,corresponding to {@link NET_NUMBERSTAT_TYPE}
     * \else
     * 数量统计类型	支持："Region" 区域类型 "Entrance" 出入口类型,参考{@link NET_NUMBERSTAT_TYPE}
     * \endif
     */
    public int emType;

    /**
     * \if ENGLISH_LANG
     * Normal moving direction, this direction is correct, opposition is inverse. It is for entrance type only. First point is starting point, second point if end point, coordinates of all points are in [0,8191] region
     * \else
     * 正常运动方向, 按照此方向行驶是正向，反过来是逆行	只对出入口类型有效。第一个点是起点，第二个点是终点，点的坐标归一化到[0,8191]区间。
     * \endif
     */
    public CFG_POLYGON         stDirection[] = new CFG_POLYGON[2];

    /**
     * \if ENGLISH_LANG
     * Record period(1-10), unit: minute
     * \else
     * 记录周期，单位：分钟，1~10
     * \endif
     */
    public int                 nRecordInterval;

    /**
     * \if ENGLISH_LANG
     * the enter alarm Threshold,  0--no alarm
     * \else
     * 进入数报警阈值,0表示不报警
     * \endif
     */
    public int				nEnterThreshold;

    /**
     * \if ENGLISH_LANG
     * the exit alarm Threshold, 0--no alarm
     * \else
     * 离开数报警阈值,0表示不报警
     * \endif
     */
    public int				nExitThreshold;

    /**
     * \if ENGLISH_LANG
     * the inside alarm Threshold, 0--no alarm
     * \else
     * 滞留数报警阈值,0表示不报警
     * \endif
     */
    public int				nInsideThreshold;

    /**
     * \if ENGLISH_LANG
     * Plan ID,Speed Dome use,start from 1
     * \else
     * 计划ID,仅球机有效,从1开始
     * \endif
     */
    public int                nPlanID;

    /**
     * \if ENGLISH_LANG
     * Area ID锟斤拷a preset point can correspond to multiple area IDs锟斤拷
     * \else
     * 区域ID,一个预置点可以对应多个区域
     * \endif
     */
    public int				nAreaID;

    /**
     * \if ENGLISH_LANG
     * The actual maximum number of detection lines
     * \else
     * 检测线实际最大个数
     * \endif
     */
    public int					nMaxDetectLineNum;

    /**
     * \if ENGLISH_LANG
     * leave detection line coordinates
     * \else
     * 离开检测线坐标
     * \endif
     */
    public CFG_POLYLINE		stuDetectLine[] = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];

    /**
     * \if ENGLISH_LANG
     * Min stay detection duration,unit:seconds,range[1~1800]
     * \else
     * 停留超时时间
     * \endif
     */
    public int                nStayMinDuration;

    /**
     * \if ENGLISH_LANG
     * Remote alarm event handler
     * \else
     * 前端视频分析联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE    stuRemoteEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Remote event respond time section
     * \else
     * 前端视频分析联动响应时间段
     * \endif
     */
    public CFG_TIME_SECTION        stuRemoteTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    public CFG_NUMBERSTAT_INFO(){
        for(int i = 0; i < FinalVar.MAX_POLYGON_NUM; i++){
            stuDetectRegion[i] = new CFG_POLYGON();
        }
        for(int j = 0; j < FinalVar.WEEK_DAY_NUM; j++){
            for(int k = 0; k < FinalVar.MAX_REC_TSECT_EX; k++) {
                stuTimeSection[j][k] = new CFG_TIME_SECTION();
                stuRemoteTimeSection[j][k] = new CFG_TIME_SECTION();
            }
        }
        for(int m = 0; m < 2; m++){
            stDirection[m] = new CFG_POLYGON();
        }

        for(int n = 0; n < FinalVar.MAX_POLYLINE_NUM; n++){
            stuDetectLine[n] = new CFG_POLYLINE();
        }
    }
}
