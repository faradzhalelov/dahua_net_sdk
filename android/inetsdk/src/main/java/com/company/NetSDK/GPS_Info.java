package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS info 
 * \else
 * GPS信息
 * \endif
 */
public class GPS_Info implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * 定位时间
	 * \endif
	 */
	public NET_TIME            revTime = new NET_TIME();                        
 	/**
	 * \if ENGLISH_LANG
	 * device number
	 * \else
	 * 设备序列号
	 * \endif
	 */
	public char                DvrSerial[] = new char[50];                  
 	/**
	 * \if ENGLISH_LANG
	 * longitude(1/1000000,range[0-360])
	 * \else
	 * 经度(单位是百万分之度，范围0-360度)
	 * \endif
	 */
	public double              longitude;                      
 	/**
	 * \if ENGLISH_LANG
	 * latitude(1/1000000,range[0-180])
	 * \else
	 * 纬度(单位是百万分之度，范围0-180度)
	 * \endif
	 */
	public double              latidude;                       
 	/**
	 * \if ENGLISH_LANG
	 * highness(m)
	 * \else
	 * 高度(米)
	 * \endif
	 */
	public double              height;                         
 	/**
	 * \if ENGLISH_LANG
	 * angle(north is source point,clockwise is positive)
	 * \else
	 * 方向角(正北方向为原点，顺时针为正)
	 * \endif
	 */
	public double              angle;                          
 	/**
	 * \if ENGLISH_LANG
	 * speed(sea mile,speed/1000*1.852km/h)
	 * \else
	 * 速度(单位是海里，speed/1000*1.852公里/小时)
	 * \endif
	 */
	public double              speed;                          
 	/**
	 * \if ENGLISH_LANG
	 * star count
	 * \else
	 * 定位星数
	 * \endif
	 */
	public int                starCount;                      
 	/**
	 * \if ENGLISH_LANG
	 * antenna state(true good, false bad)
	 * \else
	 * 天线状态(true 好，false 坏)
	 * \endif
	 */
	public boolean                antennaState;                   
 	/**
	 * \if ENGLISH_LANG
	 * orientation state(true orientation, false not)
	 * \else
	 * 定位状态(true 定位，false 不定位)
	 * \endif
	 */
	public boolean                orientationState;         
}
