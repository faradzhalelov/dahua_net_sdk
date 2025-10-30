package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel template group, the corresponding interface {@link INetSDK#GetNewDevConfig} and {@link INetSDK#SetNewDevConfig},the corresponding command {@link FinalVar#CFG_CMD_INFRARED_BOARD_TEMPLATE}
 * \else
 * 红外面板模板组, 对应接口 {@link INetSDK#GetNewDevConfig} 和 {@link INetSDK#SetNewDevConfig},对应命令 {@link FinalVar#CFG_CMD_INFRARED_BOARD_TEMPLATE}
 * \endif
 */
public class CFG_INFRARED_BOARD_TEMPLATE_GROUP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Number of template 
	 * \else
	 * 模板数量
	 * \endif
	 */
	public int			nTemplateNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Infrared panel template
	 * \else
	 * 红外面板模板
	 * \endif
	 */
	public CFG_INFRARED_BOARD_TEMPLATE stuTemplates[] = new CFG_INFRARED_BOARD_TEMPLATE[FinalVar.CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM];
	
	public CFG_INFRARED_BOARD_TEMPLATE_GROUP()
	{
		for(int i = 0; i < FinalVar.CFG_MAX_INFRARED_BOARD_TEMPLATE_NUM; i++)
		{
			stuTemplates[i] = new CFG_INFRARED_BOARD_TEMPLATE();
		}	
	}
}
