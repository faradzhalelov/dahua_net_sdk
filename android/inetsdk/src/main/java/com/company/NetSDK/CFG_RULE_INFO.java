package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * each event rule info
 * \else
 * 每个事件规则信息内容
 * \endif
 */
public class CFG_RULE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * This envent type rule configuration struct size
	 * \else
	 * 该事件类型规则配置结构体大小
	 * \endif
	 */
	public int				nRuleSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Event type,see "intelligent analyse event type" in {@link FinalVar}
	 * \else
	 * 事件类型，详见{@link FinalVar}中"智能分析事件类型"
	 * \endif
	 */
	public int				   dwRuleType;						

	/**
	 * \if ENGLISH_LANG
	 * the common of the tule
	 * \else
	 * 规则通用信息
	 * \endif
	 */
	public CFG_RULE_COMM_INFO  stuRuleCommInfo = new CFG_RULE_COMM_INFO();					
}
