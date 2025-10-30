package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Order serial data config-single serial config
 * \else
 * 订阅串口数据配置-单个串口配置
 * \endif
 */
public class CFG_DEVCOMM_SUBSCRIBE_INFO implements Serializable{
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Serial read interval,unit: s    
	 * \else
	 * 串口读取间隔,单位: 秒    
	 * \endif
	 */
	public int             nReadCycle;                             
}
