package com.company.NetSDK;

import java.io.Serializable;

public class GPS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * GPS,GLONASS
	 * \else
	 * GPS、GLONASS混合模式(模块定位数据从GPS、GLONASS两者中获取，但具体来源于哪个系统不能确定,可能模块内部自动会处理)
	 * \endif
	 */
	public final static int GPS_OR_GLONASS_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * GLONASS
	 * \else
	 * GLONASS模式(即模块的定位数据从俄罗斯的GLONASS定位系统中获取)
	 * \endif
	 */
	public final static int GLONASS_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * GPS
	 * \else
	 * GPS模式(即模块的定位数据从美国的GPS系统中获取) 
	 * \endif
	 */
	public final static int GPS_MODE = 2;
}
