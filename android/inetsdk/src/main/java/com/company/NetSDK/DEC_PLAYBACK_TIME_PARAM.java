package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Playback Time Parameters
 * \else
 * 按时间回放前端设备条件
 * \endif
 */
public class DEC_PLAYBACK_TIME_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR
	 * \else
	 * 前端DVR的IP地址
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * 前端DVR的端口号
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * 解码通道使能
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number
	 * \else
	 * 对应解码通道号
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * 用户名
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * 密码
	 * \endif
	 */
	public byte			szDevPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * 通道id 
	 * \endif
	 */
	public int				nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Start Time 
	 * \else
	 * 起始时间
	 * \endif
	 */
	public NET_TIME		startTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End Time 
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME		endTime = new NET_TIME();
}
