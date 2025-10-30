package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV adjust, the corresponding interface {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},the corresponding command {@link FinalVar#SDK_DEV_TV_ADJUST_CFG}
 * \else
 * 调节TV输出, 对应接口 {@link INetSDK#GetDevConfig}和{@link INetSDK#SetDevConfig},对应命令 {@link FinalVar#SDK_DEV_TV_ADJUST_CFG}
 * \endif
 */
public class SDKDEV_TVADJUST_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * top(0 - 100)
	 * \else
	 * 上测边距（0－100）
	 * \endif
	 */
	public int             nTop;

	/**
	 * \if ENGLISH_LANG
	 * botton(0 - 100)
	 * \else
	 * 下测边距（0－100）
	 * \endif
	 */
	public int             nBotton;

	/**
	 * \if ENGLISH_LANG
	 * left(0 - 100)
	 * \else
	 * 左测边距（0－100）
	 * \endif
	 */
	public int             nLeft;

	/**
	 * \if ENGLISH_LANG
	 * right(0 - 100)
	 * \else
	 * 右测边距（0－100）
	 * \endif
	 */
	public int             nRight;
}
