package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Watermark Congiguration, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_WATERMARK}
 * \else
 * 水印配置, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_WATERMARK}
 * \endif
 */
public class CFG_WATERMARK_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * ChannelID(from 0) 
	 * \else
	 * 通道号(0开始)
	 * \endif
	 */
	public int 					nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * 使能开关
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Stream Type(1～n)0-all 
	 * \else
	 * 码流类型(1～n)，0－所有码流
	 * \endif
	 */
	public int					nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Data Type1-Character，2-Picture 
	 * \else
	 * 数据类型，1－文字，2－图片
	 * \endif
	 */
	public int					nDataType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Character Watermark Data 
	 * \else
	 * 字符串水印数据
	 * \endif
	 */
	public byte[]				pData = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}

