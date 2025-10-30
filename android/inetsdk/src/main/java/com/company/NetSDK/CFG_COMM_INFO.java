package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Info Structur
 * \else
 * 串口信息结构体
 * \endif
 */
public class CFG_COMM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Serial Port Protocol 
	 * \else
	 * 协议名称
	 * \endif
	 */
	public char             szProtocolName[] = new char[FinalVar.MAX_PROTOCOL_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial Port Attribute 
	 * \else
	 * 串口属性
	 * \endif
	 */
	public CFG_COMM_PROP    stuAttribute = new CFG_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * 串口地址
	 * \endif
	 */
	public int              nAddress;
}
