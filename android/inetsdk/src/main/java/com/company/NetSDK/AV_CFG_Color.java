package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Color
 * \else
 * 颜色
 * \endif
 */
public class AV_CFG_Color implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Red
	 * \else
	 * 红
	 * \endif
	 */
	public int			nRed;
	
	/**
	 * \if ENGLISH_LANG
	 * Green
	 * \else
	 * 绿
	 * \endif
	 */
	public int			nGreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Blue
	 * \else
	 * 蓝
	 * \endif
	 */
	public int			nBlue;
	
	/**
	 * \if ENGLISH_LANG
	 * Transparent
	 * \else
	 * 透明
	 * \endif
	 */
	public int			nAlpha;

	public void setnRed(int nRed) {
		this.nRed = nRed;
	}

	public void setnGreen(int nGreen) {
		this.nGreen = nGreen;
	}

	public void setnBlue(int nBlue) {
		this.nBlue = nBlue;
	}

	public void setnAlpha(int nAlpha) {
		this.nAlpha = nAlpha;
	}

	public void setColor(int nRed,int nGreen,int nBlue,int nAlpha){
		this.nAlpha = nAlpha;
		this.nBlue = nBlue;
		this.nGreen = nGreen;
		this.nRed = nRed;
	}
}
