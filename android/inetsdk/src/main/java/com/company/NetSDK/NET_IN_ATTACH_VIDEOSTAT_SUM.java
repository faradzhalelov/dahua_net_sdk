package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * input param for {@link INetSDK#AttachVideoStatSummary}
 * \else
 * {@link INetSDK#AttachVideoStatSummary} 入参
 * \endif
 */
public class NET_IN_ATTACH_VIDEOSTAT_SUM implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video channel ID
	 * \else
	 * 视频通道号
	 * \endif
	 */
	public int                     nChannel;

	/**
	 * \if ENGLISH_LANG
	 * video statistical summary callback
	 * \else
	 * 视频统计摘要信息回调
	 * \endif
	 */
	public CB_fVideoStatSumCallBack   cbVideoStatSum;

}
