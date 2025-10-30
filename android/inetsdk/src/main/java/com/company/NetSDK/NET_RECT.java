package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zone.
 * \else
 * 区域,
 * \endif
 */
public class NET_RECT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int 					nLeft;
	public int 					nTop;
	public int 					nRight;
	public int 					nBottom;

	@Override
	public String toString() {
		return "NET_RECT{" +
				"nLeft=" + nLeft +
				", nTop=" + nTop +
				", nRight=" + nRight +
				", nBottom=" + nBottom +
				'}';
	}
}
