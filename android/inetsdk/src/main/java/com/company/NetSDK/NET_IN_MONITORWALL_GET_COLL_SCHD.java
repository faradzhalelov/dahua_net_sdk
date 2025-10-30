package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#OperateMonitorWall} input parameter=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_COLL_SCHD}
 * \else
 * {@link INetSDK#OperateMonitorWall} 接口输入参数=>{@link NET_MONITORWALL_OPERATE_TYPE#NET_MONITORWALL_OPERATE_GET_COLL_SCHD}
 * \endif
 */
public class NET_IN_MONITORWALL_GET_COLL_SCHD implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * TRUE-search all scheme, no need to appoint scheme name. FALSE-search name corresponding scheme
	 * \else
	 * TRUE-查询所有预案, 不需要指定预案名称. FALSE-查询名称所对应的预案
	 * \endif
	 */
	public boolean                bAllCollections;                
	
	/**
	 * \if ENGLISH_LANG
	 * scheme, bAllCollections is FALSE valid
	 * \else
	 * 预案数, bAllCollections为FALSE时有效
	 * \endif
	 */
	public int             		  nCollectionNum;                 
	
	/**
	 * \if ENGLISH_LANG
	 * scheme name
	 * \else
	 * 预案名称
	 * \endif
	 */
	public byte[][]               szCollections = new byte[FinalVar.SDK_MAX_COLLECTION_NUM][FinalVar.SDK_DEVICE_NAME_LEN];   
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall ID
	 * \else
	 * 电视墙ID
	 * \endif
	 */
	public int                 	  nMonitorWallID;                 
}
