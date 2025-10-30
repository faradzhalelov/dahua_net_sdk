package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* return to query result
* \else
* 返回查询结果
* \endif
*/
public class NET_RADIOMETRY_QUERY implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * record time
	 * \else
	 * 记录时间
	 * \endif
	 */
    public NET_TIME            stTime = new NET_TIME();                            
    
	 /**
	 * \if ENGLISH_LANG
	 * preset number
	 * \else
	 * 预置点编号
	 * \endif
	 */
    public int                 nPresetId;                        
    
	 /**
	 * \if ENGLISH_LANG
	 * rule number
	 * \else
	 * 规则编号
	 * \endif
	 */
    public int                 nRuleId;                           
    
	 /**
	 * \if ENGLISH_LANG
	 * query name
	 * \else
	 * 查询项名称
	 * \endif
	 */
    public byte[]              szName = new byte[64];             
    
	 /**
	 * \if ENGLISH_LANG
	 * query ARGtemp_meas coordinate
	 * \else
	 * 查询测温点坐标
	 * \endif
	 */
    public SDK_POINT           stCoordinate = new SDK_POINT();    
    
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
	 * ARGtemp_meas info, currently nTemperMid, nTemperStd member invalid
	 * \else
	 * 测温信息
	 * \endif
	 */
    public NET_RADIOMETRYINFO  stTemperInfo = new NET_RADIOMETRYINFO();  

}
