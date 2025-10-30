package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * @brief Whether to use remote mapping
 * \else
 * @brief 是否使用远程判图
 * \endif
 */
public class EM_XRAY_DETECTION_JUDGE_REMOTELY implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     *  unknown, when expressed as unknown, it means that the local does not send the remote judgment diagram, centralized judgment diagram when sent to the remote judgment diagram
     * \else
     * 未知, 当表示为未知时意为本地不送远程判图，集中判图时送到远程判图
     * \endif
     */
    public static final int					EM_XRAY_DETECTION_JUDGE_REMOTELY_UNKNOWN = -1;

    /**
     * \if ENGLISH_LANG
     *  Do not send the detection_detection_judge_remotely_not_send_judge
     * \else
     * 不送远端三方进行判图
     * \endif
     */
    public static final int					EM_XRAY_DETECTION_JUDGE_REMOTELY_NOT_SEND_JUDGE = 0;

    /**
     * \if ENGLISH_LANG
     *  Send to the remote three parties for graph detection
     * \else
     * 送远端三方进行判图
     * \endif
     */
    public static final int					EM_XRAY_DETECTION_JUDGE_REMOTELY_SEND_JUDGE = 1;

}