package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Search Type
 * \else
 * 查询类型
 * \endif
 */
public class SDK_SYS_ABILITY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Dynamic connect capacity
	 * \else
	 * 查询动态多连接能力
	 * \endif
	 */
	public static final int     ABILITY_DYNAMIC_CONNECT = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Watermark configuration capacity
	 * \else
	 * 水印配置能力
	 * \endif
	 */
	public static final int     ABILITY_WATERMARK_CFG = 17;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless  configuration capacity
	 * \else
	 * Wireless配置能力
	 * \endif
	 */
	public static final int     ABILITY_WIRELESS_CFG = 18;
	
	/**
	 * \if ENGLISH_LANG
	 * Device capacity list 
	 * \else
	 * 设备的能力列表
	 * \endif
	 */
	public static final int     ABILITY_DEVALL_INFO = 26;
	
	/**
	 * \if ENGLISH_LANG
	 * Card number search capacity 
	 * \else
	 * 卡号查询能力
	 * \endif
	 */
	public static final int     ABILITY_CARD_QUERY = 0x0100;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-window preview capacity
	 * \else
	 * 多画面预览能力
	 * \endif
	 */
	public static final int     ABILITY_MULTIPLAY = 0x0101;
	
	/**
	 * \if ENGLISH_LANG
	 * Fast query configuration Capabilities
	 * \else
	 * 快速查询配置能力
	 * \endif
	 */
	public static final int     ABILITY_QUICK_QUERY_CFG = 0x0102;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless alarm capacity 
	 * \else
	 * 无线报警能力
	 * \endif
	 */
	public static final int     ABILITY_INFRARED = 0x0121;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation mode function 
	 * \else
	 * 报警输出触发方式能力
	 * \endif
	 */
	public static final int     ABILITY_TRIGGER_MODE = 0x0131;
	
	/**
	 * \if ENGLISH_LANG
	 * Network hard disk partition
	 * \else
	 * 网络硬盘分区能力
	 * \endif
	 */
	public static final int     ABILITY_DISK_SUBAREA = 0x0141;
	
	/**
	 * \if ENGLISH_LANG
	 * Query DSP Capabilities
	 * \else
	 * 查询DSP能力
	 * \endif
	 */
	public static final int     ABILITY_DSP_CFG = 0x0151;
	
	/**
	 * \if ENGLISH_LANG
	 * Query SIP,RTSP Capabilities
	 * \else
	 * 查询SIP,RTSP能力
	 * \endif
	 */
	public static final int     ABILITY_STREAM_MEDIA = 0x0161;
	
	/**
	 * \if ENGLISH_LANG
	 * Search intelligent track capability.
	 * \else
	 * 查询智能跟踪能力
	 * \endif
	 */
	public static final int     ABILITY_INTELLI_TRACKER = 0x0171;
}
