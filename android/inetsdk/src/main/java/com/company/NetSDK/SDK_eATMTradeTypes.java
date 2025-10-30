package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Trade type
 * \else
 * 交易类型
 * \endif
 */
public class SDK_eATMTradeTypes implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * INSERTCARD
	 * \else
	 * 插卡 
	 * \endif
	 */
	public static final int TRADE_TYPE_INC = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * WITHDRAWCARD
	 * \else
	 * 退卡
	 * \endif
	 */
	public static final int TRADE_TYPE_WDC = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * CHECKTIME
	 * \else
	 * 校时
	 * \endif
	 */
	public static final int TRADE_TYPE_CKT = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * QUERY
	 * \else
	 * 查询
	 * \endif
	 */
	public static final int TRADE_TYPE_INQ = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * Withdrawal
	 * \else
	 * 取款
	 * \endif
	 */
	public static final int TRADE_TYPE_CWD = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * Change password
	 * \else
	 * 改密
	 * \endif
	 */
	public static final int TRADE_TYPE_PIN = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * Treansfer
	 * \else
	 * 转帐
	 * \endif
	 */
	public static final int TRADE_TYPE_TFR = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * Saving
	 * \else
	 * 存款
	 * \endif
	 */
	public static final int TRADE_TYPE_DEP = 7;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card search
	 * \else
	 * 无卡查询
	 * \endif
	 */
	public static final int TRADE_TYPE_NCINQ = 8;
	
 	/**
	 * \if ENGLISH_LANG
	 * No-card saving
	 * \else
	 * 无卡存款
	 * \endif
	 */
	public static final int TRADE_TYPE_NCDEP = 9;
	
 	/**
	 * \if ENGLISH_LANG
	 * Other
	 * \else
	 * 其它
	 * \endif
	 */
	public static final int TRADE_TYPE_OTHERS = 10;
	
 	/**
	 * \if ENGLISH_LANG
	 * Total
	 * \else
	 * 总
	 * \endif
	 */
	public static final int TRADE_TYPE_ALL = 11;
}
