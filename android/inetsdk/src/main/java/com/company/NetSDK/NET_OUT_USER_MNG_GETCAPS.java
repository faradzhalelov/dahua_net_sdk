package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output param, the corresponding interface {@link INetSDK#GetDevCaps},the corresponding command {@link FinalVar#NET_USER_MNG_CAPS}
 * \else
 * 出参, 对应接口 {@link INetSDK#GetDevCaps},对应命令 {@link FinalVar#NET_USER_MNG_CAPS}
 * \endif
 */
public class NET_OUT_USER_MNG_GETCAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Account Limitation
	 * \else
	 * 账户限制,可以精确控制每个用户允许同时进行的请求
	 * \endif
	 */
    public boolean                bAccountLimitation;                
    
	/**
	 * \if ENGLISH_LANG
	 * Individual Access Filter
	 * \else
	 * 权限名单是否支持针对单个IP的过滤
	 * \endif
	 */
    public boolean                bIndividualAccessFilter;           
    
	/**
	 * \if ENGLISH_LANG
	 * Max number of Page Size
	 * \else
	 * 分页查询时单次查询的最大用户信息条数
	 * \endif
	 */
    public int               	  dwMaxPageSize; 
    
	/**
	 * \if ENGLISH_LANG
	 * max passwd len
	 * \else
	 * 最大密码长度
	 * \endif
	 */
	public int					  nMaxPwdLen;									
	
	/**
	 * \if ENGLISH_LANG
	 * min passwd len
	 * \else
	 * 最小密码长度	
	 * \endif
	 */
	public int					  nMinPwdLen;									
	
	/**
	 * \if ENGLISH_LANG
	 * basic chars supported：Number,Lower case,Capital. such as :"Number,Lower,Upper"
	 * \else
	 * 支持的基本字符类型列表：其中Number数字；Lower小写字母；Upper大写字母，字符串形式:"Number,Lower,Upper"
	 * \endif
	 */
	public byte[]				  szType = new byte[FinalVar.MAX_PWD_BASIC_CHARS_ARRAY_LEN];		
	
	/**
	 * \if ENGLISH_LANG
	 * special chars supported, as"~!@#$%^" 
	 * \else
	 * 支持的特殊字符，如"~!@#$%^" 
	 * \endif
	 */
	public byte[]				  szCharList = new byte[FinalVar.MAX_PWD_SPEC_CHARS_ARRAY_LEN];	
	
	/**
	 * \if ENGLISH_LANG
	 * chars combine style：0-no special request, 1-special char must be included, 2-at least two style included (number, capital, lower case, special char)
	 * \else
	 * 密码组合要求：0-无特殊要求；1-必须有特殊字符，其它不限；2-必须包含2种类型以上(数字、大写、小写、特殊字符)
	 * \endif
	 */
	public int					  nCombine;									
}
