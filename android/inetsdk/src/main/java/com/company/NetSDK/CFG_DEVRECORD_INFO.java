package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * channel record group state
 * \else
 * 通道录像组状态
 * \endif
 */

public class CFG_DEVRECORD_INFO implements Serializable{

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device name 
	 * \else
	 * 设备名称
	 * \endif
	 */
	public byte[]                   szDevName = new byte[FinalVar.MAX_NAME_LEN];               
	
	/**
	 * \if ENGLISH_LANG
	 * device IP
	 * \else
	 * 设备IP	
	 * \endif
	 */
	public byte[]                   szIP = new byte[FinalVar.MAX_ADDRESS_LEN];              
	
	/**
	 * \if ENGLISH_LANG
	 * channel number 
	 * \else
	 * 通道号
	 * \endif
	 */
	public byte[]                   szChannel = new byte[FinalVar.MAX_NAME_LEN];               
	
	/**
	 * \if ENGLISH_LANG
	 * channel name
	 * \else
	 * 通道名称
	 * \endif
	 */
	public byte[]                   szChannelName = new byte[FinalVar.MAX_NAME_LEN];           
    
	/**
	 * \if ENGLISH_LANG
	 * storage position info
	 * \else
	 * 存储位置信息 
	 * \endif
	 */
	public byte[]                   szStoragePosition = new byte[FinalVar.MAX_NAME_LEN];       
    
	/**
	 * \if ENGLISH_LANG
	 * state 0:unknown 1:record 2:stop
	 * \else
	 * 状态 0:未知 1:录像 2:停止
	 * \endif
	 */
	public byte                     byStatus;                         
}
