package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Operation Parameter, the corresponding interface {@link INetSDK#QueryDevState},the corresponding command {@link FinalVar#SDK_DEVSTATE_DEV_RECORDSET}
 * \else
 * 记录集操作参数, 对应接口 {@link INetSDK#QueryDevState},对应命令 {@link FinalVar#SDK_DEVSTATE_DEV_RECORDSET}
 * \endif
 */
public class NET_CTRL_RECORDSET_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Information Type, refer to {@link EM_NET_RECORD_TYPE}
	 * \else
	 * 记录集信息类型, 取值参考 {@link EM_NET_RECORD_TYPE}
	 * \endif
	 */
	public int					nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * New/Renew/Inquire,It is Record Information Cache，the {@link EM_NET_RECORD_TYPE} Note is Details)
	 * Delete,It is Record Number(Int Model)
	 * \else
	 * 新增\更新\查询时,为记录集信息缓存，详见 {@link EM_NET_RECORD_TYPE}
	 * 1:交通允许名单账户记录,对应 {@link FIND_RECORD_TRAFFICREDLIST_CONDITION}
	 * 2:交通禁止名单账号记录,对应 {@link FIND_RECORD_TRAFFICREDLIST_CONDITION}
	 * 3:刻录案件记录,对应 {@link FIND_RECORD_BURN_CASE_CONDITION}
	 * 4:门禁卡,对应 {@link NET_RECORDSET_ACCESS_CTL_CARD}
	 * 5:门禁密码,对应 {@link NET_RECORDSET_ACCESS_CTL_PWD}
	 * 6:门禁出入记录,对应 {@link NET_RECORDSET_ACCESS_CTL_CARDREC}
	 * 7:假日记录集, 对应 {@link NET_RECORDSET_HOLIDAY}
	 * 删除时,为记录编号(int型)
	 * \endif
	 */
	public Object				pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * Record Information Cache Size
	 * \else
	 * 记录集信息缓存大小
	 * \endif
	 */
	public int					nBufLen; 
}
