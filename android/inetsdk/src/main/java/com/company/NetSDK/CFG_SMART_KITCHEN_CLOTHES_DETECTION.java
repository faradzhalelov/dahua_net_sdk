package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rule type {@link FinalVar#EVENT_IVS_SMART_KITCHEN_CLOTHES_DETECTION}  (smart kitchen clothes detection)configuration
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_SMART_KITCHEN_CLOTHES_DETECTION} (智慧厨房穿着检测)对应的规则配置
 * \endif
 */
public class CFG_SMART_KITCHEN_CLOTHES_DETECTION implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * Rule name, different fules cannot have a same
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
     * Current objecjt's number
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
    public byte[][]                    szObjectTypes = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

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
    public CFG_TIME_SECTION[][]        stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ pre set Id 0~65535, -1 means inefficacy
     * \else
     * 云台预置点编号   0~65535
     * \endif
     */
    public int 		       nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * Whether mask detection is on(TRUE:ON FALSE:OFF)
     * \else
     * 是否开启口罩检测  （TRUE:开启 FALSE:关闭）
     * \endif
     */
    public boolean					bMaskEnable;

    /**
     * \if ENGLISH_LANG
     * Whether to turn on chef cap detection锟斤拷TRUE:ON FALSE:OFF锟斤拷
     * \else
     * 是否开启厨师帽检测（TRUE:开启 FALSE:关闭）
     * \endif
     */
    public boolean					bChefHatEnable;

    /**
     * \if ENGLISH_LANG
     * Whether to turn on chef cap detection锟斤拷TRUE:ON FALSE:OFF锟斤拷
     * \else
     * 是否开启厨师服检测（TRUE:开启 FALSE:关闭）
     * \endif
     */
    public boolean					bChefClothesEnable;

    /**
     * \if ENGLISH_LANG
     * The color of chef's suit meeting the requirements is not alarmed, refer to {@link EM_SUPPORTED_COLOR_LIST_TYPE}
     * \else
     * 检测符合要求的厨师服颜色不报警,参考{@link EM_SUPPORTED_COLOR_LIST_TYPE}
     * \endif
     */
    public int[]	emChefClothesColors = new int[8];

    /**
     * \if ENGLISH_LANG
     * Number of no alarm when checking the color of chef's suit that meets the requirements
     * \else
     * 符合检测不需要报警的厨师服颜色个数
     * \endif
     */
    public int						nChefClothesColorsNum;

    /**
     * \if ENGLISH_LANG
     * Report time interval, unit second [0600] default 30,0 means no repeated alarm
     * \else
     * 报告时间间隔,单位秒 [0,600] 默认30,0表示不重复报警
     * \endif
     */
    public int					nReportInterval;

    /**
     * \if ENGLISH_LANG
     * The point number of region
     * \else
     * 警戒区端点个数
     * \endif
     */
    public int                     nDetectRegionNum;

    /**
     * \if ENGLISH_LANG
     * Detect region, point range[0,8192)
     * \else
     * 警戒区， 多边形类型，多边形中每个端点的坐标归一化到[0,8192)区间。
     * \endif
     */
    public CFG_POLYLINE[]            stuDetectRegion = new CFG_POLYLINE[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * Size filter is enable
     * \else
     * 是否设置尺寸过滤器
     * \endif
     */
    public boolean					bSizeFilterEnable;

    /**
     * \if ENGLISH_LANG
     * Size filter
     * \else
     * 规则特定的尺寸过滤器，为提高规则判断精度
     * \endif
     */
    public CFG_SIZEFILTER_INFO		stuSizeFilter = new CFG_SIZEFILTER_INFO();

    /**
     * \if ENGLISH_LANG
     * Sensitivity, range:[1, 10], default is 5
     * \else
     * 灵敏度
     * \endif
     */
    public int                    nSensitivity;

    /**
     * \if ENGLISH_LANG
     * min duration unit: s, range:[1, 3600], default is 2
     * \else
     * 最短持续时间，单位：秒0~3600默认值0,表示检测到即上报
     * \endif
     */
    public int                    nMinDuration;

    public CFG_SMART_KITCHEN_CLOTHES_DETECTION(){
        for(int i = 0; i < FinalVar.WEEK_DAY_NUM ; i ++){
            for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++){
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
        for(int k = 0; k < FinalVar.MAX_POLYGON_NUM; k ++){
            stuDetectRegion[k] = new CFG_POLYLINE();
        }
    }
}
