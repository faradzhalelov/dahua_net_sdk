package com.company.NetSDK;

import java.io.Serializable;

/**
* \if ENGLISH_LANG
* {@link INetSDK#StartFindNumberStat} 's output param
* \else
* 接口 {@link INetSDK#StartFindNumberStat} 输出参数
* \endif
*/
public class NET_OUT_FINDNUMBERSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	* \if ENGLISH_LANG
	* total count
	* \else
	* 符合此次查询条件的结果总条数
	* \endif
	*/
	public int               dwTotalCount;               
}
