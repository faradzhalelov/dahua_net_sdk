package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * PIR alarm link
 * \else
 * 报警联动信息
 * \endif
 */
public class NET_PIR_LINK_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Record enable
     * \else
     * 使能
     * \endif
     */
    public boolean					bRecordEnable;

    /**
     * \if ENGLISH_LANG
     * alarm out enable
     * \else
     * 报警输出使能
     * \endif
     */
    public boolean					bAlarmOutEnable;

    /**
     * \if ENGLISH_LANG
     * snapshot enable
     * \else
     * 快照使能
     * \endif
     */
    public boolean					bSnapshotEnable;

    /**
     * \if ENGLISH_LANG
     * mail enable
     * \else
     * 发送邮件，如果有图片，作为附件
     * \endif
     */
    public boolean					bMailEnable;

    /**
     * \if ENGLISH_LANG
     * alarm bell enable
     * \else
     * 警号输出使能
     * \endif
     */
    public boolean					bAlarmBellEnable;

    /**
     * \if ENGLISH_LANG
     * log enable
     * \else
     * 是否记录报警日志
     * \endif
     */
    public boolean					bLogEnable;

    /**
     * \if ENGLISH_LANG
     * record channel num
     * \else
     * 录像通道个数
     * \endif
     */
    public int						nRecordChannelNum;

    /**
     * \if ENGLISH_LANG
     * record channels
     * \else
     * 录像通道号列表
     * \endif
     */
    public int						[]nRecordChannels = new int[64];

    /**
     * \if ENGLISH_LANG
     * record latch
     * \else
     * 录像延时时间
     * \endif
     */
    public int						nRecordLatch;

    /**
     * \if ENGLISH_LANG
     * alarm out channel num
     * \else
     * 报警输出通道个数
     * \endif
     */
    public int						nAlarmOutChannelNum;

    /**
     * \if ENGLISH_LANG
     * alarm out channels
     * \else
     * 报警输出通道号列表
     * \endif
     */
    public int						[]AlarmOutChannels = new int[32];

    /**
     * \if ENGLISH_LANG
     * alarm out latch
     * \else
     * 报警输入停止后，输出延时时间
     * \endif
     */
    public int						nAlarmOutLatch;

    /**
     * \if ENGLISH_LANG
     * snapshot channel num
     * \else
     * 快照通道个数
     * \endif
     */
    public int						nSnapshotChannelNum;

    /**
     * \if ENGLISH_LANG
     * snapshot channels
     * \else
     * 快照通道号列表
     * \endif
     */
    public int						[]SnapshotChannels = new int[32];


    /**
     * \if ENGLISH_LANG
     * alarm bell latch
     * \else
     * 警号输出延时时间
     * \endif
     */
    public int						nAlarmBellLatch;

    /**
     * \if ENGLISH_LANG
     * dejitter
     * \else
     * 去抖动时间
     * \endif
     */
    public int						nDejitter;

    /**
     * \if ENGLISH_LANG
     * lighting link
     * \else
     * 联动白光灯威慑
     * \endif
     */
    public NET_LIGHTINGLINK_INFO						stLightingLink = new NET_LIGHTINGLINK_INFO();

    /**
     * \if ENGLISH_LANG
     * time shecule
     * \else
     * 时间表信息
     * \endif
     */
    public NET_CFG_TIME_SCHEDULE						stTimeShecule = new NET_CFG_TIME_SCHEDULE();

    @Override
    public String toString() {
        return "NET_PIR_LINK_INFO{" +
                "bRecordEnable=" + bRecordEnable +
                ", bAlarmOutEnable=" + bAlarmOutEnable +
                ", bSnapshotEnable=" + bSnapshotEnable +
                ", bMailEnable=" + bMailEnable +
                ", bAlarmBellEnable=" + bAlarmBellEnable +
                ", bLogEnable=" + bLogEnable +
                '}';
    }
}
