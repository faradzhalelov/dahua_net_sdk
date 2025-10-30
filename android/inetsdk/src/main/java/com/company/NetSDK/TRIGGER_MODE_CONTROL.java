package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activation type 
 * \else
 * 触发方式
 * \endif
 */
public class TRIGGER_MODE_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number 
	 * \else
	 * 端口序号
	 * \endif
	 */
	public short		index;
	
	/**
	 * \if ENGLISH_LANG
	 * Activation way(0:close.1:manual.2:auto); The SDK reserves the original setup if you do not set channel here. 
	 * \else
	 * 触发方式(0关闭1手动2自动);不设置的通道，sdk默认将保持原来的设置
	 * \endif
	 */
	public short		mode;
}
