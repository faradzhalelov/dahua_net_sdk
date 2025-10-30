package com.company.NetSDK;

import java.io.Serializable;

public class SDK_NUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 /**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * 统计通道号
	 * \endif
	 */
	public int      nChannelID;                          
	
	 /**
	 * \if ENGLISH_LANG
	 * rule name
	 * \else
	 * 规则名称
	 * \endif
	 */
	public byte     szRuleName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];        
	
	 /**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * 开始时间
	 * \endif
	 */
	public NET_TIME stuStartTime = new NET_TIME();                        
	
	 /**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * 结束时间
	 * \endif
	 */
	public NET_TIME stuEndTime = new NET_TIME();                           
	
	 /**
	 * \if ENGLISH_LANG
	 * entered total
	 * \else
	 * 进入人数小计
	 * \endif
	 */
	public int      nEnteredSubTotal;                    
	
	 /**
	 * \if ENGLISH_LANG
	 * out total
	 * \else
	 * 出去人数小计
	 * \endif
	 */
	public int      nExitedSubtotal;                     
	
	 /**
	 * \if ENGLISH_LANG
	 * average number inside
	 * \else
	 * 平均保有人数(除去零值)
	 * \endif
	 */
	public int      nAvgInside;                           
	
	 /**
	 * \if ENGLISH_LANG
	 * max number inside
	 * \else
	 * 最大保有人数
	 * \endif
	 */
	public int      nMaxInside;                          
	
	 /**
	 * \if ENGLISH_LANG
	 * people enter with helmet count
	 * \else
	 * 戴安全帽进入人数小计
	 * \endif
	 */
	public int      nEnteredWithHelmet;                  
	
	 /**
	 * \if ENGLISH_LANG
	 * people enter without helmet count
	 * \else
	 * 不戴安全帽进入人数小计
	 * \endif
	 */
	public int      nEnteredWithoutHelmet;               
	
	 /**
	 * \if ENGLISH_LANG
	 * people exit with helmet count
	 * \else
	 * 戴安全帽出去人数小计
	 * \endif
	 */
	public int      nExitedWithHelmet;                   
	
	 /**
	 * \if ENGLISH_LANG
	 * people exit without helmet count
	 * \else
	 * 不戴安全帽出去人数小计
	 * \endif
	 */
	public int      nExitedWithoutHelmet;                
}
