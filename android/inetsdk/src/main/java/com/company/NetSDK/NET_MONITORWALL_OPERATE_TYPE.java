package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * monitorwall operate type
 * \else
 * 电视墙操作类型
 * \endif
 */
public class NET_MONITORWALL_OPERATE_TYPE implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * add tv wall, corresponding to {@link NET_IN_MONITORWALL_ADD} and {@link NET_OUT_MONITORWALL_ADD}
	 * \else
	 * 添加电视墙, 对应 {@link NET_IN_MONITORWALL_ADD}和 {@link NET_OUT_MONITORWALL_ADD}
	 * \endif
	 */
	public static final int 	NET_MONITORWALL_OPERATE_ADD = 0;            
	
	/**
	 * \if ENGLISH_LANG
	 * scheme tour control, corresponding to {@link NET_IN_CTRL_COLLECTIONTOUR} and {@link NET_OUT_CTRL_COLLECTIONTOUR}
	 * \else
	 * 预案轮巡控制, 对应{@link NET_IN_CTRL_COLLECTIONTOUR}和  {@link NET_OUT_CTRL_COLLECTIONTOUR}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_CTRL_TOUR = 1;      
	
	/**
	 * \if ENGLISH_LANG
	 * get matrix current status, corresponding to {@link NET_IN_MONITORWALL_GET_STATUS} and {@link NET_OUT_MONITORWALL_GET_STATUS}
	 * \else
	 * 获取矩阵当前状态, 对应 {@link NET_IN_MONITORWALL_GET_STATUS}和  {@link NET_OUT_MONITORWALL_GET_STATUS}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_GET_STATUS = 2;     
	
	/**
	 * \if ENGLISH_LANG
	 * set scheme time schedule, corresponding to {@link NET_IN_MONITORWALL_SET_COLL_SCHD} and {@link NET_OUT_MONITORWALL_SET_COLL_SCHD}
	 * \else
	 * 设置预案时间表, 对应 {@link NET_IN_MONITORWALL_SET_COLL_SCHD}和 {@link NET_OUT_MONITORWALL_SET_COLL_SCHD}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_SET_COLL_SCHD = 3;  
	
	/**
	 * \if ENGLISH_LANG
	 * get scheme schedule, corresponding to {@link NET_IN_MONITORWALL_GET_COLL_SCHD} and {@link NET_OUT_MONITORWALL_GET_COLL_SCHD}
	 * \else
	 * 获取预案时间表, 对应 {@link NET_IN_MONITORWALL_GET_COLL_SCHD}和 {@link NET_OUT_MONITORWALL_GET_COLL_SCHD}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_GET_COLL_SCHD = 4;  
	
	/**
	 * \if ENGLISH_LANG
	 * delete tv wall, corresponding to {@link NET_IN_MONITORWALL_REMOVE} and {@link NET_OUT_MONITORWALL_REMOVE}
	 * \else
	 * 删除电视墙, 对应 {@link NET_IN_MONITORWALL_REMOVE}和 {@link NET_OUT_MONITORWALL_REMOVE}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_REMOVE = 5;         
	
	/**
	 * \if ENGLISH_LANG
	 * setup enable, corresponding to {@link NET_IN_MONITORWALL_SET_ENABLE} and {@link NET_OUT_MONITORWALL_SET_ENABLE}
	 * \else
	 * 设置使能, 对应 {@link NET_IN_MONITORWALL_SET_ENABLE}和 {@link NET_OUT_MONITORWALL_SET_ENABLE}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_SET_ENABLE = 6;     
	
	/**
	 * \if ENGLISH_LANG
	 * Get enable, corresponding to {@link NET_IN_MONITORWALL_GET_ENABLE} and {@linkNET_OUT_MONITORWALL_GET_ENABLE }
	 * \else
	 * 获取使能, 对应 {@link NET_IN_MONITORWALL_GET_ENABLE}和 {@linkNET_OUT_MONITORWALL_GET_ENABLE }
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_GET_ENABLE = 7;     
	
	/**
	 * \if ENGLISH_LANG
	 * tv wall exists or not, corresponding to {@link NET_IN_MONITORWALL_NAME_EXIST} and {@link NET_OUT_MONITORWALL_NAME_EXIST}
	 * \else
	 * 电视墙是否存在, 对应 {@link NET_IN_MONITORWALL_NAME_EXIST}和 {@link NET_OUT_MONITORWALL_NAME_EXIST}
	 * \endif
	 */
	public static final int    NET_MONITORWALL_OPERATE_NAME_EXIST = 8;    

}
