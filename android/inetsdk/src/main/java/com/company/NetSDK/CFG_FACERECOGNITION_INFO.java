package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Rule type EVENT_IVS_FACERECOGNITION configuration
 * \else
 * @brief 事件类型EVENT_IVS_FACERECOGNITION(目标识别)对应的规则配置
 * \endif
 */
public class CFG_FACERECOGNITION_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Rule name,different rule mast have different name
     * \else
     *  规则名称,不同规则不能重名
     * \endif
     */
    public byte					szRuleName[] = new byte[FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  Rule enable
     * \else
     *  规则使能
     * \endif
     */
    public boolean					bRuleEnable;

    /**
     * \if ENGLISH_LANG
     *  Current object's number
     * \else
     *  相应物体类型个数
     * \endif
     */
    public int					nObjectTypeNum;

    /**
     * \if ENGLISH_LANG
     *  Current object list
     * \else
     *  相应物体类型列表
     * \endif
     */
    public byte					szObjectTypes[][] = new byte[FinalVar.MAX_OBJECT_LIST_SIZE][FinalVar.MAX_NAME_LEN];

    /**
     * \if ENGLISH_LANG
     *  PTZ preset Id 0~65535
     * \else
     *  云台预置点编号	0~65535
     * \endif
     */
    public int					nPtzPresetId;

    /**
     * \if ENGLISH_LANG
     *  Similarity,it will report when over this similarity(1~100)
     * \else
     *  相似度，必须大于该相识度才报告(1~100)
     * \endif
     */
    public byte					bySimilarity;

    /**
     * \if ENGLISH_LANG
     *  Accuracy(1~10,the higher value,the higher accuracy,the lower speed. when be valued 1 means speed first, when be valued 10 means accuracy first)
     * \else
     *  识别精度(取值1~10，随着值增大，检测精度提高，检测速度下降。最小值为1 表示检测速度优先，最大值为10表示检测精度优先)
     * \endif
     */
    public byte					byAccuracy;

    /**
     * \if ENGLISH_LANG
     *  Mode, 0-normal, 1-area compounding, 2-aptitude mode
     * \else
     *  对比模式, 0-正常, 1-指定目标区域组合, 2-智能模式(算法根据目标各个区域情况自动选取组合)
     * \endif
     */
    public byte					byMode;

    /**
     * \if ENGLISH_LANG
     *  Important rank(1~10,the higher value the higher important)
     * \else
     *  查询重要等级大于等于此等级的人员(1~10,数值越高越重要)
     * \endif
     */
    public byte					byImportantRank;

    /**
     * \if ENGLISH_LANG
     *  Area number  
     * \else
     *  区域数  
     * \endif
     */
    public int					nAreaNum;

    /**
     * \if ENGLISH_LANG
     *  Area compounding, 0-eyebrow,1-eye,2-nose,3-mouth,4-Target(it work when mode = 1)
     * \else
     *  目标区域组合, 0-眉毛，1-眼睛，2-鼻子，3-嘴巴，4-脸颊(此参数在对比模式为1时有效)
     * \endif
     */
    public byte					byAreas[] = new byte[8];

    /**
     * \if ENGLISH_LANG
     *  The max pictrue number that fixed
     * \else
     *  报告的最大匹配图片个数
     * \endif
     */
    public int					nMaxCandidate;

    /**
     * \if ENGLISH_LANG
     *  Alarm event handler
     * \else
     *  报警联动
     * \endif
     */
    public CFG_ALARM_MSG_HANDLE					stuEventHandler = new CFG_ALARM_MSG_HANDLE();

    /**
     * \if ENGLISH_LANG
     *  Event respond time section
     * \else
     *  事件响应时间段
     * \endif
     */
    public CFG_TIME_SECTION					stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT_EX];

    public CFG_FACERECOGNITION_INFO() {
        for(int i = 0; i < FinalVar.WEEK_DAY_NUM; i ++){
            for (int j = 0; j < FinalVar.MAX_REC_TSECT_EX; j ++){
                this.stuTimeSection[i][j] = new CFG_TIME_SECTION();
            }
        }
    }
}