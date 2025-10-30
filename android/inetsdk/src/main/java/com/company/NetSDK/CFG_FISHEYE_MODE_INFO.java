package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye mode window location info
 * \else
 * 模块数
 * \endif
 */
public class CFG_FISHEYE_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mode type, see {@link CFG_CALIBRATE_MODE}
	 * \else
	 * 模式类型，详见  {@link CFG_CALIBRATE_MODE}
	 * \endif
	 */
	public int                nModeType;
	
	/**
	 * \if ENGLISH_LANG
	 * current mode window number
	 * \else
	 * 当前模式下的窗口数
	 * \endif
	 */
	public int                nWindowNum;
	
	/**
	 * \if ENGLISH_LANG
	 * see window info 
	 * \else
	 * 具体窗口信息
	 * \endif
	 */
	public CFG_FISHEYE_WINDOW_INFO stuWindwos[] = new CFG_FISHEYE_WINDOW_INFO[FinalVar.CFG_MAX_FISHEYE_WINDOW_NUM];
	
	public CFG_FISHEYE_MODE_INFO() {
		for (int i = 0; i < FinalVar.CFG_MAX_FISHEYE_WINDOW_NUM; i++) {
			stuWindwos[i] = new CFG_FISHEYE_WINDOW_INFO();
		}
	}
}
