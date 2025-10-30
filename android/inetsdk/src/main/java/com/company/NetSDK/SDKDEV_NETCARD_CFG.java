package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * net card configuration, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_NETCARD_CFG}
 * \else
 * 卡口信息配置, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_NETCARD_CFG}
 * \endif
 */
public class SDKDEV_NETCARD_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card number
	 * \else
	 * 有效卡号数
	 * \endif
	 */
    public int                nCardNum; 
    
    /**
	 * \if ENGLISH_LANG
	 * card info string
	 * \else
	 * 卡号信息字符串
	 * \endif
	 */
    public byte               cardInfo[][] = new byte[FinalVar.SDK_MAX_CARD_NUM][FinalVar.SDK_MAX_CARDINFO_LEN];  
}
