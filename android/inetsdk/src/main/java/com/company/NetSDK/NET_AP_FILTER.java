package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * AccessPoint access fiter configuration
 * \else
 * AccessPoint 接入过滤配置
 * \endif
 */
public class NET_AP_FILTER implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * enable ture:yes false:no
	 * \else
	 * 是否开启过滤功能
	 * \endif
	 */
    public boolean                    bEnable;                            
    
	/**
	 * \if ENGLISH_LANG
	 * maximum number of WIFI device connections
	 * \else
	 * 最大Wifi设备连接个数
	 * \endif
	 */
    public int                     nMaxAccessNum;                      
    
	/**
	 * \if ENGLISH_LANG
	 * filter policy, refer to {@link EM_ADDRLIST_FILTER_POLICY}
	 * \else
	 * 过滤策略,取值参考{@link EM_ADDRLIST_FILTER_POLICY}
	 * \endif
	 */
    public int                     emPolicy;                         
    
	/**
	 * \if ENGLISH_LANG
	 * address filter list ,new/delete by user 
	 * \else
	 * 地址过滤列表，由用户申请内存和释放      
	 * \endif
	 */
    public NET_FILTER_ADDRESS_LIST[] pstuAddrList;                       
    
	/**
	 * \if ENGLISH_LANG
	 * the max of address number
	 * \else
	 * 地址最大个数
	 * \endif
	 */
    public int                     nMaxListNum;                        
    
	/**
	 * \if ENGLISH_LANG
	 * return address number
	 * \else
	 * 返回的地址个数
	 * \endif
	 */
    public int                     nRetListNum; 
    
    public NET_AP_FILTER(int nMaxListNum){
    	this.nMaxListNum = nMaxListNum;
    	pstuAddrList = new NET_FILTER_ADDRESS_LIST[nMaxListNum];
    	for(int i = 0; i < nMaxListNum; i++) {
    		pstuAddrList[i] = new NET_FILTER_ADDRESS_LIST();
    	}
    }
}
