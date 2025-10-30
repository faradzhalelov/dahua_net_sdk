package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel quantity info
 * \else
 * 通道数量信息
 * \endif
 */
public class NET_CHN_COUNT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Device total channels(all valid channel sum)
	 * \else
	 * 设备总通道数(所有有效通道数之和)
	 * \endif
	 */
	public int					nMaxTotal;

	/**
	 * \if ENGLISH_LANG
	 * Configured channel number
	 * \else
	 * 已配置的通道数
	 * \endif
	 */
	public int					nCurTotal;

	/**
	 * \if ENGLISH_LANG
	 * Max local channel number, including motherboard and pluggable sub channel
	 * \else
	 * 最大本地通道数, 含主板和可插拔子卡通道
	 * \endif
	 */
	public int					nMaxLocal;

	/**
	 * \if ENGLISH_LANG
	 * Configured local channel number
	 * \else
	 * 已配置本地通道数
	 * \endif
	 */
	public int					nCurLocal;

	/**
	 * \if ENGLISH_LANG
	 * Max remote channel number
	 * \else
	 * 最大远程通道数
	 * \endif
	 */
	public int					nMaxRemote;

	/**
	 * \if ENGLISH_LANG
	 * Configured remote channel
	 * \else
	 * 已配置远程通道数
	 * \endif
	 */
	public int					nCurRemote;
}
