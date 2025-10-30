package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get code info, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_GET_CODEID_LIST}
 * \else
 * 获取对码信息, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_GET_CODEID_LIST}
 * \endif
 */
public class NET_GET_CODEID_LIST implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Start index symbol, start first search may set to 0
	 * \else
	 * 开始的索引号,开始第一次查询可设为0
	 * \endif
	 */
    public int	nStartIndex;            
    
    /**
     * \if ENGLISH_LANG
     * The gotten code items, refer to {@link CFG_CAP_LOWRATEWPAN}, this value issmaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * 本次获取的对码条数,取值参考 {@link CFG_CAP_LOWRATEWPAN},此值小于等于能力集中nMaxPageSize字段的值
     * \endif
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actual returned code items
     * \else
     * 实际返回的对码条数
     * \endif
     */
    public int	nRetCodeIDNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get code content, allocated by user, cannot be lower than nQueryNum
     * \else
     * 获取对码的内容, 个数不能小于 nQueryNum
     * \endif
     */
    public NET_CODEID_INFO[]    pstuCodeIDInfo; 
    
    public NET_GET_CODEID_LIST(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuCodeIDInfo = new NET_CODEID_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuCodeIDInfo[i] = new  NET_CODEID_INFO();
    	}
    }
}
