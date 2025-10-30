package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Preview type.Corresponding to interface {@link INetSDK#RealPlayEx}
 * \else
 * 端口序号, 对应接口 {@link INetSDK#RealPlayEx}
 * \endif
 */
public class SDK_RealPlayType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Real-time preview
	 * \else
	 * 实时预览
	 * \endif
	 */
	public static final int     SDK_RType_Realplay = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview 
	 * \else
	 * 多画面预览
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor-main stream. It is the same as SDK_RType_Realplay
	 * \else
	 * 实时预览-主码流，等同于 SDK_RType_Realplay
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_0 = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * 1 Real-time monitor---extra stream 1
	 * \else
	 * 实时预览-从码流1
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_1 = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * 2 Real-time monitor-- extra stream 2
	 * \else
	 * 实时预览-从码流2
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_2 = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 3 Real-time monitor -- extra stream 3
	 * \else
	 * 实时预览-从码流3
	 * \endif
	 */
	public static final int     SDK_RType_Realplay_3 = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview-- 1-window 
	 * \else
	 * 多画面预览－1画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_1 = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--4-window
	 * \else
	 * 多画面预览－4画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_4 = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--8-window
	 * \else
	 * 多画面预览－8画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_8 = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--9-window
	 * \else
	 * 多画面预览－9画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_9 = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--16-window
	 * \else
	 * 多画面预览－16画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_16 = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--6-window
	 * \else
	 * 多画面预览－6画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_6 = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Multiple-channel preview--12-window
	 * \else
	 * 多画面预览－12画面
	 * \endif
	 */
	public static final int     SDK_RType_Multiplay_12 = 12;

	/**
	 * \if ENGLISH_LANG
	 * test stream
	 * \else
	 * 带宽测试码流
	 * \endif
	 */
	public static final int 	SDK_RType_Realplay_Test = 255;
}
