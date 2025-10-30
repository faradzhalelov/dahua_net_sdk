package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * add tv wall input parameter
 * \else
 * 添加电视墙输入参数
 * \endif
 */
public class NET_IN_MONITORWALL_ADD implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall info
	 * \else
	 * 电视墙信息
	 * \endif
	 */
    public SDK_MONITORWALL stuMonitorWall; 

    public NET_IN_MONITORWALL_ADD(int blockCount, int OutputCount) {
    	stuMonitorWall = new SDK_MONITORWALL(blockCount, OutputCount);
    }
}
