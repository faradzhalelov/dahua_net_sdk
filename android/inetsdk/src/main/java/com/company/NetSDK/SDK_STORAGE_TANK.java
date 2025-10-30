package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage tank info
 * \else
 * 扩展柜信息
 * \endif
 */
public class SDK_STORAGE_TANK implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * level, the host is 0 level 
	 * \else
	 * 级别, 主机是第0级,其它下属级别类推
	 * \endif
	 */
    public int                 nLevel;                                     
    
	/**
	 * \if ENGLISH_LANG
	 * extend port number from 0 
	 * \else
	 * 同一级扩展柜内的扩展口编号, 从0开始
	 * \endif
	 */
    public int                 nTankNo;                                    
    
	/**
	 * \if ENGLISH_LANG
	 * Corresponding cabinet board card no., start from 0 
	 * \else
	 * 对应主柜上的板卡号, 从0开始编号
	 * \endif
	 */
    public int                 nSlot;                                      
}
