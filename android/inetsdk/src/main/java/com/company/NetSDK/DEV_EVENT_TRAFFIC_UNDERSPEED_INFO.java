package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of  {@link FinalVar#EVENT_IVS_TRAFFIC_UNDERSPEED} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_UNDERSPEED} (交通欠速事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_UNDERSPEED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 *  channel ID
	 * \else
	 *  通道号
	 * \endif
	 */
	public int					nChannelID;

	/**
	 * \if ENGLISH_LANG
	 *  event name
	 * \else
	 *  事件名称
	 * \endif
	 */
	public byte					szName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 *  PTS(ms)
	 * \else
	 *  时间戳(单位是毫秒)
	 * \endif
	 */
	public double					PTS;

	/**
	 * \if ENGLISH_LANG
	 *  the event happen time
	 * \else
	 *  事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX					UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 *  event ID
	 * \else
	 *  事件ID
	 * \endif
	 */
	public int					nEventID;

	/**
	 * \if ENGLISH_LANG
	 *  Corresponding Lane number
	 * \else
	 *  对应车道号
	 * \endif
	 */
	public int					nLane;

	/**
	 * \if ENGLISH_LANG
	 *  have being detected object
	 * \else
	 *  检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT					stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 *  vehicle info
	 * \else
	 *  车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT					stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 *  event file info
	 * \else
	 *  事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO					stuFileInfo = new SDK_EVENT_FILE_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  vehicle speed Unit:Km/h
	 * \else
	 *  车辆实际速度Km/h
	 * \endif
	 */
	public int					nSpeed;

	/**
	 * \if ENGLISH_LANG
	 *  Speed Up limit Unit:km/h
	 * \else
	 *  速度上限 单位：km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;

	/**
	 * \if ENGLISH_LANG
	 *  Speed Low limit Unit:km/h
	 * \else
	 *  速度下限 单位：km/h
	 * \endif
	 */
	public int					nSpeedLowerLimit;

	/**
	 * \if ENGLISH_LANG
	 *  snap index: such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 *  表示抓拍序号,如3,2,1,1表示抓拍结束,0表示异常结束
	 * \endif
	 */
	public int					nSequence;

	/**
	 * \if ENGLISH_LANG
	 *  Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 *  事件动作,0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte					bEventAction;

	/**
	 * \if ENGLISH_LANG
	 *  Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 *  图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte					byImageIndex;

	/**
	 * \if ENGLISH_LANG
	 *  under speed percentage
	 * \else
	 *  欠速百分比
	 * \endif
	 */
	public int					nUnderSpeedingPercentage;

	/**
	 * \if ENGLISH_LANG
	 *  flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 *  抓图标志(按位),具体见NET_RESERVED_COMMON
	 * \endif
	 */
	public int					dwSnapFlagMask;

	/**
	 * \if ENGLISH_LANG
	 *  picture resolution
	 * \else
	 *  对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO					stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  intelligence common information
	 * \else
	 *  智能事件公共信息
	 * \endif
	 */
	public EVENT_INTELLI_COMM_INFO					stuIntelliCommInfo = new EVENT_INTELLI_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  GPS info ,use in mobile DVR/NVR
	 * \else
	 *  GPS信息
	 * \endif
	 */
	public NET_GPS_INFO					stuGPSInfo = new NET_GPS_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Picture information
	 * \else
	 *  图片信息数组
	 * \endif
	 */
	public NET_IMAGE_INFO_EX3[]					pstuImageInfo;

	/**
	 * \if ENGLISH_LANG
	 *  Picture number
	 * \else
	 *  图片信息个数
	 * \endif
	 */
	public int					nImageInfoNum;

	/**
	 * \if ENGLISH_LANG
	 *  Traffic vehicle info
	 * \else
	 *  交通车辆信息
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO					stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  public info
	 * \else
	 *  公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO					stCommInfo = new EVENT_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Event public extension field structure
	 * \else
	 *  事件公共扩展字段结构体
	 * \endif
	 */
	public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

	public DEV_EVENT_TRAFFIC_UNDERSPEED_INFO() {
	}

	public DEV_EVENT_TRAFFIC_UNDERSPEED_INFO(int nImageInfoNum) {
		this.nImageInfoNum = nImageInfoNum;
		this.pstuImageInfo = new NET_IMAGE_INFO_EX3[nImageInfoNum];
		for (int i = 0; i < nImageInfoNum; i++) {
			this.pstuImageInfo[i] = new NET_IMAGE_INFO_EX3();
		}
	}
}
