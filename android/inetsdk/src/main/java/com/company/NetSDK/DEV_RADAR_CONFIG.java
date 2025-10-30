package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * radar configuration, the corresponding interface {@link INetSDK#GetConfig}/{@link INetSDK#SetConfig},the corresponding command {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_RADAR}
 * \else
 * 雷达配置,对应接口{@link INetSDK#GetConfig}/{@link INetSDK#SetConfig} 对应命令 {@link NET_EM_CFG_OPERATE_TYPE#NET_EM_CFG_RADAR}
 * \endif
 */
public class DEV_RADAR_CONFIG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * whether to enable function
	 * \else
	 * 是否开启功能
	 * \endif
	 */
	public boolean               bEnable;                          		
	
	/**
	 * \if ENGLISH_LANG
	 * serial port number
	 * \else
	 * 串口端口号
	 * \endif
	 */
	public int					 nPort;							  		 
	
	/**
	 * \if ENGLISH_LANG
	 * serial port attribute
	 * \else
	 * 串口属性
	 * \endif
	 */
	public SDK_COMM_PROP         stuCommAttr = new SDK_COMM_PROP();							
	
	/**
	 * \if ENGLISH_LANG
	 * device's address;if multiple devices are hung on the serial port,they are distinguished by addresses.
	 * \else
	 * 设备地址，如果串口上挂了多个串口设备，通过地址区分
	 * \endif
	 */
	public int					 nAddress;		
	
	/**
	 * \if ENGLISH_LANG
	 * waiting time in the case of speed first, range (1 -- 5000ms)
	 * \else
	 * 速度先来情况下等待时间，速度来时尚未抓拍, 范围 (1 -- 5000ms)
	 * \endif
	 */
	public int                   nPreSpeedWait;							
	
	/**
	 * \if ENGLISH_LANG
	 * waiting time in the case of speed later, range (1 -- 5000ms)
	 * \else
	 * 速度后来情况下等待时间，抓拍时还没有来速度, 范围 (1 -- 5000ms)
	 * \endif
	 */
	public int                   nDelaySpeedWait;	
	
	/**
	 * \if ENGLISH_LANG
	 * if enable private radar configuration
	 * \else
	 * 私有雷达配置是否可用
	 * \endif
	 */
	public boolean               bDahuaRadarEnable;	
	
	/**
	 * \if ENGLISH_LANG
	 * Private radar parameter configuration
	 * \else
	 * 私有雷达参数配置
	 * \endif
	 */
	public DEV_DAHUA_RADAR_CONFIG		 stuDhRadarConfig = new DEV_DAHUA_RADAR_CONFIG();										
}
