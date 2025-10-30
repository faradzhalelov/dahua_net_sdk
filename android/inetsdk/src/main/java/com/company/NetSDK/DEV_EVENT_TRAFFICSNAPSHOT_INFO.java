package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of {@link FinalVar#EVENT_TRAFFICSNAPSHOT}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_TRAFFICSNAPSHOT} (交通抓拍事件)对应的类
 * \endif
 */
public class DEV_EVENT_TRAFFICSNAPSHOT_INFO implements Serializable {
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
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte					szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)t
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double				PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX			UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int					nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way number being snapshotting
	 * \else
	 * 触发抓拍的车道个数
	 * \endif
	 */
	public byte                	bCarWayCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Car way info being snapshotting
	 * \else
	 * 端触发抓拍的车道相关信息
	 * \endif
	 */
	public SDK_CARWAY_INFO      	stuCarWayInfo[] = new SDK_CARWAY_INFO[FinalVar.SDK_MAX_CARWAY_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  	stuFileInfo = new SDK_EVENT_FILE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                	bEventAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no., within same time(second) may have multiple pictures, from 0 to
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte					byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Flag(by bit),see {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}	
	 * \endif
	 */
	public int               	dwSnapFlagMask;
    
    public DEV_EVENT_TRAFFICSNAPSHOT_INFO() {
    	for(int i=0 ; i<FinalVar.SDK_MAX_CARWAY_NUM ; i++) {
    		stuCarWayInfo[i] = new SDK_CARWAY_INFO();
    	}
    }
}
