package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* matrix status info
* \else
* 矩阵状态信息
* \endif
*/
public class NET_MONITORWALL_STATUS_INFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * tour interval
	 * \else
	 * 轮巡时间间隔
	 * \endif
	 */
	public int         	 nInterval;                      
	
	 /**
	 * \if ENGLISH_LANG
	 * scheme tour
	 * \else
	 * 预案轮巡数
	 * \endif
	 */
	public int        	 nCollectionNum;                 
	
	 /**
	 * \if ENGLISH_LANG
	 * scheme tour content
	 * \else
	 * 预案轮巡组内容
	 * \endif
	 */
	public byte[][]      szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];         
	
	 /**
	 * \if ENGLISH_LANG
	 * current display scheme name
	 * \else
	 * 当前显示的预案名称
	 * \endif
	 */
	public byte[]        szName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];     
}
