package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity search，when DSP capacity algorithm mark is 2, use.
 * \else
 * DSP能力查询，当DSP能力算法标识为2时使用。
 * \endif
 */
public class SDK_DSP_CFG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 *  Use resolution enumeration value({@link CAPTURE_SIZE}) as index, main stream resolution corresponding max frame rate, if not support this resolution, then valid is 0.
	 * \else
	 * 以分辨率枚举值({@link CAPTURE_SIZE})为索引,主码流分辨率对应支持的最大帧率,如果不支持此分辨率,则值为0.
	 * \end
	 */
	public byte		bMainFrame[] = new byte[32];			

	/**
	 * \if ENGLISH_LANG
	 * Sub stream 1, use same bMainFrame
	 * \else
	 * 辅码流1,使用同bMainFrame
	 * \endif
	 */
	public byte		bExtraFrame_1[] = new byte[32];		
}
