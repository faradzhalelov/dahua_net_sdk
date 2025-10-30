package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode
 * \else
 * 分割模式
 * \endif
 */
public class CFG_SPLITMODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1 split
	 * \else
	 * 1画面
	 * \endif
	 */
	public static final int SPLITMODE_1 = 1;						

	/**
	 * \if ENGLISH_LANG
	 * 2 split
	 * \else
	 * 2画面
	 * \endif
	 */
	public static final int SPLITMODE_2 = 2;						

	/**
	 * \if ENGLISH_LANG
	 * 4 split
	 * \else
	 * 4画面
	 * \endif
	 */
	public static final int SPLITMODE_4 = 4;						

	/**
	 * \if ENGLISH_LANG
	 * 6 split
	 * \else
	 * 6画面
	 * \endif
	 */
	public static final int SPLITMODE_6 = 6;						

	/**
	 * \if ENGLISH_LANG
	 * 8 split
	 * \else
	 * 8画面
	 * \endif
	 */
	public static final int SPLITMODE_8 = 8;						

	/**
	 * \if ENGLISH_LANG
	 * 9 split
	 * \else
	 * 9画面
	 * \endif
	 */
	public static final int SPLITMODE_9 = 9;						

	/**
	 * \if ENGLISH_LANG
	 * 12 split
	 * \else
	 * 12画面
	 * \endif
	 */
	public static final int SPLITMODE_12 = 12;				    	

	/**
	 * \if ENGLISH_LANG
	 * 16 split
	 * \else
	 * 16画面
	 * \endif
	 */
	public static final int SPLITMODE_16 = 16;				    	

	/**
	 * \if ENGLISH_LANG
	 * 20 split
	 * \else
	 * 20画面
	 * \endif
	 */
	public static final int SPLITMODE_20 = 20;				    	

	/**
	 * \if ENGLISH_LANG
	 * 25 split
	 * \else
	 * 25画面
	 * \endif
	 */
	public static final int SPLITMODE_25 = 25;					    

	/**
	 * \if ENGLISH_LANG
	 * 36 split
	 * \else
	 * 36画面
	 * \endif
	 */
	public static final int SPLITMODE_36 = 36;					    

	/**
	 * \if ENGLISH_LANG
	 * 64 split
	 * \else
	 * 64画面
	 * \endif
	 */
	public static final int SPLITMODE_64 = 64;					    

	/**
	 * \if ENGLISH_LANG
	 * 144 split
	 * \else
	 * 144画面
	 * \endif
	 */
	public static final int SPLITMODE_144 = 144;					

	/**
	 * \if ENGLISH_LANG
	 * PIP split mode basic value
	 * \else
	 * 画中画分割模式基础值
	 * \endif
	 */
	public static final int SPLITMODE_PIP = 1000;                   

	/**
	 * \if ENGLISH_LANG
	 * PIP mode, 1 full screen+1 small window
	 * \else
	 * 画中画模式, 1个全屏大画面+1个小画面窗口
	 * \endif
	 */
	public static final int SPLITMODE_PIP1 = SPLITMODE_PIP + 1;		

	/**
	 * \if ENGLISH_LANG
	 * PIP mode, 1 full screen+3 small windows
	 * \else
	 * 画中画模式, 1个全屏大画面+3个小画面窗口
	 * \endif
	 */
	public static final int SPLITMODE_PIP3 = SPLITMODE_PIP + 3;		

	/**
	 * \if ENGLISH_LANG
	 * Free mode，may create, close window, Freely set window location and Z-axis sequency
	 * \else
	 * 自由开窗模式，可以自由创建、关闭窗口，自由设置窗口位置和Z轴次序
	 * \endif
	 */
	public static final int SPLITMODE_FREE = SPLITMODE_PIP * 2;	

	/**
	 * \if ENGLISH_LANG
	 * Cubeless video wall 1 split
	 * \else
	 * 融合屏成员1分割
	 * \endif
	 */
	public static final int SPLITMODE_COMPOSITE_1 = SPLITMODE_PIP * 3 + 1;	

	/**
	 * \if ENGLISH_LANG
	 * Cubeless video wall 4 split
	 * \else
	 * 融合屏成员4分割
	 * \endif
	 */
	public static final int SPLITMODE_COMPOSITE_4 = SPLITMODE_PIP * 3 + 4;	

	/**
	 * \if ENGLISH_LANG
	 * End mark
	 * \else
	 * 结束标识
	 * \endif
	 */
	public static final int SPLITMODE_EOF = SPLITMODE_COMPOSITE_4 + 1;                          
}
