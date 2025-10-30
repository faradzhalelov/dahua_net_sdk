package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record New Operation(Insert) Parameter
 * \else
 * 记录集新增操作(insert)输出参数
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_OUT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number(The Device Come Back When New Insert )
	 * \else
	 * 记录编号(新增insert时设备返回)
	 * \endif
	 */
	public int		nRecNo;
}
