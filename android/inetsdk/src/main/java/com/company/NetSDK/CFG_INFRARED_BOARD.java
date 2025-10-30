package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel 
 * \else
 * 红外面板
 * \endif
 */
public class CFG_INFRARED_BOARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Panel number, unique identifier
	 * \else
	 * 面板编号, 唯一标示
	 * \endif
	 */
	public int    nID;
	
	/**
	 * \if ENGLISH_LANG
	 * Panel control peripherals name, user-defined
	 * \else
	 * 面板控制外设名称, 用户自定义
	 * \endif
	 */
	public byte 	szName[] = new byte[FinalVar.CFG_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Panel type, 0 to DVD, TV 
	 * \else
	 * 面板类型, 0-DVD, 1-TV
	 * \endif
	 */
	public int		nCategory;
	
	/**
	 * \if ENGLISH_LANG
	 * Infrared communication port 
	 * \else
	 * 红外通讯端口
	 * \endif
	 */
	public int		nCommPort;
	
	/**
	 * \if ENGLISH_LANG
	 * The associated template ID 
	 * \else
	 * 关联的模板ID
	 * \endif
	 */
	public int		nTemplateID;
			
}
