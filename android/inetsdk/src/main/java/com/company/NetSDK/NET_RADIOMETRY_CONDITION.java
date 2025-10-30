package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* acquire thermal condition of ARGtemp_meas 
* \else
* 获取测温项温度的条件   
* \endif
*/
public class NET_RADIOMETRY_CONDITION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	 * ARGtemp_meas type, refer to {@link NET_RADIOMETRY_METERTYPE}
	 * \else
	 * 测温项类别,见 {@link NET_RADIOMETRY_METERTYPE}
	 * \endif
	 */
    public int                 nMeterType;                         
    
	 /**
	 * \if ENGLISH_LANG
	 * name of ARGtemp_meas, select from the name of ARGtemp_meas configured rule
	 * \else
	 * 测温项的名称,从测温配置规则名字中选取
	 * \endif
	 */
    public byte[]              szName =  new byte[64];                         
    
	 /**
	 * \if ENGLISH_LANG
	 *  channel number
	 * \else
	 * 通道号
	 * \endif
	 */
    public int                 nChannel;                          

}
