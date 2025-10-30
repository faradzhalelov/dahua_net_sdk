package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Information of recorded in transportation black and allow list
 * \else
 * 交通权限名单记录信息
 * \endif
 */
public class NET_TRAFFIC_LIST_RECORD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Queried Record Numbe
	 * \else
	 * 之前查询到的记录号
	 * \endif
	 */
	public int                        nRecordNo;                                 
	  
	/**
	 * \if ENGLISH_LANG
	 * Car Owner's Name
	 * \else
	 * 车主姓名
	 * \endif
	 */
	public byte[]                     szMasterOfCar = new byte[FinalVar.SDK_MAX_NAME_LEN];            
	  
	/**
	 * \if ENGLISH_LANG
	 * License Plate Number
	 * \else
	 * 车牌号码 
	 * \endif
	 */	  
	public byte[]                     szPlateNumber = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];    
	  
	/**
	 * \if ENGLISH_LANG
	 * License Plate Type, refer to {@link EM_NET_PLATE_TYPE}
	 * \else
	 * 车牌类型 ,取值参考 {@link EM_NET_PLATE_TYPE}
	 * \endif
	 */
	public int          			  emPlateType;                               
	  
	/**
	 * \if ENGLISH_LANG
	 * License Plate Color, refer to {@link EM_NET_PLATE_COLOR_TYPE}
	 * \else
	 * 车牌颜色 ,取值参考 {@link EM_NET_PLATE_COLOR_TYPE}
	 * \endif
	 */
	public int    					  emPlateColor;                              
	  
	/**
	 * \if ENGLISH_LANG
	 * Vehicle Type, refer to {@link EM_NET_VEHICLE_TYPE}
	 * \else
	 * 车辆类型 ,取值参考 {@link EM_NET_VEHICLE_TYPE}
	 * \endif
	 */
	public int        				  emVehicleType;                             
	
	/**
	 * \if ENGLISH_LANG
	 * Car Body Color, refer to {@link EM_NET_VEHICLE_COLOR_TYPE}
	 * \else
	 * 车身颜色 ,取值参考 {@link EM_NET_VEHICLE_COLOR_TYPE}
	 * \endif
	 */
	public int  					  emVehicleColor;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Start Time 
	 * \else
	 * 开始时间
	 * \endif
	 */
    public NET_TIME                   stBeginTime = new NET_TIME();                               
    
	/**
	 * \if ENGLISH_LANG
	 * Undo Time
	 * \else
	 * 撤销时间
	 * \endif
	 */
	public NET_TIME                   stCancelTime = new NET_TIME();                              
	
	/**
	 * \if ENGLISH_LANG
	 * Permission Number
	 * \else
	 * 权限个数
	 * \endif
	 */
	public int                        nAuthrityNum;                              
	
	/**
	 * \if ENGLISH_LANG
	 * Permissions List, Allow list Only
	 * \else
	 * 权限列表 , 允许名单仅有
	 * \endif
	 */
	public NET_AUTHORITY_TYPE[]       stAuthrityTypes = new NET_AUTHORITY_TYPE[FinalVar.SDK_MAX_AUTHORITY_LIST_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Monitor Type, Block List Only, refer to {@link EM_NET_TRAFFIC_CAR_CONTROL_TYPE}
	 * \else
	 * 布控类型 ,禁止名单仅有, 取值参考 {@link EM_NET_TRAFFIC_CAR_CONTROL_TYPE}
	 * \endif
	 */
	public int 						  emControlType;                        
	  
	public NET_TRAFFIC_LIST_RECORD() {
		for(int i = 0; i < FinalVar.SDK_MAX_AUTHORITY_LIST_NUM; ++i) {
			stAuthrityTypes[i] = new NET_AUTHORITY_TYPE();
		}
	}
}
