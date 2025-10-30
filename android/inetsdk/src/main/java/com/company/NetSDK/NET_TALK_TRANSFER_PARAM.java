package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Open the forwarding mode of intercom or not 
 * \else
 * 是否开启语音对讲的转发模式
 * \endif
 */
public class NET_TALK_TRANSFER_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Open the forwarding mode of intercom or not, TRUE: yes, FALSE: no
	 * \else
	 * 是否开启语音对讲转发模式, TRUE: 开启转发, FALSE: 关闭转发
	 * \endif
	 */
	public boolean            bTransfer; 
}
