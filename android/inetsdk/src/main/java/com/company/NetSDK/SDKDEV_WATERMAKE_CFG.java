package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video watermark configuration
 * \else
 * 图象水印配置
 * \endif
 */
public class SDKDEV_WATERMAKE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * 使能
	 * \endif
	 */
	public int                 nEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit stream(1～n)0-all bit streams
	 * \else
	 * 码流(1～n)0-所有码流
	 * \endif
	 */
	public int                 nStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Data type(1-character,2-picture)
	 * \else
	 * 数据类型(1-文字，2-图片) 
	 * \endif
	 */
	public int                 nKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Character
	 * \else
	 * 文字
	 * \endif
	 */
	public byte                szLetterData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_LETTER];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture data
	 * \else
	 * 图片数据
	 * \endif
	 */
	public byte                szData[] = new byte[FinalVar.SDK_MAX_WATERMAKE_DATA];
}
