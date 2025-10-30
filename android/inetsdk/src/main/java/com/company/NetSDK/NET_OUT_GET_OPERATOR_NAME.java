package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output arguments of {@link INetSDK#GetOperatorName}
 * \else
 * {@link INetSDK#GetOperatorName} 输出参数
 * \endif
 */
public class NET_OUT_GET_OPERATOR_NAME implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * operator name
	 * \else
	 * 操作员用户名
	 * \endif
	 */
	public byte         szOpearatorName[] = new byte[FinalVar.MAX_USERNAME_LEN];
	

}
