package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * burning stream format
 * \else
 * 刻录流格式
 * \endif
 */
public class NET_BURN_RECORD_PACK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DHAV
	 * \else
	 * DHAV
	 * \endif
	 */
	public static final int BURN_PACK_DHAV 		= 0 ;
	
	/**
	 * \if ENGLISH_LANG
	 * PS
	 * \else
	 * PS
	 * \endif
	 */
	public static final int BURN_PACK_PS 	= 1	;
	
	/**
	 * \if ENGLISH_LANG
	 * ASF
	 * \else
	 * ASF
	 * \endif
	 */
	public static final int BURN_PACK_ASF 	= 2 ;
	
	/**
	 * \if ENGLISH_LANG
	 * MP4
	 * \else
	 * MP4
	 * \endif
	 */
	public static final int BURN_PACK_MP4 	= 3;
	
	/**
	 * \if ENGLISH_LANG
	 * TS
	 * \else
	 * TS
	 * \endif
	 */
	public static final int BURN_PACK_TS 	= 4;
}
