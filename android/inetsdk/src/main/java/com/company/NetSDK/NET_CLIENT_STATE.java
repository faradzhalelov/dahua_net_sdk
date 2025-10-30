package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General alarm informaiton
 * \else
 * 普通报警信息
 * \endif
 */
public class NET_CLIENT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No. 
	 * \else
	 * 通道数
	 * \endif
	 */
	public int					channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input port amount 
	 * \else
	 * 报警输入口数
	 * \endif
	 */
	public int					alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * External alarm 
	 * \else
	 * 外部报警
	 * \endif
	 */
	public byte					alarm[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Motion detection 
	 * \else
	 * 动态检测
	 * \endif
	 */
	public byte					motiondection[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Video loss 
	 * \else
	 * 视频丢失
	 * \endif
	 */
	public byte					videolost[] = new byte[16];
}
