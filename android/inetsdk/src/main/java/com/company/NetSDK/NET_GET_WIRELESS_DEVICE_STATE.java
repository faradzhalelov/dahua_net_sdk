package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Get wireless devices info, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_GET_WIRESSLESS_STATE}
 * \else
 * 获取无线设备状态, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_GET_WIRESSLESS_STATE}
 * \endif
 */
public class NET_GET_WIRELESS_DEVICE_STATE implements Serializable{
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
     * The gotten state items, refer to {@link CFG_CAP_LOWRATEWPAN}, this value is smaller than or equal to capacity set nMaxPageSize field valud
     * \else
     * 本次获取的设备状态条数, 取值参考 {@link CFG_CAP_LOWRATEWPAN},此值小于等于能力集中nMaxPageSize字段的值
     * \endif
     */
    public int	nQueryNum;              
    
    /**
     * \if ENGLISH_LANG
     * Actually returned items
     * \else
     * 实际返回的设备状态条数
     * \endif
     */
    public int	nRetQueryNum;        
    
    /**
     * \if ENGLISH_LANG
     * Get state content, allocated by user, cannot be lower than nQueryNum
     * \else
     * 获取设备状态的内容, 个数不能小于 nQueryNum
     * \endif
     */
    public NET_WIRELESS_DEVICE_INFO[]    pstuDeviceInfo; 
    
    public NET_GET_WIRELESS_DEVICE_STATE(int QueryNumber) {
    	this.nQueryNum = QueryNumber;
    	pstuDeviceInfo = new NET_WIRELESS_DEVICE_INFO[QueryNumber];
    	for (int i = 0; i < QueryNumber; ++i){
    		pstuDeviceInfo[i] = new  NET_WIRELESS_DEVICE_INFO();
    	}
    }
}
