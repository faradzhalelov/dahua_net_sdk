package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * record info, corresponde to CLIENT_FindFileEx, search result
 * \else
 * 文件摘要信息
 * \endif
 */
public class NET_FILE_SUMMARY_INFO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Abstract name 
	 * \else
	 * 摘要名称
	 * \endif
	 */
    public byte[]     szKey = new byte[FinalVar.SDK_COMMON_STRING_64];          
    
	/**
	 * \if ENGLISH_LANG
	 * Abstract contents 
	 * \else
	 * 摘要内容
	 * \endif
	 */
    public byte[]     szValue = new byte[FinalVar.SDK_COMMON_STRING_512];        
}
