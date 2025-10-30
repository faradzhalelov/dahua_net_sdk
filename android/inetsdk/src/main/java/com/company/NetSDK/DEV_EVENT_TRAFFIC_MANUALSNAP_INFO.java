package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of E{@link FinalVar#EVENT_IVS_TRAFFIC_MANUALSNAP} 's data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFIC_MANUALSNAP} (交通手动抓拍事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFIC_MANUALSNAP_INFO implements Serializable {
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
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Event name
	 * \else
	 * 事件名称
	 * \endif
	 */
	public byte				szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * 时间戳(单位是毫秒)
	 * \endif
	 */
	public double			PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * The event happen time
	 * \else
	 * 事件发生的时间
	 * \endif
	 */
	public NET_TIME_EX		UTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Event ID
	 * \else
	 * 事件ID
	 * \endif
	 */
	public int				nEventID;
	
	/**
	 * \if ENGLISH_LANG
	 * Lane number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int				nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap number
	 * \else
	 * 手动抓拍序号 
	 * \endif
	 */
	public byte            	szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT	stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Have being detected vehicle
	 * \else
	 * 检测到的车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT    stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * TrafficCar info
	 * \else
	 * 表示交通车辆的数据库记录
	 * \endif
	 */
	public DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO stTrafficCar = new DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Event file info
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
	 * Picture no. from 0,at the smae time may havemultiple pictures
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
    
	/**
	 * \if ENGLISH_LANG
	 * Picture resolution
	 * \else
	 * 对应图片的分辨率
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolution = new SDK_RESOLUTION_INFO();

	/**
	 * \if ENGLISH_LANG
	 *  Actual valid size of parking space data information array
	 * \else
	 *  停车位数据信息数组实际有效大小
	 * \endif
	 */
	public int					nParkingInfoNum;

	/**
	 * \if ENGLISH_LANG
	 *  The direction of the vehicle captured
	 * \else
	 *  抓拍车的位置
	 * \endif
	 */
	public int					emVehicleDirection;

	/**
	 * \if ENGLISH_LANG
	 *  Custom data
	 * \else
	 *  手动抓拍专用上报内容
	 * \endif
	 */
	public EVENT_MANUALSNAP_CUSTOM_DATA					stuCustom = new EVENT_MANUALSNAP_CUSTOM_DATA();

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
	 *  Parking space data information
	 * \else
	 *  停车位数据信息
	 * \endif
	 */
	public EVENT_MANUALSNAP_PARKING_INFO					stuParkingInfo[] = new EVENT_MANUALSNAP_PARKING_INFO[32];

	/**
	 * \if ENGLISH_LANG
	 *  Event Public Extension Field Structure
	 * \else
	 *  事件公共扩展字段结构体
	 * \endif
	 */
	public NET_EVENT_INFO_EXTEND					stuEventInfoEx = new NET_EVENT_INFO_EXTEND();

	public DEV_EVENT_TRAFFIC_MANUALSNAP_INFO() {
		for(int i = 0; i < 32; i ++){
			this.stuParkingInfo[i] = new EVENT_MANUALSNAP_PARKING_INFO();
		}
	}
}
