package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * filter address list
 * \else
 * 地址过滤列表
 * \endif
 */
public class NET_FILTER_ADDRESS_LIST implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * whether effective:true yes,false no
	 * \else
	 * 在列表中有效性 true有效，false无效
	 * \endif
	 */
    public boolean                    bEffective;                         
    
	/**
	 * \if ENGLISH_LANG
	 * device mac address
	 * \else
	 * 设备MAC地址
	 * \endif
	 */
    public byte[]                     szMAC = new byte[FinalVar.SDK_MACADDR_LEN];              
    
	/**
	 * \if ENGLISH_LANG
	 * A detailed description of the MAC address  
	 * \else
	 * 对该MAC的描述信息    
	 * \endif
	 */
    public byte[]                     szDescribeText = new byte[FinalVar.SDK_COMMON_STRING_256]; 
}
