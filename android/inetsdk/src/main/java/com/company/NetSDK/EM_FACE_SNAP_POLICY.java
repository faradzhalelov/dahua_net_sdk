package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target snap policy
 * \else
 * IPC智能目标抓拍策略
 * \endif
 */
public class EM_FACE_SNAP_POLICY implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * \if ENGLISH_LANG
     * unknown
     * \else
     * 未知
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_UNKNOWN = 0;

    /**
     * \if ENGLISH_LANG
     * realtime
     * \else
     * 实时抓拍模式(当前的通用模式，实时性优先)
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_REALTIME = 1;

    /**
     * \if ENGLISH_LANG
     * optimal
     * \else
     * 优选抓拍模式，在设定的延时区间(OptimalTime)内挑选评分最高的抓图，准确性优先但延时较大
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_OPTIMAL = 2;

    /**
     * \if ENGLISH_LANG
     * quality
     * \else
     * 质量抓拍模式，在Optimal的基础上，如果图片质量好于阈值提前结束优选，提高实时性
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_QUALITY = 3;

    /**
     * \if ENGLISH_LANG
     * recognize
     * \else
     * 识别优先抓拍模式，在优选时间内，以一定间隔帧数多次进行比对；一旦比对成功则立即结束优选，以提高对比成功率，取代质量优先模式。
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_RECOGNITION = 4;

    /**
     * \if ENGLISH_LANG
     * quick
     * \else
     * 快速优选，从检测到目标/人体开始，抓拍一定帧数内的质量最好的目标或人体
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_QUICK = 5;

    /**
     * \if ENGLISH_LANG
     * full track
     * \else
     * 全程优选，抓拍全程质量最好的目标人体
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_FULLTRACK = 6;

    /**
     * \if ENGLISH_LANG
     * interval
     * \else
     * 间隔抓拍
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_INTERVAL = 7;

    /**
     * \if ENGLISH_LANG
     * single
     * \else
     * 单人模式，常用于门禁
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_SINGLE = 8;

    /**
     * \if ENGLISH_LANG
     * precision
     * \else
     * 高精度模式，增强目标识别
     * \endif
     */
    public static final int EM_FACE_SNAP_POLICY_PRECISION = 9;
}
