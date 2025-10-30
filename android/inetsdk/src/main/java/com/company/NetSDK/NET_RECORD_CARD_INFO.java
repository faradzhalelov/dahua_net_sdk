package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * card no. record info
 * \else
 * 卡号录像信息
 * \endif
 */
public class NET_RECORD_CARD_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * type, 0-Card, 1-Field
	 * \else
	 * 类型, 0-Card, 1-Field
	 * \endif
	 */
    public int                   nType;                                          
    
	/**
	 * \if ENGLISH_LANG
	 * card no.
	 * \else
	 * 卡号
	 * \endif
	 */
    public byte[]                szCardNo = new byte[FinalVar.SDK_MAX_CARD_INFO_LEN];                
    
	/**
	 * \if ENGLISH_LANG
	 * transaction type, refer to {@link EM_ATM_TRADE_TYPE}
	 * \else
	 * 交易类型, 取值参考 {@link EM_ATM_TRADE_TYPE}
	 * \endif
	 */
    public int   					emTradeType;                                    
    
	/**
	 * \if ENGLISH_LANG
	 * transaction amount, nullstring means no limit amount
	 * \else
	 * 交易金额, 空字符串表示不限金额
	 * \endif
	 */
    public byte[]                szAmount = new byte[FinalVar.SDK_COMMON_STRING_64];                  
    
	/**
	 * \if ENGLISH_LANG
	 * error code, 0-all errors, 1-retain cash, 2-retain card
	 * \else
	 * 错误码, 0-所有错误, 1-吞钞, 2-吞卡
	 * \endif
	 */
    public int                   nError;                                        
    
	/**
	 * \if ENGLISH_LANG
	 * domain quantity, by domain search is valid
	 * \else
	 * 域数量, 按域查询时有效
	 * \endif
	 */
    public int                   nFieldCount;                                    
    
	/**
	 * \if ENGLISH_LANG
	 * domain info, by domain search is valid
	 * \else
	 * 域信息, 按域查询时有效
	 * \endif
	 */
    public byte[][]              szFields = new byte[FinalVar.MAX_CARD_RECORD_FIELD_NUM][FinalVar.SDK_COMMON_STRING_256];  
    
	/**
	 * \if ENGLISH_LANG
	 * change
	 * \else
	 * 零钱
	 * \endif
	 */
	public byte[] 				 szChange = new byte[FinalVar.SDK_COMMON_STRING_32];		            
}
