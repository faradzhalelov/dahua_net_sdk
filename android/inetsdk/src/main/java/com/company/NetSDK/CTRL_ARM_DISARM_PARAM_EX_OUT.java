package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion output parameter
 * \else
 * 报警布撤防控制扩展输出参数
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_OUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm source input arming failed zone number 
	 * \else
	 * 有报警源输入布防失败的防区个数
	 * \endif
	 */
	public int               dwSourceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * alarm source input failed zone no.,zone no. start from 0
	 * \else
	 * 有报警源输入失败的防区号, 防区号从0开始
	 * \endif
	 */
	public int                 nSource[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * link alarm arming failed zone number 
	 * \else
	 * 有联动报警布防失败的防区个数
	 * \endif
	 */
    public int               dwLinkNum;
    
    /**
     * \if ENGLISH_LANG
     * link alarm failed zone no., zone no. start from 0
     * \else
     * 有联动报警失败的防区号, 防区号从0开始
     * \endif
     */
    public int                 nLink[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
}
