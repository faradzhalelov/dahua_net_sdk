package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ Activation Configuration
 * \else
 * 联动云台信息
 * \endif
 */
public class CFG_PTZ_LINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Activation Type , refer to {@link CFG_LINK_TYPE}
	 * \else
	 * 联动类型, 取值参考 {@link CFG_LINK_TYPE}
	 * \endif
	 */
	public int					emType;						

	/**
	 * \if ENGLISH_LANG
	 * Value reffered to Preset Number,Tour Pattern Number and etc 
	 * \else
	 * 联动取值分别对应预置点号，巡航号等等
	 * \endif
	 */
	public int					nValue;						
}
