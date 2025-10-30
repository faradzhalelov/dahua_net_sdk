package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Target snap shot config,refer to {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_FACESNAPSHOT}
 * \else
 * IPC智能目标抓拍配置,{@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_FACESNAPSHOT}
 * \endif
 */
public class NET_CFG_FACESNAPSHOT_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    /**
     * \if ENGLISH_LANG
     * snap policy,corrsponding to {@link EM_FACE_SNAP_POLICY}
     * \else
     * 目标抓拍策略,对应{@link EM_FACE_SNAP_POLICY}
     * \endif
     */
    public int		emSnapPolicy;

    /**
     * \if ENGLISH_LANG
     * snap frame, [10,1500]锛宒efault:25
     * \else
     * 抓拍帧数，用于快速抓拍模式，范围[10,1500]，默认25帧
     * \endif
     */
    public int					nSnapFrames;

    /**
     * \if ENGLISH_LANG
     * target optimal time,unit:s
     * \else
     * 目标优先最大延时,单位秒
     * \endif
     */
    public int					nOptimalTime;

    /**
     * \if ENGLISH_LANG
     * Cutout policy,corresponding to {@link EM_CUTOUT_POLICY}
     * \else
     * IPC智能目标抓拍上报图策略,对应{@link EM_CUTOUT_POLICY}
     * \endif
     */
    public int		emCutoutPolicy;

    /**
     * \if ENGLISH_LANG
     * interval frame count, valid if emSnapPolicy is EM_FACE_SNAP_POLICY_RECOGNITION
     * \else
     * 识别优先抓拍间隔帧数	emSnapPolicy 为 EM_FACE_SNAP_POLICY_RECOGNITION 有效
     * \endif
     */
    public int					nIntervalFrmCnt;

    /**
     * \if ENGLISH_LANG
     * optimal interval, valid if emSnapPolicy is EM_FACE_SNAP_POLICY_INTERVAL
     * \else
     * 优选抓拍间隔帧数 emSnapPolicy 为 EM_FACE_SNAP_POLICY_INTERVAL 有效
     * \endif
     */
    public int					nOptimalInterval;

    /**
     * \if ENGLISH_LANG
     * optimal count,valid if emSnapPolicy is EM_FACE_SNAP_POLICY_INTERVAL
     * \else
     * 优选抓拍次数，emSnapPolicy 为 EM_FACE_SNAP_POLICY_INTERVAL 有效
     * \endif
     */
    public int					nOptimalCount;

    /**
     * \if ENGLISH_LANG
     * recognize fail time out,unit:s
     * \else
     * 目标识别失败超时时间,单位秒
     * \endif
     */
    public int					nRecognizeTimeout;

}
