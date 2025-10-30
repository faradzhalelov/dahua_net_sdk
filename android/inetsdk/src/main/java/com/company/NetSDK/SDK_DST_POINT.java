package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DST(Daylight Save Time) setup
 * \else
 * DST(夏令时)配置
 * \endif
 */
public class SDK_DST_POINT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year[200 - 2037]
	 * \else
	 * 年[200 - 2037]
	 * \endif
	 */
	public int                 nYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month[1 - 12]
	 * \else
	 * 月[1 - 12]
	 * \endif
	 */
	public int                 nMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour[0 - 23]
	 * \else
	 * 小时 [0 - 23]
	 * \endif
	 */
	public int                 nHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute [0 - 59]
	 * \else
	 * 分钟 [0 - 59]
	 * \endif
	 */
	public int                 nMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * [-1 - 4]0:It means it adopts the date calculation method.
	 * 1:in week: the first week ,2:the second week,3:the third week,4: The fourth week ,-1: the last week  
	 * \else
	 * [-1 - 4]0:表示使用按日期计算的方法
	 * 1: 按周计算: 第一周,2: 第二周,3: 第三周,4: 第四周,-1: 最后一周
	 * \endif
	 */
	public int                 nWeekOrDay;
	
	/**
	 * \if ENGLISH_LANG
	 * week[0 - 6](nWeekOrDay:calculated in week )0: Sunday, 1:Monday , 2:Tuesday ,3: Wednesday,4:Thirsday ,5: Friday,6:Saturday
	 * \else
	 * 周[0 - 6](nWeekOrDay：按周计算时)0:星期日, 1:星期一, 2:星期二,3:星期三,4:星期四,5:星期五,6:星期六
	 * \endif
	 */
	public int             iWeekDay;
	
	/**
	 * \if ENGLISH_LANG
	 * date[1 - 31] (nWeekOrDay: in date)
	 * \else
	 * 日期[1 - 31] (nWeekOrDay：按日期计算)
	 * \endif
	 */
	public int             iDay;
    
}
