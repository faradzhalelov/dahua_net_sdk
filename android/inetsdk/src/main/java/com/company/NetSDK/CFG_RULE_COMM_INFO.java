package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * event type {@link FinalVar#EVENT_IVS_LETRACK}(event of simple track)corresponding to rule config
 * \else
 * 事件类型 {@link FinalVar#EVENT_IVS_LETRACK} (简单跟踪事件)对应规则配置
 * \endif
 */
public class CFG_RULE_COMM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the ID of rule
	 * \else
	 * 事规则编号
	 * \endif
	 */
	public byte				bRuleId;							
	
	/**
	 * \if ENGLISH_LANG
	 * the scene of rule, refer to {@link EM_SCENE_TYPE} 
	 * \else
	 * 规则所属的场景, 取值参考 {@link EM_SCENE_TYPE}
	 * \endif
	 */
	public int		emClassType;
	
}
