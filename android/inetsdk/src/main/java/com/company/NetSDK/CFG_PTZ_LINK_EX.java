package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Activated PTZ info extension
 * \else
 * 联动云台信息扩展
 * \endif
 */
public class CFG_PTZ_LINK_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Activated type, refer to {@link CFG_LINK_TYPE}
	 * \else
	 * 联动类型 , 取值参考 {@link CFG_LINK_TYPE}
	 * \endif
	 */
	public int				emType;				

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 1
	 * \else
	 * 联动参数1
	 * \endif
	 */
	public int			    nParam1;			

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 2
	 * \else
	 * 联动参数2
	 * \endif
	 */
	public int			    nParam2;            

	/**
	 * \if ENGLISH_LANG
	 * Activated parameter 3
	 * \else
	 * 联动参数3
	 * \endif
	 */
	public int			    nParam3;            

	/**
	 * \if ENGLISH_LANG
	 * All activated PTZ channels
	 * \else
	 * 所联动云台通道
	 * \endif
	 */
	public int			    nChannelID;         
}
