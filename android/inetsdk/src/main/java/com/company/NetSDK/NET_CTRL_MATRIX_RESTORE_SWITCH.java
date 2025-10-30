package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * matrix switch restore
 * \else
 * 恢复上下位矩阵关系
 * \endif
 */
public class NET_CTRL_MATRIX_RESTORE_SWITCH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * The name of up-lower matrix
	 * \else
	 * 上下位矩阵输出关系名称
	 * \endif
	 */
	public String      pszName;
}
