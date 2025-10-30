package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * save up-lower matrix
 * \else
 * 保存上下位矩阵输出关系
 * \endif
 */
public class NET_CTRL_MATRIX_SAVE_SWITCH implements Serializable {
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
