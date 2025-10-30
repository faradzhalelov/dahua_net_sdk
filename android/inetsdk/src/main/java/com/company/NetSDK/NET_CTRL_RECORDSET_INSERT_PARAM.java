package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record New Operation (Insert)Parameter 
 * \else
 * 记录集新增操作(insert)参数
 * \endif
 */
public class NET_CTRL_RECORDSET_INSERT_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Information(User Write)
	 * \else
	 * 记录集信息(用户填写)
	 * \endif
	 */
	public NET_CTRL_RECORDSET_INSERT_IN		stuCtrlRecordSetInfo = new NET_CTRL_RECORDSET_INSERT_IN();
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information(the Device Come Back)
	 * \else
	 * 记录集信息(设备返回)
	 * \endif
	 */
	public NET_CTRL_RECORDSET_INSERT_OUT	stuCtrlRecordSetResult = new NET_CTRL_RECORDSET_INSERT_OUT();
}
