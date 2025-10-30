package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * when nTriggerType==2, client snap info
 * \else
 * nTriggerType==2时 客户端触发抓拍参数
 * \endif
 */
public class NET_CLIENT_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Frame no.
	 * \else
	 * 帧序号
	 * \endif
	 */
	public int                 nFrameSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp, 64 bit ms time stamp
	 * \else
	 * 时间戳,64位毫秒时间戳
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * String，client custom,"\0" end
	 * \else
	 * 字符串，客户端自定义,"\0"结尾
	 * \endif
	 */
	public byte				szUserDefinedInfo[] = new byte[FinalVar.SDK_MAX_USER_DEFINE_INFO];
	
	/**
	 * \if ENGLISH_LANG
	 * Client Type {@link SNAP_CLIENT_TYPE}
	 * \else
	 * 客户端类型 {@link SNAP_CLIENT_TYPE}
	 * \endif
	 */
	public int    emSNAP_CLIENT_TYPE;
	
	/**
	 * \if ENGLISH_LANG
	 * Issue card quantity
	 * \else
	 * 卡片个数
	 * \endif
	 */
	public int               dwRetCardNumber;
    
    /**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * 卡片信息
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];
	
	public NET_CLIENT_SNAP_INFO() {
		for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
			stuCardInfo[i] = new EVENT_CARD_INFO();
		}
	}
}
