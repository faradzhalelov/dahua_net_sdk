package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analyse rule configuration, Rule type:{@link FinalVar#EVENT_IVS_CROSSLINEDETECTION} configuration
 * \else
 * 视频分析事件规则配置, 事件类型 {@link FinalVar#EVENT_IVS_CROSSLINEDETECTION} (警戒线事件)对应的规则配置
 * \endif
 */
public class CFG_CROSSLINE_INFO implements Serializable {

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
    public boolean			bRuleEnable;

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
     * Detect direction: 0-left to right; 1-right to left; 2-both
     * \else
     * 检测方向:0-由左至右; 1-由右至左; 2-两者都可以
     * \endif
     */
    public int					nDirection;

    /**
     * \if ENGLISH_LANG
     * Detect line point number
     * \else
     * 警戒线顶点数
     * \endif
     */
    public int					nDetectLinePoint;

    /**
     * \if ENGLISH_LANG
     * Detect line
     * \else
     * 警戒线
     * \endif
     */
    public CFG_POLYLINE		stuDetectLine[] = new CFG_POLYLINE[FinalVar.MAX_POLYLINE_NUM];

    /**
     * \if ENGLISH_LANG
     * Alarm event handler
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE  stuEventHandler = new CFG_ALARM_MSG_HANDLE();

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
     * stuTimeSection ,default FALSE:not unable；TRUE:unable,user control
     * \else
     * stuTimeSection字段是否禁用，默认FALSE：不禁用；TRUE：禁用，用户控制
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
     * Trigger possition number
     * \else
     * 触发报警位置数
     * \endif
     */
    public int                 nTriggerPosition;

    /**
     * \if ENGLISH_LANG
     * Trigger possition,0-object out frame center, 1-object out frame left center, 2-object out frame top center, 3-object out frame right center, 4-object out frame bottom center
     * \else
     * 触发报警位置,0-目标外接框中心, 1-目标外接框左端中心, 2-目标外接框顶端中心, 3-目标外接框右端中心, 4-目标外接框底端中心
     * \endif
     */
    public byte[]              bTriggerPosition = new byte[8];

    /**
     * \if ENGLISH_LANG
     * Track Duration,0 second:keep tracking,1~300s:track duration
     * \else
     * 跟踪持续时间,0秒:一直跟踪,1~300秒:跟踪持续时间
     * \endif
     */
    public int					nTrackDuration;

    public CFG_CROSSLINE_INFO() {
        for(int i = 0; i < FinalVar.MAX_POLYLINE_NUM; i++) {
            stuDetectLine[i] = new CFG_POLYLINE();
        }

        for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
    }
}
