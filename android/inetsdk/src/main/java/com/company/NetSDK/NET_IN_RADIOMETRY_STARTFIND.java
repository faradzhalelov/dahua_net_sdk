package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#StartFind} port, {@link NET_FIND#NET_FIND_RADIOMETRY} command to input parameter
* \else
* {@link INetSDK#StartFind} 接口, {@link NET_FIND#NET_FIND_RADIOMETRY} 命令入参
* \endif
*/
public class NET_IN_RADIOMETRY_STARTFIND implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * query start time
	 * \else
	 * 查询开始时间
	 * \endif
	 */
    public NET_TIME            stStartTime = new NET_TIME();                      
    
	 /**
	 * \if ENGLISH_LANG
	 * query end time
	 * \else
	 * 查询结束时间
	 * \endif
	 */
    public NET_TIME            stEndTime = new NET_TIME();                         
    
	 /**
	 * \if ENGLISH_LANG
	 * query type, refer to {@link NET_RADIOMETRY_METERTYPE} 
	 * \else
	 * 查询类别,见枚举 {@link NET_RADIOMETRY_METERTYPE} 
	 * \endif
	 */
    public int                 nMeterType;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * channel number
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                 nChannel;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * query period , refer to {@link EM_RADIOMETRY_PERIOD}
	 * \else
	 *  所查询表的保存周期, 取值参考 {@link EM_RADIOMETRY_PERIOD}
	 * \endif
	 */
    public int 				   emPeriod;					
}
