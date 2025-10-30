package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Upgrade type
 * \else
 * 升级类型
 * \endif
 */

public class EM_UPGRADE_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * BIOS  upgrade
	 * \else
	 * BIOS升级
	 * \endif
	 */
    public static final int SDK_UPGRADE_BIOS_TYPE = 1;           
    
	/**
	 * \if ENGLISH_LANG
	 * WEB upgrade
	 * \else
	 * WEB升级
	 * \endif
	 */
    public static final int SDK_UPGRADE_WEB_TYPE  = 2;                
    
	/**
	 * \if ENGLISH_LANG
	 * BOOT upgrade
	 * \else
	 * BOOT升级
	 * \endif
	 */
    public static final int SDK_UPGRADE_BOOT_YPE  = 3;               
    
	/**
	 * \if ENGLISH_LANG
	 * Chinese character library
	 * \else
	 * 汉字库
	 * \endif
	 */
    public static final int SDK_UPGRADE_CHARACTER_TYPE = 4;          
    
	/**
	 * \if ENGLISH_LANG
	 * LOGO
	 * \else
	 * LOGO
	 * \endif
	 */
    public static final int SDK_UPGRADE_LOGO_TYPE = 5;               
    
	/**
	 * \if ENGLISH_LANG
	 * EXE such as player
	 * \else
	 * EXE,例如播放器等
	 * \endif
	 */
    public static final int SDK_UPGRADE_EXE_TYPE = 6;                 
    
	/**
	 * \if ENGLISH_LANG
	 * upgrade device information
	 * \else
	 * 设备固有信息设置(如：硬件ID,MAC,序列号)
	 * \endif
	 */
    public static final int SDK_UPGRADE_DEVCONSTINFO_TYPE = 7;       
    
	/**
	 * \if ENGLISH_LANG
	 * Peripheral access from (such as car 287 chip)
	 * \else
	 * 外设接入从片(如车载287芯片)
	 * \endif
	 */
    public static final int SDK_UPGRADE_PERIPHERAL_TYPE = 8;         
    
	/**
	 * \if ENGLISH_LANG
	 * Geographic information positioning chip
	 * \else
	 * 地理信息定位芯片
	 * \endif
	 */
    public static final int SDK_UPGRADE_GEOINFO_TYPE = 9;           
    
	/**
	 * \if ENGLISH_LANG
	 * Menu (equipment operation interface of the picture)
	 * \else
	 * 菜单（设备操作界面的图片）
	 * \endif
	 */
    public static final int SDK_UPGRADE_MENU = 10;                    
    
	/**
	 * \if ENGLISH_LANG
	 * Line files (such as bus lines)
	 * \else
	 * 线路文件（如公交线路）
	 * \endif
	 */
    public static final int SDK_UPGRADE_ROUTE = 11;                   
    
	/**
	 * \if ENGLISH_LANG
	 * Stops the audio (with line stops audio)
	 * \else
	 * 报站音频（与线路配套的报站音频）
	 * \endif
	 */
    public static final int SDK_UPGRADE_ROUTE_STATE_AUTO = 12;        
    
	/**
	 * \if ENGLISH_LANG
	 * Scheduling screen (e.g., bus operation panel)
	 * \else
	 * 调度屏（如公交操作屏）
	 * \endif
	 */
    public static final int SDK_UPGRADE_SCREEN = 13;                 
}
