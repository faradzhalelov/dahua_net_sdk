package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 2 dimension point
 * \else
 * 二维空间点
 * \endif
 */
public class SDK_POINT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	public int					nx;

	public int					ny;

	@Override
	public String toString() {
		return "SDK_POINT{" +
				"nx=" + nx +
				", ny=" + ny +
				'}';
	}
}
