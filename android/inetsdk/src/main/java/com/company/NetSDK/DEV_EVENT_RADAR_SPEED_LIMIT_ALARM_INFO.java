package com.company.NetSDK;

import java.io.Serializable;
import java.util.Arrays;

/**
 * \if ENGLISH_LANG
 * Corresponding to data block description of event type {@link FinalVar#EVENT_IVS_RADAR_SPEED_LIMIT_ALARM}(radar speed limit alarm)
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_RADAR_SPEED_LIMIT_ALARM} (雷达限速报警事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_RADAR_SPEED_LIMIT_ALARM_INFO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * \if ENGLISH_LANG
     * Channel ID
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannelID;

    /**
     * \if ENGLISH_LANG
     * Event action, 0:Pulse 1:Start 2:Stop
     * \else
     * 0:脉冲 1:开始 2:停止
     * \endif
     */
    public int                 nAction;

    /**
     * \if ENGLISH_LANG
     * Device IP address
     * \else
     * 设备IP地址
     * \endif
     */
    public byte[]              szAddress = new byte[32];

    /**
     * \if ENGLISH_LANG
     * Speed, km/h
     * \else
     * 时速, 单位km/h
     * \endif
     */
    public int                 nSpeed;

    /**
     * \if ENGLISH_LANG
     * Event occurrence time
     * \else
     * 事件发生时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * id of event group
     * \else
     * 事件组ID
     * \endif
     */
    public int                 nGroupID;

    /**
     * \if ENGLISH_LANG
     * the file count in the current file's group
     * \else
     * 一个事件组内的抓拍张数
     * \endif
     */
    public int                 nCountInGroup;

    /**
     * \if ENGLISH_LANG
     * the index of the file in the group
     * \else
     * 一个事件组内的抓拍序号，测速过程第n张图片,从1开始
     * \endif
     */
    public int                 nIndexInGroup;

    /**
     * \if ENGLISH_LANG
     * The common information of intelligence event
     * \else
     * 智能事件公共信息
     * \endif
     */
    public EVENT_INTELLI_COMM_INFO    stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

    @Override
    public String toString() {
        return "DEV_EVENT_RADAR_SPEED_LIMIT_ALARM_INFO{" +
                "nChannelID=" + nChannelID +
                ", nAction=" + nAction +
                ", szAddress=" + Arrays.toString(szAddress) +
                ", nSpeed=" + nSpeed +
                ", UTC=" + UTC +
                ", nGroupID=" + nGroupID +
                ", nCountInGroup=" + nCountInGroup +
                ", nIndexInGroup=" + nIndexInGroup +
                ", stuIntelliCommInfo=" + stuIntelliCommInfo +
                '}';
    }
}
