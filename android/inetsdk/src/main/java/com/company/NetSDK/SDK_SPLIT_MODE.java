package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode
 * \else
 * 分割模式
 * \endif
 */
public class SDK_SPLIT_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1-window
	 * \else
	 * 1画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_1 = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * 2-window
	 * \else
	 * 2画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_2 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * 4-window
	 * \else
	 * 4画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_4 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 6-window
	 * \else
	 * 6画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_6 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 8-window
	 * \else
	 * 8画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_8 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * 9-window
	 * \else
	 * 9画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_9 = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * 12-window
	 * \else
	 * 12画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_12 = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * 16-window
	 * \else
	 * 16画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_16 = 16;
	
	/**
	 * \if ENGLISH_LANG
	 * 20-window
	 * \else
	 * 20画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_20 = 20;
	
	/**
	 * \if ENGLISH_LANG
	 * 25-window
	 * \else
	 * 25画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_25 = 25;
	
	/**
	 * \if ENGLISH_LANG
	 * 36-window
	 * \else
	 * 36画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_36 = 36;
	
	/**
	 * \if ENGLISH_LANG
	 * 64-window
	 * \else
	 * 64画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_64 = 64;
	
	/**
	 * \if ENGLISH_LANG
	 * 144-window
	 * \else
	 * 144画面
	 * \endif
	 */
	public static final int     SDK_SPLIT_144 = 144;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP mode.1-full screen+1-small window
	 * \else
	 * 画中画模式, 1个全屏大画面+1个小画面窗口
	 * \endif
	 */
	public static final int     SDK_PIP_1 = FinalVar.SDK_SPLIT_PIP_BASE + 1;
	
	/**
	 * \if ENGLISH_LANG
	 * PIP mode.1-full screen+3-small window
	 * \else
	 * 画中画模式, 1个全屏大画面+3个小画面窗口
	 * \endif
	 */
	public static final int     SDK_PIP_3 = FinalVar.SDK_SPLIT_PIP_BASE + 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Free open window mode,are free to create,close, window position related to the z axis
	 * \else
	 * 自由开窗模式，可以自由创建、关闭窗口，自由设置窗口位置和Z轴次序
	 * \endif
	 */
	public static final int     SDK_SPLIT_FREE = FinalVar.SDK_SPLIT_PIP_BASE * 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Integration of a split screen
	 * \else
	 * 融合屏成员1分割
	 * \endif
	 */
	public static final int     SDK_COMPOSITE_SPLIT_1 = FinalVar.SDK_SPLIT_PIP_BASE * 3 + 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Fusion of four split screen
	 * \else
	 * 融合屏成员4分割
	 * \endif
	 */
	public static final int     SDK_COMPOSITE_SPLIT_4 = FinalVar.SDK_SPLIT_PIP_BASE * 3 + 4;
}
