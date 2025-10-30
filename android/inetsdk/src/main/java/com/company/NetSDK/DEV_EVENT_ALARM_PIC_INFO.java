package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of {@link FinalVar#EVENT_IVS_PICINFO} data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_PICINFO} (图片信息事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_ALARM_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * 通道号
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
    public double              PTS;
    
    /**
     * \if ENGLISH_LANG
     * the event happen time
     * \else
     * 事件发生的时间
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * 事件ID
     * \endif
     */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * stuTime, not in UTC
     * \else
     * 事件发生的时间, (设备时间, 不一定是utc时间)
     * \endif    
     */
    public NET_TIME_EX         stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * nEventType
     * \else
     * 事件类型
     * \endif    
     */
    public int                 nEventType;

    /**
     * \if ENGLISH_LANG
     * nSpeed, km/h
     * \else
     * 车速，单位km/h
     * \endif    
     */
    public int                 nSpeed;

    /**
     * \if ENGLISH_LANG
     * nSpeedHighLine, km/h
     * \else
     * 高速上限报警值, 单位km/h
     * \endif    
     */
    public int                 nSpeedHighLine;

    /**
     * \if ENGLISH_LANG
     * nDisk
     * \else
     * 磁盘号
     * \endif    
     */
    public int                 nDisk;

    /**
     * \if ENGLISH_LANG
     * nCluster
     * \else
     * 簇号
     * \endif    
     */
    public int                 nCluster;

    /**
     * \if ENGLISH_LANG
     * nPartition
     * \else
     * 分区号
     * \endif    
     */
    public int                 nPartition;

    /**
     * \if ENGLISH_LANG
     * szSnapAddr
     * \else
     * 抓图地点, 有效64字节
     * \endif    
     */
    public byte                szSnapAddr[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * ID of picture
     * \else
     * 图片唯一ID
     * \endif    
     */
    public byte                szPicID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Plate
     * \else
     * 车牌
     * \endif    
     */
    public byte                szPlate[] = new byte[FinalVar.SDK_COMMON_STRING_16];
}
