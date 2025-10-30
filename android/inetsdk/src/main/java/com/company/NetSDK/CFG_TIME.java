package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time
 * \else
 * 时间
 * \endif
 */
public class CFG_TIME implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * hour
	 * \else
	 * 时
	 * \endif
	 */
	public int				dwHour;					
	
	/**
	 * \if ENGLISH_LANG
	 * minute
	 * \else
	 * 分
	 * \endif
	 */
	public int				dwMinute;			
	
	/**
	 * \if ENGLISH_LANG
	 * second
	 * \else
	 * 秒
	 * \endif
	 */
	public int				dwSecond;				
}
