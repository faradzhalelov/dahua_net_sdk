package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The Video Analysis Rule Configuration Corresponding To Every Video Input, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_ANALYSERULE}
 * \else
 * 每个视频输入通道对应的所有事件规则：对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_ANALYSERULE}缓冲区pRuleBuf填充多个事件规则信息，每个事件规则信息内容为CFG_RULE_INFO+"事件类型对应的规则配置结构体"。
 * \endif
 */
public class CFG_ANALYSERULES_INFO implements Serializable
{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Rule Count 
	 * \else
	 * 事件规则个数
	 * \endif
	 */
	public int 						nRuleCount;
	
 	/**
	 * \if ENGLISH_LANG
	 * The Event Analysis Rule Configuration Corresponding To Each Video Input 
	 * \else
	 * 每个视频输入通道对应的视频分析事件规则配置缓冲
	 * \endif
	 */
	public CFG_RULE_INFO[]			 pRuleBuf;
	
 	/**
	 * \if ENGLISH_LANG
	 * event rule is sured by {@link CFG_RULE_INFO#dwRuleType}
	 * \else
	 * 具体的事件规则， 由 {@link CFG_RULE_INFO#dwRuleType}  来确定
	 * \endif
	 */
	public Object[]     			 pIvsRuleBuf;	

	public CFG_ANALYSERULES_INFO(int nRuleCount) {
		this.nRuleCount = nRuleCount;
		pRuleBuf = new CFG_RULE_INFO[nRuleCount];
		pIvsRuleBuf = new Object[nRuleCount];
		for(int i = 0; i < nRuleCount; i++) {
			pRuleBuf[i] = new CFG_RULE_INFO();
		}		
	}
}
