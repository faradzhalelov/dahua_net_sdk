package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Decoder information
 * \else
 * 连接的编码器信息
 * \endif
 */
public class DEV_DECODER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * 类型
	 * \endif
	 */
	public byte			szDecType[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * TV number
	 * \else
	 * TV个数
	 * \endif
	 */
	public int				nMonitorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel number
	 * \else
	 * 解码通道个数
	 * \endif
	 */
	public int				nEncoderNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported by a number of TV screen partition
	 * \else
	 * 支持的TV画面分割数，以数组形式表示，0为结尾
	 * \endif
	 */
	public byte			szSplitMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV enable
	 * \else
	 * 各TV使能
	 * \endif
	 */
	public byte            bMonitorEnable[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV tip display enable 0:not support 1:support.
	 * \else
	 * 指示是否支持TV提示信息叠加设置, 0:不支持 1:支持.
	 * \endif
	 */
	public byte            bTVTipDisplay;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 各解码通道显示叠加信息使能
	 * \endif
	 */
	public byte            byLayoutEnable[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 各解码通道显示叠加信息使能掩码,从低位到高位支持64个通道,其中dwLayoutEnMask[0]是低32位
	 * \endif
	 */
	public int           	dwLayoutEnMask[] = new int[2];
}
