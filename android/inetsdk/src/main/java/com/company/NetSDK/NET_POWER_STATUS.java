package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * define problem, please do not use
 * \else
 * 定义有问题，请勿再使用
 * \endif
 */
public class NET_POWER_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 查询是否成功
	 * \endif
	 */
	 public boolean            bEnable;                           
	 
	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电源数量
	 * \endif
	 */
	 public int                nCount;                             
	 
	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电源状态
	 * \endif
	 */
	 public NET_POWER_INFO     stuPowers[] = new NET_POWER_INFO[FinalVar.SDK_MAX_POWER_NUM];        
	 
	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电池数量
	 * \endif
	 */
	 public int                nBatteryNum;                        
	 
	 /**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 电池状态
	 * \endif
	 */
	 public NET_BATTERY_INFO   stuBatteries[] = new NET_BATTERY_INFO[FinalVar.SDK_MAX_BATTERY_NUM];   
	 
	 public NET_POWER_STATUS(){
		 for(int i=0 ; i<FinalVar.SDK_MAX_POWER_NUM ; i++){
			 stuPowers[i] = new NET_POWER_INFO();
		 }
		 
		 for( int i =0 ; i<FinalVar.SDK_MAX_BATTERY_NUM ; i++){
			 stuBatteries[i] = new NET_BATTERY_INFO();
		 }
	 }
}
