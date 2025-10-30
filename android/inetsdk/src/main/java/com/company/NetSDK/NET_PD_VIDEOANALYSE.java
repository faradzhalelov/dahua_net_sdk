package com.company.NetSDK;

import java.io.Serializable;
/**
* \if ENGLISH_LANG
* intelligent analysis
* \else
* 智能分析
* \endif
*/
public class NET_PD_VIDEOANALYSE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * intelligent analysis enable
	 * \else
	 * 是否支持智能分析
	 * \endif
	 */
    public boolean               bSupport;                   
    
	 /**
	 * \if ENGLISH_LANG
	 * support scene
	 * \else
	 * 支持的场景
	 * \endif
	 */
    public byte[][]              szSupportScenes = new byte[FinalVar.NET_VIDEOANALYSE_SCENES][FinalVar.SDK_COMMON_STRING_64];   
    
	 /**
	 * \if ENGLISH_LANG
	 * support rule
	 * \else
	 * 支持的规则
	 * \endif
	 */
    public byte[][]              SupportRules =  new byte[FinalVar.NET_VIDEOANALYSE_RULES][FinalVar.SDK_COMMON_STRING_64];      
}
