package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel template 
 * \else
 * 红外面板模板
 * \endif
 */
public class CFG_INFRARED_BOARD_TEMPLATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Panel template ID
	 * \else
	 * 面板模板编号
	 * \endif
	 */
	public int			nID;
	
	/**
	 * \if ENGLISH_LANG
	 * Panel Brand Model definitions
	 * \else
	 * 面板品牌型号定义
	 * \endif
	 */
	public char	   szName[] = new char[FinalVar.CFG_COMMON_STRING_64];
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel type, categories, 0 - DVD, TV 
	 * \else
	 * 面板类型, 大类, 0-DVD, 1-TV
	 * \endif
	 */
	public int		nCategory;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel key number 
	 * \else
	 * 面板按键数量
	 * \endif
	 */
	public int		 nKeyNum;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel buttons
	 * \else
	 * 面板按键
	 * \endif
	 */
	public CFG_INFRARED_KEY stuKeys[] =  new CFG_INFRARED_KEY[FinalVar.CFG_MAX_INFRARED_KEY_NUM];
	
	
	public CFG_INFRARED_BOARD_TEMPLATE()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_KEY_NUM; i++)
		{
			stuKeys[i] = new CFG_INFRARED_KEY();
		}
	}
}
