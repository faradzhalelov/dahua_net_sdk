package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * traffic flow state info
 * \else
 * 流量统计记录
 * \endif
 */
public class SDK_TRAFFICFLOWSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * same as {@link DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO#szMachineGroup}
	 * \else
	 * 同 {@link DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO#szMachineGroup}
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * same as {@link DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO#szMachineName}
	 * \else
	 * 同 {@link DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO#szMachineName}
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car,the scend and third param means the location of the driving direction
	 * \else
	 * 行驶方向"Approach"-上行，即车辆离设备部署点越来越近；"Leave"-下行，即车辆离设备部署点越来越远，第二和第三个参数分别代表上行和下行的两个地点，UTF-8编码
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][32];

	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * 车道号 使用用户配置的车道编号
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Statistic time
	 * \else
	 * 统计时间，转换到UTC
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Statistic period, m
	 * \else
	 * 统计周期，单位分钟
	 * \endif
	 */
	public int                 nPeriod;

	/**
	 * \if ENGLISH_LANG
	 * passed vehicle number
	 * \else
	 * 通过车辆总数
	 * \endif
	 */
	public int                 nVehicles;

	/**
	 * \if ENGLISH_LANG
	 * average speed, km/h
	 * \else
	 * 平均车速，单位km/h
	 * \endif
	 */
	public float               fAverageSpeed;

	/**
	 * \if ENGLISH_LANG
	 * average length, m
	 * \else
	 * 平均车长，单位米
	 * \endif
	 */
	public float               fAverageLength;

	/**
	 * \if ENGLISH_LANG
	 * time occupy ratio,
	 * \else
	 * 时间占有率，即单位时间内通过断面的车辆所用时间的总和占单位时间的比例
	 * \endif
	 */
	public float               fTimeOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space occupy ratio,
	 * \else
	 * 空间占有率，即按百分率计量的车辆长度总和除以时间间隔内车辆平均行驶距离
	 * \endif
	 */
	public float               fSpaceOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space between two cars,m
	 * \else
	 * 车头间距，相邻车辆之间的距离，单位米/辆
	 * \endif
	 */
	public float               fSpaceHeadway;

	/**
	 * \if ENGLISH_LANG
	 * time between two cars, s
	 * \else
	 * 车头时距，单位秒/辆
	 * \endif
	 */
	public float               fTimeHeadway;

	/**
	 * \if ENGLISH_LANG
	 * car density, every km
	 * \else
	 * 车辆密度，每公里的车辆数，单位辆/km
	 * \endif
	 */
	public float               fDensity;

	/**
	 * \if ENGLISH_LANG
	 * over speed vehicle number
	 * \else
	 * 超速车辆数
	 * \endif
	 */
	public int                 nOverSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * under speed vehicle number
	 * \else
	 * 低速车辆数
	 * \endif
	 */
	public int                 nUnderSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * big car number
	 * \else
	 * 大车数量  车辆类型判断标准参见TrafficSnapshot配置表
	 * \endif
	 */
	public int                 nLargeVehicles;

	/**
	 * \if ENGLISH_LANG
	 * mid car number
	 * \else
	 * 中型车数量
	 * \endif
	 */
	public int                 nMediumVehicles;

	/**
	 * \if ENGLISH_LANG
	 * small car number
	 * \else
	 * 小车数量
	 * \endif
	 */
	public int                 nSmallVehicles;

	/**
	 * \if ENGLISH_LANG
	 * moto car number
	 * \else
	 * 摩托车数量
	 * \endif
	 */
	public int                 nMotoVehicles;

	/**
	 * \if ENGLISH_LANG
	 * long vehicle number
	 * \else
	 * 超长车数量
	 * \endif
	 */
	public int                 nLongVehicles;
}
