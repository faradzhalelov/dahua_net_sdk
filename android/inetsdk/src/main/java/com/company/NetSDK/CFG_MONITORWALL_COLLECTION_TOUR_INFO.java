package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV wall scheme tour config, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_MONITORWALL_COLL_TOUR}
 * \else
 * 电视墙预案轮巡配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_MONITORWALL_COLL_TOUR}
 * \endif
 */
public class CFG_MONITORWALL_COLLECTION_TOUR_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * tour interval, unit is s
	 * \else
	 * 轮巡间隔时间, 单位秒
	 * \endif
	 */
    public int                 nInterval;               
    
	/**
	 * \if ENGLISH_LANG
	 * scheme toup includes scehem quantity
	 * \else
	 * 预案轮巡组中包含的预案数量
	 * \endif
	 */
    public int                 nCollectionNum;          
    
	/**
	 * \if ENGLISH_LANG
	 * scheme tour content, each item is scheme name
	 * \else
	 * 预案轮巡组内容, 每一项是预案的名称
	 * \endif
	 */
    public byte[][]            szCollectionGroup = new byte[FinalVar.CFG_MAX_COLLECTION_NUM][FinalVar.CFG_COMMON_STRING_128]; 
}
