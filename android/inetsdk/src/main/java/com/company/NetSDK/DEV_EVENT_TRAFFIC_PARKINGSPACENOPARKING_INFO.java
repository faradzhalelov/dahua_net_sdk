package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event type {@link FinalVar#EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING} (parking space no parking)corresponding data block description info
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_PARKINGSPACENOPARKING} (车位无车事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_PARKINGSPACENOPARKING_INFO implements Serializable {
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
	 * Time stamp(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public int               PTS;

	/**
	 * \if ENGLISH_LANG
	 * Event occurred time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int                 nEventID;

	/**
	 * \if ENGLISH_LANG
	 * Corresponding lane No.
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuObject = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * Vehicle body info
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();

	/**
	 * \if ENGLISH_LANG
	 * The corresponding file info of the event
	 * \else
	 * 事件对应文件信息
	 * \endif
	 */
	public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();

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
	 * Event operation.0=pulse event,1=begin of the durative event,2=end of the durative event;
	 * \else
	 * 事件动作，0表示脉冲事件,1表示持续性事件开始,2表示持续性事件结束;
	 * \endif
	 */
	public byte                bEventAction;

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
	 * Snap flag(by bit),please refer to {@link NET_RESERVED_COMMON}
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
	 * Traffic vehicle info
	 * \else
	 * 交通车辆信息
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();

	/**
	 * \if ENGLISH_LANG
	 * public info
	 * \else
	 * 公共信息
	 * \endif
	 */
	public EVENT_COMM_INFO     stCommInfo = new EVENT_COMM_INFO();

	/**
	 * \if ENGLISH_LANG
	 * The image info of parking space
	 * \else
	 * 车位图片信息
	 * \endif
	 */
	public NET_INTELLIGENCE_IMAGE_INFO stuParkingImage   = new NET_INTELLIGENCE_IMAGE_INFO();
}
