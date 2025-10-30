package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * {@link INetSDK#AttachSniffer}AttachSniffer's interface input param
 * \else
 * {@link INetSDK#AttachSniffer}AttachSniffer 接口入参
 * \endif
 */
public class NET_IN_ATTACH_SNIFFER implements Serializable {

/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * \if ENGLISH_LANG
	 * callback
	 * \else
	 * 回调函数
	 * \endif
	 */
    public CB_fAttachSniffer      cbSniffer;
}
