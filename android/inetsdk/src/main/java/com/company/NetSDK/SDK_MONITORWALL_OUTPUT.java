package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  TV wall display unit
 * \else
 * 电视墙显示单元
 * \endif
 */
public class SDK_MONITORWALL_OUTPUT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID, local time is""
	 * \else
	 * 设备ID, 本机时为""
	 * \endif
	 */
    public byte[]              szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];         
    
    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * 通道号
     * \endif
     */
    public int                 nChannel;                          
    
    /**
     * \if ENGLISH_LANG
     * screen name 
     * \else
     * 屏幕名称
     * \endif
     */
    public byte[]              szName = new byte[FinalVar.SDK_DEV_NAME_LEN];            
}
