package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Custom judicial case info
 * \else
 * 自定义案件信息
 * \endif
 */
public class CFG_CUSTOMCASE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * case title
	 * \else
	 * 案件名称
	 * \endif
	 */
	public byte[]                szCaseTitle = new byte[FinalVar.MAX_OSD_TITLE_LEN];   
	
	/**
	 * \if ENGLISH_LANG
	 * Case content
	 * \else
	 * 案件内容
	 * \endif
	 */
	public byte[]                szCaseContent = new byte[FinalVar.MAX_OSD_SUMMARY_LEN];  
	
	/**
	 * \if ENGLISH_LANG
	 * Case's number enable
	 * \else
	 * 案件编号叠加使能
	 * \endif
	 */
	public boolean               bCaseNoOsdEn;                        
}
