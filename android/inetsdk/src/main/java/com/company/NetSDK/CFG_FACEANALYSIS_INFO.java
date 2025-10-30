package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Rule type {@link FinalVar#EVENT_IVS_FACEANALYSIS} configuration
 * \else
 * 事件类型{@link FinalVar#EVENT_IVS_FACEANALYSIS}(目标分析事件)对应的规则配置
 * \endif
 */
public class CFG_FACEANALYSIS_INFO implements Serializable{
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
    public byte					szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Rule enable
     * \else
     * 规则使能
     * \endif
     */
    public boolean					bRuleEnable;

    /**
     * \if ENGLISH_LANG
     * Current object's number
     * \else
     * 相应物体类型个数
     * \endif
     */
    public int						nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     * Current object list
     * \else
     * 相应物体类型列表
     * \endif
     */
    public byte					szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     * Detect region point number
     * \else
     * 检测区顶点数
     * \endif
     */
    public int						nDetectRegionPoint;

    /**
     * \if ENGLISH_LANG
     * Detect region
     * \else
     * 检测区
     * \endif
     */
    public CFG_POLYGON				stuDetectRegion[] = new CFG_POLYGON[FinalVar.MAX_POLYGON_NUM];

    /**
     * \if ENGLISH_LANG
     * Alarm event handler
     * \else
     * 报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE 	stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     * Event respond time section
     * \else
     * 事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    /**
     * \if ENGLISH_LANG
     * PTZ preset Id 0~65535
     * \else
     * 云台预置点编号	0~65535
     * \endif
     */
    public int			nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     * sensitivity, range [1,10], the higher the sensitivity, the easier to detect
     * \else
     * 灵敏度,范围[1,10],灵敏度越高越容易检测
     * \endif
     */
    public int                 	nSensitivity;

    /**
     * \if ENGLISH_LANG
     * the count of link group
     * \else
     * 联动布控个数
     * \endif
     */
    public int						nLinkGroupNum;

    /**
     * \if ENGLISH_LANG
     * the list of link group
     * \else
     * 联动的布控组
     * \endif
     */
    public CFG_LINKGROUP_INFO		stuLinkGroup[] = new CFG_LINKGROUP_INFO[FinalVar.MAX_LINK_GROUP_NUM];

    /**
     * \if ENGLISH_LANG
     * Stranger Mode
     * \else
     * 陌生人布防模式
     * \endif
     */
    public CFG_STRANGERMODE_INFO	stuStrangerMode = new CFG_STRANGERMODE_INFO();

    /**
     * \if ENGLISH_LANG
     * whether rule special dimension filter is valid or not
     * \else
     * 规则特定的尺寸过滤器是否有效
     * \endif
     */
    public boolean                	bSizeFileter;

    /**
     * \if ENGLISH_LANG
     * rule special dimension filter
     * \else
     * 规则特定的尺寸过滤器
     * \endif
     */
    public CFG_SIZEFILTER_INFO 	stuSizeFileter = new CFG_SIZEFILTER_INFO();

    /**
     * \if ENGLISH_LANG
     * whether to open the face feature detection
     * \else
     * 是否开启目标属性识别, IPC增加
     * \endif
     */
    public boolean					bFeatureEnable;

    /**
     * \if ENGLISH_LANG
     * the count of face feature
     * \else
     * 需要检测的目标属性个数
     * \endif
     */
    public int						nFaceFeatureNum;

    /**
     * \if ENGLISH_LANG
     * the list of face feature,refer to{@link EM_FACEFEATURE_TYPE}
     * \else
     * 需检测的目标属性,参考{@link EM_FACEFEATURE_TYPE}
     * \endif
     */
    public int 	emFaceFeatureType[] = new int[FinalVar.MAX_FEATURE_LIST_SIZE];

    /**
     * \if ENGLISH_LANG
     * when open the face feature锟斤拷if the face image's quality is too bad锟斤拷whether to report
     * \else
     * 在目标属性开启前提下，如果目标图像质量太差，是否不上报属性
     * \endif
     */
    public boolean					bFeatureFilter;

    /**
     * \if ENGLISH_LANG
     * the threshold of face image quality, use with bFeatureFilter range[1,100]
     * \else
     * 目标图片质量阈值,和bFeatureFilter一起使用 范围[1,100]
     * \endif
     */
    public int						nMinQuality;

    public CFG_FACEANALYSIS_INFO(){
        for(int k = 0; k < FinalVar.MAX_POLYGON_NUM; k++){
            stuDetectRegion[k] = new CFG_POLYGON();
        }
        for (int i = 0; i < FinalVar.WEEK_DAY_NUM; ++i) {
            for (int j = 0; j < FinalVar.MAX_REC_TSECT_EX; ++j) {
                stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
        for(int m = 0; m < FinalVar.MAX_LINK_GROUP_NUM; m ++){
            stuLinkGroup[m] = new CFG_LINKGROUP_INFO();
        }
    }
}
