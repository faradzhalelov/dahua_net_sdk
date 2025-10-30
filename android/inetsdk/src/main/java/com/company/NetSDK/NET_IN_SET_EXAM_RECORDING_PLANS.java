package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief CLIENT_SetExamRecordingPlans Interface input parameters
 * \else
 * @brief CLIENT_SetExamRecordingPlans 接口入参
 * \endif
 */
public class NET_IN_SET_EXAM_RECORDING_PLANS implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  Number of exam plans
     * \else
     *  考试计划个数
     * \endif
     */
    public int					nPlansNum;

    /**
     * \if ENGLISH_LANG
     *  Exam plans, applied and released by users, up to 1024
     * \else
     *  考试计划, 由用户申请和释放, 最大为1024个
     * \endif
     */
    public NET_EXAM_RECORDING_PLAN_INFO				pstuPlans[];

    public NET_IN_SET_EXAM_RECORDING_PLANS(int nPlansNum) {
        this.nPlansNum = nPlansNum;
        this.pstuPlans = new NET_EXAM_RECORDING_PLAN_INFO[nPlansNum];
        for(int i = 0; i < nPlansNum; i ++){
            this.pstuPlans[i] = new NET_EXAM_RECORDING_PLAN_INFO();
        }
    }
}
