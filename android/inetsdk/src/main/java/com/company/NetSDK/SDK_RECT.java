package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone;Each margin is total lenght :8192
 * \else
 * 区域；各边距按整长8192的比例
 * \endif
 */
public class SDK_RECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Left
	 * \else
	 * 左
	 * \endif
	 */
	public long					left;

	/**
	 * \if ENGLISH_LANG
	 * Top
	 * \else
	 * 上
	 * \endif
	 */
	public long					top;

	/**
	 * \if ENGLISH_LANG
	 * Right
	 * \else
	 * 右
	 * \endif
	 */
	public long					right;

	/**
	 * \if ENGLISH_LANG
	 * Bottom
	 * \else
	 * 下
	 * \endif
	 */
	public long					bottom;

	@Override
	public String toString() {
		return "SDK_RECT{" +
				"left=" + left +
				", top=" + top +
				", right=" + right +
				", bottom=" + bottom +
				'}';
	}
}
