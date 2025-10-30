package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Current decoding channel status(including channel status, decoding stream info and etc.)
 * \else
 * 当前解码通道状态信息(包括通道状态，解码流信息等)
 * \endif
 */
public class DEV_DECCHANNEL_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Responding decoding channel number
	 * \else
	 * 对应解码通道号
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * Current decoding channel in opertion status:0 -free,1 -realtime monitoring,2 - playback 3 - Decode Tour
	 * \else
	 * 当前解码通道正在操作状态:0－空闲，1－实时预览，2－回放 3 - 轮巡
	 * \endif
	 */
	public byte            byChnState;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data frame rate
	 * \else
	 * 当前数据帧率
	 * \endif
	 */
	public byte			byFrame;
	                       
	/**
	 * \if ENGLISH_LANG
	 * Decoding channel data amount
	 * \else
	 * 解码通道数据总量
	 * \endif
	 */
	public int				nChannelFLux;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoding data amount
	 * \else
	 * 解码数据量
	 * \endif
	 */
	public int             nDecodeFlux;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data resolution
	 * \else
	 * 当前数据分辨率
	 * \endif
	 */
	public byte            szResolution[] = new byte[16];
}
