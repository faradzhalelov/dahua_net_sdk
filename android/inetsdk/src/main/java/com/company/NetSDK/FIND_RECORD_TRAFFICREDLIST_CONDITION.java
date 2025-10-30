package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query Conditions Of Traffic Black And Allow list Account Records
 * \else
 * 交通权限名单账户记录查询条件
 * \endif
 */
public class FIND_RECORD_TRAFFICREDLIST_CONDITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number
	 * \else
	 * 车牌号
	 * \endif
	 */
	public byte                     szPlateNumber[] = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number Fuzzy Query
	 * \else
	 * 车牌号码模糊查询
	 * \endif
	 */
	public byte                     szPlateNumberVague[] = new byte[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Offset in the query results of first results returned
	 * \else
	 * 第一个条返回结果在查询结果中的偏移量
	 * \endif
	 */
	public int                      nQueryResultBegin;

	/**
	 * \if ENGLISH_LANG
	 * Whether support the quick query, TRUE: for quick, quick query time don't wait for all add, delete, change operation is completed. The default is non-quick query
	 * \else
	 * 是否快速查询, TRUE:为快速，快速查询时不等待所有增、删、改操作完成。默认为非快速查询
	 * \endif
	 */
	public boolean                     bRapidQuery;
}
