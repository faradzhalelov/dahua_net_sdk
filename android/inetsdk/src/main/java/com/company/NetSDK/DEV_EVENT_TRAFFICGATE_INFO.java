package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The describe of {@link FinalVar#EVENT_IVS_TRAFFICGATE}'s data
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_TRAFFICGATE} (交通卡口事件)对应的数据块描述信息
 * \endif
 */
public class DEV_EVENT_TRAFFICGATE_INFO implements Serializable {
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
	 * PTS(ms)
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
	 * Have being detected object
	 * \else
	 * 检测到的物体
	 * \endif
	 */
	public SDK_MSG_OBJECT		stuObject = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Road number
	 * \else
	 * 对应车道号
	 * \endif
	 */
	public int					nLane;
	
	/**
	 * \if ENGLISH_LANG
	 * The car's actual rate(Km/h)
	 * \else
	 * 车辆实际速度Km/h
	 * \endif
	 */
	public int					nSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate upper limit(km/h)
	 * \else
	 * 速度上限 单位：km/h
	 * \endif
	 */
	public int					nSpeedUpperLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Rate lower limit(km/h) 
	 * \else
	 * 速度下限 单位：km/h 
	 * \endif
	 */
	public int					nSpeedLowerLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * BreakingRule's mask,first byte: Retrograde; 
	 * Second byte:Overline; the third byte:Overspeed; 
	 * The forth byte:UnderSpeed;the five byte: crash red light;the six byte:passing(trafficgate)
	 * The seven byte: OverYellowLine; the eight byte: WrongRunningRoute; the nine byte: YellowVehicleInRoute; default: trafficgate
	 * </pre>
	 * \else
	 * <pre>
	 * 违反规则掩码,第一位:逆行; 
	 * 第二位:压线行驶; 第三位:超速行驶; 
	 * 第四位：欠速行驶; 第五位:闯红灯;第六位:穿过路口(卡口事件)
	 * 第七位: 压黄线; 第八位: 有车占道; 第九位: 黄牌占道;否则默认为:交通卡口事件
	 * </pre>
	 * \endif
	 */
	public int					dwBreakingRule;
	
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
	 * Vehicle info
	 * \else
	 * 车身信息
	 * \endif
	 */
	public SDK_MSG_OBJECT       stuVehicle = new SDK_MSG_OBJECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Manual snap sequence string  
	 * \else
	 * 手动抓拍序号            
	 * \endif
	 */
	public byte                szManualSnapNo[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap index,such as 3,2,1,1 means the last one,0 means there has some exception and snap stop
	 * \else
	 * 表示抓拍序号，如3,2,1,1表示抓拍结束,0表示异常结束
	 * \endif
	 */
	public int                 nSequence;
	
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
	 * Snap flag from device
	 * \else
	 * 设备产生的抓拍标识
	 * \endif
	 */
	public byte                szSnapFlag[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Snap mode,0-normal 1-globle 2-near 4-snap on the same side 8-snap on the reverse side 16-plant picture
	 * \else
	 * 抓拍方式，0-未分类 1-全景 2-近景 4-同向抓拍 8-反向抓拍 16-号牌图像
	 * \endif
	 */
	public byte                bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed percentage
	 * \else
	 * 超速百分比
	 * \endif
	 */
	public byte                byOverSpeedPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed percentage
	 * \else
	 * 欠速百分比
	 * \endif
	 */
	public byte                byUnderSpeedingPercentage;
	
	/**
	 * \if ENGLISH_LANG
	 * Red light margin, sr
	 * \else
	 * 红灯容许间隔时间,单位：秒
	 * \endif
	 */
	public byte                byRedLightMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Drive direction,0-"Approach",where the car is more near,1-"Leave",means where if mor far to the car
	 * \else
	 * 行驶方向，0-上行(即车辆离设备部署点越来越近)，1-下行(即车辆离设备部署点越来越远)
	 * \endif
	 */
	public byte                byDriveDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Road way number
	 * \else
	 * 道路编号
	 * \endif
	 */
	public byte                szRoadwayNo[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation code
	 * \else
	 * 代码
	 * \endif
	 */
	public byte                szViolationCode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Violation desc
	 * \else
	 * 描述
	 * \endif
	 */
	public byte                szViolationDesc[] = new byte[128];
	
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
	 * Car type,"Motor", "Light-duty", "Medium", "Oversize", "Huge", "Other" 
	 * \else
	 * 车辆大小类型，"Motor" 摩托车车 "Light-duty" 小型车 "Medium" 中型车 "Oversize" 大型车 "Huge" 超大车 "Other" 其他类型
	 * \endif
	 */
	public byte                szVehicleType[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Car length, m
	 * \else
	 * 车辆长度, 单位米
	 * \endif
	 */
	public byte                byVehicleLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture no.,  within same time(second)may have multiple pictures, from 0 to
	 * \else
	 * 图片的序号, 同一时间内(精确到秒)可能有多张图片, 从0开始
	 * \endif
	 */
	public byte				byImageIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * Over speed margin, km/h 
	 * \else
	 * 限高速宽限值	单位：km/h 
	 * \endif
	 */
	public int                 nOverSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * Under speed margin, km/h 
	 * \else
	 * 限低速宽限值	单位：km/h 
	 * \endif
	 */
	public int                 nUnderSpeedMargin;
	
	/**
	 * \if ENGLISH_LANG
	 * <pre>
	 * "DrivingDirection" :
	 * "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car
	 * the second and third param means the location of the driving direction
	 * </pre>
	 * \else
	 * <pre>
	 * "DrivingDirection" : 行驶方向
	 * "Approach"-上行，即车辆离设备部署点越来越近；"Leave"-下行，
	 * 即车辆离设备部署点越来越远，第二和第三个参数分别代表上行和
	 * 下行的两个地点，UTF-8编码
	 * </pre>
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][FinalVar.SDK_MAX_DRIVINGDIRECTION];

	/**
	 * \if ENGLISH_LANG
	 * Machine name
	 * \else
	 * 本地或远程设备名称
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine address
	 * \else
	 * 机器部署地点、道路编码
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];
	
	/**
	 * \if ENGLISH_LANG
	 * Machine group
	 * \else
	 * 机器分组、设备所属单位
	 * \endif
	 */
	public byte                szMachineGroup[] = new byte[256];
	
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
	 * The vehicle detector generates the snap signal redundancy info
	 * \else
	 * 由车检器产生抓拍信号冗余信息
	 * \endif
	 */
	public SDK_SIG_CARWAY_INFO_EX stuSigInfo = new SDK_SIG_CARWAY_INFO_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * File path
	 * \else
	 * 文件路径
	 * \endif
	 */
	public byte                szFilePath[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * The begin time of red light
	 * \else
	 * 红灯开始UTC时间
	 * \endif
	 */
	public NET_TIME_EX			RedLightUTC = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Device address,OSD superimposed onto the image,from TrafficSnapshot.DeviceAddress,'\0'means end.
	 * \else
	 * 设备地址,OSD叠加到图片上的,来源于配置TrafficSnapshot.DeviceAddress,'\0'结束
	 * \endif
	 */
	public String              szDeviceAddress = new String();
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture exposure time，unit is ms
	 * \else
	 * 当前图片曝光时间，单位为毫秒
	 * \endif
	 */
	public float               fActualShutter;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture gain，range 0~100
	 * \else
	 * 当前图片增益，范围为0~100
	 * \endif
	 */
	public byte                byActualGain;
	
	/**
	 * \if ENGLISH_LANG
	 * Card quantity
	 * \else
	 * 卡片个数
	 * \endif
	 */
	public byte                bRetCardNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * 卡片信息
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];   
    
    public DEV_EVENT_TRAFFICGATE_INFO() {
    	for (int i=0 ; i<FinalVar.SDK_EVENT_MAX_CARD_NUM ; i++) {
    		stuCardInfo[i] = new EVENT_CARD_INFO();
    	}
    }
}
