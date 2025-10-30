package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GPS status info, the corresponding interface {@link INetSDK#StartListenEx},the corresponding command {@link FinalVar#SDK_GPS_STATUS}
 * \else
 * GPS状态信息, 对应接口 {@link INetSDK#StartListenEx},对应命令 {@link FinalVar#SDK_GPS_STATUS}
 * \endif
 */
public class NET_GPS_STATUS_INFO implements Serializable {
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
	public byte                DvrSerial[] = new byte[50];       
	
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
	public short                starCount;
	
 	/**
	 * \if ENGLISH_LANG
	 * antenna state(true good, false bad)
	 * \else
	 * 天线状态(true 好，false 坏)
	 * \endif
	 */
	public int                antennaState;
	
 	/**
	 * \if ENGLISH_LANG
	 * orientation state(true orientation, false not)
	 * \else
	 * 定位状态(true 定位，false 不定位)
	 * \endif
	 */
	public int                orientationState;
	
 	/**
	 * \if ENGLISH_LANG
	 * working state(true normal, false abnormity)
	 * \else
	 * 工作状态(0=未定位，1=非差分定位，2=差分定位，3=无效PPS，6=正在估算 
	 * \endif
	 */
	public int                workStae;
	
 	/**
	 * \if ENGLISH_LANG
	 * alarm count
	 * \else
	 * 发生的报警位置个数
	 * \endif
	 */
	public int                 nAlarmCount; 
	
 	/**
	 * \if ENGLISH_LANG
	 * alarm type
	 * \else
	 * 发生的报警位置，值可能多个
	 * \endif
	 */
	public int                 nAlarmState[] = new int[128];    
	
 	/**
	 * \if ENGLISH_LANG
	 * 0- real time 1-fill 
	 * \else
	 * 0-实时 1-补传 
	 * \endif
	 */
	public byte                bOffline;

	/**
	 * \if ENGLISH_LANG
	 *  SNR for GPS, range: 0~100, 0 for unusable
	 * \else
	 * GPS信噪比,表示GPS信号强度,值越大,信号越强 范围：0~100,0表示不可用
	 * \endif
	 */
	public byte                bSNR;

	/**
	 * \if ENGLISH_LANG
	 *  source of date croseponding to {@link EM_DATE_SOURCE }
	 * \else
	 * 数据来源 参考 {@link EM_DATE_SOURCE }
	 * \endif
	 */
	public int 				emDateSource;

	@Override
	public String toString(){
		return "angle:"+this.angle+"antennaState:"+this.antennaState+"bOffline:"+this.bOffline+"bSNR:"+this.bSNR+"DvrSerial:"+new String(this.DvrSerial).trim()+
				"emDateSource:"+this.emDateSource+"height:"+this.height+"latidude:"+this.latidude+"longitude:"+this.longitude+"nAlarmCount:"+this.nAlarmCount
				+"nAlarmState:"+this.nAlarmState+"orientationState:"+this.orientationState+"speed:"+this.speed+"workStae:"+this.workStae+"starCount"+this.starCount
				+this.revTime.dwYear+" "+this.revTime.dwMonth+" "+this.revTime.dwDay+" "+this.revTime.dwHour+" "+this.revTime.dwMinute+" "+this.revTime.dwSecond;
	}
}
