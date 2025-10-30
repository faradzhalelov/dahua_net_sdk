package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rule type EVENT_IVS_WORKCLOTHES_DETECT configuration
 * \else
 * 事件类型EVENT_IVS_WORKCLOTHES_DETECT(工装(安全帽/工作服等)检测事件)对应的规则配置
 * \endif
 */
public class CFG_WORKCLOTHES_DETECT_INFO implements Serializable {

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
    public byte							szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Rule enable
     * \else
     * 规则使能
     * \endif
     */
    public boolean							bRuleEnable;

    /**
     * \if ENGLISH_LANG
     * Current object's number
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int								nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Current object list
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte							szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Alarm activation
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE			stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Event response time section
     * \else
     * 事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION[][]	stuTimeSection = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ pre set Id	0~65535, -1 means inefficacy
     * \else
     * 云台预置点编号	0~65535
     * \endif
     */
    public int								nPtzPresetId;
    /**
     * \if ENGLISH_LANG
     * point number of ploygon detect region
     * \else
     * 检测区顶点数
     * \endif
     */
    public int							nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * ploygon detect region
     * \else
     * 检测区
     * \endif
     */
    public CFG_POLYGON						stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * the actual number of  the array of description about work clothes
     * \else
     * 工装特征描述数组的实际个数
     * \endif
     */
    public int							nWorkClothesDescriptionCount;

    /**
     * \if ENGLISH_LANG
     * Array of description about work clothes.The largest element of the array is 64
     * \else
     * 工装特征描述,数组最大元素64个
     * \endif
     */
    public NET_WORK_CLOTHES_DESCRIPTION	stuWorkClothesDescription[] = new NET_WORK_CLOTHES_DESCRIPTION[64];

    public CFG_WORKCLOTHES_DETECT_INFO() {
        for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
            for(int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j++) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
        for(int k = 0; k < 64; k++)
        {
            stuWorkClothesDescription[k] = new NET_WORK_CLOTHES_DESCRIPTION();
        }
        for(int m = 0; m < FinalVar.MAX_POLYGON_NUM; m++)
        {
            stuDetectRegion[m] = new CFG_POLYGON();
        }

    }
}
