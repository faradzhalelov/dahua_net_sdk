package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of  {@link FinalVar#EVENT_IVS_TRAFFIC_NOPASSING} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_NOPASSING} (-禁止通行事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_NOPASSING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel ID
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
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Trigger Type, 0 vehicle inspection device, 1 radar, 2 video
	 * \else
	 * TriggerType:触发类型，0车检器，1雷达，2视频
	 * \endif
	 */
	public int                 nTriggerType;

	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public int               PTS;

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
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public int                 UTCMS;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 底层产生的触发抓拍帧标记
	 * \endif
	 */
	public int                 nMark;

	/**
	 * \if ENGLISH_LANG
	 * snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 表示抓拍序号，如3,2,1,1表示抓拍结束,0表示异常结束
	 * \endif
	 */
	public int                 nSequence;

	/**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                bEventAction;

	/**
	 * \if ENGLISH_LANG
	 * TrafficCar info
	 * \else
	 * 交通车辆信息
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * flag(by bit),see {@link NET_RESERVED_COMMON}
	 * \else
	 * 抓图标志(按位)，具体见 {@link NET_RESERVED_COMMON}
	 * \endif
	 */
	public int               dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 * picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte                byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding lane number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Object to be detected
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * car body information
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Video analysis frame number
	 * \else
	 * 视频分析帧序号
	 * \endif
	 */
	public int                 nFrameSequence;

	/**
	 * \if ENGLISH_LANG
	 * Data source address of the video analysis
	 * \else
	 * 视频分析的数据源地址
	 * \endif
	 */
	public int                 nSource;

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();
}
