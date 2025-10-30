package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Interface type,responding to the interface {@link INetSDK#SetSubconnCallBack}
 * \else
 * 接口类型，对应接口 {@link INetSDK#SetSubconnCallBack}
 * \endif
 */
public class EM_INTERFACE_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown interface
	 * \else
	 * 未知接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_OTHER = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime monitoring interface
	 * \else
	 * 实时预览接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALPLAY = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Realtime multiple-window preview
	 * \else
	 * 多画面预览接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PREVIEW = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback interface
	 * \else
	 * 端回放接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_PLAYBACK = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Download interface
	 * \else
	 * 下载接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_DOWNLOAD = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Download picture interface
	 * \else
	 * 下载智能图片接口
	 * \endif
	 */
	public static int 		SDK_INTERFACE_REALLOADPIC = 5;
}
