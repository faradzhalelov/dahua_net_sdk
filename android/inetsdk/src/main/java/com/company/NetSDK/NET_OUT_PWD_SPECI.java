package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#GetPwdSpecification} Interface Output Parameters
* \else
* {@link INetSDK#GetPwdSpecification} 接口输出参数
* \endif
*/
public class NET_OUT_PWD_SPECI implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /**
	 * \if ENGLISH_LANG
	 * max passwd len
	 * \else
	 * 最大密码长度
	 * \endif
	 */
	public 	int				nMaxPwdLen;								
	
	 /**
	 * \if ENGLISH_LANG
	 * min passwd len
	 * \else
	 * 最小密码长度	
	 * \endif
	 */
	public  int				nMinPwdLen;									
	
	 /**
	 * \if ENGLISH_LANG
	 * basic chars supported：Number,Lower case,Capital. such as :"Number,Lower,Upper"
	 * \else
	 * 支持的基本字符类型列表：其中Number数字；Lower小写字母；Upper大写字母，字符串形式:"Number,Lower,Upper"
	 * \endif
	 */
	public 	byte[]			szType = new byte[FinalVar.MAX_PWD_BASIC_CHARS_ARRAY_LEN];		
	
	 /**
	 * \if ENGLISH_LANG
	 * special chars supported, as"~!@#$%^" 
	 * \else
	 * 支持的特殊字符，如"~!@#$%^"
	 * \endif
	 */
	public 	byte[]			szCharList = new byte[FinalVar.MAX_PWD_SPEC_CHARS_ARRAY_LEN];	 
	
	 /**
	 * \if ENGLISH_LANG
	 * chars combine style：0-no special request, 1-special char must be included, 2-at least two style included (number, capital, lower case, special char)
	 * \else
	 * 密码组合要求：0-无特殊要求；1-必须有特殊字符，其它不限；2-必须包含2种类型以上(数字、大写、小写、特殊字符)
	 * \endif
	 */
	public int				nCombine;									

}
